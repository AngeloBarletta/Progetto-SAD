package blackBoxTest;

import exceptions.RandoopException;
import interfaces.IObserver;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import randoop.RandoopConnector;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class RequestsTest {

    private static RandoopConnector randoopConnector;
    private static IObserver obs;

    @BeforeClass
    public static void setUp(){
       randoopConnector = RandoopConnector.getInstance();
       randoopConnector.setRepositoryDir(System.getProperty("user.home") + "/.T9_repo_test");
       obs = mock(IObserver.class);
    }

    @Test
    public void testReqQueue(){
        try {
            //inoltriamo 5 richieste; verifichiamo che tutte vengano servite
            randoopConnector.generateRandoopTest("Calcolatrice", 1, obs);
            randoopConnector.generateRandoopTest("Calcolatrice1", 1, obs);
            randoopConnector.generateRandoopTest("Calcolatrice2", 1, obs);
            randoopConnector.generateRandoopTest("Calcolatrice3", 1, obs);
            randoopConnector.generateRandoopTest("Calcolatrice4", 1, obs);

            verify(obs, timeout(3000000).times(5)).notifyCompleted(1);
        }catch(RandoopException e){
            e.printStackTrace();
            System.out.println("[ERROR] "+e.getERROR_TYPE());
        }
    }

    @AfterClass
    public static void tearDown() throws IOException {
       String path = System.getProperty("user.home") + "/.T9_repo_test/Calcolatrice/RobotTest/RandoopTest";
        FileUtils.deleteDirectory(new File(path));
        for(int i=1; i<=4; i++) {
            path = System.getProperty("user.home") + "/.T9_repo_test/Calcolatrice" + i + "/RobotTest/RandoopTest";
            FileUtils.deleteDirectory(new File(path));
        }
    }
}
