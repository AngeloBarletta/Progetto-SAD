package G8.T6.EditorApp.Model;

public class RequestDTO {
    private String testingClassName;
    private String testingClassCode;
    
    private String underTestClassName;
    private String underTestClassCode;

    // Constructor
    public RequestDTO(String testingClassName, String testingClassCode, String underTestClassName, String underTestClassCode) {
        this.testingClassName = testingClassName;
        this.testingClassCode = testingClassCode;
        this.underTestClassName = underTestClassName;
        this.underTestClassCode = underTestClassCode;
    }

    // Setters
    public void setTestingClassName(String testingClassName) {
        this.testingClassName = testingClassName;
    }

    public void setTestingClassCode(String testingClassCode) {
        this.testingClassCode = testingClassCode;
    }

    public void setUnderTestClassName(String underTestClassName) {
        this.underTestClassName = underTestClassName;
    }

    public void setUnderTestClassCode(String underTestClassCode) {
        this.underTestClassCode = underTestClassCode;
    }

    public String getTestingClassName(){
        return testingClassName;
    }
    
    public String getTestingClassCode() {
        return testingClassCode;
    }


    public String getUnderTestClassName(){
        return underTestClassName;
    }

    public String getUnderTestClassCode() {
        return underTestClassCode;
    }     
    
}