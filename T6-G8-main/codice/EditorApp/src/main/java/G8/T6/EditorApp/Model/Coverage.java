package G8.T6.EditorApp.Model;

public class Coverage {
    private boolean Error;
    private String outCompile;
    private String CoverageXML;
    private String CoverageCSV;

    // coverage del robot (valore percentuale)
    private String RobotCoverage;
    private String CoverageMethod;

    public Coverage(){
        
    }

    public Coverage(boolean Error, String outCompile, String CoverageXML, String CoverageCSV, String robotCoverage, String coverageMethod){
        this.Error = Error;
        this.outCompile = outCompile;
        this.CoverageXML = CoverageXML;
        this.CoverageCSV = CoverageCSV;
        this.RobotCoverage = robotCoverage;
        this.CoverageMethod = coverageMethod;
    }
    public void setOutCompile(String outCompile){
        this.outCompile=outCompile;
    }

    public String getOutCompile(){

       return outCompile;
    }

    public void setCoverageXML(String coverageXML){
        this.CoverageXML=coverageXML;
    }

    public String getCoverageXML(){
        return CoverageXML;
    }

    public void setCoverageCSV(String coverageCSV){
        this.CoverageCSV=coverageCSV;
    }

    public String getCoverageCSV(){
        return CoverageCSV;
    }

    public void setError(boolean error){
        this.Error=error;
    }

    public Boolean getError(){
        return Error;
    }

    public void setRobotCoverage(String robotCoverage){
        this.RobotCoverage=robotCoverage;
    }

    public String getRobotCoverage(){
        return RobotCoverage;
    }

    public String getCoverageMethod() {
        return CoverageMethod;
    }

    public void setCoverageMethod(String coverageMethod) {
        this.CoverageMethod = coverageMethod;
    }

}
