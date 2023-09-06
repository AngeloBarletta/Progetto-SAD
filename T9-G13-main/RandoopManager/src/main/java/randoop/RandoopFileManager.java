package randoop;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class RandoopFileManager {
    private String repositoryPath;
    private final String INPUT_CLASSNAME;
    private final String CLASS_PATH_BASE;
    private final String TEST_PATH_BASE;
    private final String PROJECT_DIR;
    private final String MAIN_DIR;
    private final String TEST_DIR;

    public RandoopFileManager(String repositoryPath, String project, String className){
        this.repositoryPath= repositoryPath;
        INPUT_CLASSNAME = className;
        PROJECT_DIR = project;
        MAIN_DIR = PROJECT_DIR + "/src/main/java";
        TEST_DIR = PROJECT_DIR + "/src/test/java";
        CLASS_PATH_BASE = repositoryPath + "/" + INPUT_CLASSNAME+"/"+INPUT_CLASSNAME+"SourceCode";
        TEST_PATH_BASE = repositoryPath + "/" + INPUT_CLASSNAME+"/RobotTest/RandoopTest";
    }

    private void copyWithPattern(String src, String dst,String pattern)throws IOException{

        File dir = new File(src);

        File[] files = dir.listFiles((dir1, name) -> {
            return name.contains(pattern);
        });


        for(File f : files) {    
            FileUtils.copyFileToDirectory(f, new java.io.File(dst));
        }
    }

    public void saveTests(int dirNum, boolean savePrev) throws IOException {
        String dirName = ((dirNum <10) ? "0"+dirNum : Integer.toString(dirNum))+"Level";
        String sessionDir = TEST_PATH_BASE + "/"+dirName+"/TestSourceCode";
        Path sessionDirPath = Paths.get(sessionDir);
        Files.createDirectories(sessionDirPath); //gestione delle cartelle necessarie al salvataggio dei test




        //due possibili comportamenti
        //  1) qunado savePrev == true inseriamo nel livello dirNum tutti i file generati fino a quel momemento
        //  2) quando savePrev == false inseriamo nel livello dirNum solo i file generati per lo specifico livello
        if( savePrev){
            for(int i=1 ; i  <= dirNum ; i++){
                copyWithPattern(TEST_DIR,sessionDir,"L"+i);
            }
        }else{
            copyWithPattern(TEST_DIR,sessionDir,"L"+dirNum);
        }

        
    }

    public void initTest() throws IOException {
        String inputClassFilePath = CLASS_PATH_BASE +"/" + INPUT_CLASSNAME +".java";
        String destinationDir = MAIN_DIR;
        FileUtils.copyFileToDirectory(new java.io.File(inputClassFilePath), new java.io.File(destinationDir));
        Path folderPath = Paths.get(TEST_PATH_BASE);
        Files.createDirectories(folderPath);

        String cleanCommand = "mvn -f "+ PROJECT_DIR + " clean";

        try {
            Process process = Runtime.getRuntime().exec(cleanCommand);
            process.getErrorStream().transferTo(System.out);
            process.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    


    public void selectTest(int nMaxTest, int testExceeded) throws IOException{

        int ampiezzaIntervallo = Integer.max(testExceeded/nMaxTest,1);
        int testToSave=2;
        Random rand;
        int dest_index = nMaxTest+1;
        String dirName = ((dest_index <10) ? "0"+dest_index : Integer.toString(dest_index))+"Level";
        String src = TEST_PATH_BASE + "/"+dirName+"/TestSourceCode";
        String dest;
        /*
         * ampiezza = test
         *
         */
        int selectedTest = 0;
        for(int i=0 ; i < nMaxTest ; i++){
           //k=2 numero randomico tra i*ampiezza_intervallo e (i+1)*ampiezza_intervallo-1
            for(int j=0 ; j < testToSave ; j++){
                rand = new Random();
                selectedTest=i*ampiezzaIntervallo+rand.nextInt(ampiezzaIntervallo);
                for(int k=nMaxTest; k > i ; k--){
                    dirName =  ((k <10) ? "0"+k : Integer.toString(k))+"Level";
                    dest = TEST_PATH_BASE + "/"+dirName+"/TestSourceCode";
                    copyWithPattern(src, dest, "T"+selectedTest+"Test");
                    
                }
            }
        }
        //eliminiamo la cartella in eccesso
        FileUtils.deleteDirectory(new File(src));
        //FileUtils.forceDelete(new File(src));

    } 
    
    //svuota la cartella del progetto utilizzato per un futuro utilizzo
    public void cleanDir() throws IOException {
        String cleanCommand = "mvn -f "+ PROJECT_DIR + " clean";

        try {
            Process process = Runtime.getRuntime().exec(cleanCommand);
            process.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String mainJavaFilesPattern = MAIN_DIR + "/";
        String testJavaFilesPattern = TEST_DIR + "/";
        


        FileUtils.cleanDirectory(new File(mainJavaFilesPattern));
        FileUtils.cleanDirectory(new File(testJavaFilesPattern));
    }



}
