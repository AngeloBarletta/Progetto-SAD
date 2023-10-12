/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 02:26:39 GMT 2023
 */

package XMLParserSourceCode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import XMLParserSourceCode.XMLParser;
import java.util.Hashtable;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XMLParser_ESTest extends XMLParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XMLParser xMLParser0 = new XMLParser("");
      xMLParser0.store();
      assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", xMLParser0.getXML());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XMLParser xMLParser0 = new XMLParser("");
      Hashtable<Object, Object> hashtable0 = new Hashtable<Object, Object>();
      xMLParser0.addProperty("nta", "", hashtable0);
      xMLParser0.setProperty("nta", "", hashtable0);
      assertTrue(hashtable0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XMLParser xMLParser0 = new XMLParser("");
      Hashtable<Object, Object> hashtable0 = new Hashtable<Object, Object>();
      xMLParser0.addProperty("ngta", "", hashtable0);
      xMLParser0.setProperty("ngta", "ngta", hashtable0);
      assertTrue(hashtable0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XMLParser xMLParser0 = new XMLParser("");
      Hashtable<Object, Object> hashtable0 = new Hashtable<Object, Object>();
      hashtable0.put("ngta", "ngta");
      xMLParser0.setProperty("ngta", "ngta", hashtable0);
      assertEquals(1, hashtable0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = XMLParser.returnSpecial("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      XMLParser xMLParser0 = null;
      try {
        xMLParser0 = new XMLParser("+nX]m.`BQW!s.S2");
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // Not A Valid Format!
         //
         verifyException("XMLParserSourceCode.XMLParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      XMLParser xMLParser0 = new XMLParser("");
      String string0 = xMLParser0.getXML();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      XMLParser xMLParser0 = new XMLParser("");
      Hashtable<Object, Object> hashtable0 = new Hashtable<Object, Object>();
      hashtable0.put("ngta", "ngta");
      xMLParser0.addProperty("ngta", "", hashtable0);
      String string0 = xMLParser0.getSingleProperty("ngta");
      assertEquals("ngta", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      XMLParser xMLParser0 = new XMLParser("");
      Vector vector0 = xMLParser0.getProperty("ngta");
      assertEquals(10, vector0.capacity());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      XMLParser xMLParser0 = new XMLParser("");
      Hashtable<Object, Object> hashtable0 = new Hashtable<Object, Object>();
      hashtable0.put("ngta", "ngta");
      xMLParser0.addProperty("ngta", "", hashtable0);
      Vector vector0 = xMLParser0.getProperty("ngta");
      assertEquals("[{ngta=ngta, id=}, {id=}]", vector0.toString());
  }
}
