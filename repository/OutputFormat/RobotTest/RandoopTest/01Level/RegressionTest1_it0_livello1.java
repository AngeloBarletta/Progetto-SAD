
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    outputFormat0.setIndentSize((int)'\"');
    outputFormat0.setIndentSize(1);
    outputFormat0.setIndent("hi!");
    java.lang.String str10 = outputFormat0.getLineSeparator();
    // The following exception was thrown during execution in test generation
    try {
    outputFormat0.setAttributeQuoteCharacter('a');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n"+ "'", str10.equals("\n"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    java.lang.String str10 = outputFormat0.getEncoding();
    outputFormat0.setTrimText(true);
    outputFormat0.setOmitEncoding(true);
    boolean b15 = outputFormat0.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UTF-8"+ "'", str10.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(true);
    outputFormat0.setNewlines(false);
    OutputFormat outputFormat11 = new OutputFormat("hi!");
    boolean b12 = outputFormat11.isOmitEncoding();
    java.lang.String[] str_array15 = new java.lang.String[] { "", "\n" };
    int i17 = outputFormat11.parseOptions(str_array15, (int)(byte)1);
    int i19 = outputFormat0.parseOptions(str_array15, (int)'4');
    boolean b20 = outputFormat0.isNewLineAfterDeclaration();
    java.lang.String str21 = outputFormat0.getLineSeparator();
    boolean b22 = outputFormat0.isXHTML();
    outputFormat0.setIndent(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\n"+ "'", str21.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setNewLineAfterNTags((int)(short)100);
    outputFormat0.setNewlines(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    java.lang.String str5 = outputFormat0.getIndent();
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isNewlines();
    outputFormat0.setSuppressDeclaration(true);
    boolean b10 = outputFormat0.isTrimText();
    outputFormat0.setEncoding("hi!");
    boolean b13 = outputFormat0.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setNewlines(true);
    outputFormat1.setNewLineAfterDeclaration(true);
    boolean b7 = outputFormat1.isSuppressDeclaration();
    boolean b8 = outputFormat1.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    boolean b6 = outputFormat3.isNewLineAfterDeclaration();
    outputFormat3.setIndentSize((int)(short)-1);
    outputFormat3.setOmitEncoding(false);
    outputFormat3.setSuppressDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setIndent("\n");
    OutputFormat outputFormat9 = new OutputFormat("", false, "");
    OutputFormat outputFormat10 = OutputFormat.createCompactFormat();
    java.lang.String str11 = outputFormat10.getLineSeparator();
    java.lang.String[] str_array15 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i17 = outputFormat10.parseOptions(str_array15, (int)' ');
    int i19 = outputFormat9.parseOptions(str_array15, (int)(short)0);
    outputFormat9.setOmitEncoding(true);
    boolean b22 = outputFormat9.isOmitEncoding();
    OutputFormat outputFormat24 = new OutputFormat("hi!");
    outputFormat24.setIndent(true);
    outputFormat24.setEncoding("");
    OutputFormat outputFormat29 = OutputFormat.createCompactFormat();
    outputFormat29.setNewlines(false);
    boolean b32 = outputFormat29.isNewLineAfterDeclaration();
    outputFormat29.setNewlines(true);
    outputFormat29.setExpandEmptyElements(true);
    java.lang.String str37 = outputFormat29.getLineSeparator();
    outputFormat29.setNewlines(false);
    outputFormat29.setXHTML(false);
    outputFormat29.setPadText(false);
    OutputFormat outputFormat44 = OutputFormat.createCompactFormat();
    outputFormat44.setNewlines(false);
    boolean b47 = outputFormat44.isNewLineAfterDeclaration();
    outputFormat44.setNewlines(true);
    outputFormat44.setExpandEmptyElements(true);
    java.lang.String str52 = outputFormat44.getLineSeparator();
    outputFormat44.setNewlines(false);
    OutputFormat outputFormat55 = OutputFormat.createCompactFormat();
    java.lang.String str56 = outputFormat55.getLineSeparator();
    java.lang.String[] str_array60 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i62 = outputFormat55.parseOptions(str_array60, (int)' ');
    int i64 = outputFormat44.parseOptions(str_array60, (int)' ');
    int i66 = outputFormat29.parseOptions(str_array60, (int)' ');
    int i68 = outputFormat24.parseOptions(str_array60, 100);
    int i70 = outputFormat9.parseOptions(str_array60, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    int i72 = outputFormat0.parseOptions(str_array60, (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n"+ "'", str11.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "\n"+ "'", str37.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "\n"+ "'", str52.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "\n"+ "'", str56.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 1);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    boolean b1 = outputFormat0.isTrimText();
    outputFormat0.setPadText(false);
    outputFormat0.setPadText(false);
    OutputFormat outputFormat6 = OutputFormat.createCompactFormat();
    outputFormat6.setNewlines(false);
    boolean b9 = outputFormat6.isNewLineAfterDeclaration();
    outputFormat6.setXHTML(true);
    java.lang.String str12 = outputFormat6.getLineSeparator();
    boolean b13 = outputFormat6.isPadText();
    OutputFormat outputFormat17 = new OutputFormat("", false, "");
    OutputFormat outputFormat18 = OutputFormat.createCompactFormat();
    java.lang.String str19 = outputFormat18.getLineSeparator();
    java.lang.String[] str_array23 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i25 = outputFormat18.parseOptions(str_array23, (int)' ');
    int i27 = outputFormat17.parseOptions(str_array23, (int)(short)0);
    int i29 = outputFormat6.parseOptions(str_array23, (int)(short)0);
    int i31 = outputFormat0.parseOptions(str_array23, 34);
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setExpandEmptyElements(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\n"+ "'", str19.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 34);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    outputFormat1.setIndent(true);
    boolean b4 = outputFormat1.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", false, "UTF-8");
    outputFormat3.setLineSeparator("");
    java.lang.String str6 = outputFormat3.getLineSeparator();
    outputFormat3.setAttributeQuoteCharacter('\"');
    outputFormat3.setEncoding("                                  ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", true, "hi!");
    boolean b4 = outputFormat3.isOmitEncoding();
    int i5 = outputFormat3.getNewLineAfterNTags();
    outputFormat3.setOmitEncoding(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setExpandEmptyElements(false);
    outputFormat1.setIndent("  ");
    outputFormat1.setNewLineAfterNTags((int)(short)0);
    outputFormat1.setOmitEncoding(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    outputFormat0.setNewLineAfterNTags((int)'a');
    boolean b6 = outputFormat0.isOmitEncoding();
    outputFormat0.setSuppressDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    outputFormat0.setIndentSize((int)'\"');
    outputFormat0.setIndentSize(1);
    outputFormat0.setIndent("hi!");
    boolean b10 = outputFormat0.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }


    OutputFormat outputFormat1 = new OutputFormat("");
    outputFormat1.setSuppressDeclaration(false);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setIndentSize((int)(short)1);
    java.lang.String str9 = outputFormat0.getLineSeparator();
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b12 = outputFormat0.isXHTML();
    outputFormat0.setNewLineAfterNTags((int)' ');
    outputFormat0.setNewLineAfterDeclaration(true);
    boolean b17 = outputFormat0.isSuppressDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n"+ "'", str9.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    outputFormat1.setPadText(true);
    boolean b5 = outputFormat1.isOmitEncoding();
    outputFormat1.setXHTML(false);
    boolean b8 = outputFormat1.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    OutputFormat outputFormat4 = OutputFormat.createCompactFormat();
    outputFormat4.setNewlines(false);
    outputFormat4.setNewLineAfterDeclaration(false);
    boolean b9 = outputFormat4.isTrimText();
    boolean b10 = outputFormat4.isPadText();
    OutputFormat outputFormat11 = OutputFormat.createCompactFormat();
    outputFormat11.setNewlines(false);
    boolean b14 = outputFormat11.isNewLineAfterDeclaration();
    outputFormat11.setNewlines(true);
    outputFormat11.setExpandEmptyElements(true);
    java.lang.String str19 = outputFormat11.getLineSeparator();
    outputFormat11.setNewlines(false);
    OutputFormat outputFormat22 = OutputFormat.createCompactFormat();
    java.lang.String str23 = outputFormat22.getLineSeparator();
    java.lang.String[] str_array27 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i29 = outputFormat22.parseOptions(str_array27, (int)' ');
    int i31 = outputFormat11.parseOptions(str_array27, (int)' ');
    int i33 = outputFormat4.parseOptions(str_array27, (int)(short)10);
    int i35 = outputFormat3.parseOptions(str_array27, (int)'\"');
    outputFormat3.setXHTML(false);
    boolean b38 = outputFormat3.isOmitEncoding();
    java.lang.String str39 = outputFormat3.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\n"+ "'", str19.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\n"+ "'", str23.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + ""+ "'", str39.equals(""));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }


    OutputFormat outputFormat3 = new OutputFormat("UTF-8", true, "hi!");
    outputFormat3.setIndent("          ");

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    int i6 = outputFormat1.getNewLineAfterNTags();
    boolean b7 = outputFormat1.isNewLineAfterDeclaration();
    java.lang.String str8 = outputFormat1.getIndent();
    boolean b9 = outputFormat1.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setNewlines(true);
    outputFormat1.setNewLineAfterDeclaration(true);
    outputFormat1.setEncoding("hi!");
    outputFormat1.setSuppressDeclaration(false);
    boolean b11 = outputFormat1.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", true, "hi!");
    boolean b4 = outputFormat3.isPadText();
    outputFormat3.setOmitEncoding(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    OutputFormat outputFormat8 = OutputFormat.createCompactFormat();
    outputFormat8.setNewlines(false);
    boolean b11 = outputFormat8.isNewLineAfterDeclaration();
    outputFormat8.setNewlines(true);
    outputFormat8.setExpandEmptyElements(true);
    java.lang.String str16 = outputFormat8.getLineSeparator();
    outputFormat8.setNewlines(false);
    java.lang.String str19 = outputFormat8.getIndent();
    OutputFormat outputFormat21 = new OutputFormat("hi!");
    boolean b22 = outputFormat21.isOmitEncoding();
    java.lang.String[] str_array25 = new java.lang.String[] { "", "\n" };
    int i27 = outputFormat21.parseOptions(str_array25, (int)(byte)1);
    int i29 = outputFormat8.parseOptions(str_array25, (int)'a');
    int i31 = outputFormat1.parseOptions(str_array25, 52);
    outputFormat1.setExpandEmptyElements(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\n"+ "'", str16.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 52);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    int i13 = outputFormat0.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setTrimText(true);
    boolean b7 = outputFormat0.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    outputFormat0.setIndent("hi!");
    outputFormat0.setIndentSize((int)(short)-1);
    int i16 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    java.lang.String str6 = outputFormat1.getIndent();
    OutputFormat outputFormat8 = new OutputFormat("hi!");
    boolean b9 = outputFormat8.isOmitEncoding();
    java.lang.String[] str_array12 = new java.lang.String[] { "", "\n" };
    int i14 = outputFormat8.parseOptions(str_array12, (int)(byte)1);
    int i16 = outputFormat1.parseOptions(str_array12, (int)(byte)10);
    java.lang.String str17 = outputFormat1.getEncoding();
    java.lang.String str18 = outputFormat1.getIndent();
    OutputFormat outputFormat20 = new OutputFormat("hi!");
    boolean b21 = outputFormat20.isOmitEncoding();
    java.lang.String[] str_array24 = new java.lang.String[] { "", "\n" };
    int i26 = outputFormat20.parseOptions(str_array24, (int)(byte)1);
    int i28 = outputFormat1.parseOptions(str_array24, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "UTF-8"+ "'", str17.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setTrimText(false);
    boolean b10 = outputFormat0.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    java.lang.String str12 = outputFormat0.getLineSeparator();
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setLineSeparator("\n");
    boolean b17 = outputFormat0.isXHTML();
    java.lang.String str18 = outputFormat0.getEncoding();
    boolean b19 = outputFormat0.isOmitEncoding();
    outputFormat0.setXHTML(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "UTF-8"+ "'", str18.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    java.lang.String str6 = outputFormat1.getLineSeparator();
    char char7 = outputFormat1.getAttributeQuoteCharacter();
    java.lang.String str8 = outputFormat1.getIndent();
    boolean b9 = outputFormat1.isOmitEncoding();
    outputFormat1.setIndentSize((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b5 = outputFormat0.isTrimText();
    boolean b6 = outputFormat0.isPadText();
    OutputFormat outputFormat7 = OutputFormat.createCompactFormat();
    outputFormat7.setNewlines(false);
    boolean b10 = outputFormat7.isNewLineAfterDeclaration();
    outputFormat7.setNewlines(true);
    outputFormat7.setExpandEmptyElements(true);
    java.lang.String str15 = outputFormat7.getLineSeparator();
    outputFormat7.setNewlines(false);
    OutputFormat outputFormat18 = OutputFormat.createCompactFormat();
    java.lang.String str19 = outputFormat18.getLineSeparator();
    java.lang.String[] str_array23 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i25 = outputFormat18.parseOptions(str_array23, (int)' ');
    int i27 = outputFormat7.parseOptions(str_array23, (int)' ');
    int i29 = outputFormat0.parseOptions(str_array23, (int)(short)10);
    boolean b30 = outputFormat0.isOmitEncoding();
    boolean b31 = outputFormat0.isPadText();
    outputFormat0.setNewLineAfterNTags((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\n"+ "'", str15.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\n"+ "'", str19.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setIndentSize((int)(short)100);
    outputFormat0.setPadText(true);
    outputFormat0.setNewlines(true);
    outputFormat0.setIndent(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }


    OutputFormat outputFormat3 = new OutputFormat("  ", true, "UTF-8");
    outputFormat3.setOmitEncoding(false);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    outputFormat1.setIndent("");
    outputFormat1.setSuppressDeclaration(false);
    outputFormat1.setEncoding("UTF-8");
    outputFormat1.setIndent(false);
    java.lang.String str11 = outputFormat1.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    boolean b9 = outputFormat0.isOmitEncoding();
    boolean b10 = outputFormat0.isTrimText();
    outputFormat0.setAttributeQuoteCharacter('\"');
    int i13 = outputFormat0.getNewLineAfterNTags();
    boolean b14 = outputFormat0.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    boolean b4 = outputFormat3.isOmitEncoding();
    outputFormat3.setIndent(true);
    outputFormat3.setNewLineAfterDeclaration(false);
    java.lang.String str9 = outputFormat3.getLineSeparator();
    boolean b10 = outputFormat3.isExpandEmptyElements();
    outputFormat3.setPadText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n"+ "'", str9.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    boolean b7 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setNewLineAfterNTags((int)(short)100);
    outputFormat1.setXHTML(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setPadText(false);
    outputFormat0.setIndent(false);
    int i17 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setIndent("\n");
    outputFormat0.setPadText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }


    OutputFormat outputFormat2 = new OutputFormat("  ", true);
    outputFormat2.setNewLineAfterDeclaration(true);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }


    OutputFormat outputFormat2 = new OutputFormat("UTF-8", false);
    outputFormat2.setEncoding("\n");
    outputFormat2.setNewLineAfterNTags((int)(short)1);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }


    OutputFormat outputFormat3 = new OutputFormat("UTF-8", false, "                                  ");

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setIndent("hi!");
    java.lang.String str9 = outputFormat0.getIndent();
    OutputFormat outputFormat10 = OutputFormat.createCompactFormat();
    outputFormat10.setNewlines(false);
    boolean b13 = outputFormat10.isNewLineAfterDeclaration();
    outputFormat10.setNewlines(true);
    int i16 = outputFormat10.getNewLineAfterNTags();
    outputFormat10.setTrimText(false);
    outputFormat10.setIndent(false);
    OutputFormat outputFormat22 = new OutputFormat("");
    java.lang.String str23 = outputFormat22.getIndent();
    int i24 = outputFormat22.getNewLineAfterNTags();
    outputFormat22.setIndent("UTF-8");
    OutputFormat outputFormat27 = OutputFormat.createCompactFormat();
    outputFormat27.setNewlines(false);
    boolean b30 = outputFormat27.isNewLineAfterDeclaration();
    outputFormat27.setNewlines(true);
    outputFormat27.setExpandEmptyElements(true);
    java.lang.String str35 = outputFormat27.getLineSeparator();
    outputFormat27.setNewlines(false);
    java.lang.String str38 = outputFormat27.getIndent();
    java.lang.String str39 = outputFormat27.getLineSeparator();
    int i40 = outputFormat27.getNewLineAfterNTags();
    outputFormat27.setExpandEmptyElements(false);
    outputFormat27.setExpandEmptyElements(true);
    java.lang.String[] str_array46 = new java.lang.String[] { "  " };
    int i48 = outputFormat27.parseOptions(str_array46, (int)(byte)0);
    int i50 = outputFormat22.parseOptions(str_array46, (int)(byte)1);
    int i52 = outputFormat10.parseOptions(str_array46, 97);
    int i54 = outputFormat0.parseOptions(str_array46, 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\n"+ "'", str35.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "\n"+ "'", str39.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 97);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    int i6 = outputFormat1.getNewLineAfterNTags();
    char char7 = outputFormat1.getAttributeQuoteCharacter();
    outputFormat1.setXHTML(true);
    outputFormat1.setNewLineAfterNTags(100);
    outputFormat1.setSuppressDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndent("\n");
    outputFormat0.setIndent(true);
    outputFormat0.setTrimText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    java.lang.String str12 = outputFormat0.getLineSeparator();
    int i13 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setExpandEmptyElements(false);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String[] str_array19 = new java.lang.String[] { "  " };
    int i21 = outputFormat0.parseOptions(str_array19, (int)(byte)0);
    outputFormat0.setIndent(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    outputFormat0.setNewLineAfterNTags((int)'a');
    boolean b6 = outputFormat0.isOmitEncoding();
    outputFormat0.setExpandEmptyElements(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    java.lang.String str12 = outputFormat0.getLineSeparator();
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setLineSeparator("\n");
    boolean b17 = outputFormat0.isXHTML();
    outputFormat0.setNewlines(true);
    java.lang.String str20 = outputFormat0.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isXHTML();
    outputFormat1.setExpandEmptyElements(true);
    boolean b7 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setIndentSize(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndent("\n");
    outputFormat0.setNewLineAfterNTags((int)(byte)1);
    outputFormat0.setTrimText(false);
    java.lang.String str11 = outputFormat0.getLineSeparator();
    outputFormat0.setIndentSize((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n"+ "'", str11.equals("\n"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    java.lang.String str12 = outputFormat0.getLineSeparator();
    int i13 = outputFormat0.getNewLineAfterNTags();
    boolean b14 = outputFormat0.isNewLineAfterDeclaration();
    char char15 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setLineSeparator("hi!");
    outputFormat0.setXHTML(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char15 == '\"');

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }


    OutputFormat outputFormat2 = new OutputFormat("\n", false);
    outputFormat2.setNewLineAfterDeclaration(true);
    outputFormat2.setNewLineAfterNTags(10);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    java.lang.String str5 = outputFormat0.getIndent();
    outputFormat0.setOmitEncoding(false);
    int i8 = outputFormat0.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "UTF-8"+ "'", str5.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    outputFormat0.setExpandEmptyElements(true);
    boolean b7 = outputFormat0.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    outputFormat1.setIndent(true);
    outputFormat1.setNewLineAfterNTags(0);
    outputFormat1.setSuppressDeclaration(true);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "  ");
    boolean b4 = outputFormat3.isExpandEmptyElements();
    boolean b5 = outputFormat3.isSuppressDeclaration();
    char char6 = outputFormat3.getAttributeQuoteCharacter();
    java.lang.String str7 = outputFormat3.getEncoding();
    outputFormat3.setEncoding("\n");
    outputFormat3.setLineSeparator("          ");
    boolean b12 = outputFormat3.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char6 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "  "+ "'", str7.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    boolean b9 = outputFormat0.isOmitEncoding();
    boolean b10 = outputFormat0.isTrimText();
    boolean b11 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    OutputFormat outputFormat8 = OutputFormat.createCompactFormat();
    outputFormat8.setNewlines(false);
    boolean b11 = outputFormat8.isNewLineAfterDeclaration();
    outputFormat8.setNewlines(true);
    outputFormat8.setExpandEmptyElements(true);
    java.lang.String str16 = outputFormat8.getLineSeparator();
    outputFormat8.setNewlines(false);
    java.lang.String str19 = outputFormat8.getIndent();
    OutputFormat outputFormat21 = new OutputFormat("hi!");
    boolean b22 = outputFormat21.isOmitEncoding();
    java.lang.String[] str_array25 = new java.lang.String[] { "", "\n" };
    int i27 = outputFormat21.parseOptions(str_array25, (int)(byte)1);
    int i29 = outputFormat8.parseOptions(str_array25, (int)'a');
    int i31 = outputFormat1.parseOptions(str_array25, 52);
    outputFormat1.setOmitEncoding(true);
    boolean b34 = outputFormat1.isXHTML();
    outputFormat1.setIndentSize((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\n"+ "'", str16.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    boolean b4 = outputFormat0.isNewlines();
    char char5 = outputFormat0.getAttributeQuoteCharacter();
    java.lang.String str6 = outputFormat0.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char5 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    boolean b6 = outputFormat3.isNewLineAfterDeclaration();
    outputFormat3.setPadText(true);
    outputFormat3.setNewlines(false);
    outputFormat3.setIndent(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setIndentSize((int)(short)100);
    outputFormat0.setIndentSize((int)(short)10);
    java.lang.String str10 = outputFormat0.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "          "+ "'", str10.equals("          "));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setOmitEncoding(false);
    outputFormat0.setIndentSize((int)(byte)0);
    java.lang.String str11 = outputFormat0.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }


    OutputFormat outputFormat1 = new OutputFormat("  ");
    outputFormat1.setIndentSize((int)(short)100);
    java.lang.String str4 = outputFormat1.getEncoding();
    char char5 = outputFormat1.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "UTF-8"+ "'", str4.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char5 == '\"');

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setIndent(true);
    char char6 = outputFormat0.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char6 == '\"');

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    outputFormat0.setIndentSize((int)'\"');
    outputFormat0.setIndentSize(1);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    boolean b9 = outputFormat0.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    outputFormat2.setIndent(true);
    java.lang.String str5 = outputFormat2.getIndent();
    boolean b6 = outputFormat2.isExpandEmptyElements();
    boolean b7 = outputFormat2.isTrimText();
    boolean b8 = outputFormat2.isNewlines();
    boolean b9 = outputFormat2.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "  "+ "'", str5.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", true, "");
    boolean b4 = outputFormat3.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    java.lang.String str10 = outputFormat0.getEncoding();
    java.lang.String str11 = outputFormat0.getEncoding();
    outputFormat0.setEncoding("UTF-8");
    outputFormat0.setNewLineAfterNTags(34);
    outputFormat0.setPadText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UTF-8"+ "'", str10.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "UTF-8"+ "'", str11.equals("UTF-8"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }


    OutputFormat outputFormat3 = new OutputFormat("", true, "UTF-8");
    boolean b4 = outputFormat3.isSuppressDeclaration();
    int i5 = outputFormat3.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setNewLineAfterNTags(10);
    outputFormat0.setExpandEmptyElements(false);
    java.lang.String str12 = outputFormat0.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    char char2 = outputFormat1.getAttributeQuoteCharacter();
    int i3 = outputFormat1.getNewLineAfterNTags();
    boolean b4 = outputFormat1.isOmitEncoding();
    outputFormat1.setXHTML(true);
    boolean b7 = outputFormat1.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char2 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    boolean b4 = outputFormat0.isNewlines();
    char char5 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b8 = outputFormat0.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char5 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    java.lang.String str12 = outputFormat0.getLineSeparator();
    outputFormat0.setNewLineAfterNTags(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }


    OutputFormat outputFormat3 = new OutputFormat("          ", false, "");

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    outputFormat0.setSuppressDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isXHTML();
    boolean b6 = outputFormat0.isOmitEncoding();
    java.lang.String str7 = outputFormat0.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }


    OutputFormat outputFormat2 = new OutputFormat("", true);
    outputFormat2.setEncoding("");
    boolean b5 = outputFormat2.isNewLineAfterDeclaration();
    int i6 = outputFormat2.getNewLineAfterNTags();
    boolean b7 = outputFormat2.isNewLineAfterDeclaration();
    boolean b8 = outputFormat2.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    boolean b5 = outputFormat0.isOmitEncoding();
    boolean b6 = outputFormat0.isSuppressDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    boolean b1 = outputFormat0.isTrimText();
    outputFormat0.setPadText(false);
    outputFormat0.setAttributeQuoteCharacter('\"');
    boolean b6 = outputFormat0.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)0);
    outputFormat0.setEncoding("");
    outputFormat0.setEncoding("");
    boolean b11 = outputFormat0.isTrimText();
    boolean b12 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setSuppressDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    boolean b10 = outputFormat1.isPadText();
    boolean b11 = outputFormat1.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("\n");
    java.lang.String str10 = outputFormat1.getIndent();
    boolean b11 = outputFormat1.isXHTML();
    outputFormat1.setXHTML(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n"+ "'", str10.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    char char7 = outputFormat0.getAttributeQuoteCharacter();
    boolean b8 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setPadText(false);
    outputFormat0.setNewlines(true);
    outputFormat0.setTrimText(false);
    boolean b15 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setOmitEncoding(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    java.lang.String str6 = outputFormat1.getIndent();
    outputFormat1.setTrimText(true);
    java.lang.String str9 = outputFormat1.getLineSeparator();
    boolean b10 = outputFormat1.isOmitEncoding();
    boolean b11 = outputFormat1.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n"+ "'", str9.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    boolean b13 = outputFormat0.isPadText();
    outputFormat0.setEncoding("\n");
    outputFormat0.setIndent("  ");
    outputFormat0.setSuppressDeclaration(false);
    outputFormat0.setIndentSize((int)(byte)1);
    outputFormat0.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    outputFormat2.setPadText(false);
    int i5 = outputFormat2.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    boolean b6 = outputFormat3.isNewLineAfterDeclaration();
    boolean b7 = outputFormat3.isNewlines();
    outputFormat3.setNewlines(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    boolean b6 = outputFormat3.isNewLineAfterDeclaration();
    boolean b7 = outputFormat3.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setPadText(false);
    outputFormat0.setOmitEncoding(true);
    OutputFormat outputFormat17 = OutputFormat.createCompactFormat();
    outputFormat17.setNewlines(false);
    outputFormat17.setNewLineAfterDeclaration(false);
    boolean b22 = outputFormat17.isTrimText();
    boolean b23 = outputFormat17.isPadText();
    OutputFormat outputFormat24 = OutputFormat.createCompactFormat();
    outputFormat24.setNewlines(false);
    boolean b27 = outputFormat24.isNewLineAfterDeclaration();
    outputFormat24.setNewlines(true);
    outputFormat24.setExpandEmptyElements(true);
    java.lang.String str32 = outputFormat24.getLineSeparator();
    outputFormat24.setNewlines(false);
    OutputFormat outputFormat35 = OutputFormat.createCompactFormat();
    java.lang.String str36 = outputFormat35.getLineSeparator();
    java.lang.String[] str_array40 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i42 = outputFormat35.parseOptions(str_array40, (int)' ');
    int i44 = outputFormat24.parseOptions(str_array40, (int)' ');
    int i46 = outputFormat17.parseOptions(str_array40, (int)(short)10);
    int i48 = outputFormat0.parseOptions(str_array40, (int)' ');
    outputFormat0.setSuppressDeclaration(true);
    java.lang.String str51 = outputFormat0.getEncoding();
    boolean b52 = outputFormat0.isTrimText();
    int i53 = outputFormat0.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "\n"+ "'", str32.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "\n"+ "'", str36.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "UTF-8"+ "'", str51.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    boolean b1 = outputFormat0.isTrimText();
    outputFormat0.setPadText(false);
    outputFormat0.setPadText(false);
    OutputFormat outputFormat6 = OutputFormat.createCompactFormat();
    outputFormat6.setNewlines(false);
    boolean b9 = outputFormat6.isNewLineAfterDeclaration();
    outputFormat6.setXHTML(true);
    java.lang.String str12 = outputFormat6.getLineSeparator();
    boolean b13 = outputFormat6.isPadText();
    OutputFormat outputFormat17 = new OutputFormat("", false, "");
    OutputFormat outputFormat18 = OutputFormat.createCompactFormat();
    java.lang.String str19 = outputFormat18.getLineSeparator();
    java.lang.String[] str_array23 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i25 = outputFormat18.parseOptions(str_array23, (int)' ');
    int i27 = outputFormat17.parseOptions(str_array23, (int)(short)0);
    int i29 = outputFormat6.parseOptions(str_array23, (int)(short)0);
    int i31 = outputFormat0.parseOptions(str_array23, 34);
    outputFormat0.setSuppressDeclaration(true);
    boolean b34 = outputFormat0.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\n"+ "'", str19.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    boolean b9 = outputFormat0.isOmitEncoding();
    boolean b10 = outputFormat0.isXHTML();
    int i11 = outputFormat0.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    outputFormat1.setExpandEmptyElements(true);
    outputFormat1.setIndent("                                                                                                    ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    java.lang.String str6 = outputFormat1.getIndent();
    OutputFormat outputFormat8 = new OutputFormat("hi!");
    boolean b9 = outputFormat8.isOmitEncoding();
    java.lang.String[] str_array12 = new java.lang.String[] { "", "\n" };
    int i14 = outputFormat8.parseOptions(str_array12, (int)(byte)1);
    int i16 = outputFormat1.parseOptions(str_array12, (int)(byte)10);
    boolean b17 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setLineSeparator("hi!");
    outputFormat1.setIndent(true);
    outputFormat1.setEncoding("          ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }


    OutputFormat outputFormat3 = new OutputFormat("                                                                                                    ", true, "  ");
    // The following exception was thrown during execution in test generation
    try {
    outputFormat3.setAttributeQuoteCharacter('#');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }


    OutputFormat outputFormat2 = new OutputFormat("UTF-8", true);
    boolean b3 = outputFormat2.isExpandEmptyElements();
    boolean b4 = outputFormat2.isNewLineAfterDeclaration();
    boolean b5 = outputFormat2.isNewlines();
    outputFormat2.setNewlines(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setNewLineAfterNTags(1);
    boolean b9 = outputFormat0.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    java.lang.String str5 = outputFormat0.getLineSeparator();
    outputFormat0.setIndent(true);
    outputFormat0.setIndentSize((int)(short)0);
    char char10 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setTrimText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n"+ "'", str5.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char10 == '\"');

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }


    OutputFormat outputFormat1 = new OutputFormat("  ");
    java.lang.String str2 = outputFormat1.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n"+ "'", str2.equals("\n"));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getLineSeparator();
    boolean b12 = outputFormat0.isPadText();
    java.lang.String str13 = outputFormat0.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n"+ "'", str11.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setNewlines(false);
    boolean b7 = outputFormat1.isXHTML();
    outputFormat1.setEncoding("hi!");
    outputFormat1.setIndent("UTF-8");
    outputFormat1.setEncoding("                                  ");
    int i14 = outputFormat1.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setIndentSize((int)(short)1);
    java.lang.String str9 = outputFormat0.getLineSeparator();
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b12 = outputFormat0.isXHTML();
    boolean b13 = outputFormat0.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n"+ "'", str9.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setNewLineAfterDeclaration(true);
    boolean b12 = outputFormat1.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setOmitEncoding(true);
    outputFormat0.setOmitEncoding(true);
    outputFormat0.setLineSeparator("hi!");
    boolean b16 = outputFormat0.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    java.lang.String str12 = outputFormat0.getLineSeparator();
    int i13 = outputFormat0.getNewLineAfterNTags();
    boolean b14 = outputFormat0.isNewLineAfterDeclaration();
    char char15 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setIndent("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char15 == '\"');

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    java.lang.String str10 = outputFormat0.getEncoding();
    boolean b11 = outputFormat0.isPadText();
    boolean b12 = outputFormat0.isXHTML();
    OutputFormat outputFormat15 = new OutputFormat("", false);
    outputFormat15.setIndent(true);
    boolean b18 = outputFormat15.isOmitEncoding();
    OutputFormat outputFormat19 = OutputFormat.createCompactFormat();
    outputFormat19.setNewlines(false);
    boolean b22 = outputFormat19.isNewLineAfterDeclaration();
    outputFormat19.setNewlines(true);
    outputFormat19.setExpandEmptyElements(true);
    java.lang.String str27 = outputFormat19.getLineSeparator();
    outputFormat19.setNewlines(false);
    java.lang.String str30 = outputFormat19.getIndent();
    OutputFormat outputFormat32 = new OutputFormat("hi!");
    boolean b33 = outputFormat32.isOmitEncoding();
    java.lang.String[] str_array36 = new java.lang.String[] { "", "\n" };
    int i38 = outputFormat32.parseOptions(str_array36, (int)(byte)1);
    int i40 = outputFormat19.parseOptions(str_array36, (int)'a');
    int i42 = outputFormat15.parseOptions(str_array36, (int)(short)10);
    int i44 = outputFormat0.parseOptions(str_array36, 34);
    boolean b45 = outputFormat0.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UTF-8"+ "'", str10.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\n"+ "'", str27.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setIndentSize((int)(short)100);
    outputFormat0.setIndentSize((int)(short)10);
    OutputFormat outputFormat11 = new OutputFormat("hi!");
    boolean b12 = outputFormat11.isOmitEncoding();
    java.lang.String[] str_array15 = new java.lang.String[] { "", "\n" };
    int i17 = outputFormat11.parseOptions(str_array15, (int)(byte)1);
    OutputFormat outputFormat18 = OutputFormat.createCompactFormat();
    outputFormat18.setNewlines(false);
    boolean b21 = outputFormat18.isNewLineAfterDeclaration();
    outputFormat18.setNewlines(true);
    outputFormat18.setExpandEmptyElements(true);
    java.lang.String str26 = outputFormat18.getLineSeparator();
    outputFormat18.setNewlines(false);
    java.lang.String str29 = outputFormat18.getIndent();
    OutputFormat outputFormat31 = new OutputFormat("hi!");
    boolean b32 = outputFormat31.isOmitEncoding();
    java.lang.String[] str_array35 = new java.lang.String[] { "", "\n" };
    int i37 = outputFormat31.parseOptions(str_array35, (int)(byte)1);
    int i39 = outputFormat18.parseOptions(str_array35, (int)'a');
    int i41 = outputFormat11.parseOptions(str_array35, 52);
    int i43 = outputFormat0.parseOptions(str_array35, (int)'a');
    outputFormat0.setNewLineAfterNTags((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "\n"+ "'", str26.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 97);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    outputFormat2.setIndent(true);
    java.lang.String str5 = outputFormat2.getIndent();
    boolean b6 = outputFormat2.isExpandEmptyElements();
    outputFormat2.setNewLineAfterNTags(97);
    outputFormat2.setTrimText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "  "+ "'", str5.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    OutputFormat outputFormat4 = OutputFormat.createCompactFormat();
    outputFormat4.setNewlines(false);
    boolean b7 = outputFormat4.isNewLineAfterDeclaration();
    outputFormat4.setNewlines(true);
    outputFormat4.setExpandEmptyElements(true);
    java.lang.String str12 = outputFormat4.getLineSeparator();
    outputFormat4.setNewlines(false);
    java.lang.String str15 = outputFormat4.getIndent();
    OutputFormat outputFormat17 = new OutputFormat("hi!");
    boolean b18 = outputFormat17.isOmitEncoding();
    java.lang.String[] str_array21 = new java.lang.String[] { "", "\n" };
    int i23 = outputFormat17.parseOptions(str_array21, (int)(byte)1);
    int i25 = outputFormat4.parseOptions(str_array21, (int)'a');
    int i27 = outputFormat0.parseOptions(str_array21, 32);
    boolean b28 = outputFormat0.isNewlines();
    boolean b29 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setPadText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }


    OutputFormat outputFormat3 = new OutputFormat("UTF-8", true, "  ");
    outputFormat3.setIndentSize((int)(short)-1);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    boolean b3 = outputFormat2.isNewlines();
    outputFormat2.setLineSeparator("");
    int i6 = outputFormat2.getNewLineAfterNTags();
    outputFormat2.setLineSeparator("");
    outputFormat2.setSuppressDeclaration(false);
    // The following exception was thrown during execution in test generation
    try {
    outputFormat2.setAttributeQuoteCharacter('#');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    char char7 = outputFormat0.getAttributeQuoteCharacter();
    int i8 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setIndentSize((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isPadText();
    OutputFormat outputFormat11 = new OutputFormat("", false, "");
    OutputFormat outputFormat12 = OutputFormat.createCompactFormat();
    java.lang.String str13 = outputFormat12.getLineSeparator();
    java.lang.String[] str_array17 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i19 = outputFormat12.parseOptions(str_array17, (int)' ');
    int i21 = outputFormat11.parseOptions(str_array17, (int)(short)0);
    int i23 = outputFormat0.parseOptions(str_array17, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    outputFormat0.setAttributeQuoteCharacter('a');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\n"+ "'", str13.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    boolean b10 = outputFormat0.isOmitEncoding();
    boolean b11 = outputFormat0.isTrimText();
    outputFormat0.setOmitEncoding(true);
    char char14 = outputFormat0.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char14 == '\"');

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }


    OutputFormat outputFormat3 = new OutputFormat("  ", false, "          ");
    outputFormat3.setTrimText(false);
    char char6 = outputFormat3.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char6 == '\"');

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    boolean b13 = outputFormat0.isPadText();
    boolean b14 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setTrimText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setNewlines(false);
    outputFormat0.setPadText(true);
    outputFormat0.setXHTML(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setIndentSize((int)(short)100);
    outputFormat0.setPadText(true);
    char char10 = outputFormat0.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char10 == '\"');

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    java.lang.String str10 = outputFormat0.getEncoding();
    outputFormat0.setNewLineAfterNTags((int)(short)100);
    OutputFormat outputFormat13 = OutputFormat.createCompactFormat();
    outputFormat13.setNewlines(false);
    boolean b16 = outputFormat13.isNewLineAfterDeclaration();
    outputFormat13.setNewlines(true);
    outputFormat13.setExpandEmptyElements(true);
    java.lang.String str21 = outputFormat13.getLineSeparator();
    outputFormat13.setNewlines(false);
    OutputFormat outputFormat24 = OutputFormat.createCompactFormat();
    java.lang.String str25 = outputFormat24.getLineSeparator();
    java.lang.String[] str_array29 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i31 = outputFormat24.parseOptions(str_array29, (int)' ');
    int i33 = outputFormat13.parseOptions(str_array29, (int)' ');
    int i35 = outputFormat0.parseOptions(str_array29, 97);
    outputFormat0.setIndent(false);
    boolean b38 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setIndent(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UTF-8"+ "'", str10.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\n"+ "'", str21.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\n"+ "'", str25.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", true, "  ");
    outputFormat3.setExpandEmptyElements(false);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setIndent(true);
    boolean b11 = outputFormat0.isTrimText();
    outputFormat0.setIndent("");
    outputFormat0.setNewlines(true);
    // The following exception was thrown during execution in test generation
    try {
    outputFormat0.setAttributeQuoteCharacter('a');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    java.lang.String str10 = outputFormat0.getEncoding();
    java.lang.String str11 = outputFormat0.getEncoding();
    outputFormat0.setEncoding("UTF-8");
    // The following exception was thrown during execution in test generation
    try {
    outputFormat0.setAttributeQuoteCharacter('a');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UTF-8"+ "'", str10.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "UTF-8"+ "'", str11.equals("UTF-8"));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setLineSeparator("hi!");
    java.lang.String str9 = outputFormat1.getIndent();
    outputFormat1.setIndent(false);
    boolean b12 = outputFormat1.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    java.lang.String str7 = outputFormat1.getLineSeparator();
    java.lang.String str8 = outputFormat1.getIndent();
    outputFormat1.setExpandEmptyElements(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\n"+ "'", str7.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    OutputFormat outputFormat4 = OutputFormat.createCompactFormat();
    outputFormat4.setNewlines(false);
    boolean b7 = outputFormat4.isNewLineAfterDeclaration();
    outputFormat4.setNewlines(true);
    outputFormat4.setExpandEmptyElements(true);
    java.lang.String str12 = outputFormat4.getLineSeparator();
    outputFormat4.setNewlines(false);
    java.lang.String str15 = outputFormat4.getIndent();
    OutputFormat outputFormat17 = new OutputFormat("hi!");
    boolean b18 = outputFormat17.isOmitEncoding();
    java.lang.String[] str_array21 = new java.lang.String[] { "", "\n" };
    int i23 = outputFormat17.parseOptions(str_array21, (int)(byte)1);
    int i25 = outputFormat4.parseOptions(str_array21, (int)'a');
    int i27 = outputFormat0.parseOptions(str_array21, 32);
    outputFormat0.setNewlines(true);
    outputFormat0.setIndent(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 32);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }


    OutputFormat outputFormat1 = new OutputFormat("");
    java.lang.String str2 = outputFormat1.getIndent();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setSuppressDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    java.lang.String str12 = outputFormat0.getLineSeparator();
    java.lang.String str13 = outputFormat0.getEncoding();
    outputFormat0.setSuppressDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "UTF-8"+ "'", str13.equals("UTF-8"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }


    OutputFormat outputFormat2 = new OutputFormat("  ", true);
    java.lang.String str3 = outputFormat2.getEncoding();
    outputFormat2.setIndent(true);
    boolean b6 = outputFormat2.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8"+ "'", str3.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    OutputFormat outputFormat13 = new OutputFormat("hi!");
    boolean b14 = outputFormat13.isOmitEncoding();
    java.lang.String[] str_array17 = new java.lang.String[] { "", "\n" };
    int i19 = outputFormat13.parseOptions(str_array17, (int)(byte)1);
    int i21 = outputFormat0.parseOptions(str_array17, (int)'a');
    boolean b22 = outputFormat0.isNewlines();
    boolean b23 = outputFormat0.isNewlines();
    outputFormat0.setIndentSize((int)' ');
    boolean b26 = outputFormat0.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    char char2 = outputFormat1.getAttributeQuoteCharacter();
    int i3 = outputFormat1.getNewLineAfterNTags();
    boolean b4 = outputFormat1.isOmitEncoding();
    java.lang.String str5 = outputFormat1.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char2 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n"+ "'", str5.equals("\n"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setEncoding("hi!");
    boolean b9 = outputFormat0.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    outputFormat2.setIndent("  ");
    outputFormat2.setNewlines(true);
    outputFormat2.setPadText(false);
    java.lang.String str9 = outputFormat2.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n"+ "'", str9.equals("\n"));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setTrimText(true);
    outputFormat0.setIndent("hi!");
    outputFormat0.setPadText(true);
    boolean b11 = outputFormat0.isSuppressDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }


    OutputFormat outputFormat3 = new OutputFormat("  ", true, "                                  ");

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    java.lang.String str6 = outputFormat1.getLineSeparator();
    char char7 = outputFormat1.getAttributeQuoteCharacter();
    java.lang.String str8 = outputFormat1.getIndent();
    char char9 = outputFormat1.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char9 == '\"');

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }


    OutputFormat outputFormat1 = new OutputFormat("UTF-8");
    java.lang.String str2 = outputFormat1.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "UTF-8"+ "'", str2.equals("UTF-8"));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    java.lang.String str3 = outputFormat0.getEncoding();
    outputFormat0.setIndentSize(10);
    outputFormat0.setPadText(true);
    boolean b8 = outputFormat0.isSuppressDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8"+ "'", str3.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    outputFormat0.setPadText(true);
    char char6 = outputFormat0.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char6 == '\"');

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    OutputFormat outputFormat11 = OutputFormat.createCompactFormat();
    java.lang.String str12 = outputFormat11.getLineSeparator();
    java.lang.String[] str_array16 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i18 = outputFormat11.parseOptions(str_array16, (int)' ');
    int i20 = outputFormat0.parseOptions(str_array16, (int)' ');
    outputFormat0.setNewlines(true);
    outputFormat0.setXHTML(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 32);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", false, "                                  ");

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    boolean b6 = outputFormat3.isNewLineAfterDeclaration();
    boolean b7 = outputFormat3.isSuppressDeclaration();
    boolean b8 = outputFormat3.isExpandEmptyElements();
    boolean b9 = outputFormat3.isTrimText();
    int i10 = outputFormat3.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setLineSeparator("hi!");
    java.lang.String str9 = outputFormat1.getIndent();
    outputFormat1.setIndent(false);
    boolean b12 = outputFormat1.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setIndent(true);
    boolean b11 = outputFormat0.isTrimText();
    outputFormat0.setIndent("");
    java.lang.String str14 = outputFormat0.getIndent();
    outputFormat0.setIndentSize((int)(byte)100);
    java.lang.String str17 = outputFormat0.getLineSeparator();
    outputFormat0.setEncoding("");
    outputFormat0.setOmitEncoding(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\n"+ "'", str17.equals("\n"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isExpandEmptyElements();
    boolean b8 = outputFormat0.isPadText();
    outputFormat0.setPadText(false);
    OutputFormat outputFormat11 = OutputFormat.createCompactFormat();
    outputFormat11.setNewlines(false);
    boolean b14 = outputFormat11.isNewLineAfterDeclaration();
    outputFormat11.setNewlines(true);
    outputFormat11.setExpandEmptyElements(true);
    java.lang.String str19 = outputFormat11.getLineSeparator();
    outputFormat11.setNewlines(false);
    outputFormat11.setXHTML(false);
    outputFormat11.setPadText(false);
    outputFormat11.setOmitEncoding(true);
    OutputFormat outputFormat28 = OutputFormat.createCompactFormat();
    outputFormat28.setNewlines(false);
    outputFormat28.setNewLineAfterDeclaration(false);
    boolean b33 = outputFormat28.isTrimText();
    boolean b34 = outputFormat28.isPadText();
    OutputFormat outputFormat35 = OutputFormat.createCompactFormat();
    outputFormat35.setNewlines(false);
    boolean b38 = outputFormat35.isNewLineAfterDeclaration();
    outputFormat35.setNewlines(true);
    outputFormat35.setExpandEmptyElements(true);
    java.lang.String str43 = outputFormat35.getLineSeparator();
    outputFormat35.setNewlines(false);
    OutputFormat outputFormat46 = OutputFormat.createCompactFormat();
    java.lang.String str47 = outputFormat46.getLineSeparator();
    java.lang.String[] str_array51 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i53 = outputFormat46.parseOptions(str_array51, (int)' ');
    int i55 = outputFormat35.parseOptions(str_array51, (int)' ');
    int i57 = outputFormat28.parseOptions(str_array51, (int)(short)10);
    int i59 = outputFormat11.parseOptions(str_array51, (int)' ');
    int i61 = outputFormat0.parseOptions(str_array51, (int)(byte)0);
    boolean b62 = outputFormat0.isXHTML();
    boolean b63 = outputFormat0.isNewlines();
    outputFormat0.setTrimText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\n"+ "'", str19.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "\n"+ "'", str43.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "\n"+ "'", str47.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }


    OutputFormat outputFormat3 = new OutputFormat("                                  ", true, "UTF-8");

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }


    OutputFormat outputFormat3 = new OutputFormat("", true, "UTF-8");
    boolean b4 = outputFormat3.isNewlines();
    outputFormat3.setEncoding("UTF-8");
    outputFormat3.setExpandEmptyElements(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setIndent(true);
    boolean b11 = outputFormat0.isTrimText();
    outputFormat0.setIndent("");
    outputFormat0.setNewlines(true);
    char char16 = outputFormat0.getAttributeQuoteCharacter();
    boolean b17 = outputFormat0.isPadText();
    java.lang.String str18 = outputFormat0.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char16 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\n"+ "'", str18.equals("\n"));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    outputFormat2.setPadText(false);
    char char5 = outputFormat2.getAttributeQuoteCharacter();
    int i6 = outputFormat2.getNewLineAfterNTags();
    outputFormat2.setTrimText(true);
    outputFormat2.setTrimText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char5 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    java.lang.String str3 = outputFormat0.getEncoding();
    outputFormat0.setExpandEmptyElements(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8"+ "'", str3.equals("UTF-8"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setExpandEmptyElements(true);
    outputFormat1.setNewlines(true);
    int i12 = outputFormat1.getNewLineAfterNTags();
    boolean b13 = outputFormat1.isExpandEmptyElements();
    boolean b14 = outputFormat1.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    java.lang.String str5 = outputFormat0.getIndent();
    outputFormat0.setNewlines(false);
    OutputFormat outputFormat11 = new OutputFormat("", false, "");
    OutputFormat outputFormat12 = OutputFormat.createCompactFormat();
    outputFormat12.setNewlines(false);
    outputFormat12.setNewLineAfterDeclaration(false);
    boolean b17 = outputFormat12.isTrimText();
    boolean b18 = outputFormat12.isPadText();
    OutputFormat outputFormat19 = OutputFormat.createCompactFormat();
    outputFormat19.setNewlines(false);
    boolean b22 = outputFormat19.isNewLineAfterDeclaration();
    outputFormat19.setNewlines(true);
    outputFormat19.setExpandEmptyElements(true);
    java.lang.String str27 = outputFormat19.getLineSeparator();
    outputFormat19.setNewlines(false);
    OutputFormat outputFormat30 = OutputFormat.createCompactFormat();
    java.lang.String str31 = outputFormat30.getLineSeparator();
    java.lang.String[] str_array35 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i37 = outputFormat30.parseOptions(str_array35, (int)' ');
    int i39 = outputFormat19.parseOptions(str_array35, (int)' ');
    int i41 = outputFormat12.parseOptions(str_array35, (int)(short)10);
    int i43 = outputFormat11.parseOptions(str_array35, (int)'\"');
    int i45 = outputFormat0.parseOptions(str_array35, 34);
    outputFormat0.setIndent("                                  ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "UTF-8"+ "'", str5.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\n"+ "'", str27.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\n"+ "'", str31.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 34);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(true);
    outputFormat0.setNewlines(false);
    boolean b10 = outputFormat0.isNewLineAfterDeclaration();
    java.lang.String str11 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "UTF-8"+ "'", str11.equals("UTF-8"));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setNewLineAfterDeclaration(true);
    boolean b12 = outputFormat1.isXHTML();
    int i13 = outputFormat1.getNewLineAfterNTags();
    int i14 = outputFormat1.getNewLineAfterNTags();
    java.lang.String str15 = outputFormat1.getIndent();
    outputFormat1.setTrimText(true);
    outputFormat1.setSuppressDeclaration(true);
    outputFormat1.setNewLineAfterNTags(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setIndentSize((int)(short)100);
    outputFormat0.setPadText(true);
    boolean b10 = outputFormat0.isOmitEncoding();
    java.lang.String str11 = outputFormat0.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n"+ "'", str11.equals("\n"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "  ");
    boolean b4 = outputFormat3.isExpandEmptyElements();
    boolean b5 = outputFormat3.isSuppressDeclaration();
    char char6 = outputFormat3.getAttributeQuoteCharacter();
    java.lang.String str7 = outputFormat3.getEncoding();
    outputFormat3.setEncoding("\n");
    boolean b10 = outputFormat3.isSuppressDeclaration();
    outputFormat3.setXHTML(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char6 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "  "+ "'", str7.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    boolean b5 = outputFormat0.isNewlines();
    char char6 = outputFormat0.getAttributeQuoteCharacter();
    boolean b7 = outputFormat0.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char6 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isTrimText();
    boolean b6 = outputFormat0.isNewLineAfterDeclaration();
    java.lang.String str7 = outputFormat0.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    OutputFormat outputFormat4 = OutputFormat.createCompactFormat();
    java.lang.String str5 = outputFormat4.getLineSeparator();
    java.lang.String[] str_array9 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i11 = outputFormat4.parseOptions(str_array9, (int)' ');
    int i13 = outputFormat3.parseOptions(str_array9, (int)(short)0);
    outputFormat3.setOmitEncoding(true);
    boolean b16 = outputFormat3.isOmitEncoding();
    OutputFormat outputFormat18 = new OutputFormat("hi!");
    outputFormat18.setIndent(true);
    outputFormat18.setEncoding("");
    OutputFormat outputFormat23 = OutputFormat.createCompactFormat();
    outputFormat23.setNewlines(false);
    boolean b26 = outputFormat23.isNewLineAfterDeclaration();
    outputFormat23.setNewlines(true);
    outputFormat23.setExpandEmptyElements(true);
    java.lang.String str31 = outputFormat23.getLineSeparator();
    outputFormat23.setNewlines(false);
    outputFormat23.setXHTML(false);
    outputFormat23.setPadText(false);
    OutputFormat outputFormat38 = OutputFormat.createCompactFormat();
    outputFormat38.setNewlines(false);
    boolean b41 = outputFormat38.isNewLineAfterDeclaration();
    outputFormat38.setNewlines(true);
    outputFormat38.setExpandEmptyElements(true);
    java.lang.String str46 = outputFormat38.getLineSeparator();
    outputFormat38.setNewlines(false);
    OutputFormat outputFormat49 = OutputFormat.createCompactFormat();
    java.lang.String str50 = outputFormat49.getLineSeparator();
    java.lang.String[] str_array54 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i56 = outputFormat49.parseOptions(str_array54, (int)' ');
    int i58 = outputFormat38.parseOptions(str_array54, (int)' ');
    int i60 = outputFormat23.parseOptions(str_array54, (int)' ');
    int i62 = outputFormat18.parseOptions(str_array54, 100);
    int i64 = outputFormat3.parseOptions(str_array54, (int)(short)1);
    outputFormat3.setIndent(false);
    boolean b67 = outputFormat3.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n"+ "'", str5.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\n"+ "'", str31.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "\n"+ "'", str46.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "\n"+ "'", str50.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setPadText(false);
    outputFormat0.setIndent(false);
    outputFormat0.setNewLineAfterNTags(0);
    outputFormat0.setTrimText(false);
    java.lang.String str21 = outputFormat0.getEncoding();
    outputFormat0.setSuppressDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "UTF-8"+ "'", str21.equals("UTF-8"));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setPadText(false);
    OutputFormat outputFormat15 = OutputFormat.createCompactFormat();
    outputFormat15.setNewlines(false);
    boolean b18 = outputFormat15.isNewLineAfterDeclaration();
    outputFormat15.setNewlines(true);
    outputFormat15.setExpandEmptyElements(true);
    java.lang.String str23 = outputFormat15.getLineSeparator();
    outputFormat15.setNewlines(false);
    OutputFormat outputFormat26 = OutputFormat.createCompactFormat();
    java.lang.String str27 = outputFormat26.getLineSeparator();
    java.lang.String[] str_array31 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i33 = outputFormat26.parseOptions(str_array31, (int)' ');
    int i35 = outputFormat15.parseOptions(str_array31, (int)' ');
    int i37 = outputFormat0.parseOptions(str_array31, (int)' ');
    outputFormat0.setPadText(true);
    outputFormat0.setAttributeQuoteCharacter('\"');
    boolean b42 = outputFormat0.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\n"+ "'", str23.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\n"+ "'", str27.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    outputFormat0.setIndent("hi!");
    outputFormat0.setIndentSize((int)(short)-1);
    int i16 = outputFormat0.getNewLineAfterNTags();
    boolean b17 = outputFormat0.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    boolean b5 = outputFormat0.isOmitEncoding();
    boolean b6 = outputFormat0.isTrimText();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setIndent(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    java.lang.String str6 = outputFormat1.getIndent();
    outputFormat1.setIndent("                                  ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    outputFormat2.setIndent(true);
    java.lang.String str5 = outputFormat2.getIndent();
    outputFormat2.setTrimText(false);
    outputFormat2.setExpandEmptyElements(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "  "+ "'", str5.equals("  "));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    boolean b10 = outputFormat0.isTrimText();
    java.lang.String str11 = outputFormat0.getLineSeparator();
    boolean b12 = outputFormat0.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n"+ "'", str11.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setIndentSize((int)(short)100);
    java.lang.String str8 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UTF-8"+ "'", str8.equals("UTF-8"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    java.lang.String str3 = outputFormat1.getIndent();
    outputFormat1.setIndent(false);
    outputFormat1.setTrimText(false);
    outputFormat1.setXHTML(true);
    boolean b10 = outputFormat1.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isExpandEmptyElements();
    outputFormat1.setIndent(true);
    outputFormat1.setXHTML(false);
    boolean b8 = outputFormat1.isNewlines();
    outputFormat1.setNewLineAfterNTags(32);
    java.lang.String str11 = outputFormat1.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n"+ "'", str11.equals("\n"));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setTrimText(false);
    outputFormat0.setIndent(false);
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setEncoding("hi!");
    outputFormat0.setSuppressDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setPadText(false);
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setSuppressDeclaration(false);
    java.lang.String str13 = outputFormat0.getEncoding();
    java.lang.String str14 = outputFormat0.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "UTF-8"+ "'", str13.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\n"+ "'", str14.equals("\n"));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    java.lang.String str6 = outputFormat1.getLineSeparator();
    java.lang.String str7 = outputFormat1.getIndent();
    outputFormat1.setTrimText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setEncoding("\n");
    outputFormat1.setNewLineAfterNTags(32);
    java.lang.String str7 = outputFormat1.getIndent();
    boolean b8 = outputFormat1.isTrimText();
    boolean b9 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setOmitEncoding(false);
    outputFormat1.setOmitEncoding(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }


    OutputFormat outputFormat3 = new OutputFormat("          ", false, "                                                                                                    ");

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test173"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    java.lang.String str10 = outputFormat0.getEncoding();
    outputFormat0.setTrimText(true);
    outputFormat0.setNewLineAfterNTags((int)(short)0);
    outputFormat0.setTrimText(true);
    boolean b17 = outputFormat0.isPadText();
    outputFormat0.setOmitEncoding(false);
    outputFormat0.setIndent(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UTF-8"+ "'", str10.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test174"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setNewLineAfterNTags((int)(short)100);
    boolean b13 = outputFormat0.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test175"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    java.lang.String str12 = outputFormat0.getLineSeparator();
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setLineSeparator("\n");
    boolean b17 = outputFormat0.isXHTML();
    java.lang.String str18 = outputFormat0.getEncoding();
    boolean b19 = outputFormat0.isOmitEncoding();
    boolean b20 = outputFormat0.isOmitEncoding();
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setXHTML(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "UTF-8"+ "'", str18.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test176"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setOmitEncoding(true);
    outputFormat0.setXHTML(false);
    outputFormat0.setXHTML(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test177"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setXHTML(false);
    char char11 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setEncoding("          ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char11 == '\"');

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test178"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    java.lang.String str5 = outputFormat0.getIndent();
    java.lang.String str6 = outputFormat0.getLineSeparator();
    outputFormat0.setIndent("  ");
    int i9 = outputFormat0.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test179"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setLineSeparator("hi!");
    boolean b9 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setIndent(false);
    outputFormat1.setSuppressDeclaration(false);
    outputFormat1.setIndentSize(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test180"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(true);
    outputFormat0.setNewlines(false);
    boolean b10 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setExpandEmptyElements(false);
    outputFormat0.setSuppressDeclaration(false);
    outputFormat0.setLineSeparator("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test181"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    OutputFormat outputFormat4 = OutputFormat.createCompactFormat();
    java.lang.String str5 = outputFormat4.getLineSeparator();
    java.lang.String[] str_array9 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i11 = outputFormat4.parseOptions(str_array9, (int)' ');
    int i13 = outputFormat3.parseOptions(str_array9, (int)(short)0);
    outputFormat3.setOmitEncoding(true);
    boolean b16 = outputFormat3.isOmitEncoding();
    OutputFormat outputFormat18 = new OutputFormat("hi!");
    outputFormat18.setIndent(true);
    outputFormat18.setEncoding("");
    OutputFormat outputFormat23 = OutputFormat.createCompactFormat();
    outputFormat23.setNewlines(false);
    boolean b26 = outputFormat23.isNewLineAfterDeclaration();
    outputFormat23.setNewlines(true);
    outputFormat23.setExpandEmptyElements(true);
    java.lang.String str31 = outputFormat23.getLineSeparator();
    outputFormat23.setNewlines(false);
    outputFormat23.setXHTML(false);
    outputFormat23.setPadText(false);
    OutputFormat outputFormat38 = OutputFormat.createCompactFormat();
    outputFormat38.setNewlines(false);
    boolean b41 = outputFormat38.isNewLineAfterDeclaration();
    outputFormat38.setNewlines(true);
    outputFormat38.setExpandEmptyElements(true);
    java.lang.String str46 = outputFormat38.getLineSeparator();
    outputFormat38.setNewlines(false);
    OutputFormat outputFormat49 = OutputFormat.createCompactFormat();
    java.lang.String str50 = outputFormat49.getLineSeparator();
    java.lang.String[] str_array54 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i56 = outputFormat49.parseOptions(str_array54, (int)' ');
    int i58 = outputFormat38.parseOptions(str_array54, (int)' ');
    int i60 = outputFormat23.parseOptions(str_array54, (int)' ');
    int i62 = outputFormat18.parseOptions(str_array54, 100);
    int i64 = outputFormat3.parseOptions(str_array54, (int)(short)1);
    outputFormat3.setIndent(false);
    outputFormat3.setIndentSize(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n"+ "'", str5.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\n"+ "'", str31.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "\n"+ "'", str46.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "\n"+ "'", str50.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test182"); }


    OutputFormat outputFormat2 = new OutputFormat("UTF-8", true);
    boolean b3 = outputFormat2.isExpandEmptyElements();
    outputFormat2.setNewLineAfterDeclaration(false);
    outputFormat2.setNewLineAfterDeclaration(false);
    outputFormat2.setEncoding("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test183"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    boolean b10 = outputFormat0.isPadText();
    outputFormat0.setXHTML(false);
    outputFormat0.setIndent(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test184"); }


    OutputFormat outputFormat2 = new OutputFormat("          ", false);
    outputFormat2.setPadText(true);
    boolean b5 = outputFormat2.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test185"); }


    OutputFormat outputFormat2 = new OutputFormat("UTF-8", true);
    boolean b3 = outputFormat2.isExpandEmptyElements();
    boolean b4 = outputFormat2.isNewLineAfterDeclaration();
    outputFormat2.setNewlines(true);
    char char7 = outputFormat2.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test186"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setIndent(true);
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setIndentSize((int)(byte)0);
    boolean b15 = outputFormat0.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test187"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setOmitEncoding(true);
    boolean b13 = outputFormat0.isOmitEncoding();
    outputFormat0.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test188"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setIndent(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test189"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    boolean b4 = outputFormat3.isOmitEncoding();
    outputFormat3.setIndent(true);
    outputFormat3.setXHTML(true);
    outputFormat3.setEncoding("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test190"); }


    OutputFormat outputFormat2 = new OutputFormat("UTF-8", false);
    outputFormat2.setNewLineAfterDeclaration(false);
    boolean b5 = outputFormat2.isXHTML();
    // The following exception was thrown during execution in test generation
    try {
    outputFormat2.setAttributeQuoteCharacter(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test191"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)1);
    outputFormat0.setNewLineAfterNTags(97);
    java.lang.String str13 = outputFormat0.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "UTF-8"+ "'", str13.equals("UTF-8"));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test192"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterNTags((int)(short)10);
    outputFormat0.setTrimText(true);
    outputFormat0.setIndent("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test193"); }


    OutputFormat outputFormat3 = new OutputFormat("                                  ", false, "                                  ");

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test194"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setTrimText(false);
    outputFormat0.setIndent(false);
    outputFormat0.setNewlines(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test195"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(true);
    outputFormat0.setNewlines(false);
    boolean b10 = outputFormat0.isNewLineAfterDeclaration();
    java.lang.String str11 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    java.lang.String str14 = outputFormat0.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "UTF-8"+ "'", str11.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test196"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    char char11 = outputFormat0.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char11 == '\"');

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test197"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setNewlines(true);
    outputFormat1.setNewLineAfterDeclaration(true);
    outputFormat1.setEncoding("hi!");
    outputFormat1.setSuppressDeclaration(true);
    outputFormat1.setExpandEmptyElements(true);
    boolean b13 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test198"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    OutputFormat outputFormat13 = new OutputFormat("hi!");
    boolean b14 = outputFormat13.isOmitEncoding();
    java.lang.String[] str_array17 = new java.lang.String[] { "", "\n" };
    int i19 = outputFormat13.parseOptions(str_array17, (int)(byte)1);
    int i21 = outputFormat0.parseOptions(str_array17, (int)'a');
    outputFormat0.setTrimText(true);
    outputFormat0.setLineSeparator("");
    outputFormat0.setOmitEncoding(false);
    outputFormat0.setOmitEncoding(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test199"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    outputFormat1.setPadText(true);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test200"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)0);
    outputFormat0.setEncoding("");
    java.lang.String str9 = outputFormat0.getIndent();
    boolean b10 = outputFormat0.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test201"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    int i6 = outputFormat1.getNewLineAfterNTags();
    char char7 = outputFormat1.getAttributeQuoteCharacter();
    outputFormat1.setXHTML(true);
    outputFormat1.setSuppressDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test202"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    int i6 = outputFormat1.getNewLineAfterNTags();
    char char7 = outputFormat1.getAttributeQuoteCharacter();
    boolean b8 = outputFormat1.isOmitEncoding();
    java.lang.String str9 = outputFormat1.getLineSeparator();
    outputFormat1.setExpandEmptyElements(false);
    boolean b12 = outputFormat1.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n"+ "'", str9.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test203"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    boolean b13 = outputFormat0.isPadText();
    boolean b14 = outputFormat0.isOmitEncoding();
    outputFormat0.setIndentSize(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test204"); }


    OutputFormat outputFormat3 = new OutputFormat("", true, "UTF-8");
    outputFormat3.setNewlines(false);
    int i6 = outputFormat3.getNewLineAfterNTags();
    int i7 = outputFormat3.getNewLineAfterNTags();
    outputFormat3.setSuppressDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test205"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setIndent(false);
    outputFormat1.setExpandEmptyElements(true);
    boolean b11 = outputFormat1.isSuppressDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test206"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setPadText(false);
    outputFormat0.setIndent(false);
    outputFormat0.setNewLineAfterNTags(0);
    outputFormat0.setTrimText(false);
    java.lang.String str21 = outputFormat0.getEncoding();
    outputFormat0.setSuppressDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "UTF-8"+ "'", str21.equals("UTF-8"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test207"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setNewlines(false);
    boolean b7 = outputFormat1.isXHTML();
    outputFormat1.setEncoding("hi!");
    outputFormat1.setIndent("UTF-8");
    outputFormat1.setEncoding("                                  ");
    outputFormat1.setNewLineAfterNTags(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test208"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    java.lang.String str12 = outputFormat0.getLineSeparator();
    int i13 = outputFormat0.getNewLineAfterNTags();
    boolean b14 = outputFormat0.isNewLineAfterDeclaration();
    char char15 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setIndentSize(1);
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setIndent("  ");
    outputFormat0.setTrimText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char15 == '\"');

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test209"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    java.lang.String str10 = outputFormat0.getEncoding();
    java.lang.String str11 = outputFormat0.getEncoding();
    outputFormat0.setEncoding("UTF-8");
    outputFormat0.setNewLineAfterNTags(34);
    // The following exception was thrown during execution in test generation
    try {
    outputFormat0.setAttributeQuoteCharacter('a');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UTF-8"+ "'", str10.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "UTF-8"+ "'", str11.equals("UTF-8"));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test210"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    java.lang.String str10 = outputFormat0.getEncoding();
    java.lang.String str11 = outputFormat0.getEncoding();
    outputFormat0.setOmitEncoding(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UTF-8"+ "'", str10.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "UTF-8"+ "'", str11.equals("UTF-8"));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test211"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    outputFormat0.setNewLineAfterNTags((int)'a');
    boolean b6 = outputFormat0.isOmitEncoding();
    java.lang.String str7 = outputFormat0.getLineSeparator();
    boolean b8 = outputFormat0.isXHTML();
    boolean b9 = outputFormat0.isNewlines();
    outputFormat0.setXHTML(true);
    outputFormat0.setNewlines(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\n"+ "'", str7.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test212"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setNewlines(true);
    outputFormat1.setNewLineAfterDeclaration(true);
    outputFormat1.setNewLineAfterDeclaration(false);
    outputFormat1.setXHTML(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test213"); }


    OutputFormat outputFormat1 = new OutputFormat("\n");
    boolean b2 = outputFormat1.isTrimText();
    java.lang.String str3 = outputFormat1.getEncoding();
    outputFormat1.setNewlines(true);
    outputFormat1.setOmitEncoding(false);
    outputFormat1.setTrimText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8"+ "'", str3.equals("UTF-8"));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test214"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getLineSeparator();
    boolean b12 = outputFormat0.isTrimText();
    java.lang.String str13 = outputFormat0.getIndent();
    boolean b14 = outputFormat0.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n"+ "'", str11.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test215"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b7 = outputFormat0.isTrimText();
    outputFormat0.setSuppressDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test216"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    boolean b9 = outputFormat0.isOmitEncoding();
    boolean b10 = outputFormat0.isXHTML();
    outputFormat0.setIndent("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test217"); }


    OutputFormat outputFormat0 = new OutputFormat();
    boolean b1 = outputFormat0.isNewlines();
    outputFormat0.setIndent(true);
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getEncoding();
    java.lang.String str7 = outputFormat0.getLineSeparator();
    java.lang.String str8 = outputFormat0.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "UTF-8"+ "'", str6.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\n"+ "'", str7.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "  "+ "'", str8.equals("  "));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test218"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    OutputFormat outputFormat4 = OutputFormat.createCompactFormat();
    java.lang.String str5 = outputFormat4.getLineSeparator();
    java.lang.String[] str_array9 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i11 = outputFormat4.parseOptions(str_array9, (int)' ');
    int i13 = outputFormat3.parseOptions(str_array9, (int)(short)0);
    outputFormat3.setOmitEncoding(true);
    boolean b16 = outputFormat3.isOmitEncoding();
    OutputFormat outputFormat18 = new OutputFormat("hi!");
    outputFormat18.setIndent(true);
    outputFormat18.setEncoding("");
    OutputFormat outputFormat23 = OutputFormat.createCompactFormat();
    outputFormat23.setNewlines(false);
    boolean b26 = outputFormat23.isNewLineAfterDeclaration();
    outputFormat23.setNewlines(true);
    outputFormat23.setExpandEmptyElements(true);
    java.lang.String str31 = outputFormat23.getLineSeparator();
    outputFormat23.setNewlines(false);
    outputFormat23.setXHTML(false);
    outputFormat23.setPadText(false);
    OutputFormat outputFormat38 = OutputFormat.createCompactFormat();
    outputFormat38.setNewlines(false);
    boolean b41 = outputFormat38.isNewLineAfterDeclaration();
    outputFormat38.setNewlines(true);
    outputFormat38.setExpandEmptyElements(true);
    java.lang.String str46 = outputFormat38.getLineSeparator();
    outputFormat38.setNewlines(false);
    OutputFormat outputFormat49 = OutputFormat.createCompactFormat();
    java.lang.String str50 = outputFormat49.getLineSeparator();
    java.lang.String[] str_array54 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i56 = outputFormat49.parseOptions(str_array54, (int)' ');
    int i58 = outputFormat38.parseOptions(str_array54, (int)' ');
    int i60 = outputFormat23.parseOptions(str_array54, (int)' ');
    int i62 = outputFormat18.parseOptions(str_array54, 100);
    int i64 = outputFormat3.parseOptions(str_array54, (int)(short)1);
    outputFormat3.setIndent(false);
    outputFormat3.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n"+ "'", str5.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\n"+ "'", str31.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "\n"+ "'", str46.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "\n"+ "'", str50.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test219"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    boolean b7 = outputFormat0.isPadText();
    boolean b8 = outputFormat0.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test220"); }


    OutputFormat outputFormat2 = new OutputFormat("", true);
    outputFormat2.setEncoding("");
    java.lang.String str5 = outputFormat2.getLineSeparator();
    int i6 = outputFormat2.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n"+ "'", str5.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test221"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    outputFormat2.setNewLineAfterDeclaration(true);
    outputFormat2.setNewLineAfterNTags((int)'#');
    outputFormat2.setExpandEmptyElements(true);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test222"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    outputFormat3.setNewlines(true);
    outputFormat3.setPadText(true);
    outputFormat3.setExpandEmptyElements(false);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test223"); }


    OutputFormat outputFormat3 = new OutputFormat("", true, "");
    outputFormat3.setExpandEmptyElements(true);
    outputFormat3.setIndent(true);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test224"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test225"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setNewLineAfterDeclaration(true);
    boolean b12 = outputFormat1.isXHTML();
    int i13 = outputFormat1.getNewLineAfterNTags();
    int i14 = outputFormat1.getNewLineAfterNTags();
    java.lang.String str15 = outputFormat1.getIndent();
    outputFormat1.setTrimText(true);
    java.lang.String str18 = outputFormat1.getIndent();
    boolean b19 = outputFormat1.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test226"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    java.lang.String str10 = outputFormat0.getEncoding();
    outputFormat0.setNewLineAfterNTags((int)(short)100);
    outputFormat0.setNewLineAfterNTags((int)(byte)100);
    outputFormat0.setIndentSize(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UTF-8"+ "'", str10.equals("UTF-8"));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test227"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "  ");
    boolean b4 = outputFormat3.isExpandEmptyElements();
    boolean b5 = outputFormat3.isSuppressDeclaration();
    char char6 = outputFormat3.getAttributeQuoteCharacter();
    java.lang.String str7 = outputFormat3.getEncoding();
    boolean b8 = outputFormat3.isTrimText();
    outputFormat3.setAttributeQuoteCharacter('\"');
    outputFormat3.setIndentSize(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char6 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "  "+ "'", str7.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test228"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", true, "hi!");
    boolean b4 = outputFormat3.isOmitEncoding();
    int i5 = outputFormat3.getNewLineAfterNTags();
    outputFormat3.setXHTML(false);
    outputFormat3.setIndent("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test229"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setIndent(true);
    boolean b11 = outputFormat0.isTrimText();
    outputFormat0.setIndent("");
    outputFormat0.setNewLineAfterDeclaration(false);
    java.lang.String str16 = outputFormat0.getEncoding();
    java.lang.String str17 = outputFormat0.getEncoding();
    outputFormat0.setOmitEncoding(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UTF-8"+ "'", str16.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "UTF-8"+ "'", str17.equals("UTF-8"));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test230"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    boolean b6 = outputFormat3.isNewLineAfterDeclaration();
    java.lang.String str7 = outputFormat3.getIndent();
    outputFormat3.setNewLineAfterNTags(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test231"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    boolean b1 = outputFormat0.isTrimText();
    boolean b2 = outputFormat0.isPadText();
    outputFormat0.setPadText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test232"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setNewLineAfterNTags((int)'\"');
    outputFormat0.setNewLineAfterNTags((int)' ');
    OutputFormat outputFormat15 = new OutputFormat("", false, "");
    OutputFormat outputFormat16 = OutputFormat.createCompactFormat();
    outputFormat16.setNewlines(false);
    outputFormat16.setNewLineAfterDeclaration(false);
    boolean b21 = outputFormat16.isTrimText();
    boolean b22 = outputFormat16.isPadText();
    OutputFormat outputFormat23 = OutputFormat.createCompactFormat();
    outputFormat23.setNewlines(false);
    boolean b26 = outputFormat23.isNewLineAfterDeclaration();
    outputFormat23.setNewlines(true);
    outputFormat23.setExpandEmptyElements(true);
    java.lang.String str31 = outputFormat23.getLineSeparator();
    outputFormat23.setNewlines(false);
    OutputFormat outputFormat34 = OutputFormat.createCompactFormat();
    java.lang.String str35 = outputFormat34.getLineSeparator();
    java.lang.String[] str_array39 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i41 = outputFormat34.parseOptions(str_array39, (int)' ');
    int i43 = outputFormat23.parseOptions(str_array39, (int)' ');
    int i45 = outputFormat16.parseOptions(str_array39, (int)(short)10);
    int i47 = outputFormat15.parseOptions(str_array39, (int)'\"');
    // The following exception was thrown during execution in test generation
    try {
    int i49 = outputFormat0.parseOptions(str_array39, (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\n"+ "'", str31.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\n"+ "'", str35.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 34);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test233"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    boolean b9 = outputFormat0.isOmitEncoding();
    boolean b10 = outputFormat0.isNewLineAfterDeclaration();
    char char11 = outputFormat0.getAttributeQuoteCharacter();
    boolean b12 = outputFormat0.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char11 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test234"); }


    OutputFormat outputFormat2 = new OutputFormat("\n", false);
    outputFormat2.setNewLineAfterDeclaration(true);
    outputFormat2.setAttributeQuoteCharacter('\"');
    outputFormat2.setTrimText(false);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test235"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)0);
    outputFormat0.setEncoding("");
    outputFormat0.setEncoding("");
    boolean b11 = outputFormat0.isTrimText();
    outputFormat0.setEncoding("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test236"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    java.lang.String str10 = outputFormat0.getEncoding();
    outputFormat0.setTrimText(true);
    outputFormat0.setNewLineAfterNTags((int)(short)0);
    outputFormat0.setTrimText(true);
    boolean b17 = outputFormat0.isPadText();
    outputFormat0.setOmitEncoding(false);
    outputFormat0.setEncoding("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UTF-8"+ "'", str10.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test237"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", false, "\n");
    int i4 = outputFormat3.getNewLineAfterNTags();
    boolean b5 = outputFormat3.isOmitEncoding();
    outputFormat3.setSuppressDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test238"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getLineSeparator();
    outputFormat0.setLineSeparator("hi!");
    boolean b14 = outputFormat0.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n"+ "'", str11.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test239"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setPadText(false);
    outputFormat0.setTrimText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test240"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setIndentSize((int)(short)100);
    outputFormat0.setIndentSize((int)(short)10);
    outputFormat0.setPadText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test241"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    boolean b9 = outputFormat0.isOmitEncoding();
    boolean b10 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setEncoding("UTF-8");
    boolean b13 = outputFormat0.isSuppressDeclaration();
    char char14 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setNewlines(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char14 == '\"');

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test242"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    boolean b1 = outputFormat0.isTrimText();
    boolean b2 = outputFormat0.isPadText();
    boolean b3 = outputFormat0.isSuppressDeclaration();
    boolean b4 = outputFormat0.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test243"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setOmitEncoding(true);
    boolean b13 = outputFormat0.isOmitEncoding();
    outputFormat0.setNewlines(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test244"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    java.lang.String str12 = outputFormat0.getLineSeparator();
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setLineSeparator("\n");
    boolean b17 = outputFormat0.isSuppressDeclaration();
    int i18 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setEncoding("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test245"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setIndent("  ");
    boolean b3 = outputFormat0.isOmitEncoding();
    java.lang.String str4 = outputFormat0.getEncoding();
    outputFormat0.setLineSeparator("UTF-8");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "UTF-8"+ "'", str4.equals("UTF-8"));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test246"); }


    OutputFormat outputFormat3 = new OutputFormat("", true, "UTF-8");
    boolean b4 = outputFormat3.isNewlines();
    outputFormat3.setEncoding("UTF-8");
    boolean b7 = outputFormat3.isTrimText();
    outputFormat3.setNewlines(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test247"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    boolean b6 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setTrimText(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test248"); }


    OutputFormat outputFormat3 = new OutputFormat("  ", false, "\n");
    outputFormat3.setNewlines(true);
    outputFormat3.setNewlines(true);
    java.lang.String str8 = outputFormat3.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test249"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    outputFormat1.setIndent(true);
    outputFormat1.setNewLineAfterDeclaration(false);
    boolean b6 = outputFormat1.isXHTML();
    boolean b7 = outputFormat1.isPadText();
    outputFormat1.setXHTML(true);
    outputFormat1.setLineSeparator("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test250"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setIndent(true);
    boolean b11 = outputFormat0.isTrimText();
    outputFormat0.setIndent("");
    java.lang.String str14 = outputFormat0.getIndent();
    outputFormat0.setIndentSize((int)(byte)100);
    java.lang.String str17 = outputFormat0.getLineSeparator();
    boolean b18 = outputFormat0.isNewLineAfterDeclaration();
    boolean b19 = outputFormat0.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\n"+ "'", str17.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test251"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    java.lang.String str12 = outputFormat0.getLineSeparator();
    int i13 = outputFormat0.getNewLineAfterNTags();
    boolean b14 = outputFormat0.isNewLineAfterDeclaration();
    char char15 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setIndentSize(1);
    boolean b18 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setXHTML(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char15 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test252"); }


    OutputFormat outputFormat2 = new OutputFormat("", true);
    outputFormat2.setNewLineAfterDeclaration(true);
    outputFormat2.setOmitEncoding(false);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test253"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setIndent(true);
    boolean b11 = outputFormat0.isTrimText();
    outputFormat0.setIndent("");
    outputFormat0.setNewLineAfterDeclaration(false);
    int i16 = outputFormat0.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test254"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    outputFormat0.setNewLineAfterNTags((int)'a');
    boolean b6 = outputFormat0.isOmitEncoding();
    java.lang.String str7 = outputFormat0.getLineSeparator();
    boolean b8 = outputFormat0.isOmitEncoding();
    boolean b9 = outputFormat0.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\n"+ "'", str7.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test255"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndent(false);
    OutputFormat outputFormat13 = OutputFormat.createCompactFormat();
    outputFormat13.setNewlines(false);
    boolean b16 = outputFormat13.isNewLineAfterDeclaration();
    outputFormat13.setNewlines(true);
    outputFormat13.setExpandEmptyElements(true);
    java.lang.String str21 = outputFormat13.getLineSeparator();
    outputFormat13.setNewlines(false);
    OutputFormat outputFormat24 = OutputFormat.createCompactFormat();
    java.lang.String str25 = outputFormat24.getLineSeparator();
    java.lang.String[] str_array29 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i31 = outputFormat24.parseOptions(str_array29, (int)' ');
    int i33 = outputFormat13.parseOptions(str_array29, (int)' ');
    int i35 = outputFormat0.parseOptions(str_array29, 52);
    outputFormat0.setPadText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\n"+ "'", str21.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\n"+ "'", str25.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 52);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test256"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(true);
    outputFormat0.setNewlines(false);
    outputFormat0.setOmitEncoding(false);
    outputFormat0.setEncoding("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test257"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setIndentSize((int)(short)1);
    java.lang.String str9 = outputFormat0.getLineSeparator();
    OutputFormat outputFormat12 = new OutputFormat("", false);
    outputFormat12.setIndent(true);
    boolean b15 = outputFormat12.isOmitEncoding();
    OutputFormat outputFormat16 = OutputFormat.createCompactFormat();
    outputFormat16.setNewlines(false);
    boolean b19 = outputFormat16.isNewLineAfterDeclaration();
    outputFormat16.setNewlines(true);
    outputFormat16.setExpandEmptyElements(true);
    java.lang.String str24 = outputFormat16.getLineSeparator();
    outputFormat16.setNewlines(false);
    java.lang.String str27 = outputFormat16.getIndent();
    OutputFormat outputFormat29 = new OutputFormat("hi!");
    boolean b30 = outputFormat29.isOmitEncoding();
    java.lang.String[] str_array33 = new java.lang.String[] { "", "\n" };
    int i35 = outputFormat29.parseOptions(str_array33, (int)(byte)1);
    int i37 = outputFormat16.parseOptions(str_array33, (int)'a');
    int i39 = outputFormat12.parseOptions(str_array33, (int)(short)10);
    int i41 = outputFormat0.parseOptions(str_array33, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n"+ "'", str9.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "\n"+ "'", str24.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test258"); }


    OutputFormat outputFormat2 = new OutputFormat("", true);
    int i3 = outputFormat2.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test259"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", false, "UTF-8");
    outputFormat3.setLineSeparator("");
    // The following exception was thrown during execution in test generation
    try {
    outputFormat3.setAttributeQuoteCharacter('#');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test260"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isXHTML();
    boolean b6 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewLineAfterNTags((int)(short)100);
    boolean b9 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setNewlines(true);
    boolean b12 = outputFormat0.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test261"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(true);
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setTrimText(true);
    boolean b12 = outputFormat0.isOmitEncoding();
    outputFormat0.setNewlines(true);
    boolean b15 = outputFormat0.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test262"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    OutputFormat outputFormat13 = new OutputFormat("hi!");
    boolean b14 = outputFormat13.isOmitEncoding();
    java.lang.String[] str_array17 = new java.lang.String[] { "", "\n" };
    int i19 = outputFormat13.parseOptions(str_array17, (int)(byte)1);
    int i21 = outputFormat0.parseOptions(str_array17, (int)'a');
    boolean b22 = outputFormat0.isNewlines();
    boolean b23 = outputFormat0.isExpandEmptyElements();
    boolean b24 = outputFormat0.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test263"); }


    OutputFormat outputFormat3 = new OutputFormat("UTF-8", true, "UTF-8");

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test264"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    boolean b8 = outputFormat1.isXHTML();
    boolean b9 = outputFormat1.isTrimText();
    outputFormat1.setIndent(true);
    outputFormat1.setNewlines(false);
    outputFormat1.setOmitEncoding(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test265"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    boolean b7 = outputFormat0.isPadText();
    outputFormat0.setLineSeparator("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test266"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    java.lang.String str3 = outputFormat0.getEncoding();
    boolean b4 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setExpandEmptyElements(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b9 = outputFormat0.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8"+ "'", str3.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test267"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    java.lang.String str12 = outputFormat0.getLineSeparator();
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setLineSeparator("\n");
    boolean b17 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setXHTML(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test268"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setEncoding("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test269"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setTrimText(false);
    int i11 = outputFormat0.getNewLineAfterNTags();
    boolean b12 = outputFormat0.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test270"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setExpandEmptyElements(false);
    OutputFormat outputFormat15 = new OutputFormat("", false, "");
    OutputFormat outputFormat16 = OutputFormat.createCompactFormat();
    java.lang.String str17 = outputFormat16.getLineSeparator();
    java.lang.String[] str_array21 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i23 = outputFormat16.parseOptions(str_array21, (int)' ');
    int i25 = outputFormat15.parseOptions(str_array21, (int)(short)0);
    int i27 = outputFormat0.parseOptions(str_array21, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\n"+ "'", str17.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test271"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    outputFormat0.setNewLineAfterNTags((int)'a');
    boolean b6 = outputFormat0.isOmitEncoding();
    java.lang.String str7 = outputFormat0.getLineSeparator();
    boolean b8 = outputFormat0.isTrimText();
    boolean b9 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setLineSeparator("\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\n"+ "'", str7.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test272"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    java.lang.String str6 = outputFormat1.getIndent();
    OutputFormat outputFormat8 = new OutputFormat("hi!");
    boolean b9 = outputFormat8.isOmitEncoding();
    java.lang.String[] str_array12 = new java.lang.String[] { "", "\n" };
    int i14 = outputFormat8.parseOptions(str_array12, (int)(byte)1);
    int i16 = outputFormat1.parseOptions(str_array12, (int)(byte)10);
    java.lang.String str17 = outputFormat1.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test273"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    boolean b6 = outputFormat1.isTrimText();
    java.lang.String str7 = outputFormat1.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\n"+ "'", str7.equals("\n"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test274"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setPadText(false);
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setIndent("");
    int i13 = outputFormat0.getNewLineAfterNTags();
    boolean b14 = outputFormat0.isTrimText();
    outputFormat0.setIndentSize((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test275"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    outputFormat0.setNewLineAfterNTags((int)'a');
    boolean b6 = outputFormat0.isOmitEncoding();
    java.lang.String str7 = outputFormat0.getLineSeparator();
    outputFormat0.setNewLineAfterNTags((int)(short)0);
    char char10 = outputFormat0.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\n"+ "'", str7.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char10 == '\"');

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test276"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setIndentSize((int)(short)1);
    java.lang.String str9 = outputFormat0.getLineSeparator();
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setOmitEncoding(false);
    char char14 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setNewLineAfterNTags((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n"+ "'", str9.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char14 == '\"');

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test277"); }


    OutputFormat outputFormat2 = new OutputFormat("UTF-8", false);
    outputFormat2.setNewLineAfterNTags(52);
    outputFormat2.setNewLineAfterDeclaration(true);
    outputFormat2.setNewLineAfterNTags(1);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test278"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    outputFormat0.setIndentSize((int)'\"');
    outputFormat0.setIndentSize(1);
    outputFormat0.setIndent("hi!");
    java.lang.String str10 = outputFormat0.getLineSeparator();
    outputFormat0.setAttributeQuoteCharacter('\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n"+ "'", str10.equals("\n"));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test279"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    boolean b13 = outputFormat0.isPadText();
    outputFormat0.setEncoding("\n");
    outputFormat0.setIndent("  ");
    outputFormat0.setSuppressDeclaration(false);
    outputFormat0.setIndentSize((int)(byte)1);
    java.lang.String str22 = outputFormat0.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "\n"+ "'", str22.equals("\n"));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test280"); }


    OutputFormat outputFormat1 = new OutputFormat("                                                                                                    ");
    int i2 = outputFormat1.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test281"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    java.lang.String str10 = outputFormat0.getEncoding();
    outputFormat0.setNewLineAfterNTags((int)(short)100);
    OutputFormat outputFormat13 = OutputFormat.createCompactFormat();
    outputFormat13.setNewlines(false);
    boolean b16 = outputFormat13.isNewLineAfterDeclaration();
    outputFormat13.setNewlines(true);
    outputFormat13.setExpandEmptyElements(true);
    java.lang.String str21 = outputFormat13.getLineSeparator();
    outputFormat13.setNewlines(false);
    OutputFormat outputFormat24 = OutputFormat.createCompactFormat();
    java.lang.String str25 = outputFormat24.getLineSeparator();
    java.lang.String[] str_array29 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i31 = outputFormat24.parseOptions(str_array29, (int)' ');
    int i33 = outputFormat13.parseOptions(str_array29, (int)' ');
    int i35 = outputFormat0.parseOptions(str_array29, 97);
    outputFormat0.setLineSeparator("");
    outputFormat0.setIndent(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UTF-8"+ "'", str10.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\n"+ "'", str21.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\n"+ "'", str25.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 97);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test282"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    OutputFormat outputFormat4 = OutputFormat.createCompactFormat();
    java.lang.String str5 = outputFormat4.getLineSeparator();
    java.lang.String[] str_array9 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i11 = outputFormat4.parseOptions(str_array9, (int)' ');
    int i13 = outputFormat3.parseOptions(str_array9, (int)(short)0);
    outputFormat3.setOmitEncoding(true);
    boolean b16 = outputFormat3.isOmitEncoding();
    OutputFormat outputFormat18 = new OutputFormat("hi!");
    outputFormat18.setIndent(true);
    outputFormat18.setEncoding("");
    OutputFormat outputFormat23 = OutputFormat.createCompactFormat();
    outputFormat23.setNewlines(false);
    boolean b26 = outputFormat23.isNewLineAfterDeclaration();
    outputFormat23.setNewlines(true);
    outputFormat23.setExpandEmptyElements(true);
    java.lang.String str31 = outputFormat23.getLineSeparator();
    outputFormat23.setNewlines(false);
    outputFormat23.setXHTML(false);
    outputFormat23.setPadText(false);
    OutputFormat outputFormat38 = OutputFormat.createCompactFormat();
    outputFormat38.setNewlines(false);
    boolean b41 = outputFormat38.isNewLineAfterDeclaration();
    outputFormat38.setNewlines(true);
    outputFormat38.setExpandEmptyElements(true);
    java.lang.String str46 = outputFormat38.getLineSeparator();
    outputFormat38.setNewlines(false);
    OutputFormat outputFormat49 = OutputFormat.createCompactFormat();
    java.lang.String str50 = outputFormat49.getLineSeparator();
    java.lang.String[] str_array54 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i56 = outputFormat49.parseOptions(str_array54, (int)' ');
    int i58 = outputFormat38.parseOptions(str_array54, (int)' ');
    int i60 = outputFormat23.parseOptions(str_array54, (int)' ');
    int i62 = outputFormat18.parseOptions(str_array54, 100);
    int i64 = outputFormat3.parseOptions(str_array54, (int)(short)1);
    java.lang.String str65 = outputFormat3.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n"+ "'", str5.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\n"+ "'", str31.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "\n"+ "'", str46.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "\n"+ "'", str50.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + ""+ "'", str65.equals(""));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test283"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setTrimText(true);
    outputFormat0.setIndent("hi!");
    boolean b9 = outputFormat0.isPadText();
    outputFormat0.setNewlines(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test284"); }


    OutputFormat outputFormat3 = new OutputFormat("  ", false, "");
    outputFormat3.setEncoding("\n");

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test285"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    boolean b5 = outputFormat0.isOmitEncoding();
    outputFormat0.setNewlines(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test286"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setTrimText(false);
    boolean b13 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setOmitEncoding(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test287"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    boolean b6 = outputFormat3.isNewLineAfterDeclaration();
    outputFormat3.setPadText(true);
    outputFormat3.setNewlines(false);
    outputFormat3.setOmitEncoding(true);
    outputFormat3.setPadText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test288"); }


    OutputFormat outputFormat2 = new OutputFormat("                                                                                                    ", false);
    outputFormat2.setLineSeparator("                                  ");

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test289"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    java.lang.String str5 = outputFormat0.getIndent();
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isNewlines();
    outputFormat0.setNewlines(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "UTF-8"+ "'", str5.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test290"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isExpandEmptyElements();
    boolean b8 = outputFormat0.isPadText();
    outputFormat0.setPadText(false);
    boolean b11 = outputFormat0.isNewlines();
    boolean b12 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setPadText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test291"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setLineSeparator("  ");
    outputFormat1.setPadText(true);
    outputFormat1.setPadText(false);
    OutputFormat outputFormat16 = OutputFormat.createCompactFormat();
    outputFormat16.setNewlines(false);
    boolean b19 = outputFormat16.isNewLineAfterDeclaration();
    outputFormat16.setNewlines(true);
    int i22 = outputFormat16.getNewLineAfterNTags();
    java.lang.String str23 = outputFormat16.getEncoding();
    outputFormat16.setNewlines(false);
    java.lang.String str26 = outputFormat16.getEncoding();
    outputFormat16.setNewLineAfterNTags((int)(short)100);
    OutputFormat outputFormat29 = OutputFormat.createCompactFormat();
    outputFormat29.setNewlines(false);
    boolean b32 = outputFormat29.isNewLineAfterDeclaration();
    outputFormat29.setNewlines(true);
    outputFormat29.setExpandEmptyElements(true);
    java.lang.String str37 = outputFormat29.getLineSeparator();
    outputFormat29.setNewlines(false);
    OutputFormat outputFormat40 = OutputFormat.createCompactFormat();
    java.lang.String str41 = outputFormat40.getLineSeparator();
    java.lang.String[] str_array45 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i47 = outputFormat40.parseOptions(str_array45, (int)' ');
    int i49 = outputFormat29.parseOptions(str_array45, (int)' ');
    int i51 = outputFormat16.parseOptions(str_array45, 97);
    int i53 = outputFormat1.parseOptions(str_array45, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "UTF-8"+ "'", str23.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "UTF-8"+ "'", str26.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "\n"+ "'", str37.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "\n"+ "'", str41.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 35);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test292"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isExpandEmptyElements();
    outputFormat1.setEncoding("UTF-8");
    boolean b6 = outputFormat1.isXHTML();
    java.lang.String str7 = outputFormat1.getIndent();
    outputFormat1.setTrimText(false);
    outputFormat1.setNewLineAfterNTags((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test293"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    java.lang.String str5 = outputFormat0.getLineSeparator();
    outputFormat0.setIndent(true);
    outputFormat0.setExpandEmptyElements(false);
    boolean b10 = outputFormat0.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n"+ "'", str5.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test294"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    outputFormat2.setIndent(true);
    java.lang.String str5 = outputFormat2.getIndent();
    boolean b6 = outputFormat2.isExpandEmptyElements();
    boolean b7 = outputFormat2.isTrimText();
    boolean b8 = outputFormat2.isNewlines();
    OutputFormat outputFormat9 = OutputFormat.createCompactFormat();
    outputFormat9.setNewlines(false);
    boolean b12 = outputFormat9.isNewLineAfterDeclaration();
    outputFormat9.setNewlines(true);
    outputFormat9.setExpandEmptyElements(true);
    java.lang.String str17 = outputFormat9.getLineSeparator();
    outputFormat9.setNewlines(false);
    java.lang.String str20 = outputFormat9.getIndent();
    OutputFormat outputFormat22 = new OutputFormat("hi!");
    boolean b23 = outputFormat22.isOmitEncoding();
    java.lang.String[] str_array26 = new java.lang.String[] { "", "\n" };
    int i28 = outputFormat22.parseOptions(str_array26, (int)(byte)1);
    int i30 = outputFormat9.parseOptions(str_array26, (int)'a');
    int i32 = outputFormat2.parseOptions(str_array26, (int)' ');
    boolean b33 = outputFormat2.isNewLineAfterDeclaration();
    boolean b34 = outputFormat2.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "  "+ "'", str5.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\n"+ "'", str17.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test295"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setNewlines(false);
    outputFormat0.setLineSeparator("\n");
    outputFormat0.setEncoding("");
    java.lang.String str15 = outputFormat0.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test296"); }


    OutputFormat outputFormat2 = new OutputFormat("                                                                                                    ", false);
    boolean b3 = outputFormat2.isNewlines();
    outputFormat2.setLineSeparator("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test297"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setLineSeparator("                                                                                                    ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test298"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setPadText(false);
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setIndent("");
    int i13 = outputFormat0.getNewLineAfterNTags();
    boolean b14 = outputFormat0.isTrimText();
    outputFormat0.setTrimText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test299"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(true);
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setTrimText(true);
    boolean b12 = outputFormat0.isPadText();
    outputFormat0.setPadText(true);
    boolean b15 = outputFormat0.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test300"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    boolean b5 = outputFormat0.isOmitEncoding();
    boolean b6 = outputFormat0.isTrimText();
    outputFormat0.setLineSeparator("hi!");
    outputFormat0.setTrimText(false);
    boolean b11 = outputFormat0.isTrimText();
    outputFormat0.setNewLineAfterNTags((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test301"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    java.lang.String str12 = outputFormat0.getLineSeparator();
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setLineSeparator("\n");
    boolean b17 = outputFormat0.isXHTML();
    java.lang.String str18 = outputFormat0.getEncoding();
    boolean b19 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewLineAfterDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "UTF-8"+ "'", str18.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test302"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    boolean b4 = outputFormat3.isOmitEncoding();
    outputFormat3.setIndent(true);
    outputFormat3.setNewLineAfterDeclaration(false);
    OutputFormat outputFormat10 = new OutputFormat("hi!");
    outputFormat10.setIndent(true);
    outputFormat10.setEncoding("");
    OutputFormat outputFormat15 = OutputFormat.createCompactFormat();
    outputFormat15.setNewlines(false);
    boolean b18 = outputFormat15.isNewLineAfterDeclaration();
    outputFormat15.setNewlines(true);
    outputFormat15.setExpandEmptyElements(true);
    java.lang.String str23 = outputFormat15.getLineSeparator();
    outputFormat15.setNewlines(false);
    outputFormat15.setXHTML(false);
    outputFormat15.setPadText(false);
    OutputFormat outputFormat30 = OutputFormat.createCompactFormat();
    outputFormat30.setNewlines(false);
    boolean b33 = outputFormat30.isNewLineAfterDeclaration();
    outputFormat30.setNewlines(true);
    outputFormat30.setExpandEmptyElements(true);
    java.lang.String str38 = outputFormat30.getLineSeparator();
    outputFormat30.setNewlines(false);
    OutputFormat outputFormat41 = OutputFormat.createCompactFormat();
    java.lang.String str42 = outputFormat41.getLineSeparator();
    java.lang.String[] str_array46 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i48 = outputFormat41.parseOptions(str_array46, (int)' ');
    int i50 = outputFormat30.parseOptions(str_array46, (int)' ');
    int i52 = outputFormat15.parseOptions(str_array46, (int)' ');
    int i54 = outputFormat10.parseOptions(str_array46, 100);
    int i56 = outputFormat3.parseOptions(str_array46, 0);
    boolean b57 = outputFormat3.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\n"+ "'", str23.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "\n"+ "'", str38.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "\n"+ "'", str42.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test303"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setNewlines(true);
    outputFormat1.setNewLineAfterDeclaration(true);
    boolean b7 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setIndent("          ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test304"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setNewlines(false);
    boolean b7 = outputFormat1.isXHTML();
    outputFormat1.setEncoding("hi!");
    outputFormat1.setIndent("UTF-8");
    outputFormat1.setEncoding("                                  ");
    outputFormat1.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test305"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    java.lang.String str10 = outputFormat0.getEncoding();
    java.lang.String str11 = outputFormat0.getEncoding();
    boolean b12 = outputFormat0.isNewLineAfterDeclaration();
    boolean b13 = outputFormat0.isXHTML();
    java.lang.String str14 = outputFormat0.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UTF-8"+ "'", str10.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "UTF-8"+ "'", str11.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\n"+ "'", str14.equals("\n"));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test306"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setNewlines(false);
    outputFormat1.setLineSeparator("");
    java.lang.String str9 = outputFormat1.getLineSeparator();
    boolean b10 = outputFormat1.isNewlines();
    outputFormat1.setExpandEmptyElements(false);
    outputFormat1.setOmitEncoding(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test307"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    outputFormat3.setNewlines(true);
    outputFormat3.setPadText(true);
    outputFormat3.setXHTML(true);
    boolean b12 = outputFormat3.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test308"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    boolean b5 = outputFormat0.isOmitEncoding();
    boolean b6 = outputFormat0.isTrimText();
    outputFormat0.setLineSeparator("hi!");
    outputFormat0.setTrimText(false);
    boolean b11 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setIndent(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test309"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    boolean b10 = outputFormat0.isTrimText();
    boolean b11 = outputFormat0.isNewLineAfterDeclaration();
    int i12 = outputFormat0.getNewLineAfterNTags();
    OutputFormat outputFormat13 = OutputFormat.createCompactFormat();
    outputFormat13.setNewlines(false);
    boolean b16 = outputFormat13.isNewLineAfterDeclaration();
    outputFormat13.setXHTML(true);
    outputFormat13.setTrimText(true);
    outputFormat13.setNewlines(false);
    OutputFormat outputFormat24 = new OutputFormat("hi!");
    boolean b25 = outputFormat24.isOmitEncoding();
    java.lang.String[] str_array28 = new java.lang.String[] { "", "\n" };
    int i30 = outputFormat24.parseOptions(str_array28, (int)(byte)1);
    int i32 = outputFormat13.parseOptions(str_array28, (int)'4');
    int i34 = outputFormat0.parseOptions(str_array28, (int)'a');
    boolean b35 = outputFormat0.isSuppressDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test310"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    boolean b7 = outputFormat1.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test311"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", true, "hi!");
    boolean b4 = outputFormat3.isPadText();
    outputFormat3.setSuppressDeclaration(true);
    outputFormat3.setEncoding("  ");
    outputFormat3.setLineSeparator("hi!");
    outputFormat3.setPadText(false);
    outputFormat3.setSuppressDeclaration(false);
    outputFormat3.setIndent(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test312"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    boolean b3 = outputFormat2.isNewlines();
    outputFormat2.setIndent("UTF-8");
    outputFormat2.setLineSeparator("UTF-8");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test313"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    outputFormat2.setIndent(true);
    java.lang.String str5 = outputFormat2.getIndent();
    boolean b6 = outputFormat2.isExpandEmptyElements();
    outputFormat2.setLineSeparator("UTF-8");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "  "+ "'", str5.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test314"); }


    OutputFormat outputFormat1 = new OutputFormat("\n");
    boolean b2 = outputFormat1.isTrimText();
    outputFormat1.setIndentSize(100);
    outputFormat1.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test315"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    java.lang.String str10 = outputFormat0.getEncoding();
    boolean b11 = outputFormat0.isPadText();
    boolean b12 = outputFormat0.isXHTML();
    outputFormat0.setIndentSize((int)(short)-1);
    outputFormat0.setEncoding("          ");
    outputFormat0.setLineSeparator("\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UTF-8"+ "'", str10.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test316"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setLineSeparator("\n");
    outputFormat0.setIndentSize((int)(byte)10);
    boolean b7 = outputFormat0.isSuppressDeclaration();
    OutputFormat outputFormat8 = OutputFormat.createCompactFormat();
    outputFormat8.setNewlines(false);
    outputFormat8.setXHTML(true);
    outputFormat8.setSuppressDeclaration(true);
    OutputFormat outputFormat15 = OutputFormat.createCompactFormat();
    outputFormat15.setNewlines(false);
    boolean b18 = outputFormat15.isNewLineAfterDeclaration();
    outputFormat15.setXHTML(true);
    java.lang.String str21 = outputFormat15.getLineSeparator();
    boolean b22 = outputFormat15.isExpandEmptyElements();
    boolean b23 = outputFormat15.isPadText();
    outputFormat15.setPadText(false);
    OutputFormat outputFormat26 = OutputFormat.createCompactFormat();
    outputFormat26.setNewlines(false);
    boolean b29 = outputFormat26.isNewLineAfterDeclaration();
    outputFormat26.setNewlines(true);
    outputFormat26.setExpandEmptyElements(true);
    java.lang.String str34 = outputFormat26.getLineSeparator();
    outputFormat26.setNewlines(false);
    outputFormat26.setXHTML(false);
    outputFormat26.setPadText(false);
    outputFormat26.setOmitEncoding(true);
    OutputFormat outputFormat43 = OutputFormat.createCompactFormat();
    outputFormat43.setNewlines(false);
    outputFormat43.setNewLineAfterDeclaration(false);
    boolean b48 = outputFormat43.isTrimText();
    boolean b49 = outputFormat43.isPadText();
    OutputFormat outputFormat50 = OutputFormat.createCompactFormat();
    outputFormat50.setNewlines(false);
    boolean b53 = outputFormat50.isNewLineAfterDeclaration();
    outputFormat50.setNewlines(true);
    outputFormat50.setExpandEmptyElements(true);
    java.lang.String str58 = outputFormat50.getLineSeparator();
    outputFormat50.setNewlines(false);
    OutputFormat outputFormat61 = OutputFormat.createCompactFormat();
    java.lang.String str62 = outputFormat61.getLineSeparator();
    java.lang.String[] str_array66 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i68 = outputFormat61.parseOptions(str_array66, (int)' ');
    int i70 = outputFormat50.parseOptions(str_array66, (int)' ');
    int i72 = outputFormat43.parseOptions(str_array66, (int)(short)10);
    int i74 = outputFormat26.parseOptions(str_array66, (int)' ');
    int i76 = outputFormat15.parseOptions(str_array66, (int)(byte)0);
    int i78 = outputFormat8.parseOptions(str_array66, 0);
    int i80 = outputFormat0.parseOptions(str_array66, (int)' ');
    java.lang.String str81 = outputFormat0.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\n"+ "'", str21.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "\n"+ "'", str34.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "\n"+ "'", str58.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "\n"+ "'", str62.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + "          "+ "'", str81.equals("          "));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test317"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setIndent(true);
    boolean b11 = outputFormat0.isTrimText();
    outputFormat0.setIndent("");
    outputFormat0.setNewLineAfterDeclaration(false);
    java.lang.String str16 = outputFormat0.getEncoding();
    java.lang.String str17 = outputFormat0.getEncoding();
    java.lang.String str18 = outputFormat0.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UTF-8"+ "'", str16.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "UTF-8"+ "'", str17.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test318"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    outputFormat2.setIndent(true);
    java.lang.String str5 = outputFormat2.getIndent();
    boolean b6 = outputFormat2.isExpandEmptyElements();
    boolean b7 = outputFormat2.isTrimText();
    boolean b8 = outputFormat2.isNewlines();
    OutputFormat outputFormat9 = OutputFormat.createCompactFormat();
    outputFormat9.setNewlines(false);
    boolean b12 = outputFormat9.isNewLineAfterDeclaration();
    outputFormat9.setNewlines(true);
    outputFormat9.setExpandEmptyElements(true);
    java.lang.String str17 = outputFormat9.getLineSeparator();
    outputFormat9.setNewlines(false);
    java.lang.String str20 = outputFormat9.getIndent();
    OutputFormat outputFormat22 = new OutputFormat("hi!");
    boolean b23 = outputFormat22.isOmitEncoding();
    java.lang.String[] str_array26 = new java.lang.String[] { "", "\n" };
    int i28 = outputFormat22.parseOptions(str_array26, (int)(byte)1);
    int i30 = outputFormat9.parseOptions(str_array26, (int)'a');
    int i32 = outputFormat2.parseOptions(str_array26, (int)' ');
    boolean b33 = outputFormat2.isNewLineAfterDeclaration();
    outputFormat2.setXHTML(true);
    outputFormat2.setTrimText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "  "+ "'", str5.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\n"+ "'", str17.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test319"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    boolean b3 = outputFormat2.isPadText();
    int i4 = outputFormat2.getNewLineAfterNTags();
    boolean b5 = outputFormat2.isExpandEmptyElements();
    java.lang.String str6 = outputFormat2.getIndent();
    boolean b7 = outputFormat2.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test320"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    boolean b7 = outputFormat1.isNewLineAfterDeclaration();
    boolean b8 = outputFormat1.isTrimText();
    OutputFormat outputFormat10 = new OutputFormat("hi!");
    boolean b11 = outputFormat10.isOmitEncoding();
    java.lang.String[] str_array14 = new java.lang.String[] { "", "\n" };
    int i16 = outputFormat10.parseOptions(str_array14, (int)(byte)1);
    OutputFormat outputFormat17 = OutputFormat.createCompactFormat();
    outputFormat17.setNewlines(false);
    boolean b20 = outputFormat17.isNewLineAfterDeclaration();
    outputFormat17.setNewlines(true);
    outputFormat17.setExpandEmptyElements(true);
    java.lang.String str25 = outputFormat17.getLineSeparator();
    outputFormat17.setNewlines(false);
    java.lang.String str28 = outputFormat17.getIndent();
    OutputFormat outputFormat30 = new OutputFormat("hi!");
    boolean b31 = outputFormat30.isOmitEncoding();
    java.lang.String[] str_array34 = new java.lang.String[] { "", "\n" };
    int i36 = outputFormat30.parseOptions(str_array34, (int)(byte)1);
    int i38 = outputFormat17.parseOptions(str_array34, (int)'a');
    int i40 = outputFormat10.parseOptions(str_array34, 52);
    int i42 = outputFormat1.parseOptions(str_array34, (int)'\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\n"+ "'", str25.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 34);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test321"); }


    OutputFormat outputFormat3 = new OutputFormat("                                                                                                    ", true, "          ");

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test322"); }


    OutputFormat outputFormat1 = new OutputFormat("UTF-8");
    boolean b2 = outputFormat1.isTrimText();
    // The following exception was thrown during execution in test generation
    try {
    outputFormat1.setAttributeQuoteCharacter('#');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test323"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    boolean b10 = outputFormat0.isTrimText();
    boolean b11 = outputFormat0.isNewLineAfterDeclaration();
    int i12 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setNewLineAfterNTags((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test324"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setTrimText(true);
    boolean b7 = outputFormat0.isNewlines();
    outputFormat0.setOmitEncoding(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test325"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    boolean b4 = outputFormat1.isXHTML();
    outputFormat1.setIndent("          ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test326"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isExpandEmptyElements();
    boolean b8 = outputFormat0.isPadText();
    outputFormat0.setPadText(false);
    outputFormat0.setIndent("                                  ");
    outputFormat0.setNewLineAfterNTags(0);
    outputFormat0.setExpandEmptyElements(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test327"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    boolean b6 = outputFormat3.isNewLineAfterDeclaration();
    outputFormat3.setPadText(true);
    OutputFormat outputFormat9 = OutputFormat.createCompactFormat();
    outputFormat9.setNewlines(false);
    boolean b12 = outputFormat9.isNewLineAfterDeclaration();
    outputFormat9.setNewlines(true);
    outputFormat9.setExpandEmptyElements(true);
    java.lang.String str17 = outputFormat9.getLineSeparator();
    outputFormat9.setNewlines(false);
    java.lang.String str20 = outputFormat9.getIndent();
    OutputFormat outputFormat22 = new OutputFormat("hi!");
    boolean b23 = outputFormat22.isOmitEncoding();
    java.lang.String[] str_array26 = new java.lang.String[] { "", "\n" };
    int i28 = outputFormat22.parseOptions(str_array26, (int)(byte)1);
    int i30 = outputFormat9.parseOptions(str_array26, (int)'a');
    int i32 = outputFormat3.parseOptions(str_array26, (int)'\"');
    java.lang.String str33 = outputFormat3.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\n"+ "'", str17.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test328"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    boolean b8 = outputFormat1.isXHTML();
    boolean b9 = outputFormat1.isTrimText();
    outputFormat1.setXHTML(true);
    // The following exception was thrown during execution in test generation
    try {
    outputFormat1.setAttributeQuoteCharacter('a');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test329"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    boolean b8 = outputFormat1.isXHTML();
    boolean b9 = outputFormat1.isTrimText();
    outputFormat1.setXHTML(true);
    boolean b12 = outputFormat1.isTrimText();
    java.lang.String str13 = outputFormat1.getEncoding();
    int i14 = outputFormat1.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "UTF-8"+ "'", str13.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test330"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", true, "\n");

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test331"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setNewlines(true);
    boolean b13 = outputFormat0.isNewlines();
    outputFormat0.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test332"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setEncoding("\n");
    outputFormat1.setNewLineAfterNTags(32);
    java.lang.String str7 = outputFormat1.getIndent();
    boolean b8 = outputFormat1.isNewLineAfterDeclaration();
    boolean b9 = outputFormat1.isXHTML();
    boolean b10 = outputFormat1.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test333"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setLineSeparator("hi!");
    boolean b9 = outputFormat1.isNewLineAfterDeclaration();
    OutputFormat outputFormat10 = OutputFormat.createCompactFormat();
    outputFormat10.setNewlines(false);
    boolean b13 = outputFormat10.isOmitEncoding();
    outputFormat10.setIndentSize((int)'\"');
    outputFormat10.setIndentSize(1);
    OutputFormat outputFormat19 = new OutputFormat("hi!");
    boolean b20 = outputFormat19.isOmitEncoding();
    boolean b21 = outputFormat19.isPadText();
    boolean b22 = outputFormat19.isSuppressDeclaration();
    outputFormat19.setNewlines(false);
    boolean b25 = outputFormat19.isXHTML();
    outputFormat19.setIndent("");
    OutputFormat outputFormat28 = OutputFormat.createCompactFormat();
    outputFormat28.setNewlines(false);
    outputFormat28.setNewLineAfterDeclaration(false);
    boolean b33 = outputFormat28.isTrimText();
    boolean b34 = outputFormat28.isPadText();
    OutputFormat outputFormat35 = OutputFormat.createCompactFormat();
    outputFormat35.setNewlines(false);
    boolean b38 = outputFormat35.isNewLineAfterDeclaration();
    outputFormat35.setNewlines(true);
    outputFormat35.setExpandEmptyElements(true);
    java.lang.String str43 = outputFormat35.getLineSeparator();
    outputFormat35.setNewlines(false);
    OutputFormat outputFormat46 = OutputFormat.createCompactFormat();
    java.lang.String str47 = outputFormat46.getLineSeparator();
    java.lang.String[] str_array51 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i53 = outputFormat46.parseOptions(str_array51, (int)' ');
    int i55 = outputFormat35.parseOptions(str_array51, (int)' ');
    int i57 = outputFormat28.parseOptions(str_array51, (int)(short)10);
    OutputFormat outputFormat58 = OutputFormat.createCompactFormat();
    outputFormat58.setNewlines(false);
    outputFormat58.setNewLineAfterDeclaration(false);
    boolean b63 = outputFormat58.isTrimText();
    boolean b64 = outputFormat58.isPadText();
    OutputFormat outputFormat65 = OutputFormat.createCompactFormat();
    outputFormat65.setNewlines(false);
    boolean b68 = outputFormat65.isNewLineAfterDeclaration();
    outputFormat65.setNewlines(true);
    outputFormat65.setExpandEmptyElements(true);
    java.lang.String str73 = outputFormat65.getLineSeparator();
    outputFormat65.setNewlines(false);
    OutputFormat outputFormat76 = OutputFormat.createCompactFormat();
    java.lang.String str77 = outputFormat76.getLineSeparator();
    java.lang.String[] str_array81 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i83 = outputFormat76.parseOptions(str_array81, (int)' ');
    int i85 = outputFormat65.parseOptions(str_array81, (int)' ');
    int i87 = outputFormat58.parseOptions(str_array81, (int)(short)10);
    int i89 = outputFormat28.parseOptions(str_array81, (int)(short)100);
    int i91 = outputFormat19.parseOptions(str_array81, 100);
    int i93 = outputFormat10.parseOptions(str_array81, (int)(byte)0);
    int i95 = outputFormat1.parseOptions(str_array81, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "\n"+ "'", str43.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "\n"+ "'", str47.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + "\n"+ "'", str73.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "\n"+ "'", str77.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 10);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test334"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    java.lang.String str3 = outputFormat0.getEncoding();
    boolean b4 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setExpandEmptyElements(false);
    boolean b7 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setXHTML(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8"+ "'", str3.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test335"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    OutputFormat outputFormat4 = OutputFormat.createCompactFormat();
    java.lang.String str5 = outputFormat4.getLineSeparator();
    java.lang.String[] str_array9 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i11 = outputFormat4.parseOptions(str_array9, (int)' ');
    int i13 = outputFormat3.parseOptions(str_array9, (int)(short)0);
    java.lang.String str14 = outputFormat3.getLineSeparator();
    outputFormat3.setExpandEmptyElements(false);
    int i17 = outputFormat3.getNewLineAfterNTags();
    outputFormat3.setIndentSize((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n"+ "'", str5.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\n"+ "'", str14.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test336"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("\n");
    boolean b10 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    outputFormat1.setNewLineAfterDeclaration(true);
    int i15 = outputFormat1.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test337"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    java.lang.String str12 = outputFormat0.getLineSeparator();
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setLineSeparator("\n");
    outputFormat0.setNewlines(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test338"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    outputFormat1.setIndent(true);
    outputFormat1.setNewLineAfterDeclaration(false);
    boolean b6 = outputFormat1.isXHTML();
    boolean b7 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test339"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b5 = outputFormat0.isTrimText();
    boolean b6 = outputFormat0.isPadText();
    OutputFormat outputFormat7 = OutputFormat.createCompactFormat();
    outputFormat7.setNewlines(false);
    boolean b10 = outputFormat7.isNewLineAfterDeclaration();
    outputFormat7.setNewlines(true);
    outputFormat7.setExpandEmptyElements(true);
    java.lang.String str15 = outputFormat7.getLineSeparator();
    outputFormat7.setNewlines(false);
    OutputFormat outputFormat18 = OutputFormat.createCompactFormat();
    java.lang.String str19 = outputFormat18.getLineSeparator();
    java.lang.String[] str_array23 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i25 = outputFormat18.parseOptions(str_array23, (int)' ');
    int i27 = outputFormat7.parseOptions(str_array23, (int)' ');
    int i29 = outputFormat0.parseOptions(str_array23, (int)(short)10);
    char char30 = outputFormat0.getAttributeQuoteCharacter();
    java.lang.String str31 = outputFormat0.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\n"+ "'", str15.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\n"+ "'", str19.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char30 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\n"+ "'", str31.equals("\n"));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test340"); }


    OutputFormat outputFormat2 = new OutputFormat("UTF-8", true);
    boolean b3 = outputFormat2.isExpandEmptyElements();
    outputFormat2.setOmitEncoding(true);
    outputFormat2.setExpandEmptyElements(true);
    outputFormat2.setSuppressDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test341"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    boolean b8 = outputFormat1.isXHTML();
    outputFormat1.setPadText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test342"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setPadText(false);
    outputFormat0.setIndent(false);
    outputFormat0.setLineSeparator("                                  ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test343"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isXHTML();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    boolean b5 = outputFormat1.isNewLineAfterDeclaration();
    boolean b6 = outputFormat1.isPadText();
    outputFormat1.setIndent("  ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test344"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    boolean b8 = outputFormat1.isXHTML();
    boolean b9 = outputFormat1.isTrimText();
    outputFormat1.setIndent(true);
    boolean b12 = outputFormat1.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test345"); }


    OutputFormat outputFormat3 = new OutputFormat("", true, "UTF-8");
    outputFormat3.setNewlines(false);
    int i6 = outputFormat3.getNewLineAfterNTags();
    int i7 = outputFormat3.getNewLineAfterNTags();
    outputFormat3.setXHTML(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test346"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    java.lang.String str12 = outputFormat0.getLineSeparator();
    int i13 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setExpandEmptyElements(false);
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setEncoding("  ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test347"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    java.lang.String str5 = outputFormat0.getIndent();
    outputFormat0.setExpandEmptyElements(false);
    boolean b8 = outputFormat0.isPadText();
    boolean b9 = outputFormat0.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "UTF-8"+ "'", str5.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test348"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setIndent("\n");
    outputFormat0.setXHTML(true);
    boolean b8 = outputFormat0.isNewlines();
    outputFormat0.setIndentSize(100);
    outputFormat0.setAttributeQuoteCharacter('\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test349"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", true, "");
    outputFormat3.setNewLineAfterNTags(1);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test350"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    java.lang.String str3 = outputFormat0.getEncoding();
    boolean b4 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setExpandEmptyElements(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setNewLineAfterNTags((int)(byte)10);
    java.lang.String str11 = outputFormat0.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8"+ "'", str3.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "UTF-8"+ "'", str11.equals("UTF-8"));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test351"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", true, "hi!");
    boolean b4 = outputFormat3.isOmitEncoding();
    outputFormat3.setExpandEmptyElements(true);
    outputFormat3.setIndent("          ");
    outputFormat3.setTrimText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test352"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setAttributeQuoteCharacter('\"');
    outputFormat1.setTrimText(true);
    outputFormat1.setXHTML(false);
    java.lang.String str14 = outputFormat1.getIndent();
    outputFormat1.setXHTML(false);
    boolean b17 = outputFormat1.isSuppressDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test353"); }


    OutputFormat outputFormat2 = new OutputFormat("UTF-8", true);
    outputFormat2.setIndentSize((int)(short)-1);
    outputFormat2.setPadText(true);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test354"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setNewlines(false);
    boolean b7 = outputFormat1.isXHTML();
    outputFormat1.setNewLineAfterNTags((int)'\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test355"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    boolean b6 = outputFormat3.isNewLineAfterDeclaration();
    boolean b7 = outputFormat3.isSuppressDeclaration();
    boolean b8 = outputFormat3.isPadText();
    outputFormat3.setNewLineAfterDeclaration(true);
    OutputFormat outputFormat11 = OutputFormat.createCompactFormat();
    outputFormat11.setNewlines(false);
    outputFormat11.setXHTML(true);
    outputFormat11.setSuppressDeclaration(true);
    OutputFormat outputFormat18 = OutputFormat.createCompactFormat();
    outputFormat18.setNewlines(false);
    boolean b21 = outputFormat18.isNewLineAfterDeclaration();
    outputFormat18.setXHTML(true);
    java.lang.String str24 = outputFormat18.getLineSeparator();
    boolean b25 = outputFormat18.isExpandEmptyElements();
    boolean b26 = outputFormat18.isPadText();
    outputFormat18.setPadText(false);
    OutputFormat outputFormat29 = OutputFormat.createCompactFormat();
    outputFormat29.setNewlines(false);
    boolean b32 = outputFormat29.isNewLineAfterDeclaration();
    outputFormat29.setNewlines(true);
    outputFormat29.setExpandEmptyElements(true);
    java.lang.String str37 = outputFormat29.getLineSeparator();
    outputFormat29.setNewlines(false);
    outputFormat29.setXHTML(false);
    outputFormat29.setPadText(false);
    outputFormat29.setOmitEncoding(true);
    OutputFormat outputFormat46 = OutputFormat.createCompactFormat();
    outputFormat46.setNewlines(false);
    outputFormat46.setNewLineAfterDeclaration(false);
    boolean b51 = outputFormat46.isTrimText();
    boolean b52 = outputFormat46.isPadText();
    OutputFormat outputFormat53 = OutputFormat.createCompactFormat();
    outputFormat53.setNewlines(false);
    boolean b56 = outputFormat53.isNewLineAfterDeclaration();
    outputFormat53.setNewlines(true);
    outputFormat53.setExpandEmptyElements(true);
    java.lang.String str61 = outputFormat53.getLineSeparator();
    outputFormat53.setNewlines(false);
    OutputFormat outputFormat64 = OutputFormat.createCompactFormat();
    java.lang.String str65 = outputFormat64.getLineSeparator();
    java.lang.String[] str_array69 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i71 = outputFormat64.parseOptions(str_array69, (int)' ');
    int i73 = outputFormat53.parseOptions(str_array69, (int)' ');
    int i75 = outputFormat46.parseOptions(str_array69, (int)(short)10);
    int i77 = outputFormat29.parseOptions(str_array69, (int)' ');
    int i79 = outputFormat18.parseOptions(str_array69, (int)(byte)0);
    int i81 = outputFormat11.parseOptions(str_array69, 0);
    int i83 = outputFormat3.parseOptions(str_array69, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "\n"+ "'", str24.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "\n"+ "'", str37.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "\n"+ "'", str61.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "\n"+ "'", str65.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 100);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test356"); }


    OutputFormat outputFormat3 = new OutputFormat("                                  ", true, "");
    char char4 = outputFormat3.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char4 == '\"');

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test357"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", false, "hi!");
    boolean b4 = outputFormat3.isNewlines();
    outputFormat3.setSuppressDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test358"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    OutputFormat outputFormat11 = OutputFormat.createCompactFormat();
    java.lang.String str12 = outputFormat11.getLineSeparator();
    java.lang.String[] str_array16 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i18 = outputFormat11.parseOptions(str_array16, (int)' ');
    int i20 = outputFormat0.parseOptions(str_array16, (int)' ');
    outputFormat0.setNewlines(true);
    outputFormat0.setOmitEncoding(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 32);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test359"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterNTags((int)(short)10);
    boolean b12 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setTrimText(true);
    boolean b15 = outputFormat0.isOmitEncoding();
    int i16 = outputFormat0.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test360"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setIndent(true);
    boolean b11 = outputFormat0.isTrimText();
    outputFormat0.setIndent("");
    java.lang.String str14 = outputFormat0.getIndent();
    outputFormat0.setIndentSize((int)(byte)100);
    java.lang.String str17 = outputFormat0.getLineSeparator();
    boolean b18 = outputFormat0.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\n"+ "'", str17.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test361"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterNTags((int)(short)10);
    boolean b12 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setLineSeparator("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test362"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    OutputFormat outputFormat13 = new OutputFormat("hi!");
    boolean b14 = outputFormat13.isOmitEncoding();
    java.lang.String[] str_array17 = new java.lang.String[] { "", "\n" };
    int i19 = outputFormat13.parseOptions(str_array17, (int)(byte)1);
    int i21 = outputFormat0.parseOptions(str_array17, (int)'a');
    boolean b22 = outputFormat0.isNewlines();
    boolean b23 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setExpandEmptyElements(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test363"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", false, "\n");
    int i4 = outputFormat3.getNewLineAfterNTags();
    boolean b5 = outputFormat3.isOmitEncoding();
    boolean b6 = outputFormat3.isNewLineAfterDeclaration();
    outputFormat3.setEncoding("UTF-8");
    boolean b9 = outputFormat3.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test364"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b5 = outputFormat0.isTrimText();
    outputFormat0.setXHTML(false);
    outputFormat0.setLineSeparator("UTF-8");
    boolean b10 = outputFormat0.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test365"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    java.lang.String str3 = outputFormat0.getEncoding();
    outputFormat0.setIndentSize(10);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getLineSeparator();
    boolean b8 = outputFormat0.isNewlines();
    boolean b9 = outputFormat0.isExpandEmptyElements();
    boolean b10 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setExpandEmptyElements(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8"+ "'", str3.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\n"+ "'", str7.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test366"); }


    OutputFormat outputFormat2 = new OutputFormat("\n", false);
    outputFormat2.setIndent(true);
    boolean b5 = outputFormat2.isNewLineAfterDeclaration();
    outputFormat2.setIndentSize((int)(byte)0);
    java.lang.String str8 = outputFormat2.getEncoding();
    outputFormat2.setSuppressDeclaration(false);
    // The following exception was thrown during execution in test generation
    try {
    outputFormat2.setAttributeQuoteCharacter('a');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UTF-8"+ "'", str8.equals("UTF-8"));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test367"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    boolean b10 = outputFormat0.isTrimText();
    outputFormat0.setLineSeparator("  ");
    outputFormat0.setIndent("                                  ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test368"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    outputFormat0.setExpandEmptyElements(true);
    boolean b7 = outputFormat0.isPadText();
    outputFormat0.setPadText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test369"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    outputFormat0.setPadText(true);
    boolean b6 = outputFormat0.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test370"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    java.lang.String str6 = outputFormat1.getIndent();
    outputFormat1.setTrimText(true);
    java.lang.String str9 = outputFormat1.getLineSeparator();
    outputFormat1.setTrimText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n"+ "'", str9.equals("\n"));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test371"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    java.lang.String str3 = outputFormat0.getEncoding();
    boolean b4 = outputFormat0.isNewLineAfterDeclaration();
    boolean b5 = outputFormat0.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8"+ "'", str3.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test372"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    java.lang.String str3 = outputFormat0.getEncoding();
    outputFormat0.setIndentSize(10);
    outputFormat0.setPadText(true);
    java.lang.String str8 = outputFormat0.getEncoding();
    outputFormat0.setIndent(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8"+ "'", str3.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UTF-8"+ "'", str8.equals("UTF-8"));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test373"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    boolean b9 = outputFormat0.isXHTML();
    boolean b10 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setOmitEncoding(false);
    boolean b13 = outputFormat0.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test374"); }


    OutputFormat outputFormat1 = new OutputFormat("\n");
    boolean b2 = outputFormat1.isXHTML();
    outputFormat1.setNewlines(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test375"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    OutputFormat outputFormat8 = OutputFormat.createCompactFormat();
    outputFormat8.setNewlines(false);
    boolean b11 = outputFormat8.isNewLineAfterDeclaration();
    outputFormat8.setNewlines(true);
    outputFormat8.setExpandEmptyElements(true);
    java.lang.String str16 = outputFormat8.getLineSeparator();
    outputFormat8.setNewlines(false);
    java.lang.String str19 = outputFormat8.getIndent();
    OutputFormat outputFormat21 = new OutputFormat("hi!");
    boolean b22 = outputFormat21.isOmitEncoding();
    java.lang.String[] str_array25 = new java.lang.String[] { "", "\n" };
    int i27 = outputFormat21.parseOptions(str_array25, (int)(byte)1);
    int i29 = outputFormat8.parseOptions(str_array25, (int)'a');
    int i31 = outputFormat1.parseOptions(str_array25, 52);
    outputFormat1.setOmitEncoding(true);
    outputFormat1.setOmitEncoding(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\n"+ "'", str16.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 52);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test376"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setIndent(true);
    boolean b11 = outputFormat0.isTrimText();
    outputFormat0.setIndent("");
    outputFormat0.setNewlines(true);
    char char16 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setTrimText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char16 == '\"');

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test377"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(true);
    outputFormat0.setNewlines(false);
    boolean b10 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setExpandEmptyElements(false);
    outputFormat0.setNewlines(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test378"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)1);
    outputFormat0.setIndent(false);
    boolean b13 = outputFormat0.isXHTML();
    java.lang.String str14 = outputFormat0.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "UTF-8"+ "'", str14.equals("UTF-8"));

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test379"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    outputFormat1.setIndent(true);
    outputFormat1.setEncoding("");
    outputFormat1.setEncoding("");
    outputFormat1.setXHTML(false);
    outputFormat1.setIndentSize(35);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test380"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setEncoding("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test381"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    java.lang.String str10 = outputFormat0.getEncoding();
    outputFormat0.setTrimText(true);
    outputFormat0.setNewLineAfterNTags((int)(short)0);
    outputFormat0.setTrimText(true);
    boolean b17 = outputFormat0.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UTF-8"+ "'", str10.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test382"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setIndent(true);
    int i8 = outputFormat0.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test383"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndentSize(34);
    outputFormat0.setIndentSize((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test384"); }


    OutputFormat outputFormat0 = new OutputFormat();
    boolean b1 = outputFormat0.isSuppressDeclaration();
    // The following exception was thrown during execution in test generation
    try {
    outputFormat0.setAttributeQuoteCharacter('#');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test385"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    boolean b9 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setPadText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test386"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    boolean b10 = outputFormat0.isOmitEncoding();
    outputFormat0.setOmitEncoding(true);
    char char13 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setNewLineAfterDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char13 == '\"');

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test387"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    boolean b10 = outputFormat0.isTrimText();
    boolean b11 = outputFormat0.isNewLineAfterDeclaration();
    boolean b12 = outputFormat0.isOmitEncoding();
    boolean b13 = outputFormat0.isOmitEncoding();
    outputFormat0.setOmitEncoding(false);
    boolean b16 = outputFormat0.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test388"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    java.lang.String str6 = outputFormat1.getIndent();
    OutputFormat outputFormat8 = new OutputFormat("hi!");
    boolean b9 = outputFormat8.isOmitEncoding();
    java.lang.String[] str_array12 = new java.lang.String[] { "", "\n" };
    int i14 = outputFormat8.parseOptions(str_array12, (int)(byte)1);
    int i16 = outputFormat1.parseOptions(str_array12, (int)(byte)10);
    java.lang.String str17 = outputFormat1.getEncoding();
    boolean b18 = outputFormat1.isSuppressDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "UTF-8"+ "'", str17.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test389"); }


    OutputFormat outputFormat3 = new OutputFormat("  ", true, "                                                                                                    ");

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test390"); }


    OutputFormat outputFormat2 = new OutputFormat("  ", true);
    OutputFormat outputFormat3 = OutputFormat.createCompactFormat();
    outputFormat3.setNewlines(false);
    boolean b6 = outputFormat3.isOmitEncoding();
    outputFormat3.setIndentSize((int)'\"');
    outputFormat3.setIndentSize(1);
    OutputFormat outputFormat12 = new OutputFormat("hi!");
    boolean b13 = outputFormat12.isOmitEncoding();
    boolean b14 = outputFormat12.isPadText();
    boolean b15 = outputFormat12.isSuppressDeclaration();
    outputFormat12.setNewlines(false);
    boolean b18 = outputFormat12.isXHTML();
    outputFormat12.setIndent("");
    OutputFormat outputFormat21 = OutputFormat.createCompactFormat();
    outputFormat21.setNewlines(false);
    outputFormat21.setNewLineAfterDeclaration(false);
    boolean b26 = outputFormat21.isTrimText();
    boolean b27 = outputFormat21.isPadText();
    OutputFormat outputFormat28 = OutputFormat.createCompactFormat();
    outputFormat28.setNewlines(false);
    boolean b31 = outputFormat28.isNewLineAfterDeclaration();
    outputFormat28.setNewlines(true);
    outputFormat28.setExpandEmptyElements(true);
    java.lang.String str36 = outputFormat28.getLineSeparator();
    outputFormat28.setNewlines(false);
    OutputFormat outputFormat39 = OutputFormat.createCompactFormat();
    java.lang.String str40 = outputFormat39.getLineSeparator();
    java.lang.String[] str_array44 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i46 = outputFormat39.parseOptions(str_array44, (int)' ');
    int i48 = outputFormat28.parseOptions(str_array44, (int)' ');
    int i50 = outputFormat21.parseOptions(str_array44, (int)(short)10);
    OutputFormat outputFormat51 = OutputFormat.createCompactFormat();
    outputFormat51.setNewlines(false);
    outputFormat51.setNewLineAfterDeclaration(false);
    boolean b56 = outputFormat51.isTrimText();
    boolean b57 = outputFormat51.isPadText();
    OutputFormat outputFormat58 = OutputFormat.createCompactFormat();
    outputFormat58.setNewlines(false);
    boolean b61 = outputFormat58.isNewLineAfterDeclaration();
    outputFormat58.setNewlines(true);
    outputFormat58.setExpandEmptyElements(true);
    java.lang.String str66 = outputFormat58.getLineSeparator();
    outputFormat58.setNewlines(false);
    OutputFormat outputFormat69 = OutputFormat.createCompactFormat();
    java.lang.String str70 = outputFormat69.getLineSeparator();
    java.lang.String[] str_array74 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i76 = outputFormat69.parseOptions(str_array74, (int)' ');
    int i78 = outputFormat58.parseOptions(str_array74, (int)' ');
    int i80 = outputFormat51.parseOptions(str_array74, (int)(short)10);
    int i82 = outputFormat21.parseOptions(str_array74, (int)(short)100);
    int i84 = outputFormat12.parseOptions(str_array74, 100);
    int i86 = outputFormat3.parseOptions(str_array74, (int)(byte)0);
    int i88 = outputFormat2.parseOptions(str_array74, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "\n"+ "'", str36.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "\n"+ "'", str40.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "\n"+ "'", str66.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "\n"+ "'", str70.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 52);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test391"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setEncoding("\n");
    outputFormat1.setNewLineAfterNTags(32);
    boolean b7 = outputFormat1.isNewlines();
    boolean b8 = outputFormat1.isPadText();
    outputFormat1.setExpandEmptyElements(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test392"); }


    OutputFormat outputFormat3 = new OutputFormat("                                                                                                    ", true, "                                                                                                    ");

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test393"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isXHTML();
    boolean b6 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewLineAfterNTags((int)(short)100);
    outputFormat0.setIndent(true);
    java.lang.String str11 = outputFormat0.getIndent();
    boolean b12 = outputFormat0.isOmitEncoding();
    boolean b13 = outputFormat0.isNewLineAfterDeclaration();
    boolean b14 = outputFormat0.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "  "+ "'", str11.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test394"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isXHTML();
    outputFormat0.setIndent("                                  ");
    outputFormat0.setTrimText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test395"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    boolean b4 = outputFormat1.isXHTML();
    outputFormat1.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test396"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndent(false);
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setSuppressDeclaration(true);
    java.lang.String str17 = outputFormat0.getEncoding();
    outputFormat0.setOmitEncoding(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "UTF-8"+ "'", str17.equals("UTF-8"));

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test397"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    boolean b5 = outputFormat1.isPadText();
    outputFormat1.setExpandEmptyElements(false);
    char char8 = outputFormat1.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char8 == '\"');

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test398"); }


    OutputFormat outputFormat1 = new OutputFormat("");
    java.lang.String str2 = outputFormat1.getIndent();
    int i3 = outputFormat1.getNewLineAfterNTags();
    outputFormat1.setTrimText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test399"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(true);
    outputFormat0.setNewlines(false);
    boolean b10 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setTrimText(false);
    outputFormat0.setTrimText(true);
    outputFormat0.setPadText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test400"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    char char7 = outputFormat0.getAttributeQuoteCharacter();
    boolean b8 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setPadText(false);
    outputFormat0.setNewlines(true);
    outputFormat0.setTrimText(false);
    outputFormat0.setPadText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test401"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "  ");
    boolean b4 = outputFormat3.isExpandEmptyElements();
    boolean b5 = outputFormat3.isSuppressDeclaration();
    outputFormat3.setIndentSize(52);
    outputFormat3.setIndentSize((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test402"); }


    OutputFormat outputFormat3 = new OutputFormat("                                  ", false, "UTF-8");
    OutputFormat outputFormat4 = OutputFormat.createCompactFormat();
    outputFormat4.setNewlines(false);
    boolean b7 = outputFormat4.isNewLineAfterDeclaration();
    outputFormat4.setXHTML(true);
    java.lang.String str10 = outputFormat4.getLineSeparator();
    boolean b11 = outputFormat4.isExpandEmptyElements();
    boolean b12 = outputFormat4.isPadText();
    outputFormat4.setPadText(false);
    OutputFormat outputFormat15 = OutputFormat.createCompactFormat();
    outputFormat15.setNewlines(false);
    boolean b18 = outputFormat15.isNewLineAfterDeclaration();
    outputFormat15.setNewlines(true);
    outputFormat15.setExpandEmptyElements(true);
    java.lang.String str23 = outputFormat15.getLineSeparator();
    outputFormat15.setNewlines(false);
    outputFormat15.setXHTML(false);
    outputFormat15.setPadText(false);
    outputFormat15.setOmitEncoding(true);
    OutputFormat outputFormat32 = OutputFormat.createCompactFormat();
    outputFormat32.setNewlines(false);
    outputFormat32.setNewLineAfterDeclaration(false);
    boolean b37 = outputFormat32.isTrimText();
    boolean b38 = outputFormat32.isPadText();
    OutputFormat outputFormat39 = OutputFormat.createCompactFormat();
    outputFormat39.setNewlines(false);
    boolean b42 = outputFormat39.isNewLineAfterDeclaration();
    outputFormat39.setNewlines(true);
    outputFormat39.setExpandEmptyElements(true);
    java.lang.String str47 = outputFormat39.getLineSeparator();
    outputFormat39.setNewlines(false);
    OutputFormat outputFormat50 = OutputFormat.createCompactFormat();
    java.lang.String str51 = outputFormat50.getLineSeparator();
    java.lang.String[] str_array55 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i57 = outputFormat50.parseOptions(str_array55, (int)' ');
    int i59 = outputFormat39.parseOptions(str_array55, (int)' ');
    int i61 = outputFormat32.parseOptions(str_array55, (int)(short)10);
    int i63 = outputFormat15.parseOptions(str_array55, (int)' ');
    int i65 = outputFormat4.parseOptions(str_array55, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    int i67 = outputFormat3.parseOptions(str_array55, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n"+ "'", str10.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\n"+ "'", str23.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "\n"+ "'", str47.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "\n"+ "'", str51.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test403"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    java.lang.String str5 = outputFormat0.getIndent();
    java.lang.String str6 = outputFormat0.getLineSeparator();
    outputFormat0.setIndent("  ");
    outputFormat0.setPadText(true);
    java.lang.String str11 = outputFormat0.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "UTF-8"+ "'", str11.equals("UTF-8"));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test404"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    java.lang.String str12 = outputFormat0.getLineSeparator();
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setLineSeparator("\n");
    boolean b17 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setSuppressDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test405"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setLineSeparator("hi!");
    java.lang.String str9 = outputFormat1.getIndent();
    boolean b10 = outputFormat1.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test406"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setPadText(false);
    outputFormat0.setOmitEncoding(true);
    OutputFormat outputFormat17 = OutputFormat.createCompactFormat();
    outputFormat17.setNewlines(false);
    outputFormat17.setNewLineAfterDeclaration(false);
    boolean b22 = outputFormat17.isTrimText();
    boolean b23 = outputFormat17.isPadText();
    OutputFormat outputFormat24 = OutputFormat.createCompactFormat();
    outputFormat24.setNewlines(false);
    boolean b27 = outputFormat24.isNewLineAfterDeclaration();
    outputFormat24.setNewlines(true);
    outputFormat24.setExpandEmptyElements(true);
    java.lang.String str32 = outputFormat24.getLineSeparator();
    outputFormat24.setNewlines(false);
    OutputFormat outputFormat35 = OutputFormat.createCompactFormat();
    java.lang.String str36 = outputFormat35.getLineSeparator();
    java.lang.String[] str_array40 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i42 = outputFormat35.parseOptions(str_array40, (int)' ');
    int i44 = outputFormat24.parseOptions(str_array40, (int)' ');
    int i46 = outputFormat17.parseOptions(str_array40, (int)(short)10);
    int i48 = outputFormat0.parseOptions(str_array40, (int)' ');
    outputFormat0.setSuppressDeclaration(true);
    java.lang.String str51 = outputFormat0.getEncoding();
    outputFormat0.setSuppressDeclaration(false);
    boolean b54 = outputFormat0.isXHTML();
    outputFormat0.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "\n"+ "'", str32.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "\n"+ "'", str36.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "UTF-8"+ "'", str51.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test407"); }


    OutputFormat outputFormat2 = new OutputFormat("UTF-8", false);
    outputFormat2.setNewLineAfterDeclaration(false);
    boolean b5 = outputFormat2.isXHTML();
    java.lang.String str6 = outputFormat2.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "UTF-8"+ "'", str6.equals("UTF-8"));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test408"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    boolean b9 = outputFormat0.isOmitEncoding();
    boolean b10 = outputFormat0.isTrimText();
    outputFormat0.setIndent(true);
    outputFormat0.setIndent(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test409"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("\n");
    java.lang.String str10 = outputFormat1.getIndent();
    outputFormat1.setIndent("  ");
    java.lang.String str13 = outputFormat1.getEncoding();
    boolean b14 = outputFormat1.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n"+ "'", str10.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "UTF-8"+ "'", str13.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test410"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(true);
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setTrimText(true);
    boolean b12 = outputFormat0.isOmitEncoding();
    java.lang.String str13 = outputFormat0.getEncoding();
    boolean b14 = outputFormat0.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "UTF-8"+ "'", str13.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test411"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b5 = outputFormat0.isTrimText();
    boolean b6 = outputFormat0.isPadText();
    OutputFormat outputFormat7 = OutputFormat.createCompactFormat();
    outputFormat7.setNewlines(false);
    boolean b10 = outputFormat7.isNewLineAfterDeclaration();
    outputFormat7.setNewlines(true);
    outputFormat7.setExpandEmptyElements(true);
    java.lang.String str15 = outputFormat7.getLineSeparator();
    outputFormat7.setNewlines(false);
    OutputFormat outputFormat18 = OutputFormat.createCompactFormat();
    java.lang.String str19 = outputFormat18.getLineSeparator();
    java.lang.String[] str_array23 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i25 = outputFormat18.parseOptions(str_array23, (int)' ');
    int i27 = outputFormat7.parseOptions(str_array23, (int)' ');
    int i29 = outputFormat0.parseOptions(str_array23, (int)(short)10);
    char char30 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setNewlines(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\n"+ "'", str15.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\n"+ "'", str19.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char30 == '\"');

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test412"); }


    OutputFormat outputFormat2 = new OutputFormat("", true);
    outputFormat2.setEncoding("");
    boolean b5 = outputFormat2.isNewLineAfterDeclaration();
    int i6 = outputFormat2.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat2.getEncoding();
    outputFormat2.setOmitEncoding(true);
    outputFormat2.setNewLineAfterNTags((int)(short)-1);
    java.lang.String str12 = outputFormat2.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test413"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    char char7 = outputFormat0.getAttributeQuoteCharacter();
    boolean b8 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setExpandEmptyElements(false);
    outputFormat0.setSuppressDeclaration(true);
    boolean b13 = outputFormat0.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test414"); }


    OutputFormat outputFormat3 = new OutputFormat("  ", false, "\n");
    outputFormat3.setLineSeparator("                                                                                                    ");

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test415"); }


    OutputFormat outputFormat3 = new OutputFormat("", true, "  ");
    outputFormat3.setLineSeparator("\n");
    outputFormat3.setNewLineAfterNTags((int)'a');

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test416"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isExpandEmptyElements();
    int i4 = outputFormat1.getNewLineAfterNTags();
    boolean b5 = outputFormat1.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test417"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    boolean b7 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setNewLineAfterNTags((int)(short)100);
    outputFormat1.setNewlines(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test418"); }


    OutputFormat outputFormat2 = new OutputFormat("          ", false);
    outputFormat2.setPadText(true);
    outputFormat2.setEncoding("          ");

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test419"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b5 = outputFormat0.isTrimText();
    boolean b6 = outputFormat0.isSuppressDeclaration();
    boolean b7 = outputFormat0.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test420"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndent(false);
    outputFormat0.setExpandEmptyElements(true);
    boolean b15 = outputFormat0.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test421"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setEncoding("");
    int i5 = outputFormat1.getNewLineAfterNTags();
    boolean b6 = outputFormat1.isXHTML();
    boolean b7 = outputFormat1.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test422"); }


    OutputFormat outputFormat3 = new OutputFormat("", true, "UTF-8");
    boolean b4 = outputFormat3.isNewlines();
    boolean b5 = outputFormat3.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test423"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setIndentSize((int)(short)100);
    java.lang.String str8 = outputFormat0.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "                                                                                                    "+ "'", str8.equals("                                                                                                    "));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test424"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setEncoding("\n");
    outputFormat1.setNewLineAfterNTags(32);
    java.lang.String str7 = outputFormat1.getIndent();
    boolean b8 = outputFormat1.isTrimText();
    boolean b9 = outputFormat1.isOmitEncoding();
    boolean b10 = outputFormat1.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test425"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    java.lang.String str12 = outputFormat0.getLineSeparator();
    outputFormat0.setExpandEmptyElements(true);
    boolean b15 = outputFormat0.isSuppressDeclaration();
    int i16 = outputFormat0.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test426"); }


    OutputFormat outputFormat2 = new OutputFormat("UTF-8", true);
    boolean b3 = outputFormat2.isExpandEmptyElements();
    char char4 = outputFormat2.getAttributeQuoteCharacter();
    outputFormat2.setIndent("          ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char4 == '\"');

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test427"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setIndent(true);
    boolean b11 = outputFormat0.isTrimText();
    outputFormat0.setIndent("");
    outputFormat0.setNewlines(true);
    char char16 = outputFormat0.getAttributeQuoteCharacter();
    java.lang.String str17 = outputFormat0.getIndent();
    outputFormat0.setIndent("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char16 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test428"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setTrimText(false);
    outputFormat0.setIndent(false);
    java.lang.String str11 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    outputFormat0.setSuppressDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n"+ "'", str11.equals("\n"));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test429"); }


    OutputFormat outputFormat2 = new OutputFormat("UTF-8", true);
    boolean b3 = outputFormat2.isExpandEmptyElements();
    outputFormat2.setOmitEncoding(true);
    boolean b6 = outputFormat2.isPadText();
    outputFormat2.setPadText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test430"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    outputFormat1.setIndent(true);
    outputFormat1.setNewLineAfterDeclaration(false);
    boolean b6 = outputFormat1.isXHTML();
    boolean b7 = outputFormat1.isNewLineAfterDeclaration();
    boolean b8 = outputFormat1.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test431"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    OutputFormat outputFormat11 = OutputFormat.createCompactFormat();
    java.lang.String str12 = outputFormat11.getLineSeparator();
    java.lang.String[] str_array16 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i18 = outputFormat11.parseOptions(str_array16, (int)' ');
    int i20 = outputFormat0.parseOptions(str_array16, (int)' ');
    outputFormat0.setNewlines(true);
    boolean b23 = outputFormat0.isOmitEncoding();
    boolean b24 = outputFormat0.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test432"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setLineSeparator("hi!");
    java.lang.String str9 = outputFormat1.getIndent();
    boolean b10 = outputFormat1.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test433"); }


    OutputFormat outputFormat2 = new OutputFormat("\n", false);
    outputFormat2.setIndent(true);
    boolean b5 = outputFormat2.isNewLineAfterDeclaration();
    boolean b6 = outputFormat2.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test434"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isExpandEmptyElements();
    outputFormat1.setEncoding("UTF-8");
    boolean b6 = outputFormat1.isXHTML();
    java.lang.String str7 = outputFormat1.getIndent();
    outputFormat1.setTrimText(false);
    outputFormat1.setOmitEncoding(false);
    outputFormat1.setNewlines(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test435"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setNewlines(true);
    outputFormat1.setNewLineAfterDeclaration(true);
    outputFormat1.setIndent(true);
    outputFormat1.setSuppressDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test436"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    int i6 = outputFormat1.getNewLineAfterNTags();
    char char7 = outputFormat1.getAttributeQuoteCharacter();
    boolean b8 = outputFormat1.isOmitEncoding();
    java.lang.String str9 = outputFormat1.getLineSeparator();
    java.lang.String str10 = outputFormat1.getIndent();
    outputFormat1.setLineSeparator("UTF-8");
    boolean b13 = outputFormat1.isSuppressDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n"+ "'", str9.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test437"); }


    OutputFormat outputFormat3 = new OutputFormat("UTF-8", true, "\n");
    outputFormat3.setPadText(true);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test438"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    outputFormat2.setIndent(true);
    java.lang.String str5 = outputFormat2.getIndent();
    outputFormat2.setTrimText(false);
    boolean b8 = outputFormat2.isNewlines();
    boolean b9 = outputFormat2.isTrimText();
    outputFormat2.setOmitEncoding(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "  "+ "'", str5.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test439"); }


    OutputFormat outputFormat1 = new OutputFormat("");
    java.lang.String str2 = outputFormat1.getIndent();
    int i3 = outputFormat1.getNewLineAfterNTags();
    outputFormat1.setNewlines(false);
    outputFormat1.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test440"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    char char7 = outputFormat0.getAttributeQuoteCharacter();
    boolean b8 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setPadText(false);
    java.lang.String str11 = outputFormat0.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test441"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    boolean b10 = outputFormat0.isTrimText();
    boolean b11 = outputFormat0.isNewLineAfterDeclaration();
    boolean b12 = outputFormat0.isOmitEncoding();
    boolean b13 = outputFormat0.isOmitEncoding();
    outputFormat0.setOmitEncoding(false);
    outputFormat0.setNewLineAfterNTags(34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test442"); }


    OutputFormat outputFormat0 = new OutputFormat();
    boolean b1 = outputFormat0.isNewlines();
    outputFormat0.setIndent(true);
    outputFormat0.setXHTML(true);
    outputFormat0.setLineSeparator("  ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test443"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    outputFormat1.setEncoding("hi!");
    outputFormat1.setTrimText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test444"); }


    OutputFormat outputFormat1 = new OutputFormat("                                  ");
    outputFormat1.setLineSeparator("UTF-8");

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test445"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setExpandEmptyElements(true);
    outputFormat1.setNewlines(true);
    boolean b12 = outputFormat1.isOmitEncoding();
    java.lang.String str13 = outputFormat1.getEncoding();
    int i14 = outputFormat1.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "UTF-8"+ "'", str13.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test446"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndent("\n");
    outputFormat0.setIndent(true);
    outputFormat0.setEncoding("");
    outputFormat0.setNewlines(true);
    boolean b13 = outputFormat0.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test447"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(true);
    outputFormat0.setNewlines(false);
    OutputFormat outputFormat11 = new OutputFormat("hi!");
    boolean b12 = outputFormat11.isOmitEncoding();
    java.lang.String[] str_array15 = new java.lang.String[] { "", "\n" };
    int i17 = outputFormat11.parseOptions(str_array15, (int)(byte)1);
    int i19 = outputFormat0.parseOptions(str_array15, (int)'4');
    boolean b20 = outputFormat0.isNewlines();
    outputFormat0.setPadText(false);
    outputFormat0.setIndentSize(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test448"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setNewLineAfterNTags((int)'\"');
    char char11 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setNewlines(false);
    outputFormat0.setTrimText(false);
    java.lang.String str16 = outputFormat0.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char11 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test449"); }


    OutputFormat outputFormat1 = new OutputFormat("");
    java.lang.String str2 = outputFormat1.getIndent();
    outputFormat1.setIndent("  ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test450"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    outputFormat2.setPadText(false);
    char char5 = outputFormat2.getAttributeQuoteCharacter();
    boolean b6 = outputFormat2.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char5 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test451"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndent("\n");
    outputFormat0.setIndent(true);
    outputFormat0.setEncoding("");
    outputFormat0.setIndentSize(100);
    outputFormat0.setNewlines(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test452"); }


    OutputFormat outputFormat2 = new OutputFormat("", true);
    outputFormat2.setEncoding("");
    boolean b5 = outputFormat2.isNewLineAfterDeclaration();
    int i6 = outputFormat2.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat2.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test453"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    int i6 = outputFormat1.getNewLineAfterNTags();
    char char7 = outputFormat1.getAttributeQuoteCharacter();
    outputFormat1.setIndent(false);
    outputFormat1.setNewLineAfterNTags((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test454"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    boolean b4 = outputFormat1.isTrimText();
    outputFormat1.setXHTML(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test455"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    boolean b8 = outputFormat1.isXHTML();
    boolean b9 = outputFormat1.isTrimText();
    outputFormat1.setIndent(true);
    outputFormat1.setXHTML(true);
    java.lang.String str14 = outputFormat1.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "UTF-8"+ "'", str14.equals("UTF-8"));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test456"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    char char4 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setOmitEncoding(false);
    outputFormat0.setSuppressDeclaration(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setIndent("                                  ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char4 == '\"');

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test457"); }


    OutputFormat outputFormat1 = new OutputFormat("                                                                                                    ");
    outputFormat1.setNewlines(true);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test458"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setTrimText(false);
    outputFormat0.setIndent(false);
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setEncoding("hi!");
    outputFormat0.setNewLineAfterNTags((int)(byte)100);
    outputFormat0.setXHTML(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test459"); }


    OutputFormat outputFormat2 = new OutputFormat("  ", true);
    java.lang.String str3 = outputFormat2.getEncoding();
    outputFormat2.setIndent(true);
    outputFormat2.setExpandEmptyElements(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8"+ "'", str3.equals("UTF-8"));

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test460"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    outputFormat2.setPadText(false);
    char char5 = outputFormat2.getAttributeQuoteCharacter();
    int i6 = outputFormat2.getNewLineAfterNTags();
    outputFormat2.setNewLineAfterDeclaration(false);
    outputFormat2.setSuppressDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char5 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test461"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setPadText(false);
    outputFormat0.setOmitEncoding(true);
    OutputFormat outputFormat17 = OutputFormat.createCompactFormat();
    outputFormat17.setNewlines(false);
    outputFormat17.setNewLineAfterDeclaration(false);
    boolean b22 = outputFormat17.isTrimText();
    boolean b23 = outputFormat17.isPadText();
    OutputFormat outputFormat24 = OutputFormat.createCompactFormat();
    outputFormat24.setNewlines(false);
    boolean b27 = outputFormat24.isNewLineAfterDeclaration();
    outputFormat24.setNewlines(true);
    outputFormat24.setExpandEmptyElements(true);
    java.lang.String str32 = outputFormat24.getLineSeparator();
    outputFormat24.setNewlines(false);
    OutputFormat outputFormat35 = OutputFormat.createCompactFormat();
    java.lang.String str36 = outputFormat35.getLineSeparator();
    java.lang.String[] str_array40 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i42 = outputFormat35.parseOptions(str_array40, (int)' ');
    int i44 = outputFormat24.parseOptions(str_array40, (int)' ');
    int i46 = outputFormat17.parseOptions(str_array40, (int)(short)10);
    int i48 = outputFormat0.parseOptions(str_array40, (int)' ');
    outputFormat0.setSuppressDeclaration(true);
    java.lang.String str51 = outputFormat0.getEncoding();
    outputFormat0.setSuppressDeclaration(false);
    boolean b54 = outputFormat0.isXHTML();
    outputFormat0.setTrimText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "\n"+ "'", str32.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "\n"+ "'", str36.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "UTF-8"+ "'", str51.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test462"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    int i2 = outputFormat1.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test463"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setNewlines(true);
    outputFormat1.setIndent("  ");
    java.lang.String str7 = outputFormat1.getLineSeparator();
    boolean b8 = outputFormat1.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\n"+ "'", str7.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test464"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setIndentSize((int)(short)1);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setTrimText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test465"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setNewlines(false);
    boolean b7 = outputFormat1.isXHTML();
    boolean b8 = outputFormat1.isPadText();
    outputFormat1.setTrimText(true);
    boolean b11 = outputFormat1.isExpandEmptyElements();
    outputFormat1.setExpandEmptyElements(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test466"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isExpandEmptyElements();
    outputFormat1.setIndent(true);
    outputFormat1.setXHTML(false);
    boolean b8 = outputFormat1.isNewlines();
    boolean b9 = outputFormat1.isSuppressDeclaration();
    boolean b10 = outputFormat1.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test467"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setPadText(false);
    outputFormat0.setOmitEncoding(true);
    java.lang.String str17 = outputFormat0.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test468"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    java.lang.String str5 = outputFormat0.getIndent();
    boolean b6 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setAttributeQuoteCharacter('\"');
    outputFormat0.setNewlines(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test469"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    outputFormat2.setIndent("  ");
    outputFormat2.setNewlines(true);
    outputFormat2.setOmitEncoding(true);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test470"); }


    OutputFormat outputFormat1 = new OutputFormat("  ");
    outputFormat1.setIndentSize((int)(short)100);
    java.lang.String str4 = outputFormat1.getLineSeparator();
    outputFormat1.setNewLineAfterDeclaration(true);
    outputFormat1.setOmitEncoding(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\n"+ "'", str4.equals("\n"));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test471"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setTrimText(false);
    outputFormat0.setIndent(false);
    boolean b11 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setLineSeparator("hi!");
    boolean b14 = outputFormat0.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test472"); }


    OutputFormat outputFormat2 = new OutputFormat("\n", false);
    outputFormat2.setIndent(true);
    boolean b5 = outputFormat2.isNewLineAfterDeclaration();
    outputFormat2.setIndentSize((int)(byte)0);
    java.lang.String str8 = outputFormat2.getEncoding();
    outputFormat2.setSuppressDeclaration(false);
    boolean b11 = outputFormat2.isExpandEmptyElements();
    int i12 = outputFormat2.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UTF-8"+ "'", str8.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test473"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setIndent("hi!");
    java.lang.String str9 = outputFormat0.getIndent();
    java.lang.String str10 = outputFormat0.getIndent();
    outputFormat0.setEncoding("\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test474"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b5 = outputFormat0.isTrimText();
    boolean b6 = outputFormat0.isPadText();
    OutputFormat outputFormat7 = OutputFormat.createCompactFormat();
    outputFormat7.setNewlines(false);
    boolean b10 = outputFormat7.isNewLineAfterDeclaration();
    outputFormat7.setNewlines(true);
    outputFormat7.setExpandEmptyElements(true);
    java.lang.String str15 = outputFormat7.getLineSeparator();
    outputFormat7.setNewlines(false);
    OutputFormat outputFormat18 = OutputFormat.createCompactFormat();
    java.lang.String str19 = outputFormat18.getLineSeparator();
    java.lang.String[] str_array23 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i25 = outputFormat18.parseOptions(str_array23, (int)' ');
    int i27 = outputFormat7.parseOptions(str_array23, (int)' ');
    int i29 = outputFormat0.parseOptions(str_array23, (int)(short)10);
    boolean b30 = outputFormat0.isOmitEncoding();
    boolean b31 = outputFormat0.isNewlines();
    outputFormat0.setEncoding("          ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\n"+ "'", str15.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\n"+ "'", str19.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test475"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", true, "          ");
    outputFormat3.setIndent("                                  ");
    char char6 = outputFormat3.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char6 == '\"');

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test476"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    boolean b13 = outputFormat0.isPadText();
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setLineSeparator("                                  ");
    boolean b18 = outputFormat0.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test477"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    boolean b1 = outputFormat0.isTrimText();
    outputFormat0.setPadText(false);
    int i4 = outputFormat0.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test478"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    boolean b3 = outputFormat2.isPadText();
    int i4 = outputFormat2.getNewLineAfterNTags();
    outputFormat2.setIndent("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test479"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    outputFormat2.setIndent(true);
    java.lang.String str5 = outputFormat2.getIndent();
    outputFormat2.setTrimText(false);
    boolean b8 = outputFormat2.isNewlines();
    boolean b9 = outputFormat2.isTrimText();
    outputFormat2.setSuppressDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "  "+ "'", str5.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test480"); }


    OutputFormat outputFormat2 = new OutputFormat("UTF-8", false);
    outputFormat2.setNewLineAfterNTags(52);
    outputFormat2.setNewLineAfterDeclaration(true);
    outputFormat2.setNewLineAfterDeclaration(false);
    int i9 = outputFormat2.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test481"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    char char7 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setEncoding("\n");
    OutputFormat outputFormat13 = new OutputFormat("", false, "");
    OutputFormat outputFormat14 = OutputFormat.createCompactFormat();
    java.lang.String str15 = outputFormat14.getLineSeparator();
    java.lang.String[] str_array19 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i21 = outputFormat14.parseOptions(str_array19, (int)' ');
    int i23 = outputFormat13.parseOptions(str_array19, (int)(short)0);
    outputFormat13.setOmitEncoding(true);
    boolean b26 = outputFormat13.isOmitEncoding();
    OutputFormat outputFormat28 = new OutputFormat("hi!");
    outputFormat28.setIndent(true);
    outputFormat28.setEncoding("");
    OutputFormat outputFormat33 = OutputFormat.createCompactFormat();
    outputFormat33.setNewlines(false);
    boolean b36 = outputFormat33.isNewLineAfterDeclaration();
    outputFormat33.setNewlines(true);
    outputFormat33.setExpandEmptyElements(true);
    java.lang.String str41 = outputFormat33.getLineSeparator();
    outputFormat33.setNewlines(false);
    outputFormat33.setXHTML(false);
    outputFormat33.setPadText(false);
    OutputFormat outputFormat48 = OutputFormat.createCompactFormat();
    outputFormat48.setNewlines(false);
    boolean b51 = outputFormat48.isNewLineAfterDeclaration();
    outputFormat48.setNewlines(true);
    outputFormat48.setExpandEmptyElements(true);
    java.lang.String str56 = outputFormat48.getLineSeparator();
    outputFormat48.setNewlines(false);
    OutputFormat outputFormat59 = OutputFormat.createCompactFormat();
    java.lang.String str60 = outputFormat59.getLineSeparator();
    java.lang.String[] str_array64 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i66 = outputFormat59.parseOptions(str_array64, (int)' ');
    int i68 = outputFormat48.parseOptions(str_array64, (int)' ');
    int i70 = outputFormat33.parseOptions(str_array64, (int)' ');
    int i72 = outputFormat28.parseOptions(str_array64, 100);
    int i74 = outputFormat13.parseOptions(str_array64, (int)(short)1);
    int i76 = outputFormat0.parseOptions(str_array64, (int)(short)100);
    outputFormat0.setIndentSize((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\n"+ "'", str15.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "\n"+ "'", str41.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "\n"+ "'", str56.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "\n"+ "'", str60.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 100);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test482"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    int i6 = outputFormat1.getNewLineAfterNTags();
    char char7 = outputFormat1.getAttributeQuoteCharacter();
    boolean b8 = outputFormat1.isOmitEncoding();
    java.lang.String str9 = outputFormat1.getLineSeparator();
    java.lang.String str10 = outputFormat1.getIndent();
    outputFormat1.setOmitEncoding(true);
    boolean b13 = outputFormat1.isSuppressDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n"+ "'", str9.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test483"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", true);
    outputFormat2.setExpandEmptyElements(false);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test484"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(true);
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setOmitEncoding(true);
    // The following exception was thrown during execution in test generation
    try {
    outputFormat0.setAttributeQuoteCharacter('4');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test485"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    OutputFormat outputFormat4 = OutputFormat.createCompactFormat();
    outputFormat4.setNewlines(false);
    boolean b7 = outputFormat4.isNewLineAfterDeclaration();
    outputFormat4.setNewlines(true);
    outputFormat4.setExpandEmptyElements(true);
    java.lang.String str12 = outputFormat4.getLineSeparator();
    outputFormat4.setNewlines(false);
    java.lang.String str15 = outputFormat4.getIndent();
    OutputFormat outputFormat17 = new OutputFormat("hi!");
    boolean b18 = outputFormat17.isOmitEncoding();
    java.lang.String[] str_array21 = new java.lang.String[] { "", "\n" };
    int i23 = outputFormat17.parseOptions(str_array21, (int)(byte)1);
    int i25 = outputFormat4.parseOptions(str_array21, (int)'a');
    int i27 = outputFormat0.parseOptions(str_array21, 32);
    outputFormat0.setNewlines(true);
    char char30 = outputFormat0.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char30 == '\"');

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test486"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    boolean b9 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setNewLineAfterNTags(0);
    boolean b12 = outputFormat0.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test487"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setTrimText(false);
    boolean b6 = outputFormat1.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test488"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", true, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    outputFormat3.setAttributeQuoteCharacter(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test489"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setNewLineAfterDeclaration(true);
    boolean b12 = outputFormat1.isXHTML();
    outputFormat1.setEncoding("\n");
    outputFormat1.setExpandEmptyElements(false);
    java.lang.String str17 = outputFormat1.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\n"+ "'", str17.equals("\n"));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test490"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    OutputFormat outputFormat4 = OutputFormat.createCompactFormat();
    outputFormat4.setNewlines(false);
    boolean b7 = outputFormat4.isNewLineAfterDeclaration();
    outputFormat4.setNewlines(true);
    outputFormat4.setExpandEmptyElements(true);
    java.lang.String str12 = outputFormat4.getLineSeparator();
    outputFormat4.setNewlines(false);
    java.lang.String str15 = outputFormat4.getIndent();
    OutputFormat outputFormat17 = new OutputFormat("hi!");
    boolean b18 = outputFormat17.isOmitEncoding();
    java.lang.String[] str_array21 = new java.lang.String[] { "", "\n" };
    int i23 = outputFormat17.parseOptions(str_array21, (int)(byte)1);
    int i25 = outputFormat4.parseOptions(str_array21, (int)'a');
    int i27 = outputFormat0.parseOptions(str_array21, 32);
    boolean b28 = outputFormat0.isNewlines();
    outputFormat0.setIndentSize((int)(short)1);
    outputFormat0.setIndentSize(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test491"); }


    OutputFormat outputFormat2 = new OutputFormat("                                                                                                    ", true);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test492"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setNewlines(true);
    outputFormat1.setIndent("  ");
    java.lang.String str7 = outputFormat1.getLineSeparator();
    boolean b8 = outputFormat1.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\n"+ "'", str7.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test493"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    boolean b6 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setLineSeparator("  ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test494"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    boolean b10 = outputFormat0.isTrimText();
    outputFormat0.setTrimText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test495"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setIndent(true);
    boolean b11 = outputFormat0.isTrimText();
    outputFormat0.setIndent("");
    java.lang.String str14 = outputFormat0.getIndent();
    outputFormat0.setIndentSize((int)(byte)100);
    java.lang.String str17 = outputFormat0.getLineSeparator();
    boolean b18 = outputFormat0.isNewLineAfterDeclaration();
    boolean b19 = outputFormat0.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\n"+ "'", str17.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test496"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", false, "UTF-8");
    char char4 = outputFormat3.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char4 == '\"');

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test497"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    java.lang.String str12 = outputFormat0.getLineSeparator();
    int i13 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setIndent("  ");
    outputFormat0.setTrimText(true);
    outputFormat0.setExpandEmptyElements(false);
    java.lang.String str20 = outputFormat0.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "UTF-8"+ "'", str20.equals("UTF-8"));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test498"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setIndentSize((int)(short)100);
    outputFormat0.setIndentSize((int)(short)10);
    OutputFormat outputFormat11 = new OutputFormat("hi!");
    boolean b12 = outputFormat11.isOmitEncoding();
    java.lang.String[] str_array15 = new java.lang.String[] { "", "\n" };
    int i17 = outputFormat11.parseOptions(str_array15, (int)(byte)1);
    OutputFormat outputFormat18 = OutputFormat.createCompactFormat();
    outputFormat18.setNewlines(false);
    boolean b21 = outputFormat18.isNewLineAfterDeclaration();
    outputFormat18.setNewlines(true);
    outputFormat18.setExpandEmptyElements(true);
    java.lang.String str26 = outputFormat18.getLineSeparator();
    outputFormat18.setNewlines(false);
    java.lang.String str29 = outputFormat18.getIndent();
    OutputFormat outputFormat31 = new OutputFormat("hi!");
    boolean b32 = outputFormat31.isOmitEncoding();
    java.lang.String[] str_array35 = new java.lang.String[] { "", "\n" };
    int i37 = outputFormat31.parseOptions(str_array35, (int)(byte)1);
    int i39 = outputFormat18.parseOptions(str_array35, (int)'a');
    int i41 = outputFormat11.parseOptions(str_array35, 52);
    int i43 = outputFormat0.parseOptions(str_array35, (int)'a');
    outputFormat0.setSuppressDeclaration(false);
    // The following exception was thrown during execution in test generation
    try {
    outputFormat0.setAttributeQuoteCharacter('a');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "\n"+ "'", str26.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 97);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test499"); }


    OutputFormat outputFormat3 = new OutputFormat("", true, "UTF-8");
    boolean b4 = outputFormat3.isNewlines();
    outputFormat3.setEncoding("UTF-8");
    outputFormat3.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test500"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    boolean b1 = outputFormat0.isTrimText();
    boolean b2 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setSuppressDeclaration(true);
    int i5 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setTrimText(false);
    boolean b8 = outputFormat0.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

}
