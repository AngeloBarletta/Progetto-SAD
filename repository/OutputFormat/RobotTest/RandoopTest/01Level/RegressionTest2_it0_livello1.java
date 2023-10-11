
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test001"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    boolean b5 = outputFormat0.isNewlines();
    char char6 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setIndentSize(0);
    outputFormat0.setOmitEncoding(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char6 == '\"');

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test002"); }


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
    java.lang.String[] str_array26 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i28 = outputFormat0.parseOptions(str_array26, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
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

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test003"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterNTags((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test004"); }


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
    outputFormat0.setExpandEmptyElements(false);
    outputFormat0.setSuppressDeclaration(false);
    
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
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test005"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setNewlines(false);
    boolean b7 = outputFormat1.isXHTML();
    outputFormat1.setIndent("");
    java.lang.String str10 = outputFormat1.getLineSeparator();
    outputFormat1.setIndent("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n"+ "'", str10.equals("\n"));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test006"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    boolean b5 = outputFormat1.isPadText();
    outputFormat1.setExpandEmptyElements(false);
    boolean b8 = outputFormat1.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test007"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    java.lang.String str6 = outputFormat1.getIndent();
    outputFormat1.setTrimText(true);
    boolean b9 = outputFormat1.isTrimText();
    boolean b10 = outputFormat1.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test008"); }


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
    boolean b21 = outputFormat0.isXHTML();
    outputFormat0.setNewlines(false);
    boolean b24 = outputFormat0.isOmitEncoding();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test009"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    char char7 = outputFormat0.getAttributeQuoteCharacter();
    boolean b8 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setPadText(false);
    outputFormat0.setNewlines(true);
    outputFormat0.setTrimText(false);
    outputFormat0.setIndent(false);
    outputFormat0.setNewlines(true);
    java.lang.String str19 = outputFormat0.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "UTF-8"+ "'", str19.equals("UTF-8"));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test010"); }


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
    outputFormat0.setOmitEncoding(false);
    outputFormat0.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test011"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    java.lang.String str5 = outputFormat0.getIndent();
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isNewlines();
    outputFormat0.setSuppressDeclaration(true);
    boolean b10 = outputFormat0.isTrimText();
    outputFormat0.setEncoding("hi!");
    outputFormat0.setTrimText(false);
    
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

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test012"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setNewLineAfterNTags((int)'\"');
    boolean b11 = outputFormat0.isNewlines();
    boolean b12 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setIndent(true);
    boolean b17 = outputFormat0.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test013"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    outputFormat1.setIndent(true);
    outputFormat1.setEncoding("");
    outputFormat1.setNewlines(false);
    char char8 = outputFormat1.getAttributeQuoteCharacter();
    outputFormat1.setIndent("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char8 == '\"');

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test014"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    outputFormat2.setNewLineAfterDeclaration(true);
    outputFormat2.setNewLineAfterNTags((int)'#');
    java.lang.String str7 = outputFormat2.getEncoding();
    outputFormat2.setIndentSize(32);
    outputFormat2.setExpandEmptyElements(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test015"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    boolean b5 = outputFormat0.isOmitEncoding();
    boolean b6 = outputFormat0.isTrimText();
    java.lang.String str7 = outputFormat0.getEncoding();
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setSuppressDeclaration(false);
    int i11 = outputFormat0.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test016"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setIndent(true);
    outputFormat0.setPadText(true);
    outputFormat0.setIndent("hi!");
    java.lang.String str15 = outputFormat0.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\n"+ "'", str15.equals("\n"));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test017"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    java.lang.String str3 = outputFormat0.getEncoding();
    boolean b4 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setIndent(false);
    java.lang.String str7 = outputFormat0.getEncoding();
    boolean b8 = outputFormat0.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8"+ "'", str3.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test018"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setIndent("hi!");
    outputFormat0.setNewlines(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test019"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    outputFormat3.setIndent(false);
    outputFormat3.setNewLineAfterDeclaration(false);
    outputFormat3.setSuppressDeclaration(false);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test020"); }


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
    outputFormat1.setNewlines(false);
    
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
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test021"); }


    OutputFormat outputFormat3 = new OutputFormat("UTF-8", false, "          ");
    outputFormat3.setPadText(false);
    outputFormat3.setPadText(true);
    outputFormat3.setOmitEncoding(false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test022"); }


    OutputFormat outputFormat2 = new OutputFormat("UTF-8", false);
    outputFormat2.setNewLineAfterNTags(52);
    boolean b5 = outputFormat2.isNewlines();
    outputFormat2.setSuppressDeclaration(false);
    boolean b8 = outputFormat2.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test023"); }


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
    outputFormat0.setPadText(false);
    boolean b24 = outputFormat0.isOmitEncoding();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test024"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "  ");
    boolean b4 = outputFormat3.isExpandEmptyElements();
    boolean b5 = outputFormat3.isSuppressDeclaration();
    char char6 = outputFormat3.getAttributeQuoteCharacter();
    java.lang.String str7 = outputFormat3.getEncoding();
    outputFormat3.setEncoding("\n");
    char char10 = outputFormat3.getAttributeQuoteCharacter();
    outputFormat3.setExpandEmptyElements(false);
    boolean b13 = outputFormat3.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char6 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "  "+ "'", str7.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char10 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test025"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    java.lang.String str5 = outputFormat0.getIndent();
    outputFormat0.setExpandEmptyElements(false);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    boolean b9 = outputFormat0.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "UTF-8"+ "'", str5.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test026"); }


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
    outputFormat0.setTrimText(false);
    outputFormat0.setExpandEmptyElements(false);
    boolean b58 = outputFormat0.isPadText();
    
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
    org.junit.Assert.assertTrue(b58 == false);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test027"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setNewLineAfterNTags((int)'\"');
    boolean b11 = outputFormat0.isNewlines();
    boolean b12 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setIndent(true);
    int i17 = outputFormat0.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 34);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test028"); }


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
    outputFormat1.setLineSeparator("                                                                                                    ");
    boolean b18 = outputFormat1.isOmitEncoding();
    
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
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test029"); }


    OutputFormat outputFormat1 = new OutputFormat("  ");
    java.lang.String str2 = outputFormat1.getEncoding();
    boolean b3 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setSuppressDeclaration(true);
    outputFormat1.setIndentSize((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "UTF-8"+ "'", str2.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test030"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setLineSeparator("  ");
    outputFormat1.setPadText(true);
    outputFormat1.setPadText(false);
    outputFormat1.setLineSeparator("UTF-8");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test031"); }


    OutputFormat outputFormat3 = new OutputFormat("  ", false, "          ");
    outputFormat3.setTrimText(false);
    OutputFormat outputFormat6 = OutputFormat.createCompactFormat();
    outputFormat6.setNewlines(false);
    boolean b9 = outputFormat6.isNewLineAfterDeclaration();
    outputFormat6.setNewlines(true);
    outputFormat6.setExpandEmptyElements(true);
    java.lang.String str14 = outputFormat6.getLineSeparator();
    outputFormat6.setNewlines(false);
    java.lang.String str17 = outputFormat6.getIndent();
    OutputFormat outputFormat19 = new OutputFormat("hi!");
    boolean b20 = outputFormat19.isOmitEncoding();
    java.lang.String[] str_array23 = new java.lang.String[] { "", "\n" };
    int i25 = outputFormat19.parseOptions(str_array23, (int)(byte)1);
    int i27 = outputFormat6.parseOptions(str_array23, (int)'a');
    outputFormat6.setTrimText(true);
    outputFormat6.setLineSeparator("");
    outputFormat6.setExpandEmptyElements(true);
    OutputFormat outputFormat35 = new OutputFormat("hi!");
    boolean b36 = outputFormat35.isOmitEncoding();
    boolean b37 = outputFormat35.isPadText();
    outputFormat35.setNewLineAfterDeclaration(false);
    boolean b40 = outputFormat35.isNewLineAfterDeclaration();
    outputFormat35.setLineSeparator("hi!");
    boolean b43 = outputFormat35.isNewLineAfterDeclaration();
    outputFormat35.setIndent(false);
    OutputFormat outputFormat46 = OutputFormat.createCompactFormat();
    outputFormat46.setNewlines(false);
    boolean b49 = outputFormat46.isNewLineAfterDeclaration();
    outputFormat46.setNewlines(true);
    int i52 = outputFormat46.getNewLineAfterNTags();
    outputFormat46.setXHTML(false);
    outputFormat46.setXHTML(false);
    outputFormat46.setIndent(false);
    OutputFormat outputFormat59 = OutputFormat.createCompactFormat();
    outputFormat59.setNewlines(false);
    boolean b62 = outputFormat59.isNewLineAfterDeclaration();
    outputFormat59.setNewlines(true);
    outputFormat59.setExpandEmptyElements(true);
    java.lang.String str67 = outputFormat59.getLineSeparator();
    outputFormat59.setNewlines(false);
    OutputFormat outputFormat70 = OutputFormat.createCompactFormat();
    java.lang.String str71 = outputFormat70.getLineSeparator();
    java.lang.String[] str_array75 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i77 = outputFormat70.parseOptions(str_array75, (int)' ');
    int i79 = outputFormat59.parseOptions(str_array75, (int)' ');
    int i81 = outputFormat46.parseOptions(str_array75, 52);
    int i83 = outputFormat35.parseOptions(str_array75, 52);
    int i85 = outputFormat6.parseOptions(str_array75, (int)'a');
    // The following exception was thrown during execution in test generation
    try {
    int i87 = outputFormat3.parseOptions(str_array75, (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\n"+ "'", str14.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "\n"+ "'", str67.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "\n"+ "'", str71.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 97);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test032"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b5 = outputFormat0.isTrimText();
    boolean b6 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setIndent(true);
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
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test033"); }


    OutputFormat outputFormat0 = new OutputFormat();
    boolean b1 = outputFormat0.isTrimText();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test034"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    java.lang.String str5 = outputFormat0.getIndent();
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    boolean b9 = outputFormat0.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "UTF-8"+ "'", str5.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test035"); }


    OutputFormat outputFormat3 = new OutputFormat("UTF-8", true, "\n");
    outputFormat3.setNewLineAfterNTags(100);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test036"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    char char4 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setOmitEncoding(false);
    int i7 = outputFormat0.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char4 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test037"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    outputFormat1.setIndent(true);
    outputFormat1.setIndent("hi!");
    java.lang.String str6 = outputFormat1.getIndent();
    OutputFormat outputFormat7 = OutputFormat.createCompactFormat();
    outputFormat7.setNewlines(false);
    boolean b10 = outputFormat7.isNewLineAfterDeclaration();
    outputFormat7.setNewlines(true);
    outputFormat7.setIndentSize((int)(short)100);
    outputFormat7.setIndentSize((int)(short)10);
    OutputFormat outputFormat18 = new OutputFormat("hi!");
    boolean b19 = outputFormat18.isOmitEncoding();
    java.lang.String[] str_array22 = new java.lang.String[] { "", "\n" };
    int i24 = outputFormat18.parseOptions(str_array22, (int)(byte)1);
    OutputFormat outputFormat25 = OutputFormat.createCompactFormat();
    outputFormat25.setNewlines(false);
    boolean b28 = outputFormat25.isNewLineAfterDeclaration();
    outputFormat25.setNewlines(true);
    outputFormat25.setExpandEmptyElements(true);
    java.lang.String str33 = outputFormat25.getLineSeparator();
    outputFormat25.setNewlines(false);
    java.lang.String str36 = outputFormat25.getIndent();
    OutputFormat outputFormat38 = new OutputFormat("hi!");
    boolean b39 = outputFormat38.isOmitEncoding();
    java.lang.String[] str_array42 = new java.lang.String[] { "", "\n" };
    int i44 = outputFormat38.parseOptions(str_array42, (int)(byte)1);
    int i46 = outputFormat25.parseOptions(str_array42, (int)'a');
    int i48 = outputFormat18.parseOptions(str_array42, 52);
    int i50 = outputFormat7.parseOptions(str_array42, (int)'a');
    int i52 = outputFormat1.parseOptions(str_array42, (int)(short)1);
    outputFormat1.setOmitEncoding(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\n"+ "'", str33.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test038"); }


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
    char char22 = outputFormat0.getAttributeQuoteCharacter();
    boolean b23 = outputFormat0.isTrimText();
    
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
    org.junit.Assert.assertTrue(char22 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test039"); }


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
    java.lang.String str28 = outputFormat0.getLineSeparator();
    
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
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "\n"+ "'", str28.equals("\n"));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test040"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setIndentSize(100);
    outputFormat0.setIndentSize(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test041"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isExpandEmptyElements();
    outputFormat1.setIndent(true);
    outputFormat1.setXHTML(false);
    boolean b8 = outputFormat1.isNewlines();
    boolean b9 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setTrimText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test042"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    outputFormat1.setIndent(true);
    boolean b4 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setExpandEmptyElements(true);
    boolean b7 = outputFormat1.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test043"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)0);
    outputFormat0.setEncoding("");
    java.lang.String str9 = outputFormat0.getIndent();
    outputFormat0.setXHTML(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test044"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setTrimText(false);
    outputFormat0.setIndent(false);
    boolean b11 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setLineSeparator("hi!");
    OutputFormat outputFormat14 = OutputFormat.createCompactFormat();
    outputFormat14.setNewlines(false);
    boolean b17 = outputFormat14.isNewLineAfterDeclaration();
    outputFormat14.setXHTML(true);
    java.lang.String str20 = outputFormat14.getLineSeparator();
    boolean b21 = outputFormat14.isExpandEmptyElements();
    boolean b22 = outputFormat14.isPadText();
    outputFormat14.setPadText(false);
    OutputFormat outputFormat25 = OutputFormat.createCompactFormat();
    outputFormat25.setNewlines(false);
    boolean b28 = outputFormat25.isNewLineAfterDeclaration();
    outputFormat25.setNewlines(true);
    outputFormat25.setExpandEmptyElements(true);
    java.lang.String str33 = outputFormat25.getLineSeparator();
    outputFormat25.setNewlines(false);
    outputFormat25.setXHTML(false);
    outputFormat25.setPadText(false);
    outputFormat25.setOmitEncoding(true);
    OutputFormat outputFormat42 = OutputFormat.createCompactFormat();
    outputFormat42.setNewlines(false);
    outputFormat42.setNewLineAfterDeclaration(false);
    boolean b47 = outputFormat42.isTrimText();
    boolean b48 = outputFormat42.isPadText();
    OutputFormat outputFormat49 = OutputFormat.createCompactFormat();
    outputFormat49.setNewlines(false);
    boolean b52 = outputFormat49.isNewLineAfterDeclaration();
    outputFormat49.setNewlines(true);
    outputFormat49.setExpandEmptyElements(true);
    java.lang.String str57 = outputFormat49.getLineSeparator();
    outputFormat49.setNewlines(false);
    OutputFormat outputFormat60 = OutputFormat.createCompactFormat();
    java.lang.String str61 = outputFormat60.getLineSeparator();
    java.lang.String[] str_array65 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i67 = outputFormat60.parseOptions(str_array65, (int)' ');
    int i69 = outputFormat49.parseOptions(str_array65, (int)' ');
    int i71 = outputFormat42.parseOptions(str_array65, (int)(short)10);
    int i73 = outputFormat25.parseOptions(str_array65, (int)' ');
    int i75 = outputFormat14.parseOptions(str_array65, (int)(byte)0);
    int i77 = outputFormat0.parseOptions(str_array65, 100);
    java.lang.String str78 = outputFormat0.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\n"+ "'", str20.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\n"+ "'", str33.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "\n"+ "'", str57.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "\n"+ "'", str61.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str78);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test045"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", true, "hi!");
    boolean b4 = outputFormat3.isPadText();
    outputFormat3.setSuppressDeclaration(true);
    outputFormat3.setEncoding("  ");
    outputFormat3.setLineSeparator("hi!");
    outputFormat3.setEncoding("hi!");
    java.lang.String str13 = outputFormat3.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test046"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setNewLineAfterNTags(10);
    outputFormat0.setEncoding("UTF-8");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test047"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    java.lang.String str10 = outputFormat0.getEncoding();
    outputFormat0.setTrimText(true);
    boolean b13 = outputFormat0.isSuppressDeclaration();
    
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
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test048"); }


    OutputFormat outputFormat1 = new OutputFormat("  ");
    outputFormat1.setIndentSize((int)(short)100);
    outputFormat1.setOmitEncoding(false);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test049"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setTrimText(true);
    outputFormat0.setIndent("hi!");
    outputFormat0.setPadText(true);
    char char11 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setXHTML(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char11 == '\"');

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test050"); }


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
    OutputFormat outputFormat16 = OutputFormat.createCompactFormat();
    outputFormat16.setNewlines(false);
    boolean b19 = outputFormat16.isNewLineAfterDeclaration();
    outputFormat16.setNewlines(true);
    int i22 = outputFormat16.getNewLineAfterNTags();
    java.lang.String str23 = outputFormat16.getEncoding();
    outputFormat16.setNewlines(false);
    java.lang.String str26 = outputFormat16.getEncoding();
    boolean b27 = outputFormat16.isPadText();
    boolean b28 = outputFormat16.isXHTML();
    OutputFormat outputFormat31 = new OutputFormat("", false);
    outputFormat31.setIndent(true);
    boolean b34 = outputFormat31.isOmitEncoding();
    OutputFormat outputFormat35 = OutputFormat.createCompactFormat();
    outputFormat35.setNewlines(false);
    boolean b38 = outputFormat35.isNewLineAfterDeclaration();
    outputFormat35.setNewlines(true);
    outputFormat35.setExpandEmptyElements(true);
    java.lang.String str43 = outputFormat35.getLineSeparator();
    outputFormat35.setNewlines(false);
    java.lang.String str46 = outputFormat35.getIndent();
    OutputFormat outputFormat48 = new OutputFormat("hi!");
    boolean b49 = outputFormat48.isOmitEncoding();
    java.lang.String[] str_array52 = new java.lang.String[] { "", "\n" };
    int i54 = outputFormat48.parseOptions(str_array52, (int)(byte)1);
    int i56 = outputFormat35.parseOptions(str_array52, (int)'a');
    int i58 = outputFormat31.parseOptions(str_array52, (int)(short)10);
    int i60 = outputFormat16.parseOptions(str_array52, 34);
    int i62 = outputFormat0.parseOptions(str_array52, (int)'\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
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
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "\n"+ "'", str43.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 34);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test051"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isTrimText();
    outputFormat0.setPadText(true);
    boolean b8 = outputFormat0.isTrimText();
    outputFormat0.setLineSeparator("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test052"); }


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
    outputFormat1.setTrimText(true);
    java.lang.String str34 = outputFormat1.getIndent();
    
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
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test053"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", true, "");
    java.lang.String str4 = outputFormat3.getIndent();
    outputFormat3.setSuppressDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test054"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setIndent("  ");
    boolean b3 = outputFormat0.isOmitEncoding();
    OutputFormat outputFormat7 = new OutputFormat("", false, "");
    boolean b8 = outputFormat7.isOmitEncoding();
    outputFormat7.setIndent(true);
    outputFormat7.setNewLineAfterDeclaration(false);
    OutputFormat outputFormat14 = new OutputFormat("hi!");
    outputFormat14.setIndent(true);
    outputFormat14.setEncoding("");
    OutputFormat outputFormat19 = OutputFormat.createCompactFormat();
    outputFormat19.setNewlines(false);
    boolean b22 = outputFormat19.isNewLineAfterDeclaration();
    outputFormat19.setNewlines(true);
    outputFormat19.setExpandEmptyElements(true);
    java.lang.String str27 = outputFormat19.getLineSeparator();
    outputFormat19.setNewlines(false);
    outputFormat19.setXHTML(false);
    outputFormat19.setPadText(false);
    OutputFormat outputFormat34 = OutputFormat.createCompactFormat();
    outputFormat34.setNewlines(false);
    boolean b37 = outputFormat34.isNewLineAfterDeclaration();
    outputFormat34.setNewlines(true);
    outputFormat34.setExpandEmptyElements(true);
    java.lang.String str42 = outputFormat34.getLineSeparator();
    outputFormat34.setNewlines(false);
    OutputFormat outputFormat45 = OutputFormat.createCompactFormat();
    java.lang.String str46 = outputFormat45.getLineSeparator();
    java.lang.String[] str_array50 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i52 = outputFormat45.parseOptions(str_array50, (int)' ');
    int i54 = outputFormat34.parseOptions(str_array50, (int)' ');
    int i56 = outputFormat19.parseOptions(str_array50, (int)' ');
    int i58 = outputFormat14.parseOptions(str_array50, 100);
    int i60 = outputFormat7.parseOptions(str_array50, 0);
    int i62 = outputFormat0.parseOptions(str_array50, (int)(byte)1);
    outputFormat0.setOmitEncoding(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\n"+ "'", str27.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "\n"+ "'", str42.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "\n"+ "'", str46.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test055"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    boolean b6 = outputFormat3.isNewLineAfterDeclaration();
    outputFormat3.setPadText(true);
    outputFormat3.setNewlines(false);
    boolean b11 = outputFormat3.isTrimText();
    outputFormat3.setPadText(false);
    outputFormat3.setIndent(true);
    outputFormat3.setEncoding("                                  ");
    int i18 = outputFormat3.getNewLineAfterNTags();
    outputFormat3.setExpandEmptyElements(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test056"); }


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
    outputFormat0.setNewLineAfterNTags((int)(byte)0);
    boolean b25 = outputFormat0.isNewLineAfterDeclaration();
    
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
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test057"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    java.lang.String str5 = outputFormat0.getLineSeparator();
    outputFormat0.setOmitEncoding(true);
    outputFormat0.setIndent(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n"+ "'", str5.equals("\n"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test058"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    outputFormat3.setNewlines(true);
    outputFormat3.setPadText(true);
    outputFormat3.setXHTML(true);
    outputFormat3.setIndentSize((int)'a');
    outputFormat3.setNewlines(false);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test059"); }


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
    outputFormat0.setIndentSize(52);
    
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
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test060"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setEncoding("hi!");
    outputFormat0.setPadText(true);
    boolean b11 = outputFormat0.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test061"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setIndentSize((int)(short)100);
    boolean b8 = outputFormat0.isTrimText();
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test062"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setNewLineAfterNTags(10);
    outputFormat0.setSuppressDeclaration(false);
    outputFormat0.setExpandEmptyElements(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test063"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setNewlines(true);
    outputFormat1.setNewLineAfterDeclaration(true);
    outputFormat1.setNewLineAfterDeclaration(false);
    outputFormat1.setPadText(true);
    boolean b11 = outputFormat1.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test064"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    boolean b6 = outputFormat0.isNewLineAfterDeclaration();
    boolean b7 = outputFormat0.isSuppressDeclaration();
    boolean b8 = outputFormat0.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test065"); }


    OutputFormat outputFormat2 = new OutputFormat("UTF-8", true);
    outputFormat2.setIndentSize((int)(short)-1);
    outputFormat2.setIndentSize((int)(short)10);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test066"); }


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
    boolean b14 = outputFormat0.isTrimText();
    java.lang.String str15 = outputFormat0.getEncoding();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "UTF-8"+ "'", str15.equals("UTF-8"));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test067"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setLineSeparator("  ");
    boolean b12 = outputFormat1.isXHTML();
    outputFormat1.setTrimText(true);
    boolean b15 = outputFormat1.isOmitEncoding();
    java.lang.String str16 = outputFormat1.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test068"); }


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
    char char22 = outputFormat0.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "UTF-8"+ "'", str21.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char22 == '\"');

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test069"); }


    OutputFormat outputFormat3 = new OutputFormat("                                                                                                    ", false, "\n");
    outputFormat3.setPadText(true);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test070"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    outputFormat0.setTrimText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test071"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    boolean b6 = outputFormat0.isNewLineAfterDeclaration();
    boolean b7 = outputFormat0.isSuppressDeclaration();
    java.lang.String str8 = outputFormat0.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test072"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    java.lang.String str3 = outputFormat0.getEncoding();
    boolean b4 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setOmitEncoding(true);
    boolean b7 = outputFormat0.isTrimText();
    
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
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test073"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setNewlines(false);
    boolean b7 = outputFormat1.isXHTML();
    boolean b8 = outputFormat1.isPadText();
    outputFormat1.setTrimText(true);
    boolean b11 = outputFormat1.isExpandEmptyElements();
    char char12 = outputFormat1.getAttributeQuoteCharacter();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char12 == '\"');

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test074"); }


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
    boolean b16 = outputFormat0.isSuppressDeclaration();
    
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
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test075"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setIndent("  ");
    boolean b3 = outputFormat0.isOmitEncoding();
    OutputFormat outputFormat7 = new OutputFormat("", false, "");
    boolean b8 = outputFormat7.isOmitEncoding();
    outputFormat7.setIndent(true);
    outputFormat7.setNewLineAfterDeclaration(false);
    OutputFormat outputFormat14 = new OutputFormat("hi!");
    outputFormat14.setIndent(true);
    outputFormat14.setEncoding("");
    OutputFormat outputFormat19 = OutputFormat.createCompactFormat();
    outputFormat19.setNewlines(false);
    boolean b22 = outputFormat19.isNewLineAfterDeclaration();
    outputFormat19.setNewlines(true);
    outputFormat19.setExpandEmptyElements(true);
    java.lang.String str27 = outputFormat19.getLineSeparator();
    outputFormat19.setNewlines(false);
    outputFormat19.setXHTML(false);
    outputFormat19.setPadText(false);
    OutputFormat outputFormat34 = OutputFormat.createCompactFormat();
    outputFormat34.setNewlines(false);
    boolean b37 = outputFormat34.isNewLineAfterDeclaration();
    outputFormat34.setNewlines(true);
    outputFormat34.setExpandEmptyElements(true);
    java.lang.String str42 = outputFormat34.getLineSeparator();
    outputFormat34.setNewlines(false);
    OutputFormat outputFormat45 = OutputFormat.createCompactFormat();
    java.lang.String str46 = outputFormat45.getLineSeparator();
    java.lang.String[] str_array50 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i52 = outputFormat45.parseOptions(str_array50, (int)' ');
    int i54 = outputFormat34.parseOptions(str_array50, (int)' ');
    int i56 = outputFormat19.parseOptions(str_array50, (int)' ');
    int i58 = outputFormat14.parseOptions(str_array50, 100);
    int i60 = outputFormat7.parseOptions(str_array50, 0);
    int i62 = outputFormat0.parseOptions(str_array50, (int)(byte)1);
    outputFormat0.setPadText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\n"+ "'", str27.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "\n"+ "'", str42.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "\n"+ "'", str46.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test076"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setExpandEmptyElements(false);
    boolean b7 = outputFormat0.isOmitEncoding();
    outputFormat0.setIndent("UTF-8");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test077"); }


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
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b22 = outputFormat0.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test078"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    int i6 = outputFormat1.getNewLineAfterNTags();
    boolean b7 = outputFormat1.isNewLineAfterDeclaration();
    boolean b8 = outputFormat1.isXHTML();
    outputFormat1.setNewLineAfterNTags(0);
    java.lang.String str11 = outputFormat1.getIndent();
    outputFormat1.setEncoding("                                  ");
    outputFormat1.setOmitEncoding(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test079"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setIndent("\n");
    boolean b9 = outputFormat0.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test080"); }


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
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setIndent(true);
    
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
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test081"); }


    OutputFormat outputFormat1 = new OutputFormat("");
    java.lang.String str2 = outputFormat1.getIndent();
    outputFormat1.setNewlines(false);
    outputFormat1.setPadText(true);
    boolean b7 = outputFormat1.isPadText();
    outputFormat1.setOmitEncoding(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test082"); }


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
    outputFormat0.setSuppressDeclaration(true);
    boolean b21 = outputFormat0.isXHTML();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test083"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)1);
    java.lang.String str11 = outputFormat0.getEncoding();
    boolean b12 = outputFormat0.isNewlines();
    boolean b13 = outputFormat0.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "UTF-8"+ "'", str11.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test084"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    java.lang.String str5 = outputFormat0.getIndent();
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isNewlines();
    outputFormat0.setSuppressDeclaration(true);
    boolean b10 = outputFormat0.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test085"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    OutputFormat outputFormat4 = OutputFormat.createCompactFormat();
    java.lang.String str5 = outputFormat4.getLineSeparator();
    java.lang.String[] str_array9 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i11 = outputFormat4.parseOptions(str_array9, (int)' ');
    int i13 = outputFormat3.parseOptions(str_array9, (int)(short)0);
    outputFormat3.setOmitEncoding(true);
    boolean b16 = outputFormat3.isOmitEncoding();
    java.lang.String str17 = outputFormat3.getIndent();
    boolean b18 = outputFormat3.isNewlines();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test086"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setNewLineAfterNTags((int)(short)100);
    outputFormat0.setIndent(false);
    boolean b15 = outputFormat0.isXHTML();
    boolean b16 = outputFormat0.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test087"); }


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
    outputFormat0.setExpandEmptyElements(true);
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
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test088"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndent("\n");
    outputFormat0.setNewLineAfterNTags((int)(byte)1);
    outputFormat0.setTrimText(false);
    java.lang.String str11 = outputFormat0.getLineSeparator();
    boolean b12 = outputFormat0.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n"+ "'", str11.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test089"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    outputFormat2.setIndent(true);
    java.lang.String str5 = outputFormat2.getIndent();
    outputFormat2.setTrimText(false);
    boolean b8 = outputFormat2.isNewLineAfterDeclaration();
    boolean b9 = outputFormat2.isExpandEmptyElements();
    java.lang.String str10 = outputFormat2.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "  "+ "'", str5.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n"+ "'", str10.equals("\n"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test090"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setTrimText(false);
    outputFormat0.setIndent(false);
    boolean b11 = outputFormat0.isSuppressDeclaration();
    boolean b12 = outputFormat0.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test091"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setOmitEncoding(true);
    outputFormat0.setXHTML(false);
    outputFormat0.setPadText(true);
    
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
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test092"); }


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
    boolean b39 = outputFormat3.isPadText();
    
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
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test093"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setNewlines(false);
    boolean b7 = outputFormat1.isXHTML();
    outputFormat1.setEncoding("hi!");
    outputFormat1.setEncoding("                                  ");
    outputFormat1.setIndent(false);
    
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
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test094"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setTrimText(false);
    outputFormat0.setSuppressDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test095"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isXHTML();
    boolean b5 = outputFormat1.isNewlines();
    boolean b6 = outputFormat1.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test096"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)0);
    outputFormat0.setEncoding("");
    outputFormat0.setEncoding("");
    boolean b11 = outputFormat0.isTrimText();
    boolean b12 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test097"); }


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
    outputFormat0.setOmitEncoding(true);
    outputFormat0.setOmitEncoding(true);
    
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

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test098"); }


    OutputFormat outputFormat2 = new OutputFormat("UTF-8", true);
    boolean b3 = outputFormat2.isExpandEmptyElements();
    boolean b4 = outputFormat2.isNewLineAfterDeclaration();
    boolean b5 = outputFormat2.isSuppressDeclaration();
    boolean b6 = outputFormat2.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test099"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    outputFormat2.setIndent(true);
    java.lang.String str5 = outputFormat2.getIndent();
    boolean b6 = outputFormat2.isExpandEmptyElements();
    outputFormat2.setNewLineAfterNTags(97);
    outputFormat2.setIndent("                                  ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "  "+ "'", str5.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test100"); }


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
    boolean b16 = outputFormat1.isNewlines();
    outputFormat1.setIndentSize(100);
    
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
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test101"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setTrimText(false);
    outputFormat0.setLineSeparator("                                                                                                    ");
    outputFormat0.setSuppressDeclaration(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    
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
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test102"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    boolean b12 = outputFormat0.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test103"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setExpandEmptyElements(false);
    outputFormat1.setTrimText(false);
    outputFormat1.setPadText(false);
    char char16 = outputFormat1.getAttributeQuoteCharacter();
    outputFormat1.setExpandEmptyElements(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char16 == '\"');

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test104"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", true, "hi!");
    boolean b4 = outputFormat3.isOmitEncoding();
    int i5 = outputFormat3.getNewLineAfterNTags();
    boolean b6 = outputFormat3.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test105"); }


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
    boolean b34 = outputFormat1.isTrimText();
    boolean b35 = outputFormat1.isExpandEmptyElements();
    int i36 = outputFormat1.getNewLineAfterNTags();
    outputFormat1.setExpandEmptyElements(false);
    boolean b39 = outputFormat1.isNewLineAfterDeclaration();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test106"); }


    OutputFormat outputFormat0 = new OutputFormat();
    boolean b1 = outputFormat0.isTrimText();
    boolean b2 = outputFormat0.isXHTML();
    outputFormat0.setEncoding("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test107"); }


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
    outputFormat0.setTrimText(true);
    boolean b19 = outputFormat0.isNewlines();
    
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
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test108"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    java.lang.String str5 = outputFormat0.getLineSeparator();
    boolean b6 = outputFormat0.isExpandEmptyElements();
    boolean b7 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewLineAfterNTags((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n"+ "'", str5.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test109"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    outputFormat0.setNewLineAfterNTags((int)'a');
    boolean b6 = outputFormat0.isPadText();
    outputFormat0.setNewLineAfterDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test110"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)0);
    outputFormat0.setEncoding("");
    java.lang.String str9 = outputFormat0.getEncoding();
    outputFormat0.setIndent(false);
    boolean b12 = outputFormat0.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test111"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    boolean b10 = outputFormat0.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test112"); }


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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test113"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setNewLineAfterNTags((int)'\"');
    char char11 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setNewlines(false);
    java.lang.String str14 = outputFormat0.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char11 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\n"+ "'", str14.equals("\n"));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test114"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    boolean b3 = outputFormat2.isNewlines();
    outputFormat2.setLineSeparator("");
    boolean b6 = outputFormat2.isNewlines();
    outputFormat2.setExpandEmptyElements(false);
    outputFormat2.setLineSeparator("                                                                                                    ");
    outputFormat2.setIndent(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test115"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", false, "\n");
    int i4 = outputFormat3.getNewLineAfterNTags();
    boolean b5 = outputFormat3.isOmitEncoding();
    boolean b6 = outputFormat3.isNewLineAfterDeclaration();
    outputFormat3.setEncoding("UTF-8");
    outputFormat3.setIndent("hi!");
    outputFormat3.setIndent(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test116"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    boolean b6 = outputFormat3.isOmitEncoding();
    OutputFormat outputFormat7 = OutputFormat.createCompactFormat();
    outputFormat7.setNewlines(false);
    outputFormat7.setXHTML(true);
    boolean b12 = outputFormat7.isXHTML();
    boolean b13 = outputFormat7.isNewLineAfterDeclaration();
    outputFormat7.setNewLineAfterNTags((int)(short)100);
    outputFormat7.setSuppressDeclaration(false);
    OutputFormat outputFormat20 = new OutputFormat("", false);
    outputFormat20.setIndent(true);
    java.lang.String str23 = outputFormat20.getIndent();
    outputFormat20.setTrimText(false);
    OutputFormat outputFormat26 = OutputFormat.createCompactFormat();
    java.lang.String str27 = outputFormat26.getLineSeparator();
    java.lang.String[] str_array31 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i33 = outputFormat26.parseOptions(str_array31, (int)' ');
    int i35 = outputFormat20.parseOptions(str_array31, (int)(short)100);
    int i37 = outputFormat7.parseOptions(str_array31, 0);
    // The following exception was thrown during execution in test generation
    try {
    int i39 = outputFormat3.parseOptions(str_array31, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "  "+ "'", str23.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\n"+ "'", str27.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test117"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    boolean b4 = outputFormat3.isOmitEncoding();
    outputFormat3.setIndent(true);
    outputFormat3.setSuppressDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test118"); }


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
    outputFormat0.setLineSeparator("\n");
    
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

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test119"); }


    OutputFormat outputFormat3 = new OutputFormat("          ", false, "          ");

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test120"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    java.lang.String str5 = outputFormat0.getIndent();
    java.lang.String str6 = outputFormat0.getLineSeparator();
    java.lang.String str7 = outputFormat0.getIndent();
    outputFormat0.setNewLineAfterNTags((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test121"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isTrimText();
    boolean b6 = outputFormat0.isNewLineAfterDeclaration();
    char char7 = outputFormat0.getAttributeQuoteCharacter();
    java.lang.String str8 = outputFormat0.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test122"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    outputFormat2.setIndent(true);
    java.lang.String str5 = outputFormat2.getIndent();
    boolean b6 = outputFormat2.isNewlines();
    outputFormat2.setLineSeparator("hi!");
    boolean b9 = outputFormat2.isXHTML();
    outputFormat2.setNewLineAfterDeclaration(true);
    char char12 = outputFormat2.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "  "+ "'", str5.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char12 == '\"');

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test123"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isTrimText();
    outputFormat0.setEncoding("UTF-8");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test124"); }


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
    outputFormat0.setNewLineAfterNTags((int)'#');
    
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
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test125"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)1);
    outputFormat0.setIndent(false);
    boolean b13 = outputFormat0.isSuppressDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test126"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    java.lang.String str5 = outputFormat0.getIndent();
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isXHTML();
    outputFormat0.setLineSeparator("hi!");
    boolean b11 = outputFormat0.isNewLineAfterDeclaration();
    OutputFormat outputFormat12 = OutputFormat.createCompactFormat();
    outputFormat12.setNewlines(false);
    boolean b15 = outputFormat12.isNewLineAfterDeclaration();
    outputFormat12.setNewlines(true);
    int i18 = outputFormat12.getNewLineAfterNTags();
    outputFormat12.setXHTML(false);
    outputFormat12.setIndentSize((int)(short)1);
    outputFormat12.setIndent(false);
    boolean b25 = outputFormat12.isXHTML();
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
    int i76 = outputFormat12.parseOptions(str_array66, 0);
    int i78 = outputFormat0.parseOptions(str_array66, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "UTF-8"+ "'", str5.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
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

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test127"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndent("\n");
    outputFormat0.setExpandEmptyElements(false);
    outputFormat0.setIndentSize(100);
    outputFormat0.setNewLineAfterDeclaration(false);
    int i13 = outputFormat0.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test128"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    boolean b5 = outputFormat0.isOmitEncoding();
    boolean b6 = outputFormat0.isTrimText();
    outputFormat0.setLineSeparator("hi!");
    outputFormat0.setTrimText(false);
    boolean b11 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setIndent("");
    outputFormat0.setExpandEmptyElements(false);
    boolean b16 = outputFormat0.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test129"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    boolean b6 = outputFormat3.isTrimText();
    outputFormat3.setIndent(true);
    outputFormat3.setPadText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test130"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setLineSeparator("\n");
    outputFormat0.setIndentSize((int)(byte)10);
    outputFormat0.setExpandEmptyElements(false);
    outputFormat0.setLineSeparator("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test131"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setLineSeparator("hi!");
    java.lang.String str9 = outputFormat1.getIndent();
    boolean b10 = outputFormat1.isExpandEmptyElements();
    
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
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test132"); }


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
    outputFormat0.setLineSeparator("UTF-8");
    boolean b17 = outputFormat0.isNewLineAfterDeclaration();
    
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
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test133"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    boolean b4 = outputFormat1.isTrimText();
    outputFormat1.setPadText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test134"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    boolean b5 = outputFormat0.isOmitEncoding();
    boolean b6 = outputFormat0.isTrimText();
    java.lang.String str7 = outputFormat0.getEncoding();
    boolean b8 = outputFormat0.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test135"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    outputFormat1.setIndent("");
    outputFormat1.setSuppressDeclaration(false);
    outputFormat1.setTrimText(true);
    outputFormat1.setIndent("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test136"); }


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
    outputFormat0.setIndentSize((int)'4');
    
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

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test137"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    outputFormat1.setIndent("");
    outputFormat1.setSuppressDeclaration(false);
    outputFormat1.setTrimText(true);
    outputFormat1.setExpandEmptyElements(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test138"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    boolean b6 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setNewLineAfterNTags((int)(short)0);
    outputFormat0.setSuppressDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test139"); }


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
    outputFormat0.setNewLineAfterNTags((int)(byte)100);
    
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
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test140"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)0);
    outputFormat0.setEncoding("");
    outputFormat0.setNewlines(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test141"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setLineSeparator("hi!");
    boolean b9 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setIndent(false);
    outputFormat1.setSuppressDeclaration(false);
    java.lang.String str14 = outputFormat1.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test142"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    boolean b3 = outputFormat2.isPadText();
    int i4 = outputFormat2.getNewLineAfterNTags();
    outputFormat2.setPadText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test143"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", false, "\n");
    int i4 = outputFormat3.getNewLineAfterNTags();
    boolean b5 = outputFormat3.isOmitEncoding();
    boolean b6 = outputFormat3.isNewLineAfterDeclaration();
    outputFormat3.setEncoding("UTF-8");
    boolean b9 = outputFormat3.isPadText();
    
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
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test144"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setExpandEmptyElements(false);
    outputFormat1.setTrimText(false);
    outputFormat1.setPadText(false);
    boolean b16 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setIndent(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test145"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndentSize(34);
    java.lang.String str13 = outputFormat0.getEncoding();
    boolean b14 = outputFormat0.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "UTF-8"+ "'", str13.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test146"); }


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
    boolean b16 = outputFormat1.isNewlines();
    outputFormat1.setNewLineAfterNTags(0);
    
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
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test147"); }


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
    boolean b21 = outputFormat0.isXHTML();
    char char22 = outputFormat0.getAttributeQuoteCharacter();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char22 == '\"');

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test148"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setSuppressDeclaration(true);
    boolean b7 = outputFormat0.isXHTML();
    outputFormat0.setNewLineAfterNTags((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test149"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setIndent(true);
    outputFormat3.setLineSeparator("                                                                                                    ");
    outputFormat3.setPadText(false);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test150"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setExpandEmptyElements(false);
    outputFormat1.setTrimText(false);
    outputFormat1.setPadText(false);
    outputFormat1.setTrimText(false);
    boolean b18 = outputFormat1.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test151"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    boolean b6 = outputFormat3.isNewLineAfterDeclaration();
    java.lang.String str7 = outputFormat3.getIndent();
    int i8 = outputFormat3.getNewLineAfterNTags();
    outputFormat3.setEncoding("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test152"); }


    OutputFormat outputFormat3 = new OutputFormat("          ", true, "                                  ");
    java.lang.String str4 = outputFormat3.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\n"+ "'", str4.equals("\n"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test153"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", true, "hi!");
    boolean b4 = outputFormat3.isPadText();
    outputFormat3.setSuppressDeclaration(true);
    outputFormat3.setEncoding("  ");
    outputFormat3.setLineSeparator("hi!");
    outputFormat3.setPadText(false);
    outputFormat3.setSuppressDeclaration(false);
    boolean b15 = outputFormat3.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test154"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndentSize(34);
    java.lang.String str13 = outputFormat0.getIndent();
    outputFormat0.setNewLineAfterDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "                                  "+ "'", str13.equals("                                  "));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test155"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setTrimText(true);
    outputFormat0.setIndent("hi!");
    outputFormat0.setPadText(true);
    outputFormat0.setNewLineAfterDeclaration(true);
    outputFormat0.setOmitEncoding(false);
    char char15 = outputFormat0.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char15 == '\"');

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test156"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    boolean b5 = outputFormat0.isNewlines();
    boolean b6 = outputFormat0.isOmitEncoding();
    java.lang.String str7 = outputFormat0.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\n"+ "'", str7.equals("\n"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test157"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    boolean b3 = outputFormat2.isPadText();
    char char4 = outputFormat2.getAttributeQuoteCharacter();
    outputFormat2.setIndentSize((int)'#');
    outputFormat2.setXHTML(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char4 == '\"');

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test158"); }


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
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char30 == '\"');

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test159"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setEncoding("\n");
    outputFormat1.setNewLineAfterNTags(32);
    outputFormat1.setSuppressDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test160"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndent("\n");
    outputFormat0.setIndent(true);
    outputFormat0.setEncoding("");
    outputFormat0.setIndentSize(100);
    boolean b13 = outputFormat0.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test161"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setLineSeparator("\n");
    outputFormat0.setIndentSize((int)(byte)10);
    boolean b7 = outputFormat0.isSuppressDeclaration();
    char char8 = outputFormat0.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char8 == '\"');

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test162"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    boolean b10 = outputFormat0.isTrimText();
    outputFormat0.setLineSeparator("  ");
    java.lang.String str13 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setAttributeQuoteCharacter('\"');
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "  "+ "'", str13.equals("  "));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test163"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setTrimText(false);
    outputFormat0.setIndent(false);
    OutputFormat outputFormat11 = OutputFormat.createCompactFormat();
    outputFormat11.setNewlines(false);
    boolean b14 = outputFormat11.isNewLineAfterDeclaration();
    OutputFormat outputFormat15 = OutputFormat.createCompactFormat();
    outputFormat15.setNewlines(false);
    boolean b18 = outputFormat15.isNewLineAfterDeclaration();
    outputFormat15.setNewlines(true);
    outputFormat15.setExpandEmptyElements(true);
    java.lang.String str23 = outputFormat15.getLineSeparator();
    outputFormat15.setNewlines(false);
    java.lang.String str26 = outputFormat15.getIndent();
    OutputFormat outputFormat28 = new OutputFormat("hi!");
    boolean b29 = outputFormat28.isOmitEncoding();
    java.lang.String[] str_array32 = new java.lang.String[] { "", "\n" };
    int i34 = outputFormat28.parseOptions(str_array32, (int)(byte)1);
    int i36 = outputFormat15.parseOptions(str_array32, (int)'a');
    int i38 = outputFormat11.parseOptions(str_array32, 32);
    int i40 = outputFormat0.parseOptions(str_array32, (int)(byte)1);
    boolean b41 = outputFormat0.isOmitEncoding();
    outputFormat0.setLineSeparator("\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\n"+ "'", str23.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test164"); }


    OutputFormat outputFormat2 = new OutputFormat("\n", true);
    outputFormat2.setEncoding("");

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test165"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setExpandEmptyElements(false);
    outputFormat1.setTrimText(false);
    outputFormat1.setPadText(false);
    char char16 = outputFormat1.getAttributeQuoteCharacter();
    java.lang.String str17 = outputFormat1.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char16 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\n"+ "'", str17.equals("\n"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test166"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    outputFormat1.setIndent(true);
    outputFormat1.setLineSeparator("\n");
    outputFormat1.setExpandEmptyElements(false);
    outputFormat1.setOmitEncoding(false);
    char char10 = outputFormat1.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char10 == '\"');

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test167"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    int i6 = outputFormat1.getNewLineAfterNTags();
    char char7 = outputFormat1.getAttributeQuoteCharacter();
    outputFormat1.setIndent(false);
    outputFormat1.setNewLineAfterDeclaration(false);
    
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
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test168"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", false, "\n");
    int i4 = outputFormat3.getNewLineAfterNTags();
    boolean b5 = outputFormat3.isOmitEncoding();
    boolean b6 = outputFormat3.isNewLineAfterDeclaration();
    outputFormat3.setEncoding("UTF-8");
    outputFormat3.setIndent("hi!");
    boolean b11 = outputFormat3.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test169"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setNewlines(true);
    outputFormat1.setNewLineAfterDeclaration(true);
    outputFormat1.setEncoding("hi!");
    outputFormat1.setSuppressDeclaration(true);
    outputFormat1.setExpandEmptyElements(true);
    boolean b13 = outputFormat1.isPadText();
    outputFormat1.setSuppressDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test170"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setEncoding("\n");
    outputFormat1.setNewLineAfterNTags(32);
    java.lang.String str7 = outputFormat1.getIndent();
    boolean b8 = outputFormat1.isNewLineAfterDeclaration();
    boolean b9 = outputFormat1.isXHTML();
    boolean b10 = outputFormat1.isNewlines();
    outputFormat1.setLineSeparator("hi!");
    
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
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test171"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    boolean b4 = outputFormat1.isXHTML();
    outputFormat1.setLineSeparator("");
    boolean b7 = outputFormat1.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test172"); }


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
    boolean b18 = outputFormat0.isPadText();
    
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
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test173"); }


    OutputFormat outputFormat1 = new OutputFormat("  ");
    outputFormat1.setIndentSize((int)(short)100);
    outputFormat1.setExpandEmptyElements(false);
    java.lang.String str6 = outputFormat1.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test174"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    char char4 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setPadText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char4 == '\"');

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test175"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    outputFormat1.setIndent(true);
    outputFormat1.setLineSeparator("\n");
    java.lang.String str6 = outputFormat1.getLineSeparator();
    outputFormat1.setLineSeparator("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test176"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", true, "hi!");
    outputFormat3.setOmitEncoding(false);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test177"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    outputFormat1.setIndent("");
    boolean b5 = outputFormat1.isNewlines();
    outputFormat1.setLineSeparator("UTF-8");
    boolean b8 = outputFormat1.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test178"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    boolean b3 = outputFormat2.isPadText();
    int i4 = outputFormat2.getNewLineAfterNTags();
    boolean b5 = outputFormat2.isExpandEmptyElements();
    java.lang.String str6 = outputFormat2.getIndent();
    boolean b7 = outputFormat2.isXHTML();
    outputFormat2.setTrimText(true);
    boolean b10 = outputFormat2.isNewLineAfterDeclaration();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test179"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    java.lang.String str6 = outputFormat1.getIndent();
    outputFormat1.setTrimText(true);
    boolean b9 = outputFormat1.isTrimText();
    outputFormat1.setXHTML(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test180"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setNewlines(true);
    outputFormat1.setNewLineAfterDeclaration(true);
    boolean b7 = outputFormat1.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test181"); }


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
    outputFormat0.setIndent(false);
    int i18 = outputFormat0.getNewLineAfterNTags();
    boolean b19 = outputFormat0.isNewLineAfterDeclaration();
    boolean b20 = outputFormat0.isTrimText();
    
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
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test182"); }


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
    outputFormat0.setIndentSize(52);
    
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
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test183"); }


    OutputFormat outputFormat3 = new OutputFormat("UTF-8", false, "");
    boolean b4 = outputFormat3.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test184"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", false, "\n");
    int i4 = outputFormat3.getNewLineAfterNTags();
    boolean b5 = outputFormat3.isOmitEncoding();
    java.lang.String str6 = outputFormat3.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test185"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setExpandEmptyElements(true);
    outputFormat1.setIndentSize(0);
    outputFormat1.setIndent(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test186"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    boolean b10 = outputFormat1.isPadText();
    boolean b11 = outputFormat1.isOmitEncoding();
    java.lang.String str12 = outputFormat1.getIndent();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test187"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    boolean b5 = outputFormat0.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test188"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    boolean b10 = outputFormat0.isPadText();
    java.lang.String str11 = outputFormat0.getIndent();
    boolean b12 = outputFormat0.isNewLineAfterDeclaration();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test189"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    outputFormat2.setNewLineAfterDeclaration(true);
    outputFormat2.setNewLineAfterDeclaration(false);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test190"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setAttributeQuoteCharacter('\"');
    outputFormat1.setTrimText(true);
    outputFormat1.setXHTML(false);
    java.lang.String str14 = outputFormat1.getIndent();
    outputFormat1.setEncoding("  ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test191"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    java.lang.String str6 = outputFormat1.getIndent();
    outputFormat1.setTrimText(true);
    outputFormat1.setIndent("\n");
    // The following exception was thrown during execution in test generation
    try {
    outputFormat1.setAttributeQuoteCharacter(' ');
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
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test192"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isExpandEmptyElements();
    java.lang.String str4 = outputFormat1.getIndent();
    outputFormat1.setOmitEncoding(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test193"); }


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
    outputFormat0.setPadText(false);
    OutputFormat outputFormat18 = OutputFormat.createCompactFormat();
    outputFormat18.setNewlines(false);
    outputFormat18.setNewLineAfterDeclaration(false);
    boolean b23 = outputFormat18.isTrimText();
    boolean b24 = outputFormat18.isPadText();
    OutputFormat outputFormat25 = OutputFormat.createCompactFormat();
    outputFormat25.setNewlines(false);
    boolean b28 = outputFormat25.isNewLineAfterDeclaration();
    outputFormat25.setNewlines(true);
    outputFormat25.setExpandEmptyElements(true);
    java.lang.String str33 = outputFormat25.getLineSeparator();
    outputFormat25.setNewlines(false);
    OutputFormat outputFormat36 = OutputFormat.createCompactFormat();
    java.lang.String str37 = outputFormat36.getLineSeparator();
    java.lang.String[] str_array41 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i43 = outputFormat36.parseOptions(str_array41, (int)' ');
    int i45 = outputFormat25.parseOptions(str_array41, (int)' ');
    int i47 = outputFormat18.parseOptions(str_array41, (int)(short)10);
    boolean b48 = outputFormat18.isOmitEncoding();
    OutputFormat outputFormat49 = OutputFormat.createCompactFormat();
    boolean b50 = outputFormat49.isTrimText();
    outputFormat49.setPadText(false);
    outputFormat49.setPadText(false);
    OutputFormat outputFormat55 = OutputFormat.createCompactFormat();
    outputFormat55.setNewlines(false);
    boolean b58 = outputFormat55.isNewLineAfterDeclaration();
    outputFormat55.setXHTML(true);
    java.lang.String str61 = outputFormat55.getLineSeparator();
    boolean b62 = outputFormat55.isPadText();
    OutputFormat outputFormat66 = new OutputFormat("", false, "");
    OutputFormat outputFormat67 = OutputFormat.createCompactFormat();
    java.lang.String str68 = outputFormat67.getLineSeparator();
    java.lang.String[] str_array72 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i74 = outputFormat67.parseOptions(str_array72, (int)' ');
    int i76 = outputFormat66.parseOptions(str_array72, (int)(short)0);
    int i78 = outputFormat55.parseOptions(str_array72, (int)(short)0);
    int i80 = outputFormat49.parseOptions(str_array72, 34);
    int i82 = outputFormat18.parseOptions(str_array72, (int)'4');
    int i84 = outputFormat0.parseOptions(str_array72, (int)(short)1);
    outputFormat0.setOmitEncoding(false);
    int i87 = outputFormat0.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\n"+ "'", str33.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "\n"+ "'", str37.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "\n"+ "'", str61.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "\n"+ "'", str68.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test194"); }


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
    outputFormat2.setLineSeparator("          ");
    
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
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test195"); }


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
    int i17 = outputFormat0.getNewLineAfterNTags();
    OutputFormat outputFormat19 = new OutputFormat("hi!");
    boolean b20 = outputFormat19.isOmitEncoding();
    java.lang.String[] str_array23 = new java.lang.String[] { "", "\n" };
    int i25 = outputFormat19.parseOptions(str_array23, (int)(byte)1);
    boolean b26 = outputFormat19.isXHTML();
    boolean b27 = outputFormat19.isTrimText();
    outputFormat19.setXHTML(true);
    boolean b30 = outputFormat19.isExpandEmptyElements();
    outputFormat19.setIndent(true);
    OutputFormat outputFormat36 = new OutputFormat("", false, "");
    outputFormat36.setPadText(false);
    boolean b39 = outputFormat36.isNewLineAfterDeclaration();
    boolean b40 = outputFormat36.isSuppressDeclaration();
    OutputFormat outputFormat41 = OutputFormat.createCompactFormat();
    outputFormat41.setNewlines(false);
    boolean b44 = outputFormat41.isNewLineAfterDeclaration();
    outputFormat41.setNewlines(true);
    int i47 = outputFormat41.getNewLineAfterNTags();
    outputFormat41.setTrimText(false);
    outputFormat41.setIndent(false);
    OutputFormat outputFormat53 = new OutputFormat("");
    java.lang.String str54 = outputFormat53.getIndent();
    int i55 = outputFormat53.getNewLineAfterNTags();
    outputFormat53.setIndent("UTF-8");
    OutputFormat outputFormat58 = OutputFormat.createCompactFormat();
    outputFormat58.setNewlines(false);
    boolean b61 = outputFormat58.isNewLineAfterDeclaration();
    outputFormat58.setNewlines(true);
    outputFormat58.setExpandEmptyElements(true);
    java.lang.String str66 = outputFormat58.getLineSeparator();
    outputFormat58.setNewlines(false);
    java.lang.String str69 = outputFormat58.getIndent();
    java.lang.String str70 = outputFormat58.getLineSeparator();
    int i71 = outputFormat58.getNewLineAfterNTags();
    outputFormat58.setExpandEmptyElements(false);
    outputFormat58.setExpandEmptyElements(true);
    java.lang.String[] str_array77 = new java.lang.String[] { "  " };
    int i79 = outputFormat58.parseOptions(str_array77, (int)(byte)0);
    int i81 = outputFormat53.parseOptions(str_array77, (int)(byte)1);
    int i83 = outputFormat41.parseOptions(str_array77, 97);
    int i85 = outputFormat36.parseOptions(str_array77, 52);
    int i87 = outputFormat19.parseOptions(str_array77, 0);
    int i89 = outputFormat0.parseOptions(str_array77, (int)(short)100);
    
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
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + ""+ "'", str54.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "\n"+ "'", str66.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "\n"+ "'", str70.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 100);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test196"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isXHTML();
    boolean b6 = outputFormat0.isNewLineAfterDeclaration();
    boolean b7 = outputFormat0.isNewlines();
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setExpandEmptyElements(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test197"); }


    OutputFormat outputFormat2 = new OutputFormat("                                  ", false);
    boolean b3 = outputFormat2.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test198"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    outputFormat2.setIndent(true);
    java.lang.String str5 = outputFormat2.getIndent();
    boolean b6 = outputFormat2.isExpandEmptyElements();
    boolean b7 = outputFormat2.isTrimText();
    boolean b8 = outputFormat2.isTrimText();
    outputFormat2.setIndentSize((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "  "+ "'", str5.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test199"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    outputFormat0.setPadText(true);
    outputFormat0.setNewlines(false);
    outputFormat0.setTrimText(false);
    outputFormat0.setSuppressDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test200"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    outputFormat3.setNewlines(true);
    char char8 = outputFormat3.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char8 == '\"');

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test201"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    int i6 = outputFormat1.getNewLineAfterNTags();
    char char7 = outputFormat1.getAttributeQuoteCharacter();
    boolean b8 = outputFormat1.isOmitEncoding();
    outputFormat1.setIndentSize((int)'#');
    outputFormat1.setSuppressDeclaration(false);
    
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

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test202"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setTrimText(false);
    outputFormat0.setIndent(false);
    boolean b11 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setAttributeQuoteCharacter('\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test203"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "  ");
    boolean b4 = outputFormat3.isExpandEmptyElements();
    boolean b5 = outputFormat3.isSuppressDeclaration();
    char char6 = outputFormat3.getAttributeQuoteCharacter();
    java.lang.String str7 = outputFormat3.getEncoding();
    int i8 = outputFormat3.getNewLineAfterNTags();
    boolean b9 = outputFormat3.isSuppressDeclaration();
    outputFormat3.setPadText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char6 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "  "+ "'", str7.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test204"); }


    OutputFormat outputFormat2 = new OutputFormat("", true);
    outputFormat2.setEncoding("");
    outputFormat2.setPadText(true);
    java.lang.String str7 = outputFormat2.getEncoding();
    outputFormat2.setIndent("                                  ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test205"); }


    OutputFormat outputFormat3 = new OutputFormat("  ", false, "UTF-8");

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test206"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    outputFormat3.setOmitEncoding(true);
    outputFormat3.setLineSeparator("hi!");
    boolean b10 = outputFormat3.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test207"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isTrimText();
    outputFormat0.setNewlines(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test208"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    java.lang.String str5 = outputFormat0.getIndent();
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isNewlines();
    boolean b9 = outputFormat0.isOmitEncoding();
    
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
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test209"); }


    OutputFormat outputFormat3 = new OutputFormat("                                                                                                    ", true, "hi!");

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test210"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", true, "UTF-8");
    outputFormat3.setPadText(false);
    outputFormat3.setXHTML(true);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test211"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isPadText();
    outputFormat0.setSuppressDeclaration(false);
    java.lang.String str10 = outputFormat0.getEncoding();
    outputFormat0.setPadText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UTF-8"+ "'", str10.equals("UTF-8"));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test212"); }


    OutputFormat outputFormat1 = new OutputFormat("");
    java.lang.String str2 = outputFormat1.getIndent();
    int i3 = outputFormat1.getNewLineAfterNTags();
    outputFormat1.setIndent("UTF-8");
    OutputFormat outputFormat6 = OutputFormat.createCompactFormat();
    outputFormat6.setNewlines(false);
    boolean b9 = outputFormat6.isNewLineAfterDeclaration();
    outputFormat6.setNewlines(true);
    outputFormat6.setExpandEmptyElements(true);
    java.lang.String str14 = outputFormat6.getLineSeparator();
    outputFormat6.setNewlines(false);
    java.lang.String str17 = outputFormat6.getIndent();
    java.lang.String str18 = outputFormat6.getLineSeparator();
    int i19 = outputFormat6.getNewLineAfterNTags();
    outputFormat6.setExpandEmptyElements(false);
    outputFormat6.setExpandEmptyElements(true);
    java.lang.String[] str_array25 = new java.lang.String[] { "  " };
    int i27 = outputFormat6.parseOptions(str_array25, (int)(byte)0);
    int i29 = outputFormat1.parseOptions(str_array25, (int)(byte)1);
    outputFormat1.setNewLineAfterDeclaration(false);
    outputFormat1.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\n"+ "'", str14.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\n"+ "'", str18.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test213"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    java.lang.String str3 = outputFormat0.getEncoding();
    boolean b4 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setLineSeparator("\n");
    boolean b7 = outputFormat0.isPadText();
    boolean b8 = outputFormat0.isTrimText();
    outputFormat0.setIndentSize(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8"+ "'", str3.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test214"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    boolean b6 = outputFormat3.isNewLineAfterDeclaration();
    outputFormat3.setPadText(true);
    outputFormat3.setNewlines(false);
    boolean b11 = outputFormat3.isTrimText();
    outputFormat3.setNewlines(true);
    boolean b14 = outputFormat3.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test215"); }


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
    java.lang.String str14 = outputFormat0.getIndent();
    
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
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test216"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    boolean b5 = outputFormat0.isNewlines();
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test217"); }


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
    outputFormat0.setNewLineAfterNTags(34);
    OutputFormat outputFormat17 = OutputFormat.createCompactFormat();
    outputFormat17.setNewlines(false);
    boolean b20 = outputFormat17.isNewLineAfterDeclaration();
    outputFormat17.setNewlines(true);
    int i23 = outputFormat17.getNewLineAfterNTags();
    outputFormat17.setXHTML(false);
    outputFormat17.setIndentSize((int)(short)1);
    outputFormat17.setIndent(false);
    boolean b30 = outputFormat17.isXHTML();
    OutputFormat outputFormat31 = OutputFormat.createCompactFormat();
    outputFormat31.setNewlines(false);
    boolean b34 = outputFormat31.isNewLineAfterDeclaration();
    outputFormat31.setNewlines(true);
    outputFormat31.setExpandEmptyElements(true);
    java.lang.String str39 = outputFormat31.getLineSeparator();
    outputFormat31.setNewlines(false);
    outputFormat31.setXHTML(false);
    outputFormat31.setPadText(false);
    outputFormat31.setOmitEncoding(true);
    OutputFormat outputFormat48 = OutputFormat.createCompactFormat();
    outputFormat48.setNewlines(false);
    outputFormat48.setNewLineAfterDeclaration(false);
    boolean b53 = outputFormat48.isTrimText();
    boolean b54 = outputFormat48.isPadText();
    OutputFormat outputFormat55 = OutputFormat.createCompactFormat();
    outputFormat55.setNewlines(false);
    boolean b58 = outputFormat55.isNewLineAfterDeclaration();
    outputFormat55.setNewlines(true);
    outputFormat55.setExpandEmptyElements(true);
    java.lang.String str63 = outputFormat55.getLineSeparator();
    outputFormat55.setNewlines(false);
    OutputFormat outputFormat66 = OutputFormat.createCompactFormat();
    java.lang.String str67 = outputFormat66.getLineSeparator();
    java.lang.String[] str_array71 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i73 = outputFormat66.parseOptions(str_array71, (int)' ');
    int i75 = outputFormat55.parseOptions(str_array71, (int)' ');
    int i77 = outputFormat48.parseOptions(str_array71, (int)(short)10);
    int i79 = outputFormat31.parseOptions(str_array71, (int)' ');
    int i81 = outputFormat17.parseOptions(str_array71, 0);
    int i83 = outputFormat0.parseOptions(str_array71, (int)(byte)10);
    outputFormat0.setEncoding("UTF-8");
    
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
    org.junit.Assert.assertNotNull(outputFormat17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "\n"+ "'", str39.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "\n"+ "'", str63.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "\n"+ "'", str67.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 10);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test218"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setNewlines(true);
    boolean b7 = outputFormat1.isSuppressDeclaration();
    
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
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test219"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", false, "                                                                                                    ");

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test220"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", false, "\n");
    int i4 = outputFormat3.getNewLineAfterNTags();
    boolean b5 = outputFormat3.isOmitEncoding();
    boolean b6 = outputFormat3.isNewLineAfterDeclaration();
    int i7 = outputFormat3.getNewLineAfterNTags();
    boolean b8 = outputFormat3.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test221"); }


    OutputFormat outputFormat3 = new OutputFormat("                                  ", false, "\n");
    int i4 = outputFormat3.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test222"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    outputFormat1.setIndent("");
    outputFormat1.setSuppressDeclaration(false);
    outputFormat1.setEncoding("UTF-8");
    boolean b9 = outputFormat1.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test223"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(true);
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setTrimText(true);
    boolean b12 = outputFormat0.isOmitEncoding();
    java.lang.String str13 = outputFormat0.getEncoding();
    outputFormat0.setIndent("                                  ");
    outputFormat0.setLineSeparator("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "UTF-8"+ "'", str13.equals("UTF-8"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test224"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    int i6 = outputFormat1.getNewLineAfterNTags();
    char char7 = outputFormat1.getAttributeQuoteCharacter();
    boolean b8 = outputFormat1.isOmitEncoding();
    java.lang.String str9 = outputFormat1.getLineSeparator();
    java.lang.String str10 = outputFormat1.getIndent();
    outputFormat1.setPadText(true);
    outputFormat1.setExpandEmptyElements(true);
    
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

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test225"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    boolean b10 = outputFormat0.isTrimText();
    outputFormat0.setLineSeparator("  ");
    java.lang.String str13 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(true);
    outputFormat0.setPadText(true);
    outputFormat0.setOmitEncoding(true);
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "  "+ "'", str13.equals("  "));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test226"); }


    OutputFormat outputFormat3 = new OutputFormat("  ", false, "                                  ");

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test227"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    boolean b5 = outputFormat0.isOmitEncoding();
    boolean b6 = outputFormat0.isTrimText();
    boolean b7 = outputFormat0.isXHTML();
    outputFormat0.setIndentSize((int)'\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test228"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    boolean b8 = outputFormat0.isXHTML();
    java.lang.String str9 = outputFormat0.getIndent();
    outputFormat0.setLineSeparator("          ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test229"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    boolean b6 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setIndentSize(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test230"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    outputFormat0.setIndentSize((int)'\"');
    outputFormat0.setIndentSize(1);
    outputFormat0.setPadText(true);
    char char10 = outputFormat0.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char10 == '\"');

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test231"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    outputFormat3.setNewlines(true);
    outputFormat3.setPadText(true);
    outputFormat3.setXHTML(true);
    char char12 = outputFormat3.getAttributeQuoteCharacter();
    char char13 = outputFormat3.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char12 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char13 == '\"');

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test232"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setIndentSize((int)(short)1);
    java.lang.String str9 = outputFormat0.getLineSeparator();
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setTrimText(false);
    outputFormat0.setNewlines(true);
    outputFormat0.setOmitEncoding(true);
    outputFormat0.setNewLineAfterNTags((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n"+ "'", str9.equals("\n"));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test233"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterNTags((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test234"); }


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
    char char23 = outputFormat0.getAttributeQuoteCharacter();
    char char24 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setIndent(true);
    boolean b27 = outputFormat0.isPadText();
    
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
    org.junit.Assert.assertTrue(char23 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char24 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test235"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isPadText();
    outputFormat0.setSuppressDeclaration(false);
    java.lang.String str10 = outputFormat0.getEncoding();
    java.lang.String str11 = outputFormat0.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UTF-8"+ "'", str10.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "UTF-8"+ "'", str11.equals("UTF-8"));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test236"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    boolean b7 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setIndent("UTF-8");
    char char10 = outputFormat1.getAttributeQuoteCharacter();
    outputFormat1.setNewLineAfterNTags((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char10 == '\"');

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test237"); }


    OutputFormat outputFormat2 = new OutputFormat("", true);
    outputFormat2.setEncoding("");
    outputFormat2.setIndentSize(34);
    boolean b7 = outputFormat2.isTrimText();
    outputFormat2.setNewLineAfterNTags((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test238"); }


    OutputFormat outputFormat3 = new OutputFormat("                                  ", true, "                                  ");

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test239"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(true);
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setTrimText(true);
    boolean b12 = outputFormat0.isPadText();
    outputFormat0.setPadText(true);
    boolean b15 = outputFormat0.isExpandEmptyElements();
    boolean b16 = outputFormat0.isXHTML();
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str19 = outputFormat0.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "UTF-8"+ "'", str19.equals("UTF-8"));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test240"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    boolean b1 = outputFormat0.isTrimText();
    outputFormat0.setTrimText(false);
    outputFormat0.setIndentSize(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test241"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setTrimText(false);
    outputFormat0.setIndent(true);
    OutputFormat outputFormat16 = new OutputFormat("", false, "");
    OutputFormat outputFormat17 = OutputFormat.createCompactFormat();
    java.lang.String str18 = outputFormat17.getLineSeparator();
    java.lang.String[] str_array22 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i24 = outputFormat17.parseOptions(str_array22, (int)' ');
    int i26 = outputFormat16.parseOptions(str_array22, (int)(short)0);
    outputFormat16.setOmitEncoding(true);
    boolean b29 = outputFormat16.isOmitEncoding();
    OutputFormat outputFormat31 = new OutputFormat("hi!");
    outputFormat31.setIndent(true);
    outputFormat31.setEncoding("");
    OutputFormat outputFormat36 = OutputFormat.createCompactFormat();
    outputFormat36.setNewlines(false);
    boolean b39 = outputFormat36.isNewLineAfterDeclaration();
    outputFormat36.setNewlines(true);
    outputFormat36.setExpandEmptyElements(true);
    java.lang.String str44 = outputFormat36.getLineSeparator();
    outputFormat36.setNewlines(false);
    outputFormat36.setXHTML(false);
    outputFormat36.setPadText(false);
    OutputFormat outputFormat51 = OutputFormat.createCompactFormat();
    outputFormat51.setNewlines(false);
    boolean b54 = outputFormat51.isNewLineAfterDeclaration();
    outputFormat51.setNewlines(true);
    outputFormat51.setExpandEmptyElements(true);
    java.lang.String str59 = outputFormat51.getLineSeparator();
    outputFormat51.setNewlines(false);
    OutputFormat outputFormat62 = OutputFormat.createCompactFormat();
    java.lang.String str63 = outputFormat62.getLineSeparator();
    java.lang.String[] str_array67 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i69 = outputFormat62.parseOptions(str_array67, (int)' ');
    int i71 = outputFormat51.parseOptions(str_array67, (int)' ');
    int i73 = outputFormat36.parseOptions(str_array67, (int)' ');
    int i75 = outputFormat31.parseOptions(str_array67, 100);
    int i77 = outputFormat16.parseOptions(str_array67, (int)(short)1);
    int i79 = outputFormat0.parseOptions(str_array67, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\n"+ "'", str18.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "\n"+ "'", str44.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "\n"+ "'", str59.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "\n"+ "'", str63.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test242"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(true);
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setTrimText(true);
    boolean b12 = outputFormat0.isOmitEncoding();
    outputFormat0.setNewlines(true);
    outputFormat0.setIndent(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test243"); }


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
    int i13 = outputFormat0.getNewLineAfterNTags();
    int i14 = outputFormat0.getNewLineAfterNTags();
    
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
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test244"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    outputFormat2.setNewLineAfterDeclaration(true);
    outputFormat2.setNewLineAfterNTags((int)'#');
    java.lang.String str7 = outputFormat2.getEncoding();
    outputFormat2.setEncoding("UTF-8");
    outputFormat2.setEncoding("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test245"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b5 = outputFormat0.isPadText();
    boolean b6 = outputFormat0.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test246"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(false);
    outputFormat0.setExpandEmptyElements(false);
    outputFormat0.setXHTML(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test247"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setIndent("  ");
    outputFormat0.setXHTML(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test248"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    outputFormat2.setPadText(false);
    char char5 = outputFormat2.getAttributeQuoteCharacter();
    int i6 = outputFormat2.getNewLineAfterNTags();
    outputFormat2.setNewLineAfterDeclaration(false);
    java.lang.String str9 = outputFormat2.getEncoding();
    outputFormat2.setPadText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char5 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UTF-8"+ "'", str9.equals("UTF-8"));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test249"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setExpandEmptyElements(false);
    outputFormat1.setTrimText(false);
    outputFormat1.setIndent("hi!");
    boolean b16 = outputFormat1.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test250"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    char char7 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setEncoding("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test251"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    outputFormat1.setIndent(true);
    outputFormat1.setIndent("hi!");
    outputFormat1.setOmitEncoding(false);
    boolean b8 = outputFormat1.isTrimText();
    outputFormat1.setTrimText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test252"); }


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
    boolean b16 = outputFormat0.isExpandEmptyElements();
    
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
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test253"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", true, "          ");
    outputFormat3.setSuppressDeclaration(false);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test254"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    boolean b3 = outputFormat2.isNewlines();
    boolean b4 = outputFormat2.isExpandEmptyElements();
    boolean b5 = outputFormat2.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test255"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setTrimText(false);
    outputFormat0.setIndent(false);
    OutputFormat outputFormat11 = OutputFormat.createCompactFormat();
    outputFormat11.setNewlines(false);
    boolean b14 = outputFormat11.isNewLineAfterDeclaration();
    OutputFormat outputFormat15 = OutputFormat.createCompactFormat();
    outputFormat15.setNewlines(false);
    boolean b18 = outputFormat15.isNewLineAfterDeclaration();
    outputFormat15.setNewlines(true);
    outputFormat15.setExpandEmptyElements(true);
    java.lang.String str23 = outputFormat15.getLineSeparator();
    outputFormat15.setNewlines(false);
    java.lang.String str26 = outputFormat15.getIndent();
    OutputFormat outputFormat28 = new OutputFormat("hi!");
    boolean b29 = outputFormat28.isOmitEncoding();
    java.lang.String[] str_array32 = new java.lang.String[] { "", "\n" };
    int i34 = outputFormat28.parseOptions(str_array32, (int)(byte)1);
    int i36 = outputFormat15.parseOptions(str_array32, (int)'a');
    int i38 = outputFormat11.parseOptions(str_array32, 32);
    int i40 = outputFormat0.parseOptions(str_array32, (int)(byte)1);
    outputFormat0.setIndent(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\n"+ "'", str23.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test256"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    boolean b9 = outputFormat0.isOmitEncoding();
    boolean b10 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setEncoding("UTF-8");
    int i13 = outputFormat0.getNewLineAfterNTags();
    
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
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test257"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setOmitEncoding(true);
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setEncoding("\n");
    boolean b14 = outputFormat0.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test258"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)0);
    outputFormat0.setEncoding("");
    outputFormat0.setIndent(true);
    outputFormat0.setEncoding("");
    outputFormat0.setOmitEncoding(true);
    int i15 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str16 = outputFormat0.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test259"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", false, "hi!");
    char char4 = outputFormat3.getAttributeQuoteCharacter();
    boolean b5 = outputFormat3.isOmitEncoding();
    boolean b6 = outputFormat3.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char4 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test260"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)1);
    java.lang.String str11 = outputFormat0.getEncoding();
    boolean b12 = outputFormat0.isNewlines();
    outputFormat0.setNewLineAfterNTags((int)(byte)100);
    boolean b15 = outputFormat0.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "UTF-8"+ "'", str11.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test261"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setNewlines(false);
    outputFormat0.setLineSeparator("");
    outputFormat0.setIndent("UTF-8");
    outputFormat0.setTrimText(true);
    outputFormat0.setNewlines(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test262"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    outputFormat1.setIndent(true);
    boolean b4 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setExpandEmptyElements(true);
    outputFormat1.setLineSeparator("                                  ");
    boolean b9 = outputFormat1.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test263"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isXHTML();
    int i6 = outputFormat0.getNewLineAfterNTags();
    boolean b7 = outputFormat0.isXHTML();
    boolean b8 = outputFormat0.isNewlines();
    boolean b9 = outputFormat0.isTrimText();
    boolean b10 = outputFormat0.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test264"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    boolean b6 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setIndent("                                  ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test265"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setSuppressDeclaration(true);
    java.lang.String str7 = outputFormat0.getEncoding();
    java.lang.String str8 = outputFormat0.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test266"); }


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
    outputFormat0.setIndent("\n");
    
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
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test267"); }


    OutputFormat outputFormat3 = new OutputFormat("                                  ", false, "\n");
    outputFormat3.setNewlines(true);
    boolean b6 = outputFormat3.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test268"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isExpandEmptyElements();
    int i4 = outputFormat1.getNewLineAfterNTags();
    java.lang.String str5 = outputFormat1.getIndent();
    java.lang.String str6 = outputFormat1.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test269"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    OutputFormat outputFormat6 = OutputFormat.createCompactFormat();
    outputFormat6.setNewlines(false);
    boolean b9 = outputFormat6.isNewLineAfterDeclaration();
    outputFormat6.setNewlines(true);
    outputFormat6.setExpandEmptyElements(true);
    java.lang.String str14 = outputFormat6.getLineSeparator();
    outputFormat6.setNewlines(false);
    outputFormat6.setXHTML(false);
    outputFormat6.setPadText(false);
    outputFormat6.setIndent(false);
    outputFormat6.setNewLineAfterNTags(0);
    outputFormat6.setTrimText(false);
    OutputFormat outputFormat27 = OutputFormat.createCompactFormat();
    outputFormat27.setNewlines(false);
    boolean b30 = outputFormat27.isNewLineAfterDeclaration();
    outputFormat27.setNewlines(true);
    int i33 = outputFormat27.getNewLineAfterNTags();
    java.lang.String str34 = outputFormat27.getEncoding();
    outputFormat27.setNewlines(false);
    java.lang.String str37 = outputFormat27.getEncoding();
    boolean b38 = outputFormat27.isPadText();
    boolean b39 = outputFormat27.isXHTML();
    OutputFormat outputFormat42 = new OutputFormat("", false);
    outputFormat42.setIndent(true);
    boolean b45 = outputFormat42.isOmitEncoding();
    OutputFormat outputFormat46 = OutputFormat.createCompactFormat();
    outputFormat46.setNewlines(false);
    boolean b49 = outputFormat46.isNewLineAfterDeclaration();
    outputFormat46.setNewlines(true);
    outputFormat46.setExpandEmptyElements(true);
    java.lang.String str54 = outputFormat46.getLineSeparator();
    outputFormat46.setNewlines(false);
    java.lang.String str57 = outputFormat46.getIndent();
    OutputFormat outputFormat59 = new OutputFormat("hi!");
    boolean b60 = outputFormat59.isOmitEncoding();
    java.lang.String[] str_array63 = new java.lang.String[] { "", "\n" };
    int i65 = outputFormat59.parseOptions(str_array63, (int)(byte)1);
    int i67 = outputFormat46.parseOptions(str_array63, (int)'a');
    int i69 = outputFormat42.parseOptions(str_array63, (int)(short)10);
    int i71 = outputFormat27.parseOptions(str_array63, 34);
    int i73 = outputFormat6.parseOptions(str_array63, (int)(short)0);
    int i75 = outputFormat0.parseOptions(str_array63, (int)'#');
    boolean b76 = outputFormat0.isSuppressDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\n"+ "'", str14.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "UTF-8"+ "'", str34.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "UTF-8"+ "'", str37.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "\n"+ "'", str54.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test270"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    boolean b9 = outputFormat0.isOmitEncoding();
    boolean b10 = outputFormat0.isTrimText();
    boolean b11 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setEncoding("  ");
    boolean b14 = outputFormat0.isExpandEmptyElements();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test271"); }


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
    java.lang.String str26 = outputFormat0.getIndent();
    outputFormat0.setTrimText(true);
    outputFormat0.setLineSeparator("UTF-8");
    outputFormat0.setIndentSize((int)(short)100);
    
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
    org.junit.Assert.assertNull(str26);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test272"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    outputFormat2.setIndent(true);
    java.lang.String str5 = outputFormat2.getIndent();
    boolean b6 = outputFormat2.isExpandEmptyElements();
    boolean b7 = outputFormat2.isTrimText();
    boolean b8 = outputFormat2.isTrimText();
    outputFormat2.setNewLineAfterDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "  "+ "'", str5.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test273"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isExpandEmptyElements();
    outputFormat1.setEncoding("UTF-8");
    boolean b6 = outputFormat1.isXHTML();
    java.lang.String str7 = outputFormat1.getIndent();
    outputFormat1.setTrimText(false);
    outputFormat1.setOmitEncoding(false);
    outputFormat1.setSuppressDeclaration(true);
    outputFormat1.setIndentSize((int)(short)1);
    
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
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test274"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    boolean b3 = outputFormat2.isPadText();
    char char4 = outputFormat2.getAttributeQuoteCharacter();
    outputFormat2.setIndentSize((int)'#');
    outputFormat2.setOmitEncoding(true);
    int i9 = outputFormat2.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char4 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test275"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isXHTML();
    boolean b6 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewLineAfterNTags((int)(short)100);
    outputFormat0.setIndent(true);
    boolean b11 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setIndent(false);
    outputFormat0.setNewlines(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test276"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndentSize(34);
    boolean b13 = outputFormat0.isExpandEmptyElements();
    java.lang.String str14 = outputFormat0.getIndent();
    outputFormat0.setEncoding("                                                                                                    ");
    outputFormat0.setTrimText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "                                  "+ "'", str14.equals("                                  "));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test277"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setTrimText(false);
    outputFormat0.setIndent(false);
    java.lang.String str11 = outputFormat0.getLineSeparator();
    char char12 = outputFormat0.getAttributeQuoteCharacter();
    boolean b13 = outputFormat0.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n"+ "'", str11.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char12 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test278"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setPadText(false);
    outputFormat0.setSuppressDeclaration(true);
    boolean b11 = outputFormat0.isOmitEncoding();
    boolean b12 = outputFormat0.isPadText();
    outputFormat0.setIndent(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test279"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    java.lang.String str7 = outputFormat1.getLineSeparator();
    java.lang.String str8 = outputFormat1.getIndent();
    boolean b9 = outputFormat1.isPadText();
    outputFormat1.setEncoding("          ");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test280"); }


    OutputFormat outputFormat2 = new OutputFormat("          ", false);
    char char3 = outputFormat2.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char3 == '\"');

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test281"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    char char7 = outputFormat0.getAttributeQuoteCharacter();
    boolean b8 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setPadText(false);
    outputFormat0.setNewlines(true);
    outputFormat0.setTrimText(false);
    java.lang.String str15 = outputFormat0.getLineSeparator();
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
    org.junit.Assert.assertTrue(char7 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\n"+ "'", str15.equals("\n"));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test282"); }


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
    char char16 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setLineSeparator("");
    
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
    org.junit.Assert.assertTrue(char16 == '\"');

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test283"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    boolean b5 = outputFormat1.isPadText();
    outputFormat1.setExpandEmptyElements(false);
    outputFormat1.setIndent("                                                                                                    ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test284"); }


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
    char char32 = outputFormat0.getAttributeQuoteCharacter();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char32 == '\"');

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test285"); }


    OutputFormat outputFormat1 = new OutputFormat("  ");
    int i2 = outputFormat1.getNewLineAfterNTags();
    java.lang.String str3 = outputFormat1.getIndent();
    outputFormat1.setLineSeparator("                                  ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "  "+ "'", str3.equals("  "));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test286"); }


    OutputFormat outputFormat3 = new OutputFormat("          ", true, "          ");

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test287"); }


    OutputFormat outputFormat1 = new OutputFormat("\n");
    java.lang.String str2 = outputFormat1.getLineSeparator();
    int i3 = outputFormat1.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n"+ "'", str2.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test288"); }


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
    char char17 = outputFormat0.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char17 == '\"');

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test289"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setIndent(false);
    boolean b9 = outputFormat1.isPadText();
    outputFormat1.setAttributeQuoteCharacter('\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test290"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setPadText(false);
    outputFormat0.setSuppressDeclaration(true);
    boolean b11 = outputFormat0.isOmitEncoding();
    boolean b12 = outputFormat0.isPadText();
    outputFormat0.setPadText(false);
    boolean b15 = outputFormat0.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test291"); }


    OutputFormat outputFormat3 = new OutputFormat("  ", true, "  ");
    java.lang.String str4 = outputFormat3.getEncoding();
    OutputFormat outputFormat8 = new OutputFormat("", false, "");
    OutputFormat outputFormat9 = OutputFormat.createCompactFormat();
    outputFormat9.setNewlines(false);
    outputFormat9.setNewLineAfterDeclaration(false);
    boolean b14 = outputFormat9.isTrimText();
    boolean b15 = outputFormat9.isPadText();
    OutputFormat outputFormat16 = OutputFormat.createCompactFormat();
    outputFormat16.setNewlines(false);
    boolean b19 = outputFormat16.isNewLineAfterDeclaration();
    outputFormat16.setNewlines(true);
    outputFormat16.setExpandEmptyElements(true);
    java.lang.String str24 = outputFormat16.getLineSeparator();
    outputFormat16.setNewlines(false);
    OutputFormat outputFormat27 = OutputFormat.createCompactFormat();
    java.lang.String str28 = outputFormat27.getLineSeparator();
    java.lang.String[] str_array32 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i34 = outputFormat27.parseOptions(str_array32, (int)' ');
    int i36 = outputFormat16.parseOptions(str_array32, (int)' ');
    int i38 = outputFormat9.parseOptions(str_array32, (int)(short)10);
    int i40 = outputFormat8.parseOptions(str_array32, (int)'\"');
    int i42 = outputFormat3.parseOptions(str_array32, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "  "+ "'", str4.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "\n"+ "'", str24.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "\n"+ "'", str28.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 10);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test292"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    OutputFormat outputFormat5 = OutputFormat.createCompactFormat();
    outputFormat5.setNewlines(false);
    boolean b8 = outputFormat5.isNewLineAfterDeclaration();
    outputFormat5.setNewlines(true);
    int i11 = outputFormat5.getNewLineAfterNTags();
    outputFormat5.setTrimText(false);
    outputFormat5.setIndent(false);
    boolean b16 = outputFormat5.isSuppressDeclaration();
    outputFormat5.setLineSeparator("hi!");
    OutputFormat outputFormat19 = OutputFormat.createCompactFormat();
    outputFormat19.setNewlines(false);
    boolean b22 = outputFormat19.isNewLineAfterDeclaration();
    outputFormat19.setXHTML(true);
    java.lang.String str25 = outputFormat19.getLineSeparator();
    boolean b26 = outputFormat19.isExpandEmptyElements();
    boolean b27 = outputFormat19.isPadText();
    outputFormat19.setPadText(false);
    OutputFormat outputFormat30 = OutputFormat.createCompactFormat();
    outputFormat30.setNewlines(false);
    boolean b33 = outputFormat30.isNewLineAfterDeclaration();
    outputFormat30.setNewlines(true);
    outputFormat30.setExpandEmptyElements(true);
    java.lang.String str38 = outputFormat30.getLineSeparator();
    outputFormat30.setNewlines(false);
    outputFormat30.setXHTML(false);
    outputFormat30.setPadText(false);
    outputFormat30.setOmitEncoding(true);
    OutputFormat outputFormat47 = OutputFormat.createCompactFormat();
    outputFormat47.setNewlines(false);
    outputFormat47.setNewLineAfterDeclaration(false);
    boolean b52 = outputFormat47.isTrimText();
    boolean b53 = outputFormat47.isPadText();
    OutputFormat outputFormat54 = OutputFormat.createCompactFormat();
    outputFormat54.setNewlines(false);
    boolean b57 = outputFormat54.isNewLineAfterDeclaration();
    outputFormat54.setNewlines(true);
    outputFormat54.setExpandEmptyElements(true);
    java.lang.String str62 = outputFormat54.getLineSeparator();
    outputFormat54.setNewlines(false);
    OutputFormat outputFormat65 = OutputFormat.createCompactFormat();
    java.lang.String str66 = outputFormat65.getLineSeparator();
    java.lang.String[] str_array70 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i72 = outputFormat65.parseOptions(str_array70, (int)' ');
    int i74 = outputFormat54.parseOptions(str_array70, (int)' ');
    int i76 = outputFormat47.parseOptions(str_array70, (int)(short)10);
    int i78 = outputFormat30.parseOptions(str_array70, (int)' ');
    int i80 = outputFormat19.parseOptions(str_array70, (int)(byte)0);
    int i82 = outputFormat5.parseOptions(str_array70, 100);
    int i84 = outputFormat1.parseOptions(str_array70, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\n"+ "'", str25.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "\n"+ "'", str38.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "\n"+ "'", str62.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "\n"+ "'", str66.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 100);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test293"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    boolean b9 = outputFormat0.isOmitEncoding();
    boolean b10 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setPadText(false);
    outputFormat0.setNewLineAfterNTags((int)'a');
    boolean b15 = outputFormat0.isTrimText();
    boolean b16 = outputFormat0.isNewLineAfterDeclaration();
    
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
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test294"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    outputFormat3.setNewlines(true);
    outputFormat3.setPadText(true);
    outputFormat3.setXHTML(true);
    outputFormat3.setNewlines(true);
    outputFormat3.setLineSeparator("");

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test295"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isExpandEmptyElements();
    outputFormat1.setIndent(true);
    outputFormat1.setXHTML(false);
    boolean b8 = outputFormat1.isNewlines();
    boolean b9 = outputFormat1.isSuppressDeclaration();
    boolean b10 = outputFormat1.isNewlines();
    boolean b11 = outputFormat1.isNewLineAfterDeclaration();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test296"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    boolean b5 = outputFormat0.isNewlines();
    char char6 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setIndentSize(0);
    boolean b9 = outputFormat0.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char6 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test297"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setLineSeparator("  ");
    outputFormat1.setPadText(true);
    outputFormat1.setPadText(false);
    outputFormat1.setEncoding("UTF-8");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test298"); }


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
    char char57 = outputFormat3.getAttributeQuoteCharacter();
    
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
    org.junit.Assert.assertTrue(char57 == '\"');

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test299"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setEncoding("\n");
    outputFormat1.setNewLineAfterNTags(32);
    java.lang.String str7 = outputFormat1.getIndent();
    boolean b8 = outputFormat1.isTrimText();
    boolean b9 = outputFormat1.isOmitEncoding();
    outputFormat1.setNewlines(true);
    
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
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test300"); }


    OutputFormat outputFormat2 = new OutputFormat("UTF-8", false);
    outputFormat2.setEncoding("\n");
    outputFormat2.setExpandEmptyElements(false);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test301"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setIndentSize((int)(short)1);
    java.lang.String str9 = outputFormat0.getLineSeparator();
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setTrimText(false);
    outputFormat0.setNewlines(true);
    outputFormat0.setOmitEncoding(true);
    outputFormat0.setIndent("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n"+ "'", str9.equals("\n"));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test302"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    java.lang.String str5 = outputFormat0.getEncoding();
    boolean b6 = outputFormat0.isXHTML();
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setSuppressDeclaration(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "UTF-8"+ "'", str5.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test303"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    boolean b6 = outputFormat3.isOmitEncoding();
    outputFormat3.setXHTML(true);
    outputFormat3.setTrimText(false);
    outputFormat3.setNewLineAfterDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test304"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    outputFormat2.setPadText(false);
    char char5 = outputFormat2.getAttributeQuoteCharacter();
    int i6 = outputFormat2.getNewLineAfterNTags();
    outputFormat2.setNewLineAfterDeclaration(false);
    java.lang.String str9 = outputFormat2.getEncoding();
    outputFormat2.setOmitEncoding(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char5 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UTF-8"+ "'", str9.equals("UTF-8"));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test305"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    char char2 = outputFormat1.getAttributeQuoteCharacter();
    int i3 = outputFormat1.getNewLineAfterNTags();
    boolean b4 = outputFormat1.isOmitEncoding();
    outputFormat1.setXHTML(true);
    boolean b7 = outputFormat1.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char2 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test306"); }


    OutputFormat outputFormat2 = new OutputFormat("", true);
    outputFormat2.setEncoding("");
    outputFormat2.setPadText(true);
    java.lang.String str7 = outputFormat2.getEncoding();
    outputFormat2.setExpandEmptyElements(false);
    // The following exception was thrown during execution in test generation
    try {
    outputFormat2.setAttributeQuoteCharacter('4');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test307"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    boolean b9 = outputFormat0.isOmitEncoding();
    boolean b10 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setXHTML(false);
    OutputFormat outputFormat13 = OutputFormat.createCompactFormat();
    outputFormat13.setNewlines(false);
    boolean b16 = outputFormat13.isNewLineAfterDeclaration();
    outputFormat13.setNewlines(true);
    outputFormat13.setExpandEmptyElements(true);
    boolean b21 = outputFormat13.isExpandEmptyElements();
    OutputFormat outputFormat23 = new OutputFormat("");
    java.lang.String str24 = outputFormat23.getIndent();
    int i25 = outputFormat23.getNewLineAfterNTags();
    outputFormat23.setIndent("UTF-8");
    OutputFormat outputFormat28 = OutputFormat.createCompactFormat();
    outputFormat28.setNewlines(false);
    boolean b31 = outputFormat28.isNewLineAfterDeclaration();
    outputFormat28.setNewlines(true);
    outputFormat28.setExpandEmptyElements(true);
    java.lang.String str36 = outputFormat28.getLineSeparator();
    outputFormat28.setNewlines(false);
    java.lang.String str39 = outputFormat28.getIndent();
    java.lang.String str40 = outputFormat28.getLineSeparator();
    int i41 = outputFormat28.getNewLineAfterNTags();
    outputFormat28.setExpandEmptyElements(false);
    outputFormat28.setExpandEmptyElements(true);
    java.lang.String[] str_array47 = new java.lang.String[] { "  " };
    int i49 = outputFormat28.parseOptions(str_array47, (int)(byte)0);
    int i51 = outputFormat23.parseOptions(str_array47, (int)(byte)1);
    int i53 = outputFormat13.parseOptions(str_array47, (int)'4');
    int i55 = outputFormat0.parseOptions(str_array47, 32);
    
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
    org.junit.Assert.assertNotNull(outputFormat13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "\n"+ "'", str36.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "\n"+ "'", str40.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 32);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test308"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(true);
    outputFormat0.setNewlines(false);
    boolean b10 = outputFormat0.isNewLineAfterDeclaration();
    java.lang.String str11 = outputFormat0.getEncoding();
    outputFormat0.setIndent("                                                                                                    ");
    
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
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test309"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setExpandEmptyElements(false);
    outputFormat0.setTrimText(false);
    outputFormat0.setTrimText(true);
    outputFormat0.setExpandEmptyElements(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test310"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(true);
    outputFormat0.setNewlines(false);
    outputFormat0.setOmitEncoding(false);
    outputFormat0.setIndent(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test311"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    outputFormat1.setIndent(true);
    outputFormat1.setIndent("hi!");
    java.lang.String str6 = outputFormat1.getIndent();
    boolean b7 = outputFormat1.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test312"); }


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
    boolean b16 = outputFormat1.isNewlines();
    boolean b17 = outputFormat1.isNewLineAfterDeclaration();
    java.lang.String str18 = outputFormat1.getLineSeparator();
    outputFormat1.setIndent("          ");
    
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
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\n"+ "'", str18.equals("\n"));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test313"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    char char7 = outputFormat0.getAttributeQuoteCharacter();
    boolean b8 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setExpandEmptyElements(false);
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setOmitEncoding(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test314"); }


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
    boolean b62 = outputFormat0.isExpandEmptyElements();
    
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
    org.junit.Assert.assertTrue(b62 == false);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test315"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "  ");
    boolean b4 = outputFormat3.isExpandEmptyElements();
    boolean b5 = outputFormat3.isSuppressDeclaration();
    char char6 = outputFormat3.getAttributeQuoteCharacter();
    java.lang.String str7 = outputFormat3.getEncoding();
    outputFormat3.setEncoding("\n");
    outputFormat3.setIndent(true);
    outputFormat3.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char6 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "  "+ "'", str7.equals("  "));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test316"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setNewLineAfterNTags(1);
    boolean b9 = outputFormat0.isSuppressDeclaration();
    boolean b10 = outputFormat0.isOmitEncoding();
    boolean b11 = outputFormat0.isSuppressDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test317"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setTrimText(false);
    outputFormat0.setLineSeparator("                                                                                                    ");
    outputFormat0.setSuppressDeclaration(false);
    int i16 = outputFormat0.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test318"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setXHTML(false);
    char char11 = outputFormat0.getAttributeQuoteCharacter();
    int i12 = outputFormat0.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char11 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test319"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    boolean b3 = outputFormat2.isPadText();
    int i4 = outputFormat2.getNewLineAfterNTags();
    outputFormat2.setLineSeparator("  ");
    java.lang.String str7 = outputFormat2.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test320"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    java.lang.String str5 = outputFormat0.getLineSeparator();
    outputFormat0.setIndent(true);
    outputFormat0.setIndentSize((int)(short)0);
    char char10 = outputFormat0.getAttributeQuoteCharacter();
    boolean b11 = outputFormat0.isTrimText();
    outputFormat0.setIndent(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n"+ "'", str5.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char10 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test321"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isXHTML();
    boolean b6 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewLineAfterNTags((int)(short)100);
    boolean b9 = outputFormat0.isExpandEmptyElements();
    java.lang.String str10 = outputFormat0.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test322"); }


    OutputFormat outputFormat2 = new OutputFormat("\n", false);
    outputFormat2.setIndent(true);
    boolean b5 = outputFormat2.isNewLineAfterDeclaration();
    outputFormat2.setIndentSize((int)(byte)0);
    java.lang.String str8 = outputFormat2.getEncoding();
    outputFormat2.setSuppressDeclaration(false);
    boolean b11 = outputFormat2.isExpandEmptyElements();
    boolean b12 = outputFormat2.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UTF-8"+ "'", str8.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test323"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", true);
    OutputFormat outputFormat3 = OutputFormat.createCompactFormat();
    outputFormat3.setNewlines(false);
    boolean b6 = outputFormat3.isNewLineAfterDeclaration();
    outputFormat3.setXHTML(true);
    OutputFormat outputFormat9 = OutputFormat.createCompactFormat();
    outputFormat9.setNewlines(false);
    boolean b12 = outputFormat9.isNewLineAfterDeclaration();
    outputFormat9.setNewlines(true);
    outputFormat9.setExpandEmptyElements(true);
    java.lang.String str17 = outputFormat9.getLineSeparator();
    outputFormat9.setNewlines(false);
    outputFormat9.setXHTML(false);
    outputFormat9.setPadText(false);
    outputFormat9.setIndent(false);
    outputFormat9.setNewLineAfterNTags(0);
    outputFormat9.setTrimText(false);
    OutputFormat outputFormat30 = OutputFormat.createCompactFormat();
    outputFormat30.setNewlines(false);
    boolean b33 = outputFormat30.isNewLineAfterDeclaration();
    outputFormat30.setNewlines(true);
    int i36 = outputFormat30.getNewLineAfterNTags();
    java.lang.String str37 = outputFormat30.getEncoding();
    outputFormat30.setNewlines(false);
    java.lang.String str40 = outputFormat30.getEncoding();
    boolean b41 = outputFormat30.isPadText();
    boolean b42 = outputFormat30.isXHTML();
    OutputFormat outputFormat45 = new OutputFormat("", false);
    outputFormat45.setIndent(true);
    boolean b48 = outputFormat45.isOmitEncoding();
    OutputFormat outputFormat49 = OutputFormat.createCompactFormat();
    outputFormat49.setNewlines(false);
    boolean b52 = outputFormat49.isNewLineAfterDeclaration();
    outputFormat49.setNewlines(true);
    outputFormat49.setExpandEmptyElements(true);
    java.lang.String str57 = outputFormat49.getLineSeparator();
    outputFormat49.setNewlines(false);
    java.lang.String str60 = outputFormat49.getIndent();
    OutputFormat outputFormat62 = new OutputFormat("hi!");
    boolean b63 = outputFormat62.isOmitEncoding();
    java.lang.String[] str_array66 = new java.lang.String[] { "", "\n" };
    int i68 = outputFormat62.parseOptions(str_array66, (int)(byte)1);
    int i70 = outputFormat49.parseOptions(str_array66, (int)'a');
    int i72 = outputFormat45.parseOptions(str_array66, (int)(short)10);
    int i74 = outputFormat30.parseOptions(str_array66, 34);
    int i76 = outputFormat9.parseOptions(str_array66, (int)(short)0);
    int i78 = outputFormat3.parseOptions(str_array66, (int)'#');
    // The following exception was thrown during execution in test generation
    try {
    int i80 = outputFormat2.parseOptions(str_array66, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\n"+ "'", str17.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "UTF-8"+ "'", str37.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "UTF-8"+ "'", str40.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "\n"+ "'", str57.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 35);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test324"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setNewLineAfterNTags(1);
    outputFormat0.setExpandEmptyElements(true);
    boolean b11 = outputFormat0.isSuppressDeclaration();
    int i12 = outputFormat0.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test325"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setPadText(false);
    outputFormat0.setSuppressDeclaration(true);
    boolean b11 = outputFormat0.isOmitEncoding();
    boolean b12 = outputFormat0.isPadText();
    outputFormat0.setPadText(false);
    outputFormat0.setLineSeparator("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test326"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    outputFormat3.setNewlines(true);
    outputFormat3.setPadText(true);
    outputFormat3.setXHTML(true);
    outputFormat3.setIndentSize((int)(short)1);
    outputFormat3.setIndent(true);
    outputFormat3.setPadText(true);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test327"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    outputFormat2.setNewLineAfterNTags((int)(byte)-1);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test328"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setIndent("  ");
    boolean b3 = outputFormat0.isOmitEncoding();
    outputFormat0.setOmitEncoding(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test329"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    boolean b5 = outputFormat0.isOmitEncoding();
    boolean b6 = outputFormat0.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test330"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    outputFormat3.setNewlines(true);
    outputFormat3.setPadText(true);
    outputFormat3.setNewLineAfterDeclaration(false);
    outputFormat3.setNewlines(true);
    boolean b14 = outputFormat3.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test331"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    OutputFormat outputFormat4 = OutputFormat.createCompactFormat();
    java.lang.String str5 = outputFormat4.getLineSeparator();
    java.lang.String[] str_array9 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i11 = outputFormat4.parseOptions(str_array9, (int)' ');
    int i13 = outputFormat3.parseOptions(str_array9, (int)(short)0);
    outputFormat3.setOmitEncoding(true);
    boolean b16 = outputFormat3.isOmitEncoding();
    outputFormat3.setIndent("hi!");
    outputFormat3.setXHTML(true);
    
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

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test332"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    boolean b10 = outputFormat0.isOmitEncoding();
    outputFormat0.setOmitEncoding(true);
    outputFormat0.setPadText(false);
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
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test333"); }


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
    boolean b15 = outputFormat0.isTrimText();
    outputFormat0.setTrimText(false);
    
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
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test334"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setIndentSize((int)(short)1);
    java.lang.String str9 = outputFormat0.getLineSeparator();
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setTrimText(false);
    outputFormat0.setNewlines(true);
    outputFormat0.setOmitEncoding(true);
    outputFormat0.setEncoding("                                                                                                    ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n"+ "'", str9.equals("\n"));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test335"); }


    OutputFormat outputFormat3 = new OutputFormat("UTF-8", true, "                                  ");
    outputFormat3.setXHTML(true);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test336"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b5 = outputFormat0.isTrimText();
    outputFormat0.setXHTML(false);
    outputFormat0.setIndent(false);
    outputFormat0.setTrimText(false);
    outputFormat0.setOmitEncoding(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test337"); }


    OutputFormat outputFormat1 = new OutputFormat("");
    java.lang.String str2 = outputFormat1.getIndent();
    outputFormat1.setNewlines(false);
    outputFormat1.setPadText(true);
    java.lang.String str7 = outputFormat1.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test338"); }


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
    outputFormat0.setExpandEmptyElements(true);
    boolean b26 = outputFormat0.isXHTML();
    boolean b27 = outputFormat0.isOmitEncoding();
    
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
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test339"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setIndent(false);
    int i11 = outputFormat0.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test340"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setExpandEmptyElements(true);
    outputFormat1.setNewlines(true);
    outputFormat1.setOmitEncoding(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test341"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    boolean b4 = outputFormat3.isOmitEncoding();
    outputFormat3.setIndent(true);
    outputFormat3.setNewLineAfterDeclaration(false);
    java.lang.String str9 = outputFormat3.getLineSeparator();
    boolean b10 = outputFormat3.isExpandEmptyElements();
    java.lang.String str11 = outputFormat3.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n"+ "'", str9.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n"+ "'", str11.equals("\n"));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test342"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    boolean b8 = outputFormat1.isXHTML();
    boolean b9 = outputFormat1.isTrimText();
    outputFormat1.setXHTML(true);
    boolean b12 = outputFormat1.isTrimText();
    outputFormat1.setIndent(true);
    
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
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test343"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    boolean b10 = outputFormat0.isTrimText();
    outputFormat0.setLineSeparator("  ");
    java.lang.String str13 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(true);
    outputFormat0.setLineSeparator("                                  ");
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "  "+ "'", str13.equals("  "));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test344"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    outputFormat0.setEncoding("hi!");
    outputFormat0.setEncoding("                                  ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test345"); }


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
    boolean b16 = outputFormat0.isNewlines();
    outputFormat0.setIndent("                                                                                                    ");
    
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
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test346"); }


    OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
    outputFormat0.setLineSeparator("");
    char char3 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setExpandEmptyElements(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char3 == '\"');

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test347"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isXHTML();
    boolean b6 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewLineAfterNTags((int)(short)100);
    outputFormat0.setIndent(true);
    outputFormat0.setIndent("");
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
    int i34 = outputFormat0.parseOptions(str_array28, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
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
    org.junit.Assert.assertTrue(i34 == 0);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test348"); }


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
    boolean b32 = outputFormat0.isOmitEncoding();
    outputFormat0.setIndent(false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test349"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    java.lang.String str5 = outputFormat0.getIndent();
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setTrimText(true);
    outputFormat0.setSuppressDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "UTF-8"+ "'", str5.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test350"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setIndentSize((int)(short)100);
    outputFormat0.setPadText(true);
    outputFormat0.setNewlines(true);
    boolean b12 = outputFormat0.isPadText();
    boolean b13 = outputFormat0.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test351"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    boolean b4 = outputFormat3.isOmitEncoding();
    java.lang.String str5 = outputFormat3.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n"+ "'", str5.equals("\n"));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test352"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setExpandEmptyElements(true);
    outputFormat1.setXHTML(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test353"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    boolean b8 = outputFormat1.isXHTML();
    boolean b9 = outputFormat1.isTrimText();
    outputFormat1.setIndent(true);
    outputFormat1.setXHTML(true);
    outputFormat1.setNewLineAfterNTags((int)(byte)0);
    
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
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test354"); }


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
    boolean b16 = outputFormat0.isNewlines();
    char char17 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setLineSeparator("                                                                                                    ");
    
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
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char17 == '\"');

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test355"); }


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
    outputFormat0.setOmitEncoding(true);
    
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
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test356"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
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

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test357"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    java.lang.String str5 = outputFormat0.getLineSeparator();
    outputFormat0.setIndent(true);
    outputFormat0.setIndent("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n"+ "'", str5.equals("\n"));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test358"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    outputFormat2.setPadText(false);
    char char5 = outputFormat2.getAttributeQuoteCharacter();
    int i6 = outputFormat2.getNewLineAfterNTags();
    outputFormat2.setNewLineAfterDeclaration(false);
    outputFormat2.setIndent("UTF-8");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char5 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test359"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    boolean b9 = outputFormat0.isOmitEncoding();
    boolean b10 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize(0);
    
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
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test360"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setLineSeparator("  ");
    boolean b12 = outputFormat1.isXHTML();
    outputFormat1.setTrimText(true);
    boolean b15 = outputFormat1.isOmitEncoding();
    outputFormat1.setIndent(false);
    outputFormat1.setIndent("                                  ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test361"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)1);
    java.lang.String str11 = outputFormat0.getEncoding();
    boolean b12 = outputFormat0.isNewlines();
    outputFormat0.setNewLineAfterNTags((int)(byte)100);
    outputFormat0.setNewLineAfterNTags((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "UTF-8"+ "'", str11.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test362"); }


    OutputFormat outputFormat2 = new OutputFormat("", true);
    outputFormat2.setEncoding("");
    outputFormat2.setOmitEncoding(true);
    outputFormat2.setExpandEmptyElements(false);
    outputFormat2.setXHTML(true);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test363"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    OutputFormat outputFormat4 = OutputFormat.createCompactFormat();
    java.lang.String str5 = outputFormat4.getLineSeparator();
    java.lang.String[] str_array9 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i11 = outputFormat4.parseOptions(str_array9, (int)' ');
    int i13 = outputFormat3.parseOptions(str_array9, (int)(short)0);
    outputFormat3.setOmitEncoding(true);
    outputFormat3.setTrimText(true);
    outputFormat3.setNewlines(true);
    OutputFormat outputFormat20 = OutputFormat.createCompactFormat();
    outputFormat20.setNewlines(false);
    boolean b23 = outputFormat20.isNewLineAfterDeclaration();
    outputFormat20.setXHTML(true);
    outputFormat20.setTrimText(true);
    outputFormat20.setNewlines(false);
    OutputFormat outputFormat31 = new OutputFormat("hi!");
    boolean b32 = outputFormat31.isOmitEncoding();
    java.lang.String[] str_array35 = new java.lang.String[] { "", "\n" };
    int i37 = outputFormat31.parseOptions(str_array35, (int)(byte)1);
    int i39 = outputFormat20.parseOptions(str_array35, (int)'4');
    // The following exception was thrown during execution in test generation
    try {
    int i41 = outputFormat3.parseOptions(str_array35, (int)(short)-1);
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n"+ "'", str5.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 52);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test364"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    outputFormat1.setIndent(true);
    outputFormat1.setNewLineAfterDeclaration(false);
    boolean b6 = outputFormat1.isXHTML();
    boolean b7 = outputFormat1.isSuppressDeclaration();
    java.lang.String str8 = outputFormat1.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UTF-8"+ "'", str8.equals("UTF-8"));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test365"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    boolean b4 = outputFormat3.isOmitEncoding();
    outputFormat3.setIndent(true);
    OutputFormat outputFormat7 = OutputFormat.createCompactFormat();
    outputFormat7.setNewlines(false);
    outputFormat7.setXHTML(false);
    outputFormat7.setIndentSize((int)(short)0);
    outputFormat7.setEncoding("");
    java.lang.String str16 = outputFormat7.getEncoding();
    outputFormat7.setIndent(false);
    outputFormat7.setNewLineAfterNTags((int)(byte)-1);
    java.lang.String[] str_array26 = new java.lang.String[] { "          ", "UTF-8", "          ", "", "UTF-8" };
    int i28 = outputFormat7.parseOptions(str_array26, (int)(byte)0);
    int i30 = outputFormat3.parseOptions(str_array26, 52);
    boolean b31 = outputFormat3.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test366"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b5 = outputFormat0.isTrimText();
    outputFormat0.setXHTML(false);
    outputFormat0.setIndent(false);
    outputFormat0.setTrimText(false);
    java.lang.String str12 = outputFormat0.getLineSeparator();
    outputFormat0.setLineSeparator("\n");
    outputFormat0.setIndentSize((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test367"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    boolean b9 = outputFormat0.isOmitEncoding();
    boolean b10 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setPadText(true);
    outputFormat0.setIndent("          ");
    
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
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test368"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isExpandEmptyElements();
    outputFormat1.setIndent(true);
    outputFormat1.setXHTML(false);
    boolean b8 = outputFormat1.isNewlines();
    outputFormat1.setNewLineAfterNTags(32);
    boolean b11 = outputFormat1.isSuppressDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test369"); }


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
    outputFormat0.setIndentSize((int)(byte)-1);
    
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

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test370"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    java.lang.String str3 = outputFormat0.getEncoding();
    outputFormat0.setIndentSize(10);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getLineSeparator();
    boolean b8 = outputFormat0.isSuppressDeclaration();
    
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

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test371"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    outputFormat2.setIndent(true);
    java.lang.String str5 = outputFormat2.getIndent();
    outputFormat2.setTrimText(false);
    OutputFormat outputFormat8 = OutputFormat.createCompactFormat();
    java.lang.String str9 = outputFormat8.getLineSeparator();
    java.lang.String[] str_array13 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i15 = outputFormat8.parseOptions(str_array13, (int)' ');
    int i17 = outputFormat2.parseOptions(str_array13, (int)(short)100);
    outputFormat2.setSuppressDeclaration(false);
    outputFormat2.setSuppressDeclaration(true);
    outputFormat2.setNewLineAfterDeclaration(false);
    java.lang.String str24 = outputFormat2.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "  "+ "'", str5.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n"+ "'", str9.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "UTF-8"+ "'", str24.equals("UTF-8"));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test372"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setNewlines(true);
    outputFormat1.setSuppressDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test373"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    boolean b5 = outputFormat1.isPadText();
    outputFormat1.setExpandEmptyElements(false);
    boolean b8 = outputFormat1.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test374"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setIndentSize((int)(short)100);
    java.lang.String str8 = outputFormat0.getEncoding();
    outputFormat0.setExpandEmptyElements(false);
    outputFormat0.setSuppressDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UTF-8"+ "'", str8.equals("UTF-8"));

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test375"); }


    OutputFormat outputFormat3 = new OutputFormat("                                  ", true, "");
    outputFormat3.setIndent("");
    int i6 = outputFormat3.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test376"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    boolean b10 = outputFormat0.isTrimText();
    outputFormat0.setIndent(false);
    boolean b13 = outputFormat0.isNewlines();
    outputFormat0.setLineSeparator("UTF-8");
    outputFormat0.setExpandEmptyElements(true);
    
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
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test377"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isXHTML();
    boolean b6 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewLineAfterNTags((int)(short)100);
    boolean b9 = outputFormat0.isTrimText();
    java.lang.String str10 = outputFormat0.getIndent();
    char char11 = outputFormat0.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char11 == '\"');

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test378"); }


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
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setIndent("          ");
    
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
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test379"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    outputFormat0.setIndentSize((int)'\"');
    outputFormat0.setIndentSize(1);
    outputFormat0.setPadText(true);
    boolean b10 = outputFormat0.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test380"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", false, "\n");
    boolean b4 = outputFormat3.isTrimText();
    boolean b5 = outputFormat3.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test381"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isXHTML();
    boolean b6 = outputFormat0.isOmitEncoding();
    outputFormat0.setXHTML(true);
    outputFormat0.setOmitEncoding(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test382"); }


    OutputFormat outputFormat3 = new OutputFormat("", true, "UTF-8");
    outputFormat3.setNewlines(false);
    boolean b6 = outputFormat3.isNewlines();
    boolean b7 = outputFormat3.isNewLineAfterDeclaration();
    outputFormat3.setTrimText(false);
    outputFormat3.setNewlines(false);
    int i12 = outputFormat3.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test383"); }


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
    boolean b17 = outputFormat0.isNewlines();
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
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test384"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    outputFormat2.setIndent(true);
    java.lang.String str5 = outputFormat2.getIndent();
    outputFormat2.setTrimText(false);
    OutputFormat outputFormat8 = OutputFormat.createCompactFormat();
    java.lang.String str9 = outputFormat8.getLineSeparator();
    java.lang.String[] str_array13 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i15 = outputFormat8.parseOptions(str_array13, (int)' ');
    int i17 = outputFormat2.parseOptions(str_array13, (int)(short)100);
    outputFormat2.setSuppressDeclaration(false);
    outputFormat2.setSuppressDeclaration(true);
    boolean b22 = outputFormat2.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "  "+ "'", str5.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n"+ "'", str9.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test385"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    java.lang.String str5 = outputFormat0.getIndent();
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setNewlines(false);
    outputFormat0.setPadText(true);
    outputFormat0.setSuppressDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "UTF-8"+ "'", str5.equals("UTF-8"));

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test386"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    outputFormat2.setIndent(true);
    java.lang.String str5 = outputFormat2.getIndent();
    boolean b6 = outputFormat2.isExpandEmptyElements();
    boolean b7 = outputFormat2.isTrimText();
    outputFormat2.setIndent("                                  ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "  "+ "'", str5.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test387"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    boolean b1 = outputFormat0.isTrimText();
    boolean b2 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setSuppressDeclaration(true);
    int i5 = outputFormat0.getNewLineAfterNTags();
    boolean b6 = outputFormat0.isExpandEmptyElements();
    boolean b7 = outputFormat0.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
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
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test388"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setNewLineAfterNTags(1);
    boolean b9 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setEncoding("  ");
    java.lang.String str12 = outputFormat0.getLineSeparator();
    outputFormat0.setNewLineAfterNTags((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test389"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setOmitEncoding(false);
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

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test390"); }


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
    outputFormat0.setNewLineAfterNTags((int)(short)-1);
    java.lang.String str20 = outputFormat0.getIndent();
    
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
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test391"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    outputFormat1.setExpandEmptyElements(true);
    outputFormat1.setEncoding("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test392"); }


    OutputFormat outputFormat2 = new OutputFormat("  ", true);
    outputFormat2.setNewlines(true);
    java.lang.String str5 = outputFormat2.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n"+ "'", str5.equals("\n"));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test393"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setNewlines(false);
    outputFormat0.setPadText(true);
    outputFormat0.setExpandEmptyElements(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test394"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    outputFormat1.setPadText(true);
    outputFormat1.setIndentSize(97);
    outputFormat1.setPadText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test395"); }


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
    OutputFormat outputFormat20 = OutputFormat.createCompactFormat();
    outputFormat20.setNewlines(false);
    boolean b23 = outputFormat20.isNewLineAfterDeclaration();
    outputFormat20.setNewlines(true);
    int i26 = outputFormat20.getNewLineAfterNTags();
    outputFormat20.setXHTML(false);
    outputFormat20.setIndentSize((int)(short)1);
    java.lang.String str31 = outputFormat20.getEncoding();
    boolean b32 = outputFormat20.isNewlines();
    OutputFormat outputFormat33 = OutputFormat.createCompactFormat();
    outputFormat33.setNewlines(false);
    boolean b36 = outputFormat33.isNewLineAfterDeclaration();
    OutputFormat outputFormat37 = OutputFormat.createCompactFormat();
    outputFormat37.setNewlines(false);
    boolean b40 = outputFormat37.isNewLineAfterDeclaration();
    outputFormat37.setNewlines(true);
    outputFormat37.setExpandEmptyElements(true);
    java.lang.String str45 = outputFormat37.getLineSeparator();
    outputFormat37.setNewlines(false);
    java.lang.String str48 = outputFormat37.getIndent();
    OutputFormat outputFormat50 = new OutputFormat("hi!");
    boolean b51 = outputFormat50.isOmitEncoding();
    java.lang.String[] str_array54 = new java.lang.String[] { "", "\n" };
    int i56 = outputFormat50.parseOptions(str_array54, (int)(byte)1);
    int i58 = outputFormat37.parseOptions(str_array54, (int)'a');
    int i60 = outputFormat33.parseOptions(str_array54, 32);
    int i62 = outputFormat20.parseOptions(str_array54, (int)(short)100);
    int i64 = outputFormat1.parseOptions(str_array54, 100);
    
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
    org.junit.Assert.assertNotNull(outputFormat20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "UTF-8"+ "'", str31.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "\n"+ "'", str45.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 100);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test396"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    java.lang.String str5 = outputFormat0.getIndent();
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setNewlines(false);
    char char10 = outputFormat0.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "UTF-8"+ "'", str5.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char10 == '\"');

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test397"); }


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
    java.lang.String str34 = outputFormat2.getEncoding();
    
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
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "UTF-8"+ "'", str34.equals("UTF-8"));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test398"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getLineSeparator();
    boolean b12 = outputFormat0.isTrimText();
    boolean b13 = outputFormat0.isXHTML();
    
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
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test399"); }


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
    boolean b17 = outputFormat1.isTrimText();
    
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
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test400"); }


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
    outputFormat0.setOmitEncoding(true);
    outputFormat0.setXHTML(true);
    boolean b39 = outputFormat0.isNewLineAfterDeclaration();
    
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
    org.junit.Assert.assertTrue(b39 == true);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test401"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setNewlines(true);
    java.lang.String str13 = outputFormat0.getLineSeparator();
    boolean b14 = outputFormat0.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\n"+ "'", str13.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test402"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getLineSeparator();
    boolean b12 = outputFormat0.isTrimText();
    outputFormat0.setNewLineAfterDeclaration(true);
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
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n"+ "'", str11.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test403"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("  ");
    outputFormat0.setXHTML(false);
    int i15 = outputFormat0.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test404"); }


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
    outputFormat3.setNewLineAfterDeclaration(false);
    outputFormat3.setNewLineAfterDeclaration(true);
    boolean b40 = outputFormat3.isExpandEmptyElements();
    
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
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test405"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setIndent(false);
    boolean b9 = outputFormat1.isPadText();
    boolean b10 = outputFormat1.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test406"); }


    OutputFormat outputFormat2 = new OutputFormat("\n", true);
    boolean b3 = outputFormat2.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test407"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    outputFormat0.setXHTML(false);
    java.lang.String str9 = outputFormat0.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UTF-8"+ "'", str9.equals("UTF-8"));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test408"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)0);
    outputFormat0.setEncoding("");
    outputFormat0.setEncoding("");
    boolean b11 = outputFormat0.isTrimText();
    java.lang.String str12 = outputFormat0.getEncoding();
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
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test409"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    java.lang.String str5 = outputFormat0.getLineSeparator();
    boolean b6 = outputFormat0.isExpandEmptyElements();
    boolean b7 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setIndent("          ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n"+ "'", str5.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test410"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(true);
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setTrimText(true);
    boolean b12 = outputFormat0.isPadText();
    outputFormat0.setPadText(true);
    boolean b15 = outputFormat0.isExpandEmptyElements();
    boolean b16 = outputFormat0.isXHTML();
    outputFormat0.setNewlines(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test411"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setExpandEmptyElements(true);
    outputFormat1.setNewlines(true);
    outputFormat1.setNewLineAfterNTags((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test412"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", true, "  ");
    outputFormat3.setIndent(true);
    outputFormat3.setNewLineAfterDeclaration(false);
    outputFormat3.setExpandEmptyElements(false);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test413"); }


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
    outputFormat0.setTrimText(true);
    boolean b19 = outputFormat0.isPadText();
    
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
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test414"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    int i6 = outputFormat1.getNewLineAfterNTags();
    boolean b7 = outputFormat1.isNewLineAfterDeclaration();
    boolean b8 = outputFormat1.isXHTML();
    outputFormat1.setNewLineAfterNTags(0);
    OutputFormat outputFormat14 = new OutputFormat("", false, "");
    OutputFormat outputFormat15 = OutputFormat.createCompactFormat();
    java.lang.String str16 = outputFormat15.getLineSeparator();
    java.lang.String[] str_array20 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i22 = outputFormat15.parseOptions(str_array20, (int)' ');
    int i24 = outputFormat14.parseOptions(str_array20, (int)(short)0);
    outputFormat14.setOmitEncoding(true);
    boolean b27 = outputFormat14.isOmitEncoding();
    OutputFormat outputFormat29 = new OutputFormat("hi!");
    outputFormat29.setIndent(true);
    outputFormat29.setEncoding("");
    OutputFormat outputFormat34 = OutputFormat.createCompactFormat();
    outputFormat34.setNewlines(false);
    boolean b37 = outputFormat34.isNewLineAfterDeclaration();
    outputFormat34.setNewlines(true);
    outputFormat34.setExpandEmptyElements(true);
    java.lang.String str42 = outputFormat34.getLineSeparator();
    outputFormat34.setNewlines(false);
    outputFormat34.setXHTML(false);
    outputFormat34.setPadText(false);
    OutputFormat outputFormat49 = OutputFormat.createCompactFormat();
    outputFormat49.setNewlines(false);
    boolean b52 = outputFormat49.isNewLineAfterDeclaration();
    outputFormat49.setNewlines(true);
    outputFormat49.setExpandEmptyElements(true);
    java.lang.String str57 = outputFormat49.getLineSeparator();
    outputFormat49.setNewlines(false);
    OutputFormat outputFormat60 = OutputFormat.createCompactFormat();
    java.lang.String str61 = outputFormat60.getLineSeparator();
    java.lang.String[] str_array65 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i67 = outputFormat60.parseOptions(str_array65, (int)' ');
    int i69 = outputFormat49.parseOptions(str_array65, (int)' ');
    int i71 = outputFormat34.parseOptions(str_array65, (int)' ');
    int i73 = outputFormat29.parseOptions(str_array65, 100);
    int i75 = outputFormat14.parseOptions(str_array65, (int)(short)1);
    int i77 = outputFormat1.parseOptions(str_array65, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\n"+ "'", str16.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "\n"+ "'", str42.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "\n"+ "'", str57.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "\n"+ "'", str61.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 35);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test415"); }


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
    outputFormat1.setExpandEmptyElements(true);
    
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

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test416"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setLineSeparator("  ");
    outputFormat1.setPadText(true);
    outputFormat1.setPadText(false);
    outputFormat1.setIndent("\n");
    java.lang.String str18 = outputFormat1.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\n"+ "'", str18.equals("\n"));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test417"); }


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
    outputFormat0.setOmitEncoding(false);
    
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

}
