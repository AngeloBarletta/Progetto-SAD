/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 12 01:37:25 GMT 2023
 */

package SubjectParserSourceCode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import SubjectParserSourceCode.SubjectParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SubjectParser_ESTest extends SubjectParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SubjectParser.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        SubjectParser.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[3] = "~{y[]XpL&JH@^[D";
      SubjectParser.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[13];
      stringArray0[3] = "/2)>tQPh^eF>Tn[wX&";
      SubjectParser.main(stringArray0);
      assertEquals(13, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SubjectParser subjectParser0 = new SubjectParser("0");
      int int0 = subjectParser0.getUpperRange();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SubjectParser subjectParser0 = new SubjectParser((String) null);
      String string0 = subjectParser0.getTitle();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SubjectParser subjectParser0 = new SubjectParser("0");
      String string0 = subjectParser0.getTitle();
      assertNotNull(string0);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SubjectParser subjectParser0 = new SubjectParser("");
      String string0 = subjectParser0.getTitle();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SubjectParser subjectParser0 = new SubjectParser("0");
      int int0 = subjectParser0.getThisRange();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SubjectParser subjectParser0 = new SubjectParser("0");
      String string0 = subjectParser0.getRangeString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SubjectParser subjectParser0 = new SubjectParser("0");
      long long0 = subjectParser0.getId();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SubjectParser subjectParser0 = new SubjectParser("3");
      long long0 = subjectParser0.getId();
      assertEquals(3L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SubjectParser subjectParser0 = new SubjectParser((String) null);
      long long0 = subjectParser0.getId();
      assertEquals((-1L), long0);
  }
}
