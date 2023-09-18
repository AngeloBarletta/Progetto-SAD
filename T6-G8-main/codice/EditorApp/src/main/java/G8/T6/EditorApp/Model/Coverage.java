package G8.T6.EditorApp.Model;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


public class Coverage {
    private boolean Error;
    private String outCompile;
    private String Coverage;

    // coverage del robot (valore percentuale)
    private int RobotCoverage;

    public Coverage(){
        
    }

    public Coverage(boolean Error, String outCompile, String Coverage, int robotCoverage){
        this.Error = Error;
        this.outCompile = outCompile;
        this.Coverage = Coverage;
        this.RobotCoverage = robotCoverage;
    }
    public void setOutCompile(String outCompile){
        this.outCompile=outCompile;
    }

    public String getOutCompile(){

       return outCompile;
    }

    public void setCoverage(String coverage){
        this.Coverage=coverage;
    }

    public String getCoverage(){
        return Coverage;
    }

    public void setError(boolean error){
        this.Error=error;
    }

    public Boolean getError(){
        return Error;
    }

    public void setRobotCoverage(int robotCoverage){
        this.RobotCoverage=robotCoverage;
    }

    public int getRobotCoverage(){
        return RobotCoverage;
    }


    public static int getLineCoverage(String filePath, String fileUnderTest) {
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


}
