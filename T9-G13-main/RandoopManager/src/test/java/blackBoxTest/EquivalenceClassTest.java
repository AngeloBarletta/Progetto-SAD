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
import static org.mockito.Mockito.*;

public class EquivalenceClassTest {

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
    public void testClassNameEmpty() throws Exception{
        assertThrows(RandoopException.class, ()->randoopConnector.generateRandoopTest("",10,obs));
        try{
            randoopConnector.generateRandoopTest("",10,obs);
        }catch (RandoopException e){
            assertEquals(e.getERROR_TYPE(),RandoopException.INVALID_CLASSNAME);
        }
    }

    @Test
    public void testClassNameContainsSymbols() throws Exception{
        assertThrows(RandoopException.class, ()->randoopConnector.generateRandoopTest("Calcolat.rice",10,obs));
        try{
            randoopConnector.generateRandoopTest("Calcolat.rice",10,obs);
        }catch (RandoopException e){
            assertEquals(e.getERROR_TYPE(),RandoopException.INVALID_CLASSNAME);
        }
    }

    @Test
    public void testClassNameIsLowerCase() throws Exception{
        assertThrows(RandoopException.class, ()->randoopConnector.generateRandoopTest("calcolatrice",10,obs));

        try{
            randoopConnector.generateRandoopTest("calcolatrice",10,obs);
        }catch (RandoopException e){
            assertEquals(e.getERROR_TYPE(),RandoopException.INVALID_CLASSNAME);
        }
    }

    @Test
    public void testInputNumber() throws Exception{
        assertThrows(RandoopException.class, ()->randoopConnector.generateRandoopTest("Calcolatrice",-1,obs));
        try{
            randoopConnector.generateRandoopTest("Calcolatrice",-1,obs);
        }catch (RandoopException e){
            assertEquals(e.getERROR_TYPE(),RandoopException.INVALID_NTEST);
        }
    }

    @Test
    public void testInputNumberBoundaryValue() throws Exception{
        assertThrows(RandoopException.class, ()->randoopConnector.generateRandoopTest("Calcolatrice",0,obs));
        try{
            randoopConnector.generateRandoopTest("Calcolatrice",0,obs);
        }catch (RandoopException e){
            assertEquals(e.getERROR_TYPE(),RandoopException.INVALID_NTEST);
        }
    }

    @Test
    public void testValidClass() throws Exception{
        randoopConnector.generateRandoopTest("Calcolatrice",1,obs);

        verify(obs, timeout(240000)).notifyCompleted(1);
    }

    @AfterClass
    public static void tearDown() throws IOException {
        String path = System.getProperty("user.home") + "/.T9_repo_test/Calcolatrice/RobotTest/RandoopTest";
        FileUtils.deleteDirectory(new File(path));


    }
}
