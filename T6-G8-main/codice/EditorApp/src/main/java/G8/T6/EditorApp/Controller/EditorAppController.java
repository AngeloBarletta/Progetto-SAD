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
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/editor")
public class EditorAppController {
    private Partita partita;
    private Coverage coverageResult; 

    @Value("${COVERAGE_SERVER_URL}")
    private String urlCoverageServer; 

    @Value("${CLASS_SERVER_URL}")
    private String urlClassServer; 

    @Value("${TESTS_SERVER_URL}")
    private String urlTestsServer; 
    
    private final RestTemplate restTemplate = new RestTemplate(); // Inietta un'istanza di RestTemplate

    private String template(){
        return """
        import static org.junit.Assert.assertEquals;
        import org.junit.Test;
        public class AppTest{
        @After
        public void tearDown(){

        }

        @AfterClass
        public static void tearDownClass(){

        }

        @Before
        public void setUp(){

        }

        @BeforeClass
        public static void setUpClass(){

        }

        @Test
        public void test(){
            assertEquals(2,1+1);
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
                partita = new Partita(partitaJson.getIdGiocatore(), partitaJson.getIdPartita(), partitaJson.getNomeClasse(),
                        partitaJson.getCodiceClasse(), partitaJson.getIdRobot(), template());
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

        // Trasformiamo l'oggetto in una stringa json
        ObjectMapper objectMapper = new ObjectMapper();
        String json;

        try {
            json = objectMapper.writeValueAsString(testToSend);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);


            HttpEntity<String> requestEntity = new HttpEntity<>(json, headers);
            ResponseEntity<String> responseEntity = restTemplate.postForEntity(urlCoverageServer, requestEntity, String.class);

            String responseBody = responseEntity.getBody();
            
            objectMapper = new ObjectMapper();
            Coverage coverageJson;
            try {
                coverageJson = objectMapper.readValue(responseBody, Coverage.class);


                if (coverageJson != null) {
                    coverageResult = new Coverage(coverageJson.getError(), coverageJson.getOutCompile(), coverageJson.getCoverage());
                    return ResponseEntity.ok(responseBody);
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

