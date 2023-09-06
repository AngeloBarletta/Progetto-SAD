package randoop;
import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

import org.apache.commons.io.FileUtils;

public class RandoopTestGenerator extends Thread{

    private RandoopConnector randoopConnector;
    
    private static final String START_DIR =  System.getProperty("user.home") + "/.T9_projects_test";
    private String REPOSITORY_DIR;
    private final String INPUT_CLASSNAME;
    private final String PROJECT_DIR;
    private final String TEST_DIR;
    private int maxNumberLevel;
    private int threadIndex;


    private int testExceeded;

    public RandoopTestGenerator(String className, RandoopConnector randoopConnector, int maxNumberLevel, int threadIndex, String repository_dir){
        this.randoopConnector = randoopConnector;
        this.maxNumberLevel = maxNumberLevel;
        this.threadIndex = threadIndex;
        this.REPOSITORY_DIR = repository_dir;
        INPUT_CLASSNAME = className;

        PROJECT_DIR = START_DIR + "/project_"+threadIndex;
        TEST_DIR = PROJECT_DIR + "/src/test/java";


        testExceeded=0;
    }

    private void randoop(int timeLimit, String nomeRegr, String nomeErr, int seed) throws IOException, InterruptedException,URISyntaxException {
        //System.out.println("[DEBUG] TIME: " + timeLimit + " SEED: " + seed);
        //SE VA SU WINDOWS NECESSARIO MODIFICARE SEPARATORE DEL CLASSPATH

        String separator = ":";
        String[] commands = {"/bin/bash","-c",""};


        String cmd = "cd " + PROJECT_DIR + " && mvn compile && java -classpath "
				+ "../randoop-all-4.3.2.jar"
                + separator
                + "./target/classes/"
                + " randoop.main.Main gentests"
                + " --testclass=" + INPUT_CLASSNAME
                + " --time-limit=" + timeLimit
                + " --regression-test-basename=" + nomeRegr
                + " --error-test-basename=" + nomeErr
                + " --randomseed=" + seed
                + " --junit-output-dir=" + TEST_DIR
                + " && mvn test";
        commands[2] = cmd;
        Process process = Runtime.getRuntime().exec(commands);
        //process.getInputStream().transferTo(System.out);
        process.getErrorStream().transferTo(System.out);
        process.waitFor();

    }

    private int runTest(RandoopFileManager fileManager) throws IOException, InterruptedException,URISyntaxException{
        int i = 0;
        int testForSession = 0;
        int dirNum = 1;
        double coverage = 0;
        double oldCoverage = 0;
        //maxTestForSession: numero di esecuzioni di randoop per un singolo livello
        int maxTestForSession = 2; //da definire
        //IMAX - parametro per la saturazione: determina il numero di test generati con la stessa copertura che determina la condizione di uscita
        int I_MAX = 5; //da definire
        // DELTA - parametro per la saturazione: detrmina quando due coperture possono ritenersi equivalenti
        double DELTA = 0.05; //da definire
        //time: tempo in secondida cui parte randoop
        int time = 5;

        boolean newIteration = true; //variabile booleana che determina quando l'algoritmo termina
        boolean exceedingLevels = false;

        // variaibili per la valutazione della copertura
        int inst_missed=0, inst_covered=0;
        String[] result ={"",""};

        while (newIteration) {
            String nomeErr = "ErrorL" + dirNum + "T" + testForSession + "Test";
            String nomeRegr = "RegressionL" + dirNum + "T" + testForSession + "Test";

            //metodo wrapper per la chiamata a randoop
            randoop(time, nomeRegr, nomeErr, new Random().nextInt(100) + 1);

            if(!exceedingLevels) {
                testForSession = (testForSession + 1) % maxTestForSession;
            }else{
                testForSession+=1;
            }

            //calcolo della copertura
            String line = "";
            String splitBy = ",";
            String csvFilePath = PROJECT_DIR + "/target/my-reports/jacoco.csv";
            BufferedReader br = new BufferedReader(new FileReader(csvFilePath));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                result = line.split(splitBy);    // use comma as separator
            }
            inst_missed = Integer.parseInt(result[3]);
            inst_covered = Integer.parseInt(result[4]);
            coverage = (double) inst_covered/ (inst_missed + inst_covered);
            //fine calcolo copertura

            //valutazione saturazione
            if (Math.abs(oldCoverage - coverage) <= DELTA) {
                i++;
            } else {
                i = 0;
            }
            oldCoverage = coverage;

            newIteration = (coverage <= 0.95) && (i < I_MAX - 1);

            //se siamo alla fine della sessione o non faremo altre iterazioni, salva i test finora
            if ((testForSession % maxTestForSession == 0)|| !newIteration) {
                time = incrementTime(time);
                if(dirNum <= maxNumberLevel) {
                    fileManager.saveTests(dirNum, true);
                    dirNum++;
                }
                else {
                    exceedingLevels = true;
                    fileManager.saveTests(maxNumberLevel+1, false);
                }

            }
        }
        
        if(exceedingLevels)
            testExceeded=testForSession;
        return dirNum-1;
    }

    // legge incremento del tempo ad ogni sessione
    private int incrementTime(int time) {
        int TIME_MAX = 100;
        int TIME_INCR = 5;
        if (time < TIME_MAX) {
            time += TIME_INCR;
        } else {
            time += 1;
        }
        return time;
    }

    //metodo chiamato dal thread 
    public void run(){
        RandoopFileManager fileManager = new RandoopFileManager(REPOSITORY_DIR, PROJECT_DIR, INPUT_CLASSNAME);
        int nLevel = 0;
        try {           
            fileManager.initTest();
            nLevel = runTest(fileManager);
            if(testExceeded!=0){ //la funzione selectTest viene chiamata solo sono sttai generati test in eccesso
                //System.out.println("TEST EXCEEDED "+testExceeded);
                fileManager.selectTest(maxNumberLevel,testExceeded);
            }

        }catch (Exception e){
            e.printStackTrace();
            nLevel=0;
        }
        
        try {
            fileManager.cleanDir();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        randoopConnector.operationCompleted(nLevel,INPUT_CLASSNAME,threadIndex);
    }
}
