/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 22:59:57 GMT 2023
 */

package InflectionSourceCode;

import org.junit.Test;
import static org.junit.Assert.*;
import InflectionSourceCode.Inflection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Inflection_ESTest extends Inflection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = Inflection.singularize("nufcL?icF`Y{1");
      assertEquals("nufcL?icF`Y{1", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Inflection inflection0 = new Inflection("", "nufcL?icF`Y{1");
      String string0 = inflection0.replace("UNl\")<YYfzU2tQF");
      assertEquals("nufcL?icF`Y{1UnufcL?icF`Y{1NnufcL?icF`Y{1lnufcL?icF`Y{1\"nufcL?icF`Y{1)nufcL?icF`Y{1<nufcL?icF`Y{1YnufcL?icF`Y{1YnufcL?icF`Y{1fnufcL?icF`Y{1znufcL?icF`Y{1UnufcL?icF`Y{12nufcL?icF`Y{1tnufcL?icF`Y{1QnufcL?icF`Y{1FnufcL?icF`Y{1", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = Inflection.pluralize("");
      assertEquals("s", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Inflection inflection0 = new Inflection("", "nufcL?icF`Y{1");
      boolean boolean0 = inflection0.match("x8SJKQ}?{x!+");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      boolean boolean0 = Inflection.isUncountable("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Inflection inflection0 = new Inflection("", (String) null, true);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Inflection inflection0 = new Inflection("w3NraY");
  }
}
