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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assume.assumeNotNull;
import static org.mockito.AdditionalMatchers.leq;
import static org.mockito.Mockito.*;

public class SpecificationBasedTest {

    private static RandoopConnector randoopConnector;
    private static IObserver obs;

    @BeforeClass
    public static void setUp(){
        randoopConnector = RandoopConnector.getInstance();
        assumeNotNull(randoopConnector);

        randoopConnector.setRepositoryDir(System.getProperty("user.home") + "/.T9_repo_test");
        obs = mock(IObserver.class);
    }

    @Test
    public void testClassCompile(){
        //la classe Esempio non compila
        assertThrows(RandoopException.class, ()->randoopConnector.generateRandoopTest("Esempio",5,obs));
        try{
            randoopConnector.generateRandoopTest("Esempio",5,obs);
        }catch (RandoopException e){
            assertEquals(e.getERROR_TYPE(),RandoopException.CLASS_NO_COMPILE);
        }
    }

    @Test
    public void testDirError(){
        //la cartella per la classe Calcolatore non esiste
        assertThrows(RandoopException.class, ()->randoopConnector.generateRandoopTest("Calcolatore",5,obs));
        try{
            randoopConnector.generateRandoopTest("Calcolatore",5,obs);
        }catch (RandoopException e){
            assertEquals(e.getERROR_TYPE(),RandoopException.DIR_ERROR);
        }
    }

    @Test
    public void testClassNotFound(){
        //la cartella per Calendario esiste, ma non c'è la classe
        assertThrows(RandoopException.class, ()->randoopConnector.generateRandoopTest("Calendario",5,obs));
        try{
            randoopConnector.generateRandoopTest("Calendario",5,obs);
        }catch (RandoopException e){
            assertEquals(e.getERROR_TYPE(),RandoopException.CLASS_NOT_FOUND);
        }
    }

    @Test
    public void testNoExceptions() throws RandoopException{
        randoopConnector.generateRandoopTest("VCardBean",3,obs);

        verify(obs, timeout(300000)).notifyCompleted(leq(3));

    }

    @AfterClass
    public static void tearDown() throws IOException {
        String path = System.getProperty("user.home") + "/.T9_repo_test/VCard/RobotTest/RandoopTest";
        FileUtils.deleteDirectory(new File(path));


    }

}
