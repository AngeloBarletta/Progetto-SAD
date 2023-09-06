package exceptions;

public class RandoopException extends Exception{

     public static final int INVALID_NTEST = 1;
    public static final int INVALID_CLASSNAME = 2;
    public static final int DIR_ERROR = 3;
    public static final int CLASS_NOT_FOUND = 4;
    public static final int CLASS_NO_COMPILE = 5;
   
    
    private int ERROR_TYPE;
    public RandoopException(String message, int error_type){
        super("[RANDOOP EXCEPTION]: "+message);
        this.ERROR_TYPE =error_type;
    }
    public int getERROR_TYPE(){return ERROR_TYPE;}
}
