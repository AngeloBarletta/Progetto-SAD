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
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


 
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
    public void testAlgebra(){
    Calcolatrice cut = new Calcolatrice();

    assertEquals(2,cut.add(1,1));

    assertEquals(2,cut.subtract(3,1));
    
    assertEquals(2,cut.multiply(2,1));

    assertEquals(2.0,cut.divide(4,2), 0.001);
    Exception thrown = assertThrows(IllegalArgumentException.class, () -> {cut.divide(2,0);});
    assertTrue(thrown.getMessage().contains("Division by zero"));
    }

    @Test
    public void testFactorial() {
    Calcolatrice cut = new Calcolatrice();

    assertEquals(6,cut.factorial(3));
    assertEquals(1,cut.factorial(1));
    assertEquals(1,cut.factorial(0));

    Exception thrown = assertThrows(IllegalArgumentException.class, () -> {cut.factorial(-1);});
    assertTrue(thrown.getMessage().contains("Factorial is not defined"));
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
            
            // ***************************** VERSIONE VECCHIA *****************************
            /*
            String urlCoverage = "";
            if (partita.getCoverageMethod().equals("JaCoCo")) {
                // in questo caso prendo solo il file xml prodotto dal task7 per misurare la coverage e vedere quali linee sono coperte per colorarle
                urlCoverage = jacocoUrlCoverageServer;
            } else {
                // se coverageMethod=EvoSuite allora mi prendo sia il csv che l'xml: dal csv mi prendo la coverage misurata con EvoSuite;
                // l'xml invece mi serve per estrarre e colorare le linee di codice coperte (EvoSuite mi dise solo quante, non quali sono coperte)
                urlCoverage = evosuiteUrlCoverageServer;
            }
            ResponseEntity<String> responseEntity = restTemplate.postForEntity(urlCoverage, requestEntity, String.class);
            String responseBody = responseEntity.getBody();
            */

           // ***************************** VERSIONE NUOVA *****************************
           String urlCoverage = "";
           objectMapper = new ObjectMapper();
           Coverage coverageJson;
           ResponseEntity<String> responseEntity;

            // richiesta ci compilazione e copertura al task 7, per ottenere il file di copertura xml
            urlCoverage = jacocoUrlCoverageServer;
            responseEntity = restTemplate.postForEntity(urlCoverage, requestEntity, String.class);
            String responseBody_xml = responseEntity.getBody();
            Coverage coverageXML = objectMapper.readValue(responseBody_xml, Coverage.class);
            coverageXML.setCoverageCSV("");

            // se coverageMethod=EvoSuite allora mi prendo sia il csv che l'xml: dal csv mi prendo la coverage misurata con EvoSuite;
            // l'xml invece mi serve per estrarre e colorare le linee di codice coperte (EvoSuite mi dise solo quante, non quali sono coperte)
            if(partita.getCoverageMethod().equals("EvoSuite")){
                urlCoverage = evosuiteUrlCoverageServer;
                responseEntity = restTemplate.postForEntity(urlCoverage, requestEntity, String.class);
                String responseBody_csv = responseEntity.getBody();
                Coverage coverageCSV = objectMapper.readValue(responseBody_csv, Coverage.class);
                coverageCSV.setCoverageXML(coverageXML.getCoverageXML());
                coverageJson = coverageCSV;
            }
            else{
                coverageJson = coverageXML;
            }

            try {
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

                    String coverage = "";

                    if (robot.equals("Randoop")) {
                        
                        if(partita.getCoverageMethod().equals("EvoSuite")){     //in questo caso gioco contro i test randoop misurati da evosuite (se coverageMethod = EvoSuite)
                            String filePath = "./TestsResults/"+className+"/RobotTest/"+robot+"Test/"+robotLevel+"Level/statistics.csv";
                            coverage = new String(Files.readAllBytes(Paths.get(filePath)));
                            // coverage = Parser.parseCSVCoverage(filePath);
                        }
                        else{                                                   //in questo caso gioco contro i test randoop misurati da emma (se coverageMethod = JaCoCo)
                            String filePath = "./TestsResults/"+className+"/RobotTest/"+robot+"Test/"+robotLevel+"Level/coveragetot.xml";
                            // coverage = Parser.parseXMLCoverage(filePath, partita.getNomeClasse());
                            coverage = new String(Files.readAllBytes(Paths.get(filePath)));
                        }

                    } else if (robot.equals("EvoSuite")) {                      // se robot=evosuite gioco sempre contro itest evosuite misurati con evosuite
                        String filePath = "./TestsResults/"+className+"/RobotTest/"+robot+"Test/"+robotLevel+"Level/TestReport/statistics.csv";
                        // coverage = Parser.parseCSVCoverage(filePath);
                        coverage = new String(Files.readAllBytes(Paths.get(filePath)));
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
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (JsonProcessingException e) {
            System.out.println("Fallito");
            e.printStackTrace();
        }

        return ResponseEntity.badRequest().build();
    }
}

