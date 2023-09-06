package randoop;

public class RandoopRequest {

    private String className;
    private int nTests;

    public RandoopRequest(String className, int nTests) {
        this.className = className;
        this.nTests = nTests;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getnTests() {
        return nTests;
    }

    public void setnTests(int nTests) {
        this.nTests = nTests;
    }

}
