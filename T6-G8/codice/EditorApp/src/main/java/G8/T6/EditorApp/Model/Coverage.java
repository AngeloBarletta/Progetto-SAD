package G8.T6.EditorApp.Model;

public class Coverage {
    private boolean Error;
    private String outCompile;
    private String Coverage;

    public Coverage(){

    }

    public Coverage(boolean Error, String outCompile, String Coverage){
        this.Error = Error;
        this.outCompile = outCompile;
        this.Coverage = Coverage;
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

}
