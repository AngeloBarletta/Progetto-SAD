/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 22:40:05 GMT 2023
 */

package ImprovedTokenizerSourceCode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ImprovedTokenizerSourceCode.ImprovedTokenizer;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ImprovedTokenizer_ESTest extends ImprovedTokenizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ImprovedTokenizer improvedTokenizer0 = new ImprovedTokenizer("9gmLa`ls,ge.G4", "9gmLa`ls,ge.G4");
      improvedTokenizer0.myState = 46;
      // Undeclared exception!
      try { 
        improvedTokenizer0.next();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // invalid state: 46
         //
         verifyException("ImprovedTokenizerSourceCode.ImprovedTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ImprovedTokenizer improvedTokenizer0 = new ImprovedTokenizer("invalid state: ", "HNmpGEj");
      boolean boolean0 = improvedTokenizer0.advance();
      assertTrue(boolean0);
      
      String string0 = improvedTokenizer0.next();
      assertEquals("invalid state: ", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ImprovedTokenizer improvedTokenizer0 = new ImprovedTokenizer("QJf1t293+", "3p#N%_dB5gpq9?GHSm");
      improvedTokenizer0.myState = 3;
      // Undeclared exception!
      try { 
        improvedTokenizer0.next();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // invalid state: 3
         //
         verifyException("ImprovedTokenizerSourceCode.ImprovedTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ImprovedTokenizer improvedTokenizer0 = new ImprovedTokenizer("#%d_<-0Lf]GWoxkU}", "xp");
      boolean boolean0 = improvedTokenizer0.advance();
      assertTrue(boolean0);
      
      String string0 = improvedTokenizer0.next();
      assertNotNull(string0);
      assertEquals("#%d_<-0Lf]GWo", string0);
      
      String string1 = improvedTokenizer0.next();
      assertEquals("x", improvedTokenizer0.previousDelimiter());
      assertEquals("kU}", string1);
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ImprovedTokenizer improvedTokenizer0 = new ImprovedTokenizer("ImprovedTokenizerSourceCode.ImprovedTokenizer", "ImprovedTokenizerSourceCode.ImprovedTokenizer");
      improvedTokenizer0.advance();
      // Undeclared exception!
      try { 
        improvedTokenizer0.next();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // invalid state: 1
         //
         verifyException("ImprovedTokenizerSourceCode.ImprovedTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("&$aSfa&:zawHUj2k\"J");
      ImprovedTokenizer improvedTokenizer0 = new ImprovedTokenizer(stringReader0, "&$aSfa&:zawHUj2k\"J");
      improvedTokenizer0.myDelimiters = "LZ7}vZ}e/Y'k|8";
      // Undeclared exception!
      try { 
        improvedTokenizer0.afterToken('L');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ImprovedTokenizerSourceCode.ImprovedTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ImprovedTokenizer improvedTokenizer0 = new ImprovedTokenizer("ImprovedTokenizerSourceCode.ImprovedTokenizer", "Za8iR:69");
      String string0 = improvedTokenizer0.next();
      assertEquals("ImprovedToken", string0);
      assertNotNull(string0);
      
      int int0 = improvedTokenizer0.stop();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Lc^");
      ImprovedTokenizer improvedTokenizer0 = new ImprovedTokenizer(stringReader0, "Lc^");
      boolean boolean0 = improvedTokenizer0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ImprovedTokenizer improvedTokenizer0 = new ImprovedTokenizer("", "");
      boolean boolean0 = improvedTokenizer0.hasNext();
      assertFalse(boolean0);
      
      int int0 = improvedTokenizer0.stop();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ImprovedTokenizer improvedTokenizer0 = new ImprovedTokenizer("U1C5=G7pSU", "\"&=X");
      improvedTokenizer0.myState = (-1919);
      // Undeclared exception!
      try { 
        improvedTokenizer0.advance();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid state, -1919
         //
         verifyException("ImprovedTokenizerSourceCode.ImprovedTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ImprovedTokenizer improvedTokenizer0 = new ImprovedTokenizer("ImprovedTokenizerSourceCode.ImprovedTokenizer", "ImprovedTokenizerSourceCode.ImprovedTokenizer");
      StringReader stringReader0 = new StringReader("ImprovedTokenizerSourceCode.ImprovedTokenizer");
      improvedTokenizer0.initialize((Reader) stringReader0, "T*#UAQ&Dw`fC&/");
      boolean boolean0 = improvedTokenizer0.advance();
      assertTrue(boolean0);
      
      boolean boolean1 = improvedTokenizer0.advance();
      assertEquals("T", improvedTokenizer0.previousDelimiter());
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ImprovedTokenizer improvedTokenizer0 = new ImprovedTokenizer("", "");
      improvedTokenizer0.hasNext();
      StringReader stringReader0 = new StringReader("[dx)f{o");
      improvedTokenizer0.myInput = (Reader) stringReader0;
      // Undeclared exception!
      try { 
        improvedTokenizer0.advance();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid state, 1
         //
         verifyException("ImprovedTokenizerSourceCode.ImprovedTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ImprovedTokenizer improvedTokenizer0 = new ImprovedTokenizer("ImprovedTokenizerSourceCode.ImprovedTokenizer", "ImprovedTokenizerSourceCode.ImprovedTokenizer");
      improvedTokenizer0.myState = (-1);
      // Undeclared exception!
      try { 
        improvedTokenizer0.advance();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid state, -1
         //
         verifyException("ImprovedTokenizerSourceCode.ImprovedTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ImprovedTokenizer improvedTokenizer0 = new ImprovedTokenizer("L@valid state: ", "L@valid state: ");
      boolean boolean0 = improvedTokenizer0.keepParsing(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ImprovedTokenizer improvedTokenizer0 = new ImprovedTokenizer("ImprovedTokenizerSourceCode.ImprovedTokenizer", "Bp;jjQ#9");
      StringReader stringReader0 = new StringReader("Bp;jjQ#9");
      improvedTokenizer0.initialize((Reader) stringReader0, "T*#UAQ&Dw`fC&/");
      String string0 = improvedTokenizer0.next();
      assertNotNull(string0);
      
      String string1 = improvedTokenizer0.next();
      assertEquals("Bp;jj", string1);
      
      boolean boolean0 = improvedTokenizer0.hasNext();
      assertEquals("Q#", improvedTokenizer0.previousDelimiter());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ImprovedTokenizer improvedTokenizer0 = new ImprovedTokenizer("U1C5=G7pSU", "\"&=X");
      improvedTokenizer0.myState = (-1919);
      boolean boolean0 = improvedTokenizer0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ImprovedTokenizer improvedTokenizer0 = new ImprovedTokenizer("ImprovedTokenizerSourceCode.ImprovedTokenizer", "Bp;jjQ#9");
      boolean boolean0 = improvedTokenizer0.advance();
      assertTrue(boolean0);
      
      boolean boolean1 = improvedTokenizer0.hasNext();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ImprovedTokenizer improvedTokenizer0 = new ImprovedTokenizer("", "");
      boolean boolean0 = improvedTokenizer0.hasNext();
      assertFalse(boolean0);
      
      boolean boolean1 = improvedTokenizer0.hasNext();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ImprovedTokenizer improvedTokenizer0 = new ImprovedTokenizer("", "");
      PipedInputStream pipedInputStream0 = new PipedInputStream(3);
      improvedTokenizer0.initialize((InputStream) pipedInputStream0, "");
      assertEquals(4, ImprovedTokenizer.STATE_AFTER_TOKEN);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ImprovedTokenizer improvedTokenizer0 = new ImprovedTokenizer("", "");
      String string0 = improvedTokenizer0.previousDelimiter();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("ImprovedTokenizerSourceCode.ImprovedTokenizer");
      ImprovedTokenizer improvedTokenizer0 = new ImprovedTokenizer(stringReader0, "");
      String string0 = improvedTokenizer0.next();
      assertEquals("ImprovedTokenizerSourceCode.ImprovedTokenizer", string0);
      assertNotNull(string0);
      
      boolean boolean0 = improvedTokenizer0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ImprovedTokenizer improvedTokenizer0 = new ImprovedTokenizer("<=pZ^m%Gicuu<i^2v ", "<=pZ^m%Gicuu<i^2v ");
      improvedTokenizer0.myState = 3;
      boolean boolean0 = improvedTokenizer0.hasNext();
      assertFalse(boolean0);
  }
}
