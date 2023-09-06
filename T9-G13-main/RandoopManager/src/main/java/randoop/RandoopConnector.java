package randoop;

import interfaces.*;
import exceptions.RandoopException;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;

public class RandoopConnector implements IRandoopConnector{
    //path Repository delle Classi
    private String repositoryPath;
    //singleton
    private static RandoopConnector instance;

    //gestione dei threads in esecuzione
    private static final int N_MAX = 4;
    private int numberThreads ;
    private boolean busyThreads[];
    private Queue<RandoopRequest> requests;

    //implmentazione DP Observer
    private Dictionary<String,IObserver> observers;

    //implementazione DP Singleton
    protected RandoopConnector(){
        repositoryPath = System.getProperty("user.home") + "/repo";
        requests = new LinkedList<RandoopRequest>();
        observers = new Hashtable<String,IObserver>();
        numberThreads=0;
        busyThreads = new boolean[N_MAX];
        for(boolean b: busyThreads){
            b = false;
        }

    }

    public static RandoopConnector getInstance(){
        if (instance == null) {
            instance = new RandoopConnector();
        }
        return instance;
    }

    public void setRepositoryDir(String dir){
        repositoryPath=dir;
    }
    
    //
    public void generateRandoopTest(String className, int maxNumberLevel, IObserver o) throws RandoopException{
        try {
            RandoopFilter f = new RandoopFilter(className,maxNumberLevel, repositoryPath);
            f.filter();
            observers.put(className, o);
            execRandoopTest(className, maxNumberLevel);
        }catch (IOException | InterruptedException e){

            e.printStackTrace();
        }
    }

    //creazione e gestione Threads
    private synchronized void execRandoopTest(String className, int maxNumberLevel){
        if(numberThreads < N_MAX) {
            numberThreads++;
            //seleziona thread su cui eseguire
            int threadIndex = 0;
            while(busyThreads[threadIndex]){
                threadIndex++;
            }
            busyThreads[threadIndex] = true;
            //System.out.println("[RANDOOP CONNECTOR] className="+className+" richiesta inoltrata; indiceThread="+(threadIndex+1));
            RandoopTestGenerator thread = new RandoopTestGenerator(className, this, maxNumberLevel, threadIndex+1, repositoryPath);
            thread.start();
        }else{
            //metti la richiesta in coda
            //System.out.println("[RANDOOP CONNECTOR] className="+className+" richiesta in coda");
            requests.add(new RandoopRequest(className,maxNumberLevel));
        }
    }

    public synchronized void operationCompleted(int nSessions, String className, int threadIndex){
        //System.out.println("[RANDOOP CONNECTOR] generation for class "+className+" completed by thread n"+threadIndex);
        numberThreads--;
        busyThreads[threadIndex-1] = false;
        //invia la notifica che hai completato a chi è in ascolto
        observers.get(className).notifyCompleted(nSessions);
        observers.remove(className);

        //vedi se ci sono richieste in coda
        if(!requests.isEmpty()){
            RandoopRequest r = requests.remove();
            execRandoopTest(r.getClassName(),r.getnTests());
        }

    }


}