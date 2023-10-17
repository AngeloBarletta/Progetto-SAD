/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 23:14:34 GMT 2023
 */

package OutputFormatSourceCode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import OutputFormatSourceCode.OutputFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OutputFormat_ESTest extends OutputFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      assertFalse(outputFormat0.isXHTML());
      
      outputFormat0.setXHTML(true);
      assertTrue(outputFormat0.isXHTML());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      assertFalse(outputFormat0.isTrimText());
      
      outputFormat0.setTrimText(true);
      assertTrue(outputFormat0.isTrimText());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setSuppressDeclaration(false);
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isXHTML());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("nyPG");
      outputFormat0.setPadText(false);
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals("nyPG", outputFormat0.getIndent());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isNewlines());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-expandEmpty");
      outputFormat0.setOmitEncoding(false);
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("-expandEmpty", outputFormat0.getIndent());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isNewlines());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setNewlines(false);
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isTrimText());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setNewLineAfterNTags((-9));
      assertEquals((-9), outputFormat0.getNewLineAfterNTags());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("rCBF*:", true, "-lineSeparator");
      outputFormat0.setNewLineAfterDeclaration(true);
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("-lineSeparator", outputFormat0.getEncoding());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertTrue(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals("rCBF*:", outputFormat0.getIndent());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isPadText());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("nyPG");
      assertEquals("\n", outputFormat0.getLineSeparator());
      
      outputFormat0.setLineSeparator("J@b$JhZ/gbrPP1o=0x");
      assertFalse(outputFormat0.isXHTML());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("nyPG", outputFormat0.getIndent());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isTrimText());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      assertEquals("  ", outputFormat0.getIndent());
      
      outputFormat0.setIndentSize(0);
      assertTrue(outputFormat0.isTrimText());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setIndent(false);
      assertFalse(outputFormat0.isTrimText());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isPadText());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      assertEquals("  ", outputFormat0.getIndent());
      
      outputFormat0.setIndent("");
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isXHTML());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isTrimText());
      assertTrue(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertTrue(outputFormat0.isPadText());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("nyPG");
      outputFormat0.setExpandEmptyElements(false);
      assertEquals("nyPG", outputFormat0.getIndent());
      assertFalse(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isXHTML());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isTrimText());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setEncoding("y/|Tqy[TT3sqCj3IDip");
      assertEquals("y/|Tqy[TT3sqCj3IDip", outputFormat0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = "n\\u#2^\"\\e*K";
      OutputFormat outputFormat0 = new OutputFormat(string0, true, string0);
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('.');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (.)
         //
         verifyException("OutputFormatSourceCode.OutputFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("sHa");
      String[] stringArray0 = new String[0];
      int int0 = outputFormat0.parseOptions(stringArray0, 357);
      assertEquals("sHa", outputFormat0.getIndent());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isTrimText());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isXHTML());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals(357, int0);
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      boolean boolean0 = outputFormat0.isTrimText();
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isNewlines());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(boolean0);
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isPadText());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      boolean boolean0 = outputFormat0.isSuppressDeclaration();
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isTrimText());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(boolean0);
      assertFalse(outputFormat0.isXHTML());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isExpandEmptyElements());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      boolean boolean0 = outputFormat0.isPadText();
      assertFalse(boolean0);
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isNewlines());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isTrimText());
      assertEquals("UTF-8", outputFormat0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      boolean boolean0 = outputFormat0.isOmitEncoding();
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(boolean0);
      assertFalse(outputFormat0.isNewlines());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-expandEmpty");
      boolean boolean0 = outputFormat0.isNewlines();
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(boolean0);
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isTrimText());
      assertEquals("-expandEmpty", outputFormat0.getIndent());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isSuppressDeclaration());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      boolean boolean0 = outputFormat0.isNewLineAfterDeclaration();
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isPadText());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertTrue(boolean0);
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("UTF-8", outputFormat0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("xjrR)<`", false, "");
      String string0 = outputFormat0.getIndent();
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isNewlines());
      assertEquals("", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("xjrR)<`", string0);
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isPadText());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("");
      char char0 = outputFormat0.getAttributeQuoteCharacter();
      assertFalse(outputFormat0.isTrimText());
      assertEquals('\"', char0);
      assertFalse(outputFormat0.isXHTML());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isNewlines());
      assertEquals("", outputFormat0.getIndent());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      boolean boolean0 = outputFormat0.isXHTML();
      assertFalse(boolean0);
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isPadText());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertTrue(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("  ", outputFormat0.getIndent());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      String string0 = outputFormat0.getEncoding();
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("UTF-8", string0);
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("rCBF*:", true, "-lineSeparator");
      String string0 = outputFormat0.getLineSeparator();
      assertTrue(outputFormat0.isNewlines());
      assertEquals("rCBF*:", outputFormat0.getIndent());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isPadText());
      assertEquals("-lineSeparator", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertEquals("\n", string0);
      assertFalse(outputFormat0.isExpandEmptyElements());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null, true);
      assertFalse(outputFormat0.isPadText());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isTrimText());
      assertTrue(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("\n", outputFormat0.getLineSeparator());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("nyPG");
      int int0 = outputFormat0.getNewLineAfterNTags();
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isXHTML());
      assertEquals(0, int0);
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("nyPG", outputFormat0.getIndent());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isPadText());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      boolean boolean0 = outputFormat0.isExpandEmptyElements();
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(boolean0);
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isTrimText());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
  }
}