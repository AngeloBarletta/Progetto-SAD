package unitTest;

import exceptions.RandoopException;
import interfaces.IRandoopConnector;
import org.junit.BeforeClass;
import org.junit.Test;
import randoop.RandoopConnector;
import randoop.RandoopFilter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FilterTest {

    private RandoopFilter randoopFilter;
    private static String testPath = System.getProperty("user.home") + "/.T9_repo_test";

    @Test
    public void testClassNameEmpty() throws Exception{
        randoopFilter = new RandoopFilter("",10, testPath);
        assertThrows(RandoopException.class, ()->randoopFilter.filter());
        try{
            randoopFilter.filter();
        }catch (RandoopException e){
            assertEquals(e.getERROR_TYPE(),RandoopException.INVALID_CLASSNAME);
        }
    }

    @Test
    public void testClassNameContainsSymbols() throws Exception{

        randoopFilter = new RandoopFilter("Calcolat.rice",10, testPath);
        assertThrows(RandoopException.class, ()->randoopFilter.filter());
        try{
            randoopFilter.filter();
        }catch (RandoopException e){
            assertEquals(e.getERROR_TYPE(),RandoopException.INVALID_CLASSNAME);
        }
    }

    @Test
    public void testClassNameIsLowerCase() throws Exception{

        randoopFilter = new RandoopFilter("calcolatrice",10, testPath);
        assertThrows(RandoopException.class, ()->randoopFilter.filter());
        try{
            randoopFilter.filter();
        }catch (RandoopException e){
            assertEquals(e.getERROR_TYPE(),RandoopException.INVALID_CLASSNAME);
        }
    }

    @Test
    public void testInputNumberNeg() throws Exception{
        randoopFilter = new RandoopFilter("Calcolatrice",-1, testPath);
        assertThrows(RandoopException.class, ()->randoopFilter.filter());
        try{
            randoopFilter.filter();
        }catch (RandoopException e){
            assertEquals(e.getERROR_TYPE(),RandoopException.INVALID_NTEST);
        }
    }

    @Test
    public void testInputNumberNull() throws Exception{
        randoopFilter = new RandoopFilter("Calcolatrice",0, testPath);
        assertThrows(RandoopException.class, ()->randoopFilter.filter());
        try{
            randoopFilter.filter();
        }catch (RandoopException e){
            assertEquals(e.getERROR_TYPE(),RandoopException.INVALID_NTEST);
        }
    }

    @Test
    public void testClassCompile() throws Exception{
        //la classe Esempio non compila
        randoopFilter = new RandoopFilter("Esempio",5, testPath);
        assertThrows(RandoopException.class, ()->randoopFilter.filter());
        try{
            randoopFilter.filter();
        }catch (RandoopException e){
            assertEquals(e.getERROR_TYPE(),RandoopException.CLASS_NO_COMPILE);
        }
    }

    @Test
    public void testDirError() throws Exception{
        //la cartella per la classe Calcolatore non esiste
        randoopFilter = new RandoopFilter("Calcolatore",2, testPath);
        assertThrows(RandoopException.class, ()->randoopFilter.filter());
        try{
            randoopFilter.filter();
        }catch (RandoopException e){
            assertEquals(e.getERROR_TYPE(),RandoopException.DIR_ERROR);
        }
    }

    @Test
    public void testClassNotFound() throws Exception{
        //la cartella per Calendario esiste, ma non c'è la classe
        randoopFilter = new RandoopFilter("Calendario",2, testPath);
        assertThrows(RandoopException.class, ()->randoopFilter.filter());
        try{
            randoopFilter.filter();
        }catch (RandoopException e){
            assertEquals(e.getERROR_TYPE(),RandoopException.CLASS_NOT_FOUND);
        }
    }

}
