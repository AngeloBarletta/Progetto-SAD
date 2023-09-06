package randoop;

import exceptions.RandoopException;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RandoopFilter {
    private String className;
    private String class_file_path;
    private int maxNumLevels;

    private String repositoryPath;

    public RandoopFilter(String className, int maxNumLevels, String repositoryPath){
        this.repositoryPath = repositoryPath;
        this.className = className;
        class_file_path = repositoryPath + "/"+className+"/"+className+"SourceCode";
        this.maxNumLevels = maxNumLevels;
    }

    private void checkClassName() throws RandoopException{
        File f = new File(class_file_path);
        if(!f.isDirectory()){
            throw new RandoopException("The directory for class " + className+" doesn't exists",RandoopException.DIR_ERROR);
        }
        f = new File(class_file_path + "/" + className + ".java");
        if(!f.exists()){
            throw new RandoopException("The file for this class ("+className+") doesn't exists",RandoopException.CLASS_NOT_FOUND);
        }
    }
    private void checkClassCompile() throws RandoopException,IOException,InterruptedException {

        Process p = Runtime.getRuntime().exec("javac " + class_file_path + "/" + className + ".java");
        //p.getErrorStream().transferTo(System.out);
        p.waitFor();
        if(p.exitValue() != 0){
            throw new RandoopException("Unable to compile class "+className,RandoopException.CLASS_NO_COMPILE);
        }
        FileUtils.forceDelete(new File(class_file_path + "/" + className + ".class"));
    }

    private void validateInput()throws RandoopException{
        if(maxNumLevels <= 0){
            throw new RandoopException("Max number of tests must be <= 0", RandoopException.INVALID_NTEST);
        }
        if(className.isEmpty()){
            throw new RandoopException("Class name must not be empty", RandoopException.INVALID_CLASSNAME);

        }
        if(Character.isLowerCase(className.charAt(0))){
            throw new RandoopException("Class name "+className+" is not a valid input value: must start with uppercase letter", RandoopException.INVALID_CLASSNAME);
        }
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(className);
        if(matcher.find()){
             throw new RandoopException("Class name "+className+" is not a valid input value: must not contain any special characters", RandoopException.INVALID_CLASSNAME);
        }

    }

    public void filter() throws RandoopException,IOException,InterruptedException{
        validateInput();
        checkClassName();
        checkClassCompile();
    }

}