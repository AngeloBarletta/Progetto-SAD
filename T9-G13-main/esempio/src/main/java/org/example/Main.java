package org.example;

import exceptions.RandoopException;
import interfaces.IObserver;
import interfaces.IRandoopConnector;
import randoop.RandoopConnector;
import java.io.File;
public class Main implements IObserver {

    public static void main(String[] args) {
        Main main = new Main();

        String path = System.getProperty("user.home") + "/repo";

        RandoopConnector conn = RandoopConnector.getInstance();
        conn.setRepositoryDir(path);

        IRandoopConnector randoopConnector = RandoopConnector.getInstance();

        File currentDir = new File(path);

        File[] folders = currentDir.listFiles(File::isDirectory);

        for (File folder : folders) {
            try {
                randoopConnector.generateRandoopTest(folder.getName(), 3, main);
            }catch (RandoopException e){
                e.printStackTrace();
                System.out.println("ERROR CODE: "+e.getERROR_TYPE());
            }
        }
    }

    @Override
    public void notifyCompleted(int i) {
        System.out.println("N LEVELS COMPLETED: ="+i);
    }
}