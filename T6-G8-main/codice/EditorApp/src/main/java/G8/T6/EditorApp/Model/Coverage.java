package G8.T6.EditorApp.Model;

public class Coverage {
    private boolean Error;
    private String outCompile;
    private String Coverage;

    // coverage del robot (valore percentuale)
    private int RobotCoverage;
    private String CoverageMethod;

    public Coverage(){
        
    }

    public Coverage(boolean Error, String outCompile, String Coverage, int robotCoverage, String coverageMethod){
        this.Error = Error;
        this.outCompile = outCompile;
        this.Coverage = Coverage;
        this.RobotCoverage = robotCoverage;
        this.CoverageMethod = coverageMethod;
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

    public String getCoverageMethod() {
        return CoverageMethod;
    }

    public void setCoverageMethod(String coverageMethod) {
        this.CoverageMethod = coverageMethod;
    }

}
