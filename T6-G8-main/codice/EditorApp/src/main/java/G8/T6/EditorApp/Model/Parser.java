package G8.T6.EditorApp.Model;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


public class Parser {
    public static int parseXMLCoverage(String filePath, String fileUnderTest) {
        try {
            // Carica il file XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(filePath);
    
            // Ottieni l'elemento <srcfile name="ClassUnderTest.java">
            NodeList srcfileList = doc.getElementsByTagName("srcfile");
            for (int i = 0; i < srcfileList.getLength(); i++) {
                Element srcfileElement = (Element) srcfileList.item(i);
                String fileName = srcfileElement.getAttribute("name");
    
                // Controlla se il nome del file è "ClassUnderTest.java"
                if (fileUnderTest.equals(fileName)) {
                    // Recupera l'elemento <coverage type="line, %" value="100% (2/2)"/>
                    Element lineCoverageElement = (Element) srcfileElement.getElementsByTagName("coverage").item(3); // L'indice 3 rappresenta la copertura delle linee
    
                    // Estrai il valore della copertura delle linee
                    String lineCoverage = lineCoverageElement.getAttribute("value");
    
                    // Estrai solo il valore numerico
                    String[] parts = lineCoverage.split(" ");
                    return Integer.parseInt(parts[0].replace("%","")); // La parte "100%" viene sostituita con il valore numerico
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1; // Ritorna null se il file non è stato trovato o c'è un errore
    }

    public static int parseCSVCoverage(String filePath) {
            // Carica il file CSV
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();
            for (String[] record : records) {
                String targetClass = record[0];
                String criterion = record[1];
                String coverage = record[2];

                if ("LINE".equals(criterion)) {
                    try {
                        float coverageFloat = Float.parseFloat(coverage);
                        int coveragePercentage = (int) (coverageFloat * 100);

                        System.out.println("Target Class: " + targetClass);
                        System.out.println("Criterion: " + criterion);
                        System.out.println("Coverage (Percentage): " + coveragePercentage + "%");

                        return coveragePercentage;
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid Coverage format: " + coverage);
                    }
                }
            }
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1; // Ritorna null se il file non è stato trovato o c'è un errore
    }
}