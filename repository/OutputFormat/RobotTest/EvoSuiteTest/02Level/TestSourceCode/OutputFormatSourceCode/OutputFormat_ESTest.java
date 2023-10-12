/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 23:18:53 GMT 2023
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
      OutputFormat outputFormat0 = new OutputFormat("3vKjx#}Y@gCDxol", false);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-newlines";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      String[] stringArray0 = new String[6];
      stringArray0[1] = "-encoding";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      String[] stringArray0 = new String[9];
      stringArray0[1] = "-indentSize";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 1);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[6] = "-indent";
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      assertEquals("  ", outputFormat0.getIndent());
      
      int int0 = outputFormat0.parseOptions(stringArray0, 6);
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertTrue(outputFormat0.isPadText());
      assertTrue(outputFormat0.isTrimText());
      assertEquals(8, int0);
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("\n", outputFormat0.getLineSeparator());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-omitEncoding", true);
      String[] stringArray0 = new String[7];
      stringArray0[2] = "-expandEmpty(ugX,T- ";
      stringArray0[3] = "-omitEncoding";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-suppressDeclaration";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      assertFalse(outputFormat0.isXHTML());
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-xhtml2";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isXHTML());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("gnjl5rA", false);
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter(' ');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character ( )
         //
         verifyException("OutputFormatSourceCode.OutputFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setAttributeQuoteCharacter('\"');
      assertFalse(outputFormat0.isOmitEncoding());
      assertTrue(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals("  ", outputFormat0.getIndent());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isTrimText());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertTrue(outputFormat0.isPadText());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('&');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (&)
         //
         verifyException("OutputFormatSourceCode.OutputFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-NxpndEmptyj");
      outputFormat0.setAttributeQuoteCharacter('\'');
      assertEquals('\'', outputFormat0.getAttributeQuoteCharacter());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Tj8", true, "-indentSize");
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('W');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (W)
         //
         verifyException("OutputFormatSourceCode.OutputFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true, "");
      assertEquals("", outputFormat0.getIndent());
      
      outputFormat0.setIndentSize((-1444));
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertEquals("", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isPadText());
      assertTrue(outputFormat0.isNewlines());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("HN", true, "HN");
      assertEquals("HN", outputFormat0.getIndent());
      
      outputFormat0.setIndent(true);
      assertEquals("  ", outputFormat0.getIndent());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setIndent("-encoding");
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isTrimText());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals("-encoding", outputFormat0.getIndent());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isSuppressDeclaration());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true, "");
      assertEquals("", outputFormat0.getIndent());
      
      outputFormat0.setIndent("");
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isTrimText());
      assertEquals("", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertTrue(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isPadText());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true, "");
      outputFormat0.setEncoding("");
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isPadText());
      assertTrue(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals("", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertEquals("", outputFormat0.getIndent());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("\n", outputFormat0.getLineSeparator());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      String[] stringArray0 = new String[21];
      stringArray0[0] = ";LW Z}<9>^?k";
      outputFormat0.parseOptions(stringArray0, 0);
      assertEquals("  ", outputFormat0.getIndent());
      assertTrue(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isOmitEncoding());
      assertTrue(outputFormat0.isPadText());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertTrue(outputFormat0.isTrimText());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", false, (String) null);
      String[] stringArray0 = new String[7];
      int int0 = outputFormat0.parseOptions(stringArray0, 2866);
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("", outputFormat0.getIndent());
      assertEquals(2866, int0);
      assertFalse(outputFormat0.isPadText());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isNewlines());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("HN", true, "HN");
      assertFalse(outputFormat0.isXHTML());
      
      outputFormat0.setXHTML(true);
      boolean boolean0 = outputFormat0.isXHTML();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Jtbn<Vjbdjd{_WY^dv#", true);
      boolean boolean0 = outputFormat0.isXHTML();
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("Jtbn<Vjbdjd{_WY^dv#", outputFormat0.getIndent());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(boolean0);
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertTrue(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isPadText());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isExpandEmptyElements());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      boolean boolean0 = outputFormat0.isTrimText();
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertTrue(boolean0);
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isXHTML());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isPadText());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-xhtml", false, "T, 58Qap2u4");
      boolean boolean0 = outputFormat0.isTrimText();
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("-xhtml", outputFormat0.getIndent());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isPadText());
      assertFalse(boolean0);
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals("T, 58Qap2u4", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      assertFalse(outputFormat0.isSuppressDeclaration());
      
      outputFormat0.setSuppressDeclaration(true);
      boolean boolean0 = outputFormat0.isSuppressDeclaration();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Jtbn<Vjbdjd{_WY^dv#", true);
      boolean boolean0 = outputFormat0.isSuppressDeclaration();
      assertFalse(outputFormat0.isPadText());
      assertTrue(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isTrimText());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals("Jtbn<Vjbdjd{_WY^dv#", outputFormat0.getIndent());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      boolean boolean0 = outputFormat0.isPadText();
      assertEquals("  ", outputFormat0.getIndent());
      assertTrue(boolean0);
      assertTrue(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isOmitEncoding());
      assertTrue(outputFormat0.isTrimText());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isXHTML());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      boolean boolean0 = outputFormat0.isPadText();
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(boolean0);
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Jtbn<Vjbdjd{_WY^dv#", true);
      assertFalse(outputFormat0.isOmitEncoding());
      
      outputFormat0.setOmitEncoding(true);
      boolean boolean0 = outputFormat0.isOmitEncoding();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", false);
      boolean boolean0 = outputFormat0.isOmitEncoding();
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isNewlines());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(boolean0);
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isPadText());
      assertEquals("", outputFormat0.getIndent());
      assertEquals("\n", outputFormat0.getLineSeparator());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("bOx't", true);
      boolean boolean0 = outputFormat0.isNewlines();
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("bOx't", outputFormat0.getIndent());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertTrue(boolean0);
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isXHTML());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isTrimText());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null, false, "");
      boolean boolean0 = outputFormat0.isNewlines();
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isTrimText());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(boolean0);
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals("", outputFormat0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", false);
      boolean boolean0 = outputFormat0.isNewLineAfterDeclaration();
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isPadText());
      assertEquals("", outputFormat0.getIndent());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isNewlines());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(boolean0);
      assertFalse(outputFormat0.isOmitEncoding());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Invalid attribute quote character (", true);
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      
      outputFormat0.setNewLineAfterDeclaration(false);
      boolean boolean0 = outputFormat0.isNewLineAfterDeclaration();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true, "");
      boolean boolean0 = outputFormat0.isExpandEmptyElements();
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals("", outputFormat0.getIndent());
      assertFalse(outputFormat0.isPadText());
      assertFalse(boolean0);
      assertTrue(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("", outputFormat0.getEncoding());
      assertEquals("\n", outputFormat0.getLineSeparator());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true, "");
      int int0 = outputFormat0.getNewLineAfterNTags();
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertTrue(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals(0, int0);
      assertFalse(outputFormat0.isTrimText());
      assertEquals("", outputFormat0.getIndent());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isXHTML());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Jtbn<Vjbdjd{_WY^dv#", true);
      outputFormat0.setNewLineAfterNTags(89);
      int int0 = outputFormat0.getNewLineAfterNTags();
      assertEquals(89, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true, "");
      outputFormat0.setNewLineAfterNTags((-1444));
      int int0 = outputFormat0.getNewLineAfterNTags();
      assertEquals((-1444), int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", false);
      assertEquals("\n", outputFormat0.getLineSeparator());
      
      outputFormat0.setLineSeparator((String) null);
      outputFormat0.getLineSeparator();
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isPadText());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isXHTML());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("", outputFormat0.getIndent());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true, "");
      String string0 = outputFormat0.getLineSeparator();
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("\n", string0);
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isXHTML());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals("", outputFormat0.getIndent());
      assertEquals("", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isTrimText());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", false);
      assertEquals("\n", outputFormat0.getLineSeparator());
      
      outputFormat0.setLineSeparator("");
      String string0 = outputFormat0.getLineSeparator();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null, false, "");
      String string0 = outputFormat0.getIndent();
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isNewlines());
      assertEquals("", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertNull(string0);
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isTrimText());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("H{=p(U4p/S0", true);
      String string0 = outputFormat0.getIndent();
      assertFalse(outputFormat0.isPadText());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals("H{=p(U4p/S0", string0);
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertTrue(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isOmitEncoding());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true, "");
      String string0 = outputFormat0.getIndent();
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isTrimText());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("", outputFormat0.getEncoding());
      assertEquals("", string0);
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isXHTML());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", false, (String) null);
      String string0 = outputFormat0.getEncoding();
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isNewlines());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertNull(string0);
      assertEquals("", outputFormat0.getIndent());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("3vKjx#}Y@gCDxol", false);
      String string0 = outputFormat0.getEncoding();
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals("3vKjx#}Y@gCDxol", outputFormat0.getIndent());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isNewlines());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals("UTF-8", string0);
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isPadText());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true, "");
      String string0 = outputFormat0.getEncoding();
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isPadText());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals("", string0);
      assertEquals("", outputFormat0.getIndent());
      assertTrue(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isTrimText());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      char char0 = outputFormat0.getAttributeQuoteCharacter();
      assertTrue(outputFormat0.isPadText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals('\"', char0);
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertTrue(outputFormat0.isNewlines());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("  ", outputFormat0.getIndent());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isTrimText());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isSuppressDeclaration());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      assertFalse(outputFormat0.isExpandEmptyElements());
      
      outputFormat0.setExpandEmptyElements(true);
      boolean boolean0 = outputFormat0.isExpandEmptyElements();
      assertTrue(boolean0);
  }
}
