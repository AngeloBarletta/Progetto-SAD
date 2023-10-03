package G8.T6.EditorApp.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import G8.T6.EditorApp.Model.*;

 
@RestController
// @CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/editor")
public class EditorAppController {
    private Partita partita;
    private Coverage coverageResult; 

    @Value("${JACOCO_COVERAGE_SERVER_URL}")
    private String jacocoUrlCoverageServer; 

    @Value("${EVOSUITE_COVERAGE_SERVER_URL}")
    private String evosuiteUrlCoverageServer; 

    @Value("${CLASS_SERVER_URL}")
    private String urlClassServer; 

    @Value("${TESTS_SERVER_URL}")
    private String urlTestsServer; 
    
    private final RestTemplate restTemplate = new RestTemplate(); // Inietta un'istanza di RestTemplate

    private String template(){
        return """
        import org.junit.Test;
        import static org.junit.Assert.*;
        
        public class AppTest{
            @Test
            public void test(){
            ClassUnderTest cut = new ClassUnderTest();
            assertEquals(2,cut.add(1,1));
            }
        }
        """;
    }
    
    // Funzione per ricevere le informazioni relative alla partita
    @GetMapping("/getCodiceClasse")
    public ResponseEntity<String> getCodiceClasse() {
        
        String jsonString = restTemplate.getForObject(urlClassServer, String.class);
        

        ObjectMapper objectMapper = new ObjectMapper();
        Partita partitaJson;
        try {
            partitaJson = objectMapper.readValue(jsonString, Partita.class);


            if (partitaJson != null) {
                System.out.println("Partita JSON is OK!\n\n\n\n");
                System.out.println(partitaJson.getCodiceClasse());
                partita = new Partita(partitaJson.getIdGiocatore(), partitaJson.getIdPartita(), partitaJson.getNomeClasse(),
                        partitaJson.getCodiceClasse(), partitaJson.getIdRobot(), template(), partitaJson.getLivello(), partitaJson.getRobot(), partitaJson.getCoverageMethod());
            } else {
                System.out.println("Partita JSON is NULL!\n\n\n\n");
            }
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        

        return ResponseEntity.ok(partita.getCodiceClasse());
    }

 
    // Funzione che aggiorna il codice
    @PostMapping("/updateCode")
    public String updateCode(@RequestBody String jsonString) {
        ObjectMapper objectMapper = new ObjectMapper();
        Messaggio messaggioJson;
        try {
            messaggioJson = objectMapper.readValue(jsonString, Messaggio.class);


            if (messaggioJson != null) {
                partita.setCodiceTest(messaggioJson.getMsg());
                return "Codice aggiornato";
            }
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return "Fallito";
    }

    // Funzione che salva il test scritto dall'utente
    @PostMapping("/saveTest")
    public String saveTest(@RequestBody Messaggio msg) {

        Test testToSend = new Test(msg.getMsg(), partita.getCodiceTest(), partita.getIdGiocatore(), partita.getIdPartita(), 
                                    partita.getNomeClasse(), partita.getCodiceClasse(), partita.getIdRobot());

        // Trasformiamo l'oggetto in una stringa json
        ObjectMapper objectMapper = new ObjectMapper();
        String json;

        try {
            json = objectMapper.writeValueAsString(testToSend);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);


            HttpEntity<String> requestEntity = new HttpEntity<>(json, headers);
            ResponseEntity<String> responseEntity = restTemplate.postForEntity(urlTestsServer, requestEntity, String.class);

            String responseBody = responseEntity.getBody();
            return responseBody;

        } catch (JsonProcessingException e) {
            System.out.println("Fallito");
            e.printStackTrace();
        }

        return "Errore durante il salvataggio del test";
    }

    // Funzione che richiede i risultati di coverage
    @PostMapping("/getCoverage")
    public ResponseEntity<String> getCoverage(@RequestBody Messaggio msg) {
        System.out.println(msg.getMsg());


        Test testToSend = new Test(msg.getMsg(), partita.getCodiceTest(), partita.getIdGiocatore(), partita.getIdPartita(), 
                                    partita.getNomeClasse(), partita.getCodiceClasse(), partita.getIdRobot());
        
        RequestDTO reqToSend = new RequestDTO(msg.getMsg(), partita.getCodiceTest(), partita.getNomeClasse(), partita.getCodiceClasse());

        // Trasformiamo l'oggetto in una stringa json
        ObjectMapper objectMapper = new ObjectMapper();
        String json;

        try {
            json = objectMapper.writeValueAsString(reqToSend);

            // System.out.println(json);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);


            HttpEntity<String> requestEntity = new HttpEntity<>(json, headers);
            
            
            String urlCoverage = "";
            if (partita.getCoverageMethod().equals("JaCoCo")) {
                urlCoverage = jacocoUrlCoverageServer;
            } else {
                urlCoverage = evosuiteUrlCoverageServer;
            }
            ResponseEntity<String> responseEntity = restTemplate.postForEntity(urlCoverage, requestEntity, String.class);

            String responseBody = responseEntity.getBody();
            
            objectMapper = new ObjectMapper();
            Coverage coverageJson;
            try {
                coverageJson = objectMapper.readValue(responseBody, Coverage.class);
//                coverageJson.parseCoverage();

                if (coverageJson != null) {
                    if (partita.getCoverageMethod().equals("EvoSuite")) {
                        coverageJson.setCoverageMethod("EvoSuite");
                    } else {
                        coverageJson.setCoverageMethod("JaCoCo");
                    }
                    String className = partita.getNomeClasse().replace(".java","");
                    String robot = partita.getRobot();
                    String robotLevel = ""+partita.getLivello();
                    if(partita.getLivello() <= 9){
                        robotLevel = "0"+partita.getLivello();
                    }

                    int coverage = 0;

                    if (robot.equals("Randoop")) {
                        String filePath = "./TestsResults/"+className+"/RobotTest/"+robot+"Test/"+robotLevel+"Level/coveragetot.xml";
                        coverage = Parser.parseXMLCoverage(filePath, partita.getNomeClasse());
                        // System.out.println("Coverage: " +  parser.getLineCoverage(filePath, partita.getNomeClasse()));

                    } else if (robot.equals("EvoSuite")) {
                        String filePath = "./TestsResults/"+className+"/RobotTest/"+robot+"Test/"+robotLevel+"Level/TestReport/statistics.csv";
                        coverage = Parser.parseCSVCoverage(filePath);
                    }

                    coverageJson.setRobotCoverage(coverage);
                        
                    // coverageResult = new Coverage(coverageJson.getError(), coverageJson.getOutCompile(), coverageJson.getCoverage());
                    json = objectMapper.writeValueAsString(coverageJson);
                    System.out.println("\n\nDEBUG: " + json);
                    return ResponseEntity.ok(json);
                }

            } catch (JsonMappingException e) {
                e.printStackTrace();
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }

        } catch (JsonProcessingException e) {
            System.out.println("Fallito");
            e.printStackTrace();
        }

        return ResponseEntity.badRequest().build();
    }
}

