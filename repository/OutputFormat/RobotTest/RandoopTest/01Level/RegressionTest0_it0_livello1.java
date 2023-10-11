
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
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

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b5 = outputFormat0.isTrimText();
    outputFormat0.setIndent("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setEncoding("");
    boolean b5 = outputFormat1.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


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
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setIndentSize((int)(short)1);
    boolean b9 = outputFormat0.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    java.lang.String str6 = outputFormat3.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setTrimText(false);
    OutputFormat outputFormat9 = OutputFormat.createCompactFormat();
    outputFormat9.setNewlines(false);
    boolean b12 = outputFormat9.isNewLineAfterDeclaration();
    OutputFormat outputFormat13 = OutputFormat.createCompactFormat();
    outputFormat13.setNewlines(false);
    boolean b16 = outputFormat13.isNewLineAfterDeclaration();
    outputFormat13.setNewlines(true);
    outputFormat13.setExpandEmptyElements(true);
    java.lang.String str21 = outputFormat13.getLineSeparator();
    outputFormat13.setNewlines(false);
    java.lang.String str24 = outputFormat13.getIndent();
    OutputFormat outputFormat26 = new OutputFormat("hi!");
    boolean b27 = outputFormat26.isOmitEncoding();
    java.lang.String[] str_array30 = new java.lang.String[] { "", "\n" };
    int i32 = outputFormat26.parseOptions(str_array30, (int)(byte)1);
    int i34 = outputFormat13.parseOptions(str_array30, (int)'a');
    int i36 = outputFormat9.parseOptions(str_array30, 32);
    // The following exception was thrown during execution in test generation
    try {
    int i38 = outputFormat0.parseOptions(str_array30, (int)(short)-1);
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
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\n"+ "'", str21.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 32);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    boolean b1 = outputFormat0.isTrimText();
    boolean b2 = outputFormat0.isSuppressDeclaration();
    // The following exception was thrown during execution in test generation
    try {
    outputFormat0.setAttributeQuoteCharacter(' ');
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
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    boolean b8 = outputFormat1.isOmitEncoding();
    
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
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    java.lang.String str5 = outputFormat0.getIndent();
    outputFormat0.setLineSeparator("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    outputFormat1.setPadText(true);
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

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    boolean b9 = outputFormat0.isOmitEncoding();
    boolean b10 = outputFormat0.isNewLineAfterDeclaration();
    boolean b11 = outputFormat0.isOmitEncoding();
    
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
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setNewlines(true);
    outputFormat1.setNewLineAfterDeclaration(true);
    outputFormat1.setPadText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    int i3 = outputFormat0.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    boolean b3 = outputFormat2.isPadText();
    int i4 = outputFormat2.getNewLineAfterNTags();
    outputFormat2.setNewLineAfterDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
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

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("\n");
    java.lang.String str10 = outputFormat1.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "UTF-8"+ "'", str10.equals("UTF-8"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    boolean b13 = outputFormat0.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    java.lang.String str5 = outputFormat0.getIndent();
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setXHTML(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "UTF-8"+ "'", str5.equals("UTF-8"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    boolean b7 = outputFormat1.isNewLineAfterDeclaration();
    java.lang.String str8 = outputFormat1.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    OutputFormat outputFormat2 = new OutputFormat("\n", false);
    outputFormat2.setPadText(false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    int i6 = outputFormat1.getNewLineAfterNTags();
    char char7 = outputFormat1.getAttributeQuoteCharacter();
    outputFormat1.setExpandEmptyElements(true);
    
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
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    boolean b4 = outputFormat1.isTrimText();
    outputFormat1.setNewLineAfterNTags((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setExpandEmptyElements(false);
    boolean b12 = outputFormat1.isSuppressDeclaration();
    
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
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    java.lang.String[] str_array3 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i5 = outputFormat2.parseOptions(str_array3, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isExpandEmptyElements();
    int i4 = outputFormat1.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    java.lang.String str5 = outputFormat0.getIndent();
    outputFormat0.setNewlines(false);
    boolean b8 = outputFormat0.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "UTF-8"+ "'", str5.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    java.lang.String str5 = outputFormat0.getLineSeparator();
    outputFormat0.setIndent(true);
    outputFormat0.setExpandEmptyElements(false);
    java.lang.String str10 = outputFormat0.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n"+ "'", str5.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "  "+ "'", str10.equals("  "));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    boolean b6 = outputFormat3.isNewLineAfterDeclaration();
    outputFormat3.setPadText(true);
    outputFormat3.setNewlines(false);
    boolean b11 = outputFormat3.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    OutputFormat outputFormat3 = new OutputFormat("", true, "hi!");

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    java.lang.String str10 = outputFormat0.getEncoding();
    outputFormat0.setTrimText(true);
    outputFormat0.setTrimText(true);
    
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
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    char char2 = outputFormat1.getAttributeQuoteCharacter();
    java.lang.String str3 = outputFormat1.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char2 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8"+ "'", str3.equals("UTF-8"));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", true, "hi!");
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
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isExpandEmptyElements();
    boolean b8 = outputFormat0.isPadText();
    boolean b9 = outputFormat0.isTrimText();
    
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
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    java.lang.String str6 = outputFormat1.getIndent();
    boolean b7 = outputFormat1.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setTrimText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(true);
    outputFormat0.setNewlines(false);
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
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setNewLineAfterNTags(1);
    outputFormat0.setExpandEmptyElements(true);
    boolean b11 = outputFormat0.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isExpandEmptyElements();
    java.lang.String str4 = outputFormat1.getIndent();
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
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("\n");
    boolean b10 = outputFormat1.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setNewlines(true);
    boolean b13 = outputFormat0.isNewLineAfterDeclaration();
    OutputFormat outputFormat14 = OutputFormat.createCompactFormat();
    outputFormat14.setNewlines(false);
    boolean b17 = outputFormat14.isNewLineAfterDeclaration();
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
    int i41 = outputFormat14.parseOptions(str_array35, 32);
    // The following exception was thrown during execution in test generation
    try {
    int i43 = outputFormat0.parseOptions(str_array35, (int)(byte)-1);
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
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
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
    org.junit.Assert.assertTrue(i41 == 32);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


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
    outputFormat0.setLineSeparator("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setNewlines(true);
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
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    OutputFormat outputFormat1 = new OutputFormat("\n");
    java.lang.String str2 = outputFormat1.getLineSeparator();
    boolean b3 = outputFormat1.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n"+ "'", str2.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setNewLineAfterDeclaration(true);
    boolean b12 = outputFormat1.isOmitEncoding();
    
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
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    boolean b10 = outputFormat1.isPadText();
    boolean b11 = outputFormat1.isOmitEncoding();
    int i12 = outputFormat1.getNewLineAfterNTags();
    
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
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    outputFormat0.setIndentSize((int)'\"');
    outputFormat0.setIndentSize(1);
    outputFormat0.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    boolean b6 = outputFormat3.isNewLineAfterDeclaration();
    outputFormat3.setIndentSize((int)(short)-1);
    outputFormat3.setLineSeparator("\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


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
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    outputFormat1.setIndent("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    OutputFormat outputFormat3 = new OutputFormat("", true, "  ");
    outputFormat3.setLineSeparator("\n");
    boolean b6 = outputFormat3.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setEncoding("hi!");
    outputFormat0.setExpandEmptyElements(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    char char2 = outputFormat1.getAttributeQuoteCharacter();
    int i3 = outputFormat1.getNewLineAfterNTags();
    boolean b4 = outputFormat1.isOmitEncoding();
    outputFormat1.setSuppressDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char2 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setLineSeparator("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    boolean b3 = outputFormat2.isPadText();
    int i4 = outputFormat2.getNewLineAfterNTags();
    boolean b5 = outputFormat2.isExpandEmptyElements();
    boolean b6 = outputFormat2.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndentSize((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    java.lang.String str3 = outputFormat1.getIndent();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isXHTML();
    outputFormat1.setExpandEmptyElements(true);
    outputFormat1.setNewlines(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", true, "");
    outputFormat3.setLineSeparator("  ");

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setPadText(false);
    // The following exception was thrown during execution in test generation
    try {
    outputFormat0.setAttributeQuoteCharacter(' ');
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

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    outputFormat1.setIndent(true);
    boolean b4 = outputFormat1.isNewLineAfterDeclaration();
    boolean b5 = outputFormat1.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    boolean b8 = outputFormat1.isXHTML();
    boolean b9 = outputFormat1.isTrimText();
    outputFormat1.setXHTML(true);
    boolean b12 = outputFormat1.isExpandEmptyElements();
    outputFormat1.setSuppressDeclaration(true);
    
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
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    OutputFormat outputFormat1 = new OutputFormat("UTF-8");
    outputFormat1.setIndent(true);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", false, "\n");
    outputFormat3.setTrimText(true);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    java.lang.String str12 = outputFormat0.getLineSeparator();
    boolean b13 = outputFormat0.isNewLineAfterDeclaration();
    char char14 = outputFormat0.getAttributeQuoteCharacter();
    
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
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char14 == '\"');

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    outputFormat1.setIndent("");
    outputFormat1.setSuppressDeclaration(false);
    outputFormat1.setPadText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("\n");
    boolean b10 = outputFormat1.isTrimText();
    outputFormat1.setPadText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    outputFormat2.setNewLineAfterDeclaration(true);
    outputFormat2.setIndent("UTF-8");

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    char char7 = outputFormat0.getAttributeQuoteCharacter();
    boolean b8 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setPadText(false);
    java.lang.String str11 = outputFormat0.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "UTF-8"+ "'", str11.equals("UTF-8"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setIndent("");
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    OutputFormat outputFormat3 = new OutputFormat("  ", true, "UTF-8");
    outputFormat3.setTrimText(false);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndent(false);
    outputFormat0.setExpandEmptyElements(true);
    boolean b15 = outputFormat0.isExpandEmptyElements();
    
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
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


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
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isXHTML();
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\n"+ "'", str7.equals("\n"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


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
    java.lang.String str21 = outputFormat0.getIndent();
    
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
    org.junit.Assert.assertNull(str21);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setLineSeparator("  ");
    outputFormat1.setPadText(true);
    outputFormat1.setPadText(false);
    outputFormat1.setNewLineAfterDeclaration(true);
    boolean b18 = outputFormat1.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setNewlines(true);
    outputFormat0.setTrimText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setLineSeparator("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b5 = outputFormat0.isTrimText();
    outputFormat0.setOmitEncoding(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    OutputFormat outputFormat4 = OutputFormat.createCompactFormat();
    java.lang.String str5 = outputFormat4.getLineSeparator();
    java.lang.String[] str_array9 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i11 = outputFormat4.parseOptions(str_array9, (int)' ');
    int i13 = outputFormat3.parseOptions(str_array9, (int)(short)0);
    outputFormat3.setOmitEncoding(true);
    outputFormat3.setTrimText(true);
    boolean b18 = outputFormat3.isPadText();
    
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
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    OutputFormat outputFormat3 = new OutputFormat("UTF-8", false, "UTF-8");

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setTrimText(false);
    outputFormat0.setIndent(false);
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setEncoding("hi!");
    boolean b15 = outputFormat0.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndent("\n");
    outputFormat0.setExpandEmptyElements(false);
    boolean b9 = outputFormat0.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setLineSeparator("hi!");
    boolean b9 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setNewLineAfterDeclaration(true);
    
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
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


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
    java.lang.String[] str_array33 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i35 = outputFormat3.parseOptions(str_array33, 34);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
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

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


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
    boolean b28 = outputFormat0.isNewLineAfterDeclaration();
    
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
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    outputFormat2.setIndent(true);
    boolean b5 = outputFormat2.isOmitEncoding();
    boolean b6 = outputFormat2.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    
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
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    outputFormat0.setNewLineAfterNTags((int)'a');
    boolean b6 = outputFormat0.isOmitEncoding();
    outputFormat0.setIndentSize(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", true, "  ");

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    boolean b9 = outputFormat0.isOmitEncoding();
    boolean b10 = outputFormat0.isTrimText();
    outputFormat0.setAttributeQuoteCharacter('\"');
    outputFormat0.setNewLineAfterNTags(52);
    
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
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    outputFormat1.setIndent("");
    outputFormat1.setXHTML(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    boolean b6 = outputFormat3.isTrimText();
    outputFormat3.setIndent(true);
    boolean b9 = outputFormat3.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


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
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isExpandEmptyElements();
    boolean b8 = outputFormat0.isPadText();
    boolean b9 = outputFormat0.isExpandEmptyElements();
    
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
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    java.lang.String str6 = outputFormat1.getIndent();
    outputFormat1.setIndent("\n");
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setTrimText(false);
    outputFormat0.setIndent(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(true);
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setTrimText(true);
    boolean b12 = outputFormat0.isOmitEncoding();
    outputFormat0.setIndentSize(10);
    outputFormat0.setTrimText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isXHTML();
    boolean b5 = outputFormat1.isNewlines();
    outputFormat1.setIndentSize((int)(short)100);
    
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
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)1);
    java.lang.String str11 = outputFormat0.getEncoding();
    java.lang.String str12 = outputFormat0.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "UTF-8"+ "'", str11.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    outputFormat1.setLineSeparator("\n");
    boolean b4 = outputFormat1.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setIndent(false);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


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
    // The following exception was thrown during execution in test generation
    try {
    outputFormat1.setAttributeQuoteCharacter('4');
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

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isTrimText();
    outputFormat0.setIndent("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    outputFormat1.setIndent(true);
    outputFormat1.setIndent("hi!");
    outputFormat1.setIndent("UTF-8");

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    OutputFormat outputFormat1 = new OutputFormat("\n");
    boolean b2 = outputFormat1.isTrimText();
    java.lang.String str3 = outputFormat1.getEncoding();
    outputFormat1.setLineSeparator("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8"+ "'", str3.equals("UTF-8"));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    java.lang.String str3 = outputFormat0.getEncoding();
    boolean b4 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setExpandEmptyElements(false);
    boolean b7 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setEncoding("\n");
    
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
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


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
    outputFormat0.setXHTML(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


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
    boolean b36 = outputFormat0.isSuppressDeclaration();
    
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
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    OutputFormat outputFormat4 = OutputFormat.createCompactFormat();
    java.lang.String str5 = outputFormat4.getLineSeparator();
    java.lang.String[] str_array9 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i11 = outputFormat4.parseOptions(str_array9, (int)' ');
    int i13 = outputFormat3.parseOptions(str_array9, (int)(short)0);
    outputFormat3.setOmitEncoding(true);
    outputFormat3.setIndent("");
    
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

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    char char2 = outputFormat1.getAttributeQuoteCharacter();
    int i3 = outputFormat1.getNewLineAfterNTags();
    boolean b4 = outputFormat1.isOmitEncoding();
    java.lang.String str5 = outputFormat1.getEncoding();
    outputFormat1.setXHTML(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char2 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "UTF-8"+ "'", str5.equals("UTF-8"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)1);
    outputFormat0.setIndentSize((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setTrimText(false);
    outputFormat0.setIndent(false);
    boolean b11 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setLineSeparator("hi!");
    outputFormat0.setExpandEmptyElements(true);
    
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
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    boolean b9 = outputFormat0.isOmitEncoding();
    boolean b10 = outputFormat0.isNewLineAfterDeclaration();
    boolean b11 = outputFormat0.isNewLineAfterDeclaration();
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
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setIndent(true);
    boolean b8 = outputFormat0.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setPadText(false);
    outputFormat0.setSuppressDeclaration(true);
    boolean b11 = outputFormat0.isOmitEncoding();
    outputFormat0.setXHTML(false);
    
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
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", false, "\n");
    boolean b4 = outputFormat3.isTrimText();
    outputFormat3.setExpandEmptyElements(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


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
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\n"+ "'", str17.equals("\n"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    OutputFormat outputFormat3 = new OutputFormat("", true, "UTF-8");
    outputFormat3.setNewlines(false);
    boolean b6 = outputFormat3.isPadText();
    int i7 = outputFormat3.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    OutputFormat outputFormat2 = new OutputFormat("UTF-8", true);
    outputFormat2.setIndentSize((int)(short)-1);
    outputFormat2.setTrimText(true);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setXHTML(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


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
    java.lang.String str23 = outputFormat0.getLineSeparator();
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\n"+ "'", str23.equals("\n"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isExpandEmptyElements();
    boolean b8 = outputFormat0.isPadText();
    outputFormat0.setExpandEmptyElements(true);
    
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
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    java.lang.String str3 = outputFormat0.getEncoding();
    boolean b4 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setIndentSize((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8"+ "'", str3.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setTrimText(false);
    java.lang.String str13 = outputFormat0.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setIndentSize((int)(short)1);
    java.lang.String str9 = outputFormat0.getLineSeparator();
    outputFormat0.setNewLineAfterDeclaration(false);
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n"+ "'", str9.equals("\n"));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setAttributeQuoteCharacter('\"');
    outputFormat1.setTrimText(true);
    java.lang.String str12 = outputFormat1.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setPadText(false);
    outputFormat0.setSuppressDeclaration(true);
    boolean b11 = outputFormat0.isOmitEncoding();
    outputFormat0.setIndent("\n");
    java.lang.String str14 = outputFormat0.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "UTF-8"+ "'", str14.equals("UTF-8"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setIndent(true);
    outputFormat0.setPadText(true);
    // The following exception was thrown during execution in test generation
    try {
    outputFormat0.setAttributeQuoteCharacter(' ');
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

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    OutputFormat outputFormat2 = new OutputFormat("", true);
    boolean b3 = outputFormat2.isNewlines();
    boolean b4 = outputFormat2.isExpandEmptyElements();
    int i5 = outputFormat2.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setNewlines(true);
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

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("\n");
    boolean b10 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setLineSeparator("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


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
    outputFormat0.setIndent(true);
    
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
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


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
    java.lang.String str18 = outputFormat0.getLineSeparator();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\n"+ "'", str18.equals("\n"));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    boolean b9 = outputFormat0.isNewlines();
    
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
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)0);
    outputFormat0.setEncoding("");
    java.lang.String str9 = outputFormat0.getEncoding();
    outputFormat0.setTrimText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    boolean b1 = outputFormat0.isTrimText();
    outputFormat0.setPadText(false);
    outputFormat0.setAttributeQuoteCharacter('\"');
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
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    outputFormat0.setNewLineAfterNTags((int)'a');
    boolean b6 = outputFormat0.isOmitEncoding();
    java.lang.String str7 = outputFormat0.getLineSeparator();
    boolean b8 = outputFormat0.isXHTML();
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
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    OutputFormat outputFormat10 = new OutputFormat("", false, "");
    OutputFormat outputFormat11 = OutputFormat.createCompactFormat();
    outputFormat11.setNewlines(false);
    outputFormat11.setNewLineAfterDeclaration(false);
    boolean b16 = outputFormat11.isTrimText();
    boolean b17 = outputFormat11.isPadText();
    OutputFormat outputFormat18 = OutputFormat.createCompactFormat();
    outputFormat18.setNewlines(false);
    boolean b21 = outputFormat18.isNewLineAfterDeclaration();
    outputFormat18.setNewlines(true);
    outputFormat18.setExpandEmptyElements(true);
    java.lang.String str26 = outputFormat18.getLineSeparator();
    outputFormat18.setNewlines(false);
    OutputFormat outputFormat29 = OutputFormat.createCompactFormat();
    java.lang.String str30 = outputFormat29.getLineSeparator();
    java.lang.String[] str_array34 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i36 = outputFormat29.parseOptions(str_array34, (int)' ');
    int i38 = outputFormat18.parseOptions(str_array34, (int)' ');
    int i40 = outputFormat11.parseOptions(str_array34, (int)(short)10);
    int i42 = outputFormat10.parseOptions(str_array34, (int)'\"');
    // The following exception was thrown during execution in test generation
    try {
    int i44 = outputFormat1.parseOptions(str_array34, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "\n"+ "'", str26.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "\n"+ "'", str30.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 34);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    outputFormat0.setExpandEmptyElements(false);
    outputFormat0.setIndent(true);
    
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
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setNewLineAfterNTags((int)(short)100);
    outputFormat0.setNewLineAfterDeclaration(true);
    outputFormat0.setIndent("  ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setIndent("  ");
    boolean b3 = outputFormat0.isOmitEncoding();
    // The following exception was thrown during execution in test generation
    try {
    outputFormat0.setAttributeQuoteCharacter(' ');
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

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "  ");
    boolean b4 = outputFormat3.isExpandEmptyElements();
    boolean b5 = outputFormat3.isSuppressDeclaration();
    outputFormat3.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


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
    boolean b16 = outputFormat0.isSuppressDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    outputFormat2.setPadText(false);
    char char5 = outputFormat2.getAttributeQuoteCharacter();
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
    org.junit.Assert.assertTrue(char5 == '\"');

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isExpandEmptyElements();
    outputFormat1.setIndent(true);
    outputFormat1.setIndent("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    boolean b8 = outputFormat1.isXHTML();
    outputFormat1.setSuppressDeclaration(false);
    
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
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isXHTML();
    int i6 = outputFormat0.getNewLineAfterNTags();
    boolean b7 = outputFormat0.isXHTML();
    boolean b8 = outputFormat0.isPadText();
    
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

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setTrimText(true);
    outputFormat0.setIndent("hi!");
    boolean b9 = outputFormat0.isPadText();
    outputFormat0.setIndent("\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setLineSeparator("  ");
    boolean b12 = outputFormat1.isXHTML();
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
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterNTags((int)(short)10);
    boolean b12 = outputFormat0.isNewlines();
    
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
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    char char7 = outputFormat0.getAttributeQuoteCharacter();
    OutputFormat outputFormat8 = OutputFormat.createCompactFormat();
    outputFormat8.setNewlines(false);
    boolean b11 = outputFormat8.isNewLineAfterDeclaration();
    outputFormat8.setNewlines(true);
    int i14 = outputFormat8.getNewLineAfterNTags();
    outputFormat8.setXHTML(false);
    outputFormat8.setIndentSize((int)(short)1);
    java.lang.String str19 = outputFormat8.getEncoding();
    boolean b20 = outputFormat8.isNewlines();
    OutputFormat outputFormat21 = OutputFormat.createCompactFormat();
    outputFormat21.setNewlines(false);
    boolean b24 = outputFormat21.isNewLineAfterDeclaration();
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
    int i48 = outputFormat21.parseOptions(str_array42, 32);
    int i50 = outputFormat8.parseOptions(str_array42, (int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    int i52 = outputFormat0.parseOptions(str_array42, (int)(short)-1);
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
    org.junit.Assert.assertTrue(char7 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "UTF-8"+ "'", str19.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
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
    org.junit.Assert.assertTrue(i48 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 100);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    boolean b8 = outputFormat1.isXHTML();
    boolean b9 = outputFormat1.isTrimText();
    outputFormat1.setXHTML(true);
    boolean b12 = outputFormat1.isExpandEmptyElements();
    java.lang.String str13 = outputFormat1.getIndent();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)0);
    outputFormat0.setEncoding("");
    outputFormat0.setEncoding("");
    boolean b11 = outputFormat0.isTrimText();
    boolean b12 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setPadText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isXHTML();
    outputFormat1.setExpandEmptyElements(true);
    char char7 = outputFormat1.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setNewLineAfterNTags(1);
    outputFormat0.setXHTML(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    outputFormat0.setIndent(false);
    outputFormat0.setTrimText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    outputFormat1.setIndent("");
    outputFormat1.setSuppressDeclaration(false);
    outputFormat1.setEncoding("UTF-8");
    outputFormat1.setIndent("UTF-8");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setLineSeparator("  ");
    int i12 = outputFormat1.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setNewlines(true);
    outputFormat3.setOmitEncoding(true);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


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
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setTrimText(false);
    outputFormat0.setOmitEncoding(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    outputFormat0.setPadText(true);
    boolean b6 = outputFormat0.isSuppressDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }


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
    boolean b40 = outputFormat0.isSuppressDeclaration();
    
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
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }


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
    boolean b14 = outputFormat0.isNewlines();
    java.lang.String str15 = outputFormat0.getEncoding();
    outputFormat0.setPadText(false);
    
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
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "UTF-8"+ "'", str15.equals("UTF-8"));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    char char2 = outputFormat1.getAttributeQuoteCharacter();
    outputFormat1.setNewLineAfterDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char2 == '\"');

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }


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
    boolean b38 = outputFormat0.isXHTML();
    
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
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }


    OutputFormat outputFormat3 = new OutputFormat("UTF-8", true, "");

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterNTags((int)(short)10);
    boolean b12 = outputFormat0.isSuppressDeclaration();
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
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }


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
    outputFormat0.setNewLineAfterNTags((int)(byte)100);
    outputFormat0.setExpandEmptyElements(false);
    
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
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    boolean b8 = outputFormat1.isXHTML();
    boolean b9 = outputFormat1.isTrimText();
    outputFormat1.setIndent(true);
    outputFormat1.setXHTML(true);
    boolean b14 = outputFormat1.isTrimText();
    
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
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", false, "UTF-8");
    outputFormat3.setLineSeparator("");
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
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isExpandEmptyElements();
    boolean b8 = outputFormat0.isPadText();
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
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setOmitEncoding(false);
    int i9 = outputFormat0.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    char char4 = outputFormat0.getAttributeQuoteCharacter();
    boolean b5 = outputFormat0.isNewlines();
    outputFormat0.setPadText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char4 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setOmitEncoding(true);
    outputFormat0.setOmitEncoding(true);
    outputFormat0.setLineSeparator("\n");
    java.lang.String str16 = outputFormat0.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UTF-8"+ "'", str16.equals("UTF-8"));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndentSize(34);
    boolean b13 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setPadText(true);
    
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
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setNewlines(true);
    outputFormat1.setNewLineAfterDeclaration(true);
    outputFormat1.setNewLineAfterNTags(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setNewLineAfterDeclaration(true);
    outputFormat1.setEncoding("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setTrimText(true);
    boolean b7 = outputFormat0.isNewlines();
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
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndentSize(34);
    char char13 = outputFormat0.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char13 == '\"');

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setEncoding("\n");
    outputFormat1.setNewLineAfterNTags(32);
    boolean b7 = outputFormat1.isNewlines();
    java.lang.String str8 = outputFormat1.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setNewLineAfterNTags(1);
    boolean b9 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setEncoding("  ");
    boolean b12 = outputFormat0.isTrimText();
    boolean b13 = outputFormat0.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    outputFormat0.setNewLineAfterNTags((int)'a');
    boolean b6 = outputFormat0.isOmitEncoding();
    java.lang.String str7 = outputFormat0.getLineSeparator();
    boolean b8 = outputFormat0.isOmitEncoding();
    outputFormat0.setExpandEmptyElements(false);
    
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

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }


    OutputFormat outputFormat1 = new OutputFormat("\n");
    outputFormat1.setPadText(false);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b5 = outputFormat0.isTrimText();
    outputFormat0.setXHTML(false);
    outputFormat0.setIndent(false);
    outputFormat0.setLineSeparator("hi!");
    java.lang.String str12 = outputFormat0.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    int i8 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setEncoding("\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    boolean b3 = outputFormat2.isNewlines();
    outputFormat2.setIndent("UTF-8");
    boolean b6 = outputFormat2.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setAttributeQuoteCharacter('\"');
    outputFormat1.setTrimText(true);
    int i12 = outputFormat1.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    java.lang.String str3 = outputFormat0.getEncoding();
    boolean b4 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setExpandEmptyElements(false);
    java.lang.String str7 = outputFormat0.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8"+ "'", str3.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\n"+ "'", str7.equals("\n"));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    java.lang.String[] str_array6 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i8 = outputFormat1.parseOptions(str_array6, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    boolean b6 = outputFormat3.isTrimText();
    boolean b7 = outputFormat3.isNewLineAfterDeclaration();
    outputFormat3.setEncoding("  ");
    outputFormat3.setXHTML(false);
    outputFormat3.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    boolean b10 = outputFormat0.isTrimText();
    outputFormat0.setIndent(false);
    outputFormat0.setNewlines(false);
    
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
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    java.lang.String str6 = outputFormat1.getLineSeparator();
    char char7 = outputFormat1.getAttributeQuoteCharacter();
    outputFormat1.setIndentSize(10);
    outputFormat1.setIndent(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isTrimText();
    java.lang.String str6 = outputFormat0.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    boolean b9 = outputFormat0.isOmitEncoding();
    
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
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    outputFormat2.setIndent(true);
    java.lang.String str5 = outputFormat2.getIndent();
    outputFormat2.setTrimText(false);
    OutputFormat outputFormat8 = OutputFormat.createCompactFormat();
    java.lang.String str9 = outputFormat8.getLineSeparator();
    java.lang.String[] str_array13 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i15 = outputFormat8.parseOptions(str_array13, (int)' ');
    int i17 = outputFormat2.parseOptions(str_array13, (int)(short)100);
    java.lang.String[] str_array18 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i20 = outputFormat2.parseOptions(str_array18, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
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

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }


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
    java.lang.String str36 = outputFormat3.getIndent();
    
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
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setIndent("");
    // The following exception was thrown during execution in test generation
    try {
    outputFormat0.setAttributeQuoteCharacter(' ');
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
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setIndent("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setNewlines(false);
    boolean b7 = outputFormat1.isXHTML();
    outputFormat1.setIndent("");
    OutputFormat outputFormat10 = OutputFormat.createCompactFormat();
    outputFormat10.setNewlines(false);
    outputFormat10.setNewLineAfterDeclaration(false);
    boolean b15 = outputFormat10.isTrimText();
    boolean b16 = outputFormat10.isPadText();
    OutputFormat outputFormat17 = OutputFormat.createCompactFormat();
    outputFormat17.setNewlines(false);
    boolean b20 = outputFormat17.isNewLineAfterDeclaration();
    outputFormat17.setNewlines(true);
    outputFormat17.setExpandEmptyElements(true);
    java.lang.String str25 = outputFormat17.getLineSeparator();
    outputFormat17.setNewlines(false);
    OutputFormat outputFormat28 = OutputFormat.createCompactFormat();
    java.lang.String str29 = outputFormat28.getLineSeparator();
    java.lang.String[] str_array33 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i35 = outputFormat28.parseOptions(str_array33, (int)' ');
    int i37 = outputFormat17.parseOptions(str_array33, (int)' ');
    int i39 = outputFormat10.parseOptions(str_array33, (int)(short)10);
    OutputFormat outputFormat40 = OutputFormat.createCompactFormat();
    outputFormat40.setNewlines(false);
    outputFormat40.setNewLineAfterDeclaration(false);
    boolean b45 = outputFormat40.isTrimText();
    boolean b46 = outputFormat40.isPadText();
    OutputFormat outputFormat47 = OutputFormat.createCompactFormat();
    outputFormat47.setNewlines(false);
    boolean b50 = outputFormat47.isNewLineAfterDeclaration();
    outputFormat47.setNewlines(true);
    outputFormat47.setExpandEmptyElements(true);
    java.lang.String str55 = outputFormat47.getLineSeparator();
    outputFormat47.setNewlines(false);
    OutputFormat outputFormat58 = OutputFormat.createCompactFormat();
    java.lang.String str59 = outputFormat58.getLineSeparator();
    java.lang.String[] str_array63 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i65 = outputFormat58.parseOptions(str_array63, (int)' ');
    int i67 = outputFormat47.parseOptions(str_array63, (int)' ');
    int i69 = outputFormat40.parseOptions(str_array63, (int)(short)10);
    int i71 = outputFormat10.parseOptions(str_array63, (int)(short)100);
    int i73 = outputFormat1.parseOptions(str_array63, 100);
    outputFormat1.setOmitEncoding(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\n"+ "'", str25.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "\n"+ "'", str29.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "\n"+ "'", str55.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "\n"+ "'", str59.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 100);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setIndent(true);
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setNewlines(false);
    boolean b15 = outputFormat0.isNewLineAfterDeclaration();
    
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
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setNewlines(true);
    outputFormat1.setNewLineAfterDeclaration(true);
    outputFormat1.setNewLineAfterDeclaration(false);
    outputFormat1.setIndent("\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setNewlines(true);
    outputFormat1.setNewLineAfterDeclaration(true);
    outputFormat1.setEncoding("hi!");
    outputFormat1.setSuppressDeclaration(true);
    outputFormat1.setExpandEmptyElements(true);
    boolean b13 = outputFormat1.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setNewlines(false);
    outputFormat1.setLineSeparator("");
    outputFormat1.setOmitEncoding(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    // The following exception was thrown during execution in test generation
    try {
    outputFormat0.setAttributeQuoteCharacter(' ');
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

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    boolean b4 = outputFormat3.isOmitEncoding();
    outputFormat3.setIndent(true);
    outputFormat3.setNewLineAfterDeclaration(false);
    java.lang.String str9 = outputFormat3.getLineSeparator();
    boolean b10 = outputFormat3.isExpandEmptyElements();
    outputFormat3.setNewLineAfterDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n"+ "'", str9.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }


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
    outputFormat0.setSuppressDeclaration(true);
    
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
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    java.lang.String str6 = outputFormat1.getLineSeparator();
    // The following exception was thrown during execution in test generation
    try {
    outputFormat1.setAttributeQuoteCharacter('4');
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
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    java.lang.String str6 = outputFormat1.getLineSeparator();
    char char7 = outputFormat1.getAttributeQuoteCharacter();
    java.lang.String str8 = outputFormat1.getIndent();
    outputFormat1.setIndent("\n");
    
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

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", true, "hi!");

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    boolean b9 = outputFormat0.isOmitEncoding();
    boolean b10 = outputFormat0.isNewLineAfterDeclaration();
    char char11 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setNewLineAfterNTags((int)' ');
    
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

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setNewlines(true);
    outputFormat1.setNewLineAfterDeclaration(true);
    outputFormat1.setEncoding("hi!");
    outputFormat1.setSuppressDeclaration(true);
    outputFormat1.setExpandEmptyElements(true);
    outputFormat1.setIndent(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    boolean b1 = outputFormat0.isTrimText();
    outputFormat0.setPadText(false);
    outputFormat0.setAttributeQuoteCharacter('\"');
    outputFormat0.setIndent("UTF-8");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)1);
    outputFormat0.setIndent(false);
    boolean b13 = outputFormat0.isPadText();
    
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
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }


    OutputFormat outputFormat1 = new OutputFormat("          ");

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    boolean b10 = outputFormat0.isOmitEncoding();
    java.lang.String str11 = outputFormat0.getEncoding();
    
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "UTF-8"+ "'", str11.equals("UTF-8"));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)1);
    outputFormat0.setIndent(false);
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setAttributeQuoteCharacter('\"');
    java.lang.String str17 = outputFormat0.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }


    OutputFormat outputFormat1 = new OutputFormat("");
    java.lang.String str2 = outputFormat1.getIndent();
    int i3 = outputFormat1.getNewLineAfterNTags();
    outputFormat1.setIndent("UTF-8");
    char char6 = outputFormat1.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char6 == '\"');

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }


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
    outputFormat0.setNewLineAfterDeclaration(true);
    
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
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("\n");
    boolean b10 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setOmitEncoding(true);
    outputFormat1.setIndent("\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }


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
    boolean b22 = outputFormat0.isNewLineAfterDeclaration();
    
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
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }


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
    outputFormat0.setNewLineAfterDeclaration(false);
    
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

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)0);
    outputFormat0.setEncoding("");
    outputFormat0.setIndent(true);
    outputFormat0.setEncoding("");
    boolean b13 = outputFormat0.isTrimText();
    outputFormat0.setEncoding("");
    outputFormat0.setIndentSize((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    java.lang.String str5 = outputFormat0.getEncoding();
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "UTF-8"+ "'", str5.equals("UTF-8"));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    boolean b5 = outputFormat0.isOmitEncoding();
    outputFormat0.setPadText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    java.lang.String str5 = outputFormat0.getIndent();
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isNewlines();
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
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setEncoding("\n");
    outputFormat1.setNewLineAfterNTags(32);
    boolean b7 = outputFormat1.isNewlines();
    outputFormat1.setNewLineAfterNTags(34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }


    OutputFormat outputFormat2 = new OutputFormat("\n", false);
    outputFormat2.setIndent(true);
    boolean b5 = outputFormat2.isNewLineAfterDeclaration();
    java.lang.String str6 = outputFormat2.getLineSeparator();
    java.lang.String[] str_array7 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i9 = outputFormat2.parseOptions(str_array7, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    boolean b10 = outputFormat0.isTrimText();
    outputFormat0.setIndent(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b15 = outputFormat0.isTrimText();
    
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
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    boolean b6 = outputFormat1.isTrimText();
    outputFormat1.setTrimText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", false, "\n");
    boolean b4 = outputFormat3.isTrimText();
    outputFormat3.setExpandEmptyElements(false);
    outputFormat3.setSuppressDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }


    OutputFormat outputFormat2 = new OutputFormat("                                  ", true);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isTrimText();
    boolean b6 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setTrimText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    java.lang.String str6 = outputFormat1.getLineSeparator();
    java.lang.String str7 = outputFormat1.getIndent();
    outputFormat1.setSuppressDeclaration(false);
    
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
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(true);
    outputFormat0.setNewlines(false);
    boolean b10 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setSuppressDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setNewLineAfterNTags((int)(short)100);
    outputFormat0.setOmitEncoding(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }


    OutputFormat outputFormat2 = new OutputFormat("\n", false);
    outputFormat2.setIndent(true);
    boolean b5 = outputFormat2.isNewLineAfterDeclaration();
    outputFormat2.setIndentSize(100);
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
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    boolean b10 = outputFormat1.isPadText();
    outputFormat1.setLineSeparator("\n");
    java.lang.String str13 = outputFormat1.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }


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
    outputFormat0.setIndentSize((int)(short)-1);
    java.lang.String str32 = outputFormat0.getEncoding();
    
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
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "UTF-8"+ "'", str32.equals("UTF-8"));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", false, "\n");
    boolean b4 = outputFormat3.isTrimText();
    outputFormat3.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    boolean b9 = outputFormat0.isOmitEncoding();
    boolean b10 = outputFormat0.isNewLineAfterDeclaration();
    boolean b11 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setExpandEmptyElements(false);
    
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
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    char char7 = outputFormat0.getAttributeQuoteCharacter();
    int i8 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str9 = outputFormat0.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UTF-8"+ "'", str9.equals("UTF-8"));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }


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
    boolean b16 = outputFormat1.isTrimText();
    
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
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)0);
    outputFormat0.setEncoding("");
    java.lang.String str9 = outputFormat0.getEncoding();
    outputFormat0.setIndent(false);
    outputFormat0.setNewLineAfterNTags((int)(byte)-1);
    int i14 = outputFormat0.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    java.lang.String str3 = outputFormat0.getEncoding();
    boolean b4 = outputFormat0.isNewLineAfterDeclaration();
    boolean b5 = outputFormat0.isOmitEncoding();
    
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
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isExpandEmptyElements();
    outputFormat1.setEncoding("UTF-8");
    outputFormat1.setEncoding("\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isXHTML();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    boolean b5 = outputFormat1.isNewLineAfterDeclaration();
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }


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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setNewlines(false);
    boolean b7 = outputFormat1.isXHTML();
    outputFormat1.setIndent("");
    boolean b10 = outputFormat1.isTrimText();
    outputFormat1.setXHTML(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }


    OutputFormat outputFormat2 = new OutputFormat("\n", false);
    outputFormat2.setIndent(true);
    boolean b5 = outputFormat2.isNewLineAfterDeclaration();
    outputFormat2.setIndentSize(100);
    java.lang.String str8 = outputFormat2.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "                                                                                                    "+ "'", str8.equals("                                                                                                    "));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    boolean b3 = outputFormat2.isPadText();
    int i4 = outputFormat2.getNewLineAfterNTags();
    outputFormat2.setLineSeparator("  ");
    java.lang.String str7 = outputFormat2.getLineSeparator();
    boolean b8 = outputFormat2.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "  "+ "'", str7.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    boolean b8 = outputFormat1.isXHTML();
    boolean b9 = outputFormat1.isTrimText();
    outputFormat1.setXHTML(true);
    boolean b12 = outputFormat1.isExpandEmptyElements();
    boolean b13 = outputFormat1.isOmitEncoding();
    
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
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }


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
    outputFormat1.setXHTML(true);
    
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
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    boolean b5 = outputFormat0.isOmitEncoding();
    boolean b6 = outputFormat0.isTrimText();
    java.lang.String str7 = outputFormat0.getEncoding();
    boolean b8 = outputFormat0.isNewlines();
    
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
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    OutputFormat outputFormat6 = new OutputFormat("hi!");
    boolean b7 = outputFormat6.isOmitEncoding();
    java.lang.String[] str_array10 = new java.lang.String[] { "", "\n" };
    int i12 = outputFormat6.parseOptions(str_array10, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    int i14 = outputFormat0.parseOptions(str_array10, (int)(short)-1);
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
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }


    OutputFormat outputFormat2 = new OutputFormat("\n", false);
    boolean b3 = outputFormat2.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndent("\n");
    outputFormat0.setNewLineAfterNTags((int)(byte)1);
    boolean b9 = outputFormat0.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }


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
    boolean b16 = outputFormat0.isPadText();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }


    OutputFormat outputFormat1 = new OutputFormat("  ");
    int i2 = outputFormat1.getNewLineAfterNTags();
    outputFormat1.setNewlines(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    boolean b10 = outputFormat1.isPadText();
    outputFormat1.setLineSeparator("\n");
    outputFormat1.setLineSeparator("UTF-8");
    boolean b15 = outputFormat1.isSuppressDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }


    OutputFormat outputFormat1 = new OutputFormat("\n");
    boolean b2 = outputFormat1.isTrimText();
    java.lang.String str3 = outputFormat1.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\n"+ "'", str3.equals("\n"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setLineSeparator("hi!");
    boolean b9 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setIndent(false);
    boolean b12 = outputFormat1.isSuppressDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    outputFormat1.setIndent(true);
    outputFormat1.setNewLineAfterDeclaration(false);
    boolean b6 = outputFormat1.isXHTML();
    boolean b7 = outputFormat1.isPadText();
    outputFormat1.setNewlines(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setNewLineAfterNTags((int)'\"');
    boolean b10 = outputFormat0.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }


    OutputFormat outputFormat2 = new OutputFormat("", true);
    boolean b3 = outputFormat2.isNewlines();
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
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    boolean b3 = outputFormat2.isNewlines();
    boolean b4 = outputFormat2.isExpandEmptyElements();
    java.lang.String str5 = outputFormat2.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n"+ "'", str5.equals("\n"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setExpandEmptyElements(false);
    outputFormat0.setIndentSize((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getLineSeparator();
    outputFormat0.setLineSeparator("hi!");
    char char14 = outputFormat0.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n"+ "'", str11.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char14 == '\"');

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    OutputFormat outputFormat8 = new OutputFormat("", false);
    outputFormat8.setIndent(true);
    java.lang.String str11 = outputFormat8.getIndent();
    outputFormat8.setTrimText(false);
    OutputFormat outputFormat14 = OutputFormat.createCompactFormat();
    java.lang.String str15 = outputFormat14.getLineSeparator();
    java.lang.String[] str_array19 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i21 = outputFormat14.parseOptions(str_array19, (int)' ');
    int i23 = outputFormat8.parseOptions(str_array19, (int)(short)100);
    int i25 = outputFormat0.parseOptions(str_array19, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "  "+ "'", str11.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\n"+ "'", str15.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)1);
    java.lang.String str11 = outputFormat0.getEncoding();
    boolean b12 = outputFormat0.isNewlines();
    OutputFormat outputFormat13 = OutputFormat.createCompactFormat();
    outputFormat13.setNewlines(false);
    boolean b16 = outputFormat13.isNewLineAfterDeclaration();
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
    int i40 = outputFormat13.parseOptions(str_array34, 32);
    int i42 = outputFormat0.parseOptions(str_array34, (int)(short)100);
    outputFormat0.setEncoding("UTF-8");
    
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
    org.junit.Assert.assertNotNull(outputFormat13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
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
    org.junit.Assert.assertTrue(i40 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 100);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setNewLineAfterDeclaration(true);
    boolean b12 = outputFormat1.isXHTML();
    int i13 = outputFormat1.getNewLineAfterNTags();
    int i14 = outputFormat1.getNewLineAfterNTags();
    outputFormat1.setXHTML(false);
    
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

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setNewlines(false);
    boolean b7 = outputFormat1.isXHTML();
    boolean b8 = outputFormat1.isPadText();
    outputFormat1.setTrimText(true);
    // The following exception was thrown during execution in test generation
    try {
    outputFormat1.setAttributeQuoteCharacter('4');
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
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isXHTML();
    boolean b6 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewLineAfterNTags((int)(short)100);
    outputFormat0.setIndent(true);
    java.lang.String str11 = outputFormat0.getIndent();
    java.lang.String[] str_array12 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i14 = outputFormat0.parseOptions(str_array12, (int)'a');
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "  "+ "'", str11.equals("  "));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }


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
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }


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
    boolean b22 = outputFormat0.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    outputFormat0.setXHTML(false);
    boolean b9 = outputFormat0.isTrimText();
    boolean b10 = outputFormat0.isTrimText();
    java.lang.String str11 = outputFormat0.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "UTF-8"+ "'", str11.equals("UTF-8"));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    java.lang.String str7 = outputFormat1.getLineSeparator();
    boolean b8 = outputFormat1.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\n"+ "'", str7.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    boolean b3 = outputFormat2.isPadText();
    int i4 = outputFormat2.getNewLineAfterNTags();
    boolean b5 = outputFormat2.isExpandEmptyElements();
    outputFormat2.setIndentSize((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isOmitEncoding();
    outputFormat0.setIndentSize((int)'\"');
    outputFormat0.setIndentSize(1);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }


    OutputFormat outputFormat3 = new OutputFormat("  ", true, "UTF-8");
    java.lang.String str4 = outputFormat3.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\n"+ "'", str4.equals("\n"));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(true);
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setTrimText(true);
    boolean b12 = outputFormat0.isOmitEncoding();
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

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }


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
    boolean b24 = outputFormat0.isXHTML();
    outputFormat0.setExpandEmptyElements(false);
    
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
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }


    OutputFormat outputFormat2 = new OutputFormat("UTF-8", true);
    int i3 = outputFormat2.getNewLineAfterNTags();
    outputFormat2.setPadText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    boolean b3 = outputFormat2.isNewlines();
    boolean b4 = outputFormat2.isExpandEmptyElements();
    outputFormat2.setEncoding("                                                                                                    ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }


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
    boolean b17 = outputFormat1.isNewlines();
    
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
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    int i6 = outputFormat1.getNewLineAfterNTags();
    char char7 = outputFormat1.getAttributeQuoteCharacter();
    boolean b8 = outputFormat1.isOmitEncoding();
    outputFormat1.setIndentSize((int)'#');
    boolean b11 = outputFormat1.isSuppressDeclaration();
    
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
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    java.lang.String str5 = outputFormat0.getLineSeparator();
    boolean b6 = outputFormat0.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n"+ "'", str5.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }


    OutputFormat outputFormat3 = new OutputFormat("UTF-8", false, "          ");
    char char4 = outputFormat3.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char4 == '\"');

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(true);
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setTrimText(true);
    boolean b12 = outputFormat0.isOmitEncoding();
    outputFormat0.setIndentSize(10);
    outputFormat0.setIndent("\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }


    OutputFormat outputFormat2 = new OutputFormat("\n", false);
    outputFormat2.setIndent(true);
    outputFormat2.setNewLineAfterDeclaration(true);
    outputFormat2.setSuppressDeclaration(true);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }


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
    java.lang.String str19 = outputFormat0.getIndent();
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "                                                                                                    "+ "'", str19.equals("                                                                                                    "));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isXHTML();
    outputFormat1.setExpandEmptyElements(true);
    boolean b7 = outputFormat1.isSuppressDeclaration();
    boolean b8 = outputFormat1.isNewlines();
    
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

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndentSize(34);
    OutputFormat outputFormat13 = OutputFormat.createCompactFormat();
    outputFormat13.setNewlines(false);
    boolean b16 = outputFormat13.isNewLineAfterDeclaration();
    outputFormat13.setNewlines(true);
    outputFormat13.setExpandEmptyElements(true);
    java.lang.String str21 = outputFormat13.getLineSeparator();
    outputFormat13.setNewlines(false);
    outputFormat13.setXHTML(false);
    outputFormat13.setPadText(false);
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
    int i50 = outputFormat13.parseOptions(str_array44, (int)' ');
    // The following exception was thrown during execution in test generation
    try {
    int i52 = outputFormat0.parseOptions(str_array44, (int)(byte)-1);
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
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\n"+ "'", str21.equals("\n"));
    
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
    org.junit.Assert.assertTrue(i50 == 32);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setNewLineAfterDeclaration(true);
    boolean b12 = outputFormat1.isXHTML();
    int i13 = outputFormat1.getNewLineAfterNTags();
    int i14 = outputFormat1.getNewLineAfterNTags();
    boolean b15 = outputFormat1.isNewLineAfterDeclaration();
    
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
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }


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
    outputFormat0.setNewLineAfterNTags(0);
    
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
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }


    OutputFormat outputFormat2 = new OutputFormat("UTF-8", true);
    boolean b3 = outputFormat2.isExpandEmptyElements();
    boolean b4 = outputFormat2.isNewLineAfterDeclaration();
    outputFormat2.setNewLineAfterDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }


    OutputFormat outputFormat2 = new OutputFormat("  ", true);
    java.lang.String str3 = outputFormat2.getEncoding();
    outputFormat2.setNewlines(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8"+ "'", str3.equals("UTF-8"));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b5 = outputFormat0.isTrimText();
    outputFormat0.setXHTML(false);
    outputFormat0.setIndent(false);
    outputFormat0.setTrimText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }


    OutputFormat outputFormat2 = new OutputFormat("UTF-8", true);
    boolean b3 = outputFormat2.isExpandEmptyElements();
    boolean b4 = outputFormat2.isNewLineAfterDeclaration();
    outputFormat2.setEncoding("\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setNewlines(true);
    outputFormat1.setNewLineAfterDeclaration(true);
    outputFormat1.setIndent(true);
    boolean b9 = outputFormat1.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }


    OutputFormat outputFormat0 = new OutputFormat();
    boolean b1 = outputFormat0.isTrimText();
    outputFormat0.setNewlines(true);
    outputFormat0.setTrimText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }


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
    java.lang.String str17 = outputFormat0.getEncoding();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "UTF-8"+ "'", str17.equals("UTF-8"));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    outputFormat1.setExpandEmptyElements(true);
    outputFormat1.setNewlines(true);
    outputFormat1.setPadText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setTrimText(false);
    boolean b13 = outputFormat0.isExpandEmptyElements();
    boolean b14 = outputFormat0.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isXHTML();
    int i6 = outputFormat0.getNewLineAfterNTags();
    boolean b7 = outputFormat0.isXHTML();
    outputFormat0.setLineSeparator("\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }


    OutputFormat outputFormat3 = new OutputFormat("", true, "UTF-8");
    outputFormat3.setNewlines(false);
    outputFormat3.setExpandEmptyElements(true);
    OutputFormat outputFormat9 = new OutputFormat("hi!");
    boolean b10 = outputFormat9.isOmitEncoding();
    java.lang.String[] str_array13 = new java.lang.String[] { "", "\n" };
    int i15 = outputFormat9.parseOptions(str_array13, (int)(byte)1);
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
    int i39 = outputFormat9.parseOptions(str_array33, 52);
    // The following exception was thrown during execution in test generation
    try {
    int i41 = outputFormat3.parseOptions(str_array33, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
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
    org.junit.Assert.assertTrue(i39 == 52);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndent(false);
    outputFormat0.setNewlines(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("\n");
    java.lang.String str10 = outputFormat1.getIndent();
    outputFormat1.setIndent(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n"+ "'", str10.equals("\n"));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isPadText();
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
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }


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
    OutputFormat outputFormat15 = OutputFormat.createCompactFormat();
    outputFormat15.setNewlines(false);
    outputFormat15.setXHTML(true);
    outputFormat15.setNewLineAfterDeclaration(false);
    char char22 = outputFormat15.getAttributeQuoteCharacter();
    outputFormat15.setEncoding("\n");
    OutputFormat outputFormat28 = new OutputFormat("", false, "");
    OutputFormat outputFormat29 = OutputFormat.createCompactFormat();
    java.lang.String str30 = outputFormat29.getLineSeparator();
    java.lang.String[] str_array34 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i36 = outputFormat29.parseOptions(str_array34, (int)' ');
    int i38 = outputFormat28.parseOptions(str_array34, (int)(short)0);
    outputFormat28.setOmitEncoding(true);
    boolean b41 = outputFormat28.isOmitEncoding();
    OutputFormat outputFormat43 = new OutputFormat("hi!");
    outputFormat43.setIndent(true);
    outputFormat43.setEncoding("");
    OutputFormat outputFormat48 = OutputFormat.createCompactFormat();
    outputFormat48.setNewlines(false);
    boolean b51 = outputFormat48.isNewLineAfterDeclaration();
    outputFormat48.setNewlines(true);
    outputFormat48.setExpandEmptyElements(true);
    java.lang.String str56 = outputFormat48.getLineSeparator();
    outputFormat48.setNewlines(false);
    outputFormat48.setXHTML(false);
    outputFormat48.setPadText(false);
    OutputFormat outputFormat63 = OutputFormat.createCompactFormat();
    outputFormat63.setNewlines(false);
    boolean b66 = outputFormat63.isNewLineAfterDeclaration();
    outputFormat63.setNewlines(true);
    outputFormat63.setExpandEmptyElements(true);
    java.lang.String str71 = outputFormat63.getLineSeparator();
    outputFormat63.setNewlines(false);
    OutputFormat outputFormat74 = OutputFormat.createCompactFormat();
    java.lang.String str75 = outputFormat74.getLineSeparator();
    java.lang.String[] str_array79 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i81 = outputFormat74.parseOptions(str_array79, (int)' ');
    int i83 = outputFormat63.parseOptions(str_array79, (int)' ');
    int i85 = outputFormat48.parseOptions(str_array79, (int)' ');
    int i87 = outputFormat43.parseOptions(str_array79, 100);
    int i89 = outputFormat28.parseOptions(str_array79, (int)(short)1);
    int i91 = outputFormat15.parseOptions(str_array79, (int)(short)100);
    int i93 = outputFormat0.parseOptions(str_array79, 1);
    
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
    org.junit.Assert.assertNotNull(outputFormat15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char22 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "\n"+ "'", str30.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "\n"+ "'", str56.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "\n"+ "'", str71.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "\n"+ "'", str75.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 1);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setNewLineAfterNTags((int)'\"');
    java.lang.String str10 = outputFormat0.getEncoding();
    
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
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }


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
    outputFormat0.setSuppressDeclaration(false);
    
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
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)1);
    java.lang.String str11 = outputFormat0.getEncoding();
    outputFormat0.setSuppressDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "UTF-8"+ "'", str11.equals("UTF-8"));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(true);
    boolean b12 = outputFormat0.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "                                  ");

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    char char7 = outputFormat0.getAttributeQuoteCharacter();
    boolean b8 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setPadText(false);
    outputFormat0.setNewlines(true);
    boolean b13 = outputFormat0.isOmitEncoding();
    int i14 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setIndent(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(false);
    outputFormat0.setExpandEmptyElements(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setTrimText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }


    OutputFormat outputFormat2 = new OutputFormat("UTF-8", true);
    boolean b3 = outputFormat2.isExpandEmptyElements();
    outputFormat2.setOmitEncoding(true);
    boolean b6 = outputFormat2.isSuppressDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }


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
    outputFormat0.setNewlines(true);
    
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
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setNewLineAfterDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }


    OutputFormat outputFormat2 = new OutputFormat("UTF-8", true);
    boolean b3 = outputFormat2.isExpandEmptyElements();
    boolean b4 = outputFormat2.isNewLineAfterDeclaration();
    outputFormat2.setNewlines(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    java.lang.String str5 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n"+ "'", str5.equals("\n"));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }


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
    boolean b17 = outputFormat0.isSuppressDeclaration();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    java.lang.String str6 = outputFormat1.getIndent();
    outputFormat1.setTrimText(true);
    java.lang.String str9 = outputFormat1.getLineSeparator();
    boolean b10 = outputFormat1.isOmitEncoding();
    outputFormat1.setAttributeQuoteCharacter('\"');
    
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

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    java.lang.String str3 = outputFormat0.getEncoding();
    boolean b4 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setIndent(false);
    char char7 = outputFormat0.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8"+ "'", str3.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setExpandEmptyElements(true);
    outputFormat1.setNewlines(true);
    int i12 = outputFormat1.getNewLineAfterNTags();
    char char13 = outputFormat1.getAttributeQuoteCharacter();
    outputFormat1.setPadText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char13 == '\"');

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    boolean b5 = outputFormat0.isNewlines();
    boolean b6 = outputFormat0.isNewLineAfterDeclaration();
    boolean b7 = outputFormat0.isSuppressDeclaration();
    
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
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }


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
    boolean b34 = outputFormat1.isPadText();
    
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
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    char char4 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setOmitEncoding(false);
    outputFormat0.setSuppressDeclaration(false);
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
    org.junit.Assert.assertTrue(char4 == '\"');

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    java.lang.String str1 = outputFormat0.getLineSeparator();
    outputFormat0.setNewLineAfterNTags((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\n"+ "'", str1.equals("\n"));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    boolean b6 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setNewLineAfterNTags((int)(short)0);
    outputFormat0.setIndent("          ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    boolean b8 = outputFormat1.isXHTML();
    outputFormat1.setTrimText(true);
    char char11 = outputFormat1.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char11 == '\"');

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setIndent(false);
    boolean b9 = outputFormat1.isTrimText();
    
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
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }


    OutputFormat outputFormat3 = new OutputFormat("UTF-8", true, "hi!");
    OutputFormat outputFormat5 = new OutputFormat("hi!");
    boolean b6 = outputFormat5.isOmitEncoding();
    java.lang.String[] str_array9 = new java.lang.String[] { "", "\n" };
    int i11 = outputFormat5.parseOptions(str_array9, (int)(byte)1);
    outputFormat5.setAttributeQuoteCharacter('\"');
    outputFormat5.setTrimText(true);
    OutputFormat outputFormat16 = OutputFormat.createCompactFormat();
    outputFormat16.setNewlines(false);
    outputFormat16.setXHTML(true);
    java.lang.String str21 = outputFormat16.getLineSeparator();
    outputFormat16.setIndent(true);
    outputFormat16.setExpandEmptyElements(false);
    outputFormat16.setLineSeparator("\n");
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
    int i51 = outputFormat16.parseOptions(str_array47, (int)'4');
    int i53 = outputFormat5.parseOptions(str_array47, (int)' ');
    int i55 = outputFormat3.parseOptions(str_array47, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\n"+ "'", str21.equals("\n"));
    
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
    org.junit.Assert.assertTrue(i51 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 97);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }


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
    outputFormat0.setPadText(false);
    
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
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    boolean b9 = outputFormat0.isOmitEncoding();
    boolean b10 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setXHTML(false);
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
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }


    OutputFormat outputFormat0 = new OutputFormat();
    outputFormat0.setNewLineAfterDeclaration(false);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setNewlines(false);
    outputFormat1.setLineSeparator("");
    java.lang.String str9 = outputFormat1.getLineSeparator();
    outputFormat1.setNewlines(false);
    char char12 = outputFormat1.getAttributeQuoteCharacter();
    outputFormat1.setExpandEmptyElements(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char12 == '\"');

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }


    OutputFormat outputFormat1 = new OutputFormat("\n");
    outputFormat1.setIndent(false);
    boolean b4 = outputFormat1.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }


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
    outputFormat1.setXHTML(true);
    outputFormat1.setNewLineAfterNTags((int)(short)100);
    
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
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    java.lang.String str3 = outputFormat0.getEncoding();
    boolean b4 = outputFormat0.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8"+ "'", str3.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setTrimText(true);
    outputFormat0.setIndent("hi!");
    outputFormat0.setPadText(true);
    outputFormat0.setNewLineAfterDeclaration(true);
    boolean b13 = outputFormat0.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    boolean b5 = outputFormat1.isPadText();
    outputFormat1.setOmitEncoding(true);
    
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
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setNewLineAfterNTags(1);
    boolean b9 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setEncoding("  ");
    boolean b12 = outputFormat0.isSuppressDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }


    OutputFormat outputFormat2 = new OutputFormat("          ", true);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setNewLineAfterNTags(10);
    outputFormat0.setSuppressDeclaration(false);
    boolean b12 = outputFormat0.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setAttributeQuoteCharacter('\"');
    char char10 = outputFormat1.getAttributeQuoteCharacter();
    outputFormat1.setSuppressDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char10 == '\"');

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }


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
    outputFormat0.setIndent("\n");
    
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
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    java.lang.String str3 = outputFormat0.getEncoding();
    boolean b4 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setExpandEmptyElements(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b9 = outputFormat0.isXHTML();
    
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
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    char char4 = outputFormat0.getAttributeQuoteCharacter();
    boolean b5 = outputFormat0.isNewlines();
    outputFormat0.setEncoding("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char4 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", false, "");

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setAttributeQuoteCharacter('\"');
    outputFormat1.setTrimText(true);
    outputFormat1.setXHTML(false);
    java.lang.String str14 = outputFormat1.getIndent();
    outputFormat1.setTrimText(true);
    
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
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }


    OutputFormat outputFormat2 = new OutputFormat("", true);
    outputFormat2.setEncoding("");
    outputFormat2.setOmitEncoding(true);
    char char7 = outputFormat2.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }


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
    boolean b16 = outputFormat0.isSuppressDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n"+ "'", str8.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(true);
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setTrimText(true);
    boolean b12 = outputFormat0.isOmitEncoding();
    outputFormat0.setIndentSize(10);
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
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setEncoding("\n");
    outputFormat1.setNewLineAfterNTags(32);
    java.lang.String str7 = outputFormat1.getIndent();
    boolean b8 = outputFormat1.isOmitEncoding();
    java.lang.String str9 = outputFormat1.getIndent();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setExpandEmptyElements(false);
    outputFormat0.setTrimText(false);
    boolean b9 = outputFormat0.isXHTML();
    boolean b10 = outputFormat0.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }


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
    outputFormat0.setXHTML(false);
    char char15 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setNewlines(true);
    
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
    org.junit.Assert.assertTrue(char15 == '\"');

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)1);
    java.lang.String str11 = outputFormat0.getEncoding();
    boolean b12 = outputFormat0.isNewlines();
    OutputFormat outputFormat13 = OutputFormat.createCompactFormat();
    outputFormat13.setNewlines(false);
    boolean b16 = outputFormat13.isNewLineAfterDeclaration();
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
    int i40 = outputFormat13.parseOptions(str_array34, 32);
    int i42 = outputFormat0.parseOptions(str_array34, (int)(short)100);
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "UTF-8"+ "'", str11.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
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
    org.junit.Assert.assertTrue(i40 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 100);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }


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
    outputFormat0.setIndent(true);
    
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
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }


    OutputFormat outputFormat3 = new OutputFormat("", true, "UTF-8");
    outputFormat3.setNewlines(false);
    boolean b6 = outputFormat3.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setNewLineAfterDeclaration(false);
    char char7 = outputFormat0.getAttributeQuoteCharacter();
    boolean b8 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setPadText(false);
    outputFormat0.setIndentSize((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char7 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndent("\n");
    outputFormat0.setExpandEmptyElements(false);
    outputFormat0.setIndent(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)1);
    java.lang.String str11 = outputFormat0.getEncoding();
    boolean b12 = outputFormat0.isNewlines();
    outputFormat0.setPadText(true);
    
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
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }


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
    boolean b16 = outputFormat0.isNewLineAfterDeclaration();
    
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
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    java.lang.String str5 = outputFormat0.getEncoding();
    boolean b6 = outputFormat0.isXHTML();
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b9 = outputFormat0.isSuppressDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "UTF-8"+ "'", str5.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    java.lang.String str5 = outputFormat0.getIndent();
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isNewlines();
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setNewLineAfterNTags(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }


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
    java.lang.String str18 = outputFormat0.getEncoding();
    int i19 = outputFormat0.getNewLineAfterNTags();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "UTF-8"+ "'", str18.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }


    OutputFormat outputFormat2 = new OutputFormat("UTF-8", true);
    boolean b3 = outputFormat2.isExpandEmptyElements();
    boolean b4 = outputFormat2.isNewLineAfterDeclaration();
    boolean b5 = outputFormat2.isPadText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    outputFormat1.setIndent(true);
    outputFormat1.setNewLineAfterDeclaration(false);
    boolean b6 = outputFormat1.isXHTML();
    boolean b7 = outputFormat1.isPadText();
    outputFormat1.setXHTML(true);
    outputFormat1.setIndent(true);
    java.lang.String str12 = outputFormat1.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n"+ "'", str12.equals("\n"));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setSuppressDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setNewLineAfterNTags(1);
    boolean b9 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setEncoding("  ");
    int i12 = outputFormat0.getNewLineAfterNTags();
    boolean b13 = outputFormat0.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    outputFormat0.setExpandEmptyElements(true);
    boolean b7 = outputFormat0.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }


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
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setTrimText(true);
    outputFormat0.setIndent("\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isExpandEmptyElements();
    outputFormat1.setLineSeparator("\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)0);
    outputFormat0.setEncoding("");
    outputFormat0.setEncoding("");
    boolean b11 = outputFormat0.isTrimText();
    java.lang.String str12 = outputFormat0.getEncoding();
    java.lang.String str13 = outputFormat0.getLineSeparator();
    // The following exception was thrown during execution in test generation
    try {
    outputFormat0.setAttributeQuoteCharacter(' ');
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\n"+ "'", str13.equals("\n"));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }


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
    boolean b28 = outputFormat0.isTrimText();
    outputFormat0.setExpandEmptyElements(true);
    
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
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setTrimText(false);
    boolean b13 = outputFormat0.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isPadText();
    boolean b8 = outputFormat0.isPadText();
    outputFormat0.setOmitEncoding(true);
    
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
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "  ");
    boolean b4 = outputFormat3.isExpandEmptyElements();
    boolean b5 = outputFormat3.isSuppressDeclaration();
    char char6 = outputFormat3.getAttributeQuoteCharacter();
    outputFormat3.setIndent(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char6 == '\"');

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    outputFormat1.setIndent(true);
    outputFormat1.setEncoding("");
    outputFormat1.setNewlines(false);
    char char8 = outputFormat1.getAttributeQuoteCharacter();
    java.lang.String str9 = outputFormat1.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char8 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n"+ "'", str9.equals("\n"));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }


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

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }


    OutputFormat outputFormat2 = new OutputFormat("", true);
    outputFormat2.setEncoding("");
    boolean b5 = outputFormat2.isNewLineAfterDeclaration();
    int i6 = outputFormat2.getNewLineAfterNTags();
    outputFormat2.setTrimText(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    outputFormat1.setIndent(true);
    outputFormat1.setEncoding("");
    outputFormat1.setNewlines(false);
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

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    outputFormat0.setTrimText(true);
    outputFormat0.setXHTML(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setXHTML(false);
    boolean b9 = outputFormat0.isOmitEncoding();
    boolean b10 = outputFormat0.isTrimText();
    outputFormat0.setXHTML(true);
    outputFormat0.setSuppressDeclaration(true);
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
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    outputFormat2.setIndent(true);
    java.lang.String str5 = outputFormat2.getIndent();
    outputFormat2.setTrimText(false);
    boolean b8 = outputFormat2.isNewlines();
    java.lang.String str9 = outputFormat2.getIndent();
    boolean b10 = outputFormat2.isNewLineAfterDeclaration();
    int i11 = outputFormat2.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "  "+ "'", str5.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "  "+ "'", str9.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", true, "hi!");
    boolean b4 = outputFormat3.isPadText();
    outputFormat3.setSuppressDeclaration(true);
    outputFormat3.setSuppressDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", false, "UTF-8");
    outputFormat3.setNewLineAfterDeclaration(true);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    boolean b5 = outputFormat0.isOmitEncoding();
    boolean b6 = outputFormat0.isTrimText();
    outputFormat0.setEncoding("hi!");
    outputFormat0.setOmitEncoding(false);
    java.lang.String str11 = outputFormat0.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }


    OutputFormat outputFormat1 = new OutputFormat("\n");
    boolean b2 = outputFormat1.isTrimText();
    outputFormat1.setIndentSize(100);
    outputFormat1.setEncoding("                                  ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isExpandEmptyElements();
    boolean b8 = outputFormat0.isPadText();
    outputFormat0.setPadText(false);
    boolean b11 = outputFormat0.isNewlines();
    outputFormat0.setIndentSize(10);
    
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

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", true, "          ");
    outputFormat3.setPadText(true);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    outputFormat1.setPadText(true);
    boolean b5 = outputFormat1.isOmitEncoding();
    outputFormat1.setXHTML(false);
    java.lang.String str8 = outputFormat1.getIndent();
    outputFormat1.setIndent("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    boolean b5 = outputFormat0.isNewlines();
    outputFormat0.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    outputFormat0.setNewlines(false);
    java.lang.String str11 = outputFormat0.getIndent();
    outputFormat0.setExpandEmptyElements(false);
    outputFormat0.setNewlines(true);
    
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
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }


    OutputFormat outputFormat2 = new OutputFormat("UTF-8", false);
    outputFormat2.setNewLineAfterNTags(52);
    boolean b5 = outputFormat2.isNewlines();
    outputFormat2.setOmitEncoding(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    outputFormat2.setNewLineAfterDeclaration(true);
    outputFormat2.setNewLineAfterNTags((int)'#');
    java.lang.String str7 = outputFormat2.getEncoding();
    outputFormat2.setIndentSize(32);
    char char10 = outputFormat2.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UTF-8"+ "'", str7.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char10 == '\"');

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    boolean b6 = outputFormat3.isTrimText();
    // The following exception was thrown during execution in test generation
    try {
    outputFormat3.setAttributeQuoteCharacter('a');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    boolean b6 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setIndent(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }


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
    boolean b16 = outputFormat0.isXHTML();
    
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
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    boolean b6 = outputFormat3.isNewLineAfterDeclaration();
    boolean b7 = outputFormat3.isSuppressDeclaration();
    boolean b8 = outputFormat3.isPadText();
    boolean b9 = outputFormat3.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b5 = outputFormat0.isTrimText();
    boolean b6 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setTrimText(false);
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
    // The following exception was thrown during execution in test generation
    try {
    int i32 = outputFormat0.parseOptions(str_array26, (int)(byte)-1);
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
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

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    java.lang.String str5 = outputFormat0.getIndent();
    outputFormat0.setNewlines(false);
    java.lang.String str8 = outputFormat0.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "UTF-8"+ "'", str5.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "UTF-8"+ "'", str8.equals("UTF-8"));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)0);
    outputFormat0.setEncoding("");
    outputFormat0.setIndent(true);
    outputFormat0.setEncoding("");
    outputFormat0.setOmitEncoding(true);
    int i15 = outputFormat0.getNewLineAfterNTags();
    boolean b16 = outputFormat0.isNewLineAfterDeclaration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isXHTML();
    boolean b6 = outputFormat0.isOmitEncoding();
    outputFormat0.setIndent("hi!");
    boolean b9 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setSuppressDeclaration(true);
    boolean b7 = outputFormat0.isOmitEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    java.lang.String str3 = outputFormat0.getEncoding();
    boolean b4 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setExpandEmptyElements(false);
    boolean b7 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setIndentSize((-1));
    
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
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isTrimText();
    boolean b6 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setLineSeparator("                                                                                                    ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setEncoding("\n");
    outputFormat1.setNewLineAfterNTags(32);
    java.lang.String str7 = outputFormat1.getIndent();
    boolean b8 = outputFormat1.isTrimText();
    boolean b9 = outputFormat1.isNewlines();
    
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
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }


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
    java.lang.String str34 = outputFormat2.getLineSeparator();
    
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
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "\n"+ "'", str34.equals("\n"));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    boolean b7 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setExpandEmptyElements(true);
    
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
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setNewlines(false);
    boolean b7 = outputFormat1.isXHTML();
    outputFormat1.setNewLineAfterNTags((-1));
    
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
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }


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
    boolean b14 = outputFormat0.isOmitEncoding();
    boolean b15 = outputFormat0.isOmitEncoding();
    
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
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    boolean b7 = outputFormat0.isPadText();
    outputFormat0.setXHTML(false);
    
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
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }


    OutputFormat outputFormat1 = new OutputFormat("\n");
    boolean b2 = outputFormat1.isXHTML();
    java.lang.String str3 = outputFormat1.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8"+ "'", str3.equals("UTF-8"));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    outputFormat1.setIndent("");
    outputFormat1.setSuppressDeclaration(false);
    outputFormat1.setEncoding("UTF-8");
    outputFormat1.setIndent(false);
    outputFormat1.setIndent("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }


    OutputFormat outputFormat2 = new OutputFormat("  ", false);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    OutputFormat outputFormat4 = OutputFormat.createCompactFormat();
    java.lang.String str5 = outputFormat4.getLineSeparator();
    java.lang.String[] str_array9 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i11 = outputFormat4.parseOptions(str_array9, (int)' ');
    int i13 = outputFormat3.parseOptions(str_array9, (int)(short)0);
    outputFormat3.setOmitEncoding(true);
    outputFormat3.setTrimText(true);
    outputFormat3.setIndent(true);
    
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

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("\n");
    outputFormat1.setExpandEmptyElements(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }


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
    outputFormat0.setTrimText(false);
    outputFormat0.setXHTML(true);
    
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
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isXHTML();
    boolean b5 = outputFormat1.isExpandEmptyElements();
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
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setEncoding("\n");
    outputFormat1.setNewLineAfterNTags(32);
    java.lang.String str7 = outputFormat1.getIndent();
    boolean b8 = outputFormat1.isTrimText();
    boolean b9 = outputFormat1.isOmitEncoding();
    outputFormat1.setSuppressDeclaration(false);
    
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
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }


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
    boolean b31 = outputFormat0.isExpandEmptyElements();
    
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
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "  ");
    boolean b4 = outputFormat3.isExpandEmptyElements();
    boolean b5 = outputFormat3.isSuppressDeclaration();
    char char6 = outputFormat3.getAttributeQuoteCharacter();
    java.lang.String str7 = outputFormat3.getEncoding();
    outputFormat3.setEncoding("\n");
    outputFormat3.setIndent(true);
    boolean b12 = outputFormat3.isNewlines();
    
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
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setIndent(true);
    boolean b11 = outputFormat0.isTrimText();
    OutputFormat outputFormat12 = OutputFormat.createCompactFormat();
    outputFormat12.setNewlines(false);
    boolean b15 = outputFormat12.isNewLineAfterDeclaration();
    outputFormat12.setNewlines(true);
    outputFormat12.setExpandEmptyElements(true);
    java.lang.String str20 = outputFormat12.getLineSeparator();
    outputFormat12.setNewlines(false);
    outputFormat12.setXHTML(false);
    outputFormat12.setPadText(false);
    OutputFormat outputFormat27 = OutputFormat.createCompactFormat();
    outputFormat27.setNewlines(false);
    boolean b30 = outputFormat27.isNewLineAfterDeclaration();
    outputFormat27.setNewlines(true);
    outputFormat27.setExpandEmptyElements(true);
    java.lang.String str35 = outputFormat27.getLineSeparator();
    outputFormat27.setNewlines(false);
    OutputFormat outputFormat38 = OutputFormat.createCompactFormat();
    java.lang.String str39 = outputFormat38.getLineSeparator();
    java.lang.String[] str_array43 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i45 = outputFormat38.parseOptions(str_array43, (int)' ');
    int i47 = outputFormat27.parseOptions(str_array43, (int)' ');
    int i49 = outputFormat12.parseOptions(str_array43, (int)' ');
    int i51 = outputFormat0.parseOptions(str_array43, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\n"+ "'", str20.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\n"+ "'", str35.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "\n"+ "'", str39.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 10);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    outputFormat1.setLineSeparator("                                  ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setIndent("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    boolean b5 = outputFormat0.isXHTML();
    boolean b6 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewLineAfterNTags((int)(short)100);
    outputFormat0.setIndent(true);
    java.lang.String str11 = outputFormat0.getIndent();
    outputFormat0.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "  "+ "'", str11.equals("  "));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    outputFormat0.setExpandEmptyElements(false);
    boolean b7 = outputFormat0.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    boolean b1 = outputFormat0.isTrimText();
    outputFormat0.setPadText(false);
    outputFormat0.setPadText(false);
    boolean b6 = outputFormat0.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }


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
    boolean b28 = outputFormat0.isNewlines();
    
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
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    boolean b8 = outputFormat1.isXHTML();
    OutputFormat outputFormat9 = OutputFormat.createCompactFormat();
    outputFormat9.setNewlines(false);
    boolean b12 = outputFormat9.isNewLineAfterDeclaration();
    outputFormat9.setNewlines(true);
    int i15 = outputFormat9.getNewLineAfterNTags();
    java.lang.String str16 = outputFormat9.getEncoding();
    outputFormat9.setNewlines(false);
    java.lang.String str19 = outputFormat9.getEncoding();
    boolean b20 = outputFormat9.isPadText();
    boolean b21 = outputFormat9.isXHTML();
    OutputFormat outputFormat24 = new OutputFormat("", false);
    outputFormat24.setIndent(true);
    boolean b27 = outputFormat24.isOmitEncoding();
    OutputFormat outputFormat28 = OutputFormat.createCompactFormat();
    outputFormat28.setNewlines(false);
    boolean b31 = outputFormat28.isNewLineAfterDeclaration();
    outputFormat28.setNewlines(true);
    outputFormat28.setExpandEmptyElements(true);
    java.lang.String str36 = outputFormat28.getLineSeparator();
    outputFormat28.setNewlines(false);
    java.lang.String str39 = outputFormat28.getIndent();
    OutputFormat outputFormat41 = new OutputFormat("hi!");
    boolean b42 = outputFormat41.isOmitEncoding();
    java.lang.String[] str_array45 = new java.lang.String[] { "", "\n" };
    int i47 = outputFormat41.parseOptions(str_array45, (int)(byte)1);
    int i49 = outputFormat28.parseOptions(str_array45, (int)'a');
    int i51 = outputFormat24.parseOptions(str_array45, (int)(short)10);
    int i53 = outputFormat9.parseOptions(str_array45, 34);
    int i55 = outputFormat1.parseOptions(str_array45, 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "UTF-8"+ "'", str16.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "UTF-8"+ "'", str19.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "\n"+ "'", str36.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 97);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }


    OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
    outputFormat0.setLineSeparator("");
    outputFormat0.setLineSeparator("\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }


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
    java.lang.String str15 = outputFormat0.getEncoding();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "UTF-8"+ "'", str15.equals("UTF-8"));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setXHTML(true);
    int i6 = outputFormat1.getNewLineAfterNTags();
    char char7 = outputFormat1.getAttributeQuoteCharacter();
    boolean b8 = outputFormat1.isOmitEncoding();
    OutputFormat outputFormat9 = OutputFormat.createCompactFormat();
    outputFormat9.setNewlines(false);
    outputFormat9.setXHTML(true);
    outputFormat9.setNewLineAfterDeclaration(false);
    char char16 = outputFormat9.getAttributeQuoteCharacter();
    outputFormat9.setEncoding("\n");
    OutputFormat outputFormat22 = new OutputFormat("", false, "");
    OutputFormat outputFormat23 = OutputFormat.createCompactFormat();
    java.lang.String str24 = outputFormat23.getLineSeparator();
    java.lang.String[] str_array28 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i30 = outputFormat23.parseOptions(str_array28, (int)' ');
    int i32 = outputFormat22.parseOptions(str_array28, (int)(short)0);
    outputFormat22.setOmitEncoding(true);
    boolean b35 = outputFormat22.isOmitEncoding();
    OutputFormat outputFormat37 = new OutputFormat("hi!");
    outputFormat37.setIndent(true);
    outputFormat37.setEncoding("");
    OutputFormat outputFormat42 = OutputFormat.createCompactFormat();
    outputFormat42.setNewlines(false);
    boolean b45 = outputFormat42.isNewLineAfterDeclaration();
    outputFormat42.setNewlines(true);
    outputFormat42.setExpandEmptyElements(true);
    java.lang.String str50 = outputFormat42.getLineSeparator();
    outputFormat42.setNewlines(false);
    outputFormat42.setXHTML(false);
    outputFormat42.setPadText(false);
    OutputFormat outputFormat57 = OutputFormat.createCompactFormat();
    outputFormat57.setNewlines(false);
    boolean b60 = outputFormat57.isNewLineAfterDeclaration();
    outputFormat57.setNewlines(true);
    outputFormat57.setExpandEmptyElements(true);
    java.lang.String str65 = outputFormat57.getLineSeparator();
    outputFormat57.setNewlines(false);
    OutputFormat outputFormat68 = OutputFormat.createCompactFormat();
    java.lang.String str69 = outputFormat68.getLineSeparator();
    java.lang.String[] str_array73 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i75 = outputFormat68.parseOptions(str_array73, (int)' ');
    int i77 = outputFormat57.parseOptions(str_array73, (int)' ');
    int i79 = outputFormat42.parseOptions(str_array73, (int)' ');
    int i81 = outputFormat37.parseOptions(str_array73, 100);
    int i83 = outputFormat22.parseOptions(str_array73, (int)(short)1);
    int i85 = outputFormat9.parseOptions(str_array73, (int)(short)100);
    int i87 = outputFormat1.parseOptions(str_array73, 97);
    
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
    org.junit.Assert.assertNotNull(outputFormat9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char16 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "\n"+ "'", str24.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "\n"+ "'", str50.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "\n"+ "'", str65.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "\n"+ "'", str69.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 97);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    outputFormat2.setIndent(true);
    boolean b5 = outputFormat2.isOmitEncoding();
    int i6 = outputFormat2.getNewLineAfterNTags();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isExpandEmptyElements();
    boolean b8 = outputFormat0.isPadText();
    outputFormat0.setPadText(false);
    boolean b11 = outputFormat0.isNewlines();
    outputFormat0.setNewLineAfterNTags((int)(short)-1);
    
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

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }


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
    boolean b24 = outputFormat0.isNewlines();
    boolean b25 = outputFormat0.isXHTML();
    
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
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    outputFormat1.setNewlines(true);
    outputFormat1.setIndent("  ");
    outputFormat1.setTrimText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isXHTML();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setSuppressDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }


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
    outputFormat0.setXHTML(false);
    
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
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    outputFormat2.setPadText(false);
    char char5 = outputFormat2.getAttributeQuoteCharacter();
    int i6 = outputFormat2.getNewLineAfterNTags();
    outputFormat2.setTrimText(true);
    outputFormat2.setNewLineAfterDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char5 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndentSize(34);
    java.lang.String str13 = outputFormat0.getEncoding();
    outputFormat0.setTrimText(true);
    java.lang.String str16 = outputFormat0.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "UTF-8"+ "'", str13.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "                                  "+ "'", str16.equals("                                  "));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    int i6 = outputFormat0.getNewLineAfterNTags();
    java.lang.String str7 = outputFormat0.getEncoding();
    outputFormat0.setNewlines(false);
    java.lang.String str10 = outputFormat0.getEncoding();
    java.lang.String str11 = outputFormat0.getEncoding();
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "UTF-8"+ "'", str11.equals("UTF-8"));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setIndent("hi!");
    outputFormat1.setLineSeparator("  ");
    outputFormat1.setPadText(true);
    outputFormat1.setPadText(false);
    java.lang.String str16 = outputFormat1.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setIndent("UTF-8");
    boolean b5 = outputFormat0.isOmitEncoding();
    boolean b6 = outputFormat0.isTrimText();
    outputFormat0.setEncoding("hi!");
    outputFormat0.setOmitEncoding(false);
    boolean b11 = outputFormat0.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setOmitEncoding(true);
    outputFormat0.setExpandEmptyElements(true);
    outputFormat0.setEncoding("\n");
    outputFormat0.setIndentSize((int)'\"');
    
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
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setNewlines(false);
    outputFormat1.setLineSeparator("");
    java.lang.String str9 = outputFormat1.getLineSeparator();
    boolean b10 = outputFormat1.isNewlines();
    outputFormat1.setIndent(true);
    
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
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    outputFormat0.setIndentSize((int)(short)0);
    int i7 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setIndent(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    outputFormat0.setTrimText(false);
    outputFormat0.setEncoding("\n");
    outputFormat0.setNewLineAfterNTags(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setIndentSize((int)(short)100);
    outputFormat0.setPadText(true);
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setExpandEmptyElements(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b5 = outputFormat0.isTrimText();
    boolean b6 = outputFormat0.isSuppressDeclaration();
    boolean b7 = outputFormat0.isTrimText();
    outputFormat0.setIndentSize(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }


    OutputFormat outputFormat3 = new OutputFormat("hi!", true, "UTF-8");
    boolean b4 = outputFormat3.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    boolean b3 = outputFormat2.isNewlines();
    outputFormat2.setLineSeparator("");
    int i6 = outputFormat2.getNewLineAfterNTags();
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
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    boolean b8 = outputFormat1.isXHTML();
    boolean b9 = outputFormat1.isTrimText();
    outputFormat1.setIndent(true);
    boolean b12 = outputFormat1.isNewlines();
    
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
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }


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
    boolean b32 = outputFormat1.isXHTML();
    
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
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isTrimText();
    boolean b3 = outputFormat1.isXHTML();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    boolean b5 = outputFormat1.isSuppressDeclaration();
    
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
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setNewlines(false);
    outputFormat1.setLineSeparator("");
    java.lang.String str9 = outputFormat1.getLineSeparator();
    outputFormat1.setNewlines(false);
    outputFormat1.setPadText(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(false);
    java.lang.String str5 = outputFormat0.getEncoding();
    outputFormat0.setSuppressDeclaration(true);
    outputFormat0.setIndent(true);
    outputFormat0.setNewLineAfterDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "UTF-8"+ "'", str5.equals("UTF-8"));

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isExpandEmptyElements();
    int i4 = outputFormat1.getNewLineAfterNTags();
    outputFormat1.setIndent("          ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    boolean b8 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setNewlines(false);
    outputFormat0.setLineSeparator("");
    outputFormat0.setIndent("UTF-8");
    boolean b15 = outputFormat0.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    java.lang.String str5 = outputFormat0.getIndent();
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isNewlines();
    outputFormat0.setSuppressDeclaration(true);
    boolean b10 = outputFormat0.isOmitEncoding();
    
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
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setXHTML(true);
    java.lang.String str6 = outputFormat0.getLineSeparator();
    boolean b7 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setOmitEncoding(true);
    outputFormat0.setXHTML(false);
    boolean b12 = outputFormat0.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }


    OutputFormat outputFormat2 = new OutputFormat("hi!", false);
    outputFormat2.setNewLineAfterDeclaration(true);
    outputFormat2.setNewLineAfterNTags((int)'#');
    outputFormat2.setTrimText(true);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isSuppressDeclaration();
    outputFormat1.setNewlines(false);
    boolean b7 = outputFormat1.isXHTML();
    outputFormat1.setIndent("");
    OutputFormat outputFormat10 = OutputFormat.createCompactFormat();
    outputFormat10.setNewlines(false);
    outputFormat10.setNewLineAfterDeclaration(false);
    boolean b15 = outputFormat10.isTrimText();
    boolean b16 = outputFormat10.isPadText();
    OutputFormat outputFormat17 = OutputFormat.createCompactFormat();
    outputFormat17.setNewlines(false);
    boolean b20 = outputFormat17.isNewLineAfterDeclaration();
    outputFormat17.setNewlines(true);
    outputFormat17.setExpandEmptyElements(true);
    java.lang.String str25 = outputFormat17.getLineSeparator();
    outputFormat17.setNewlines(false);
    OutputFormat outputFormat28 = OutputFormat.createCompactFormat();
    java.lang.String str29 = outputFormat28.getLineSeparator();
    java.lang.String[] str_array33 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i35 = outputFormat28.parseOptions(str_array33, (int)' ');
    int i37 = outputFormat17.parseOptions(str_array33, (int)' ');
    int i39 = outputFormat10.parseOptions(str_array33, (int)(short)10);
    OutputFormat outputFormat40 = OutputFormat.createCompactFormat();
    outputFormat40.setNewlines(false);
    outputFormat40.setNewLineAfterDeclaration(false);
    boolean b45 = outputFormat40.isTrimText();
    boolean b46 = outputFormat40.isPadText();
    OutputFormat outputFormat47 = OutputFormat.createCompactFormat();
    outputFormat47.setNewlines(false);
    boolean b50 = outputFormat47.isNewLineAfterDeclaration();
    outputFormat47.setNewlines(true);
    outputFormat47.setExpandEmptyElements(true);
    java.lang.String str55 = outputFormat47.getLineSeparator();
    outputFormat47.setNewlines(false);
    OutputFormat outputFormat58 = OutputFormat.createCompactFormat();
    java.lang.String str59 = outputFormat58.getLineSeparator();
    java.lang.String[] str_array63 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i65 = outputFormat58.parseOptions(str_array63, (int)' ');
    int i67 = outputFormat47.parseOptions(str_array63, (int)' ');
    int i69 = outputFormat40.parseOptions(str_array63, (int)(short)10);
    int i71 = outputFormat10.parseOptions(str_array63, (int)(short)100);
    int i73 = outputFormat1.parseOptions(str_array63, 100);
    int i74 = outputFormat1.getNewLineAfterNTags();
    outputFormat1.setLineSeparator("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\n"+ "'", str25.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "\n"+ "'", str29.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "\n"+ "'", str55.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "\n"+ "'", str59.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }


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
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterNTags(35);
    
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
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", true, "hi!");
    boolean b4 = outputFormat3.isPadText();
    boolean b5 = outputFormat3.isTrimText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }


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
    outputFormat0.setNewLineAfterNTags(52);
    
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
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setNewlines(true);
    outputFormat0.setExpandEmptyElements(true);
    java.lang.String str8 = outputFormat0.getLineSeparator();
    boolean b9 = outputFormat0.isOmitEncoding();
    boolean b10 = outputFormat0.isNewLineAfterDeclaration();
    boolean b11 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setIndent("hi!");
    outputFormat0.setPadText(true);
    
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
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    char char5 = outputFormat0.getAttributeQuoteCharacter();
    outputFormat0.setNewLineAfterDeclaration(false);
    boolean b8 = outputFormat0.isOmitEncoding();
    outputFormat0.setIndentSize(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char5 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", true, "          ");
    boolean b4 = outputFormat3.isExpandEmptyElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    boolean b1 = outputFormat0.isTrimText();
    outputFormat0.setPadText(false);
    java.lang.String str4 = outputFormat0.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "UTF-8"+ "'", str4.equals("UTF-8"));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setXHTML(true);
    java.lang.String str5 = outputFormat0.getLineSeparator();
    outputFormat0.setIndent(true);
    outputFormat0.setExpandEmptyElements(false);
    outputFormat0.setLineSeparator("\n");
    OutputFormat outputFormat12 = OutputFormat.createCompactFormat();
    outputFormat12.setNewlines(false);
    boolean b15 = outputFormat12.isNewLineAfterDeclaration();
    outputFormat12.setNewlines(true);
    outputFormat12.setExpandEmptyElements(true);
    java.lang.String str20 = outputFormat12.getLineSeparator();
    outputFormat12.setNewlines(false);
    java.lang.String str23 = outputFormat12.getIndent();
    java.lang.String str24 = outputFormat12.getLineSeparator();
    int i25 = outputFormat12.getNewLineAfterNTags();
    outputFormat12.setExpandEmptyElements(false);
    outputFormat12.setExpandEmptyElements(true);
    java.lang.String[] str_array31 = new java.lang.String[] { "  " };
    int i33 = outputFormat12.parseOptions(str_array31, (int)(byte)0);
    int i35 = outputFormat0.parseOptions(str_array31, (int)'4');
    boolean b36 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setIndentSize((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n"+ "'", str5.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\n"+ "'", str20.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "\n"+ "'", str24.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    java.lang.String str3 = outputFormat0.getEncoding();
    outputFormat0.setIndentSize(10);
    int i6 = outputFormat0.getNewLineAfterNTags();
    outputFormat0.setSuppressDeclaration(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8"+ "'", str3.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }


    OutputFormat outputFormat2 = new OutputFormat("\n", false);
    outputFormat2.setIndent(true);
    boolean b5 = outputFormat2.isNewLineAfterDeclaration();
    outputFormat2.setIndentSize((int)'\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setNewLineAfterDeclaration(false);
    java.lang.String str5 = outputFormat0.getIndent();
    java.lang.String str6 = outputFormat0.getLineSeparator();
    outputFormat0.setIndent("  ");
    java.lang.String str9 = outputFormat0.getIndent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "  "+ "'", str9.equals("  "));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    boolean b6 = outputFormat3.isNewLineAfterDeclaration();
    boolean b7 = outputFormat3.isSuppressDeclaration();
    char char8 = outputFormat3.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char8 == '\"');

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    outputFormat2.setIndent(true);
    java.lang.String str5 = outputFormat2.getIndent();
    outputFormat2.setTrimText(false);
    boolean b8 = outputFormat2.isNewlines();
    java.lang.String str9 = outputFormat2.getIndent();
    boolean b10 = outputFormat2.isTrimText();
    boolean b11 = outputFormat2.isNewlines();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "  "+ "'", str5.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "  "+ "'", str9.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }


    OutputFormat outputFormat3 = new OutputFormat("", false, "");
    outputFormat3.setPadText(false);
    outputFormat3.setNewlines(true);
    java.lang.String str8 = outputFormat3.getEncoding();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }


    OutputFormat outputFormat3 = new OutputFormat("UTF-8", false, "          ");
    outputFormat3.setNewlines(false);
    outputFormat3.setExpandEmptyElements(false);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setNewlines(false);
    outputFormat0.setLineSeparator("\n");
    outputFormat0.setIndentSize((int)(byte)10);
    outputFormat0.setExpandEmptyElements(false);
    java.lang.String str9 = outputFormat0.getIndent();
    outputFormat0.setNewLineAfterDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "          "+ "'", str9.equals("          "));

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }


    OutputFormat outputFormat3 = new OutputFormat("", true, "UTF-8");
    boolean b4 = outputFormat3.isNewlines();
    outputFormat3.setNewlines(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    outputFormat1.setAttributeQuoteCharacter('\"');
    outputFormat1.setTrimText(true);
    boolean b12 = outputFormat1.isPadText();
    outputFormat1.setIndent("UTF-8");
    
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
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }


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
    outputFormat0.setIndentSize(32);
    outputFormat0.setNewlines(true);
    
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
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    boolean b6 = outputFormat1.isNewLineAfterDeclaration();
    outputFormat1.setLineSeparator("hi!");
    outputFormat1.setLineSeparator("");
    boolean b11 = outputFormat1.isXHTML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }


    OutputFormat outputFormat3 = new OutputFormat("\n", false, "\n");

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    java.lang.String str3 = outputFormat0.getEncoding();
    boolean b4 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setEncoding("  ");
    outputFormat0.setNewLineAfterNTags((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "UTF-8"+ "'", str3.equals("UTF-8"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    boolean b4 = outputFormat1.isXHTML();
    outputFormat1.setSuppressDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }


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
    java.lang.String str27 = outputFormat0.getLineSeparator();
    outputFormat0.setPadText(true);
    outputFormat0.setNewLineAfterDeclaration(true);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }


    OutputFormat outputFormat2 = new OutputFormat("", false);
    outputFormat2.setIndent(true);
    java.lang.String str5 = outputFormat2.getIndent();
    boolean b6 = outputFormat2.isExpandEmptyElements();
    outputFormat2.setExpandEmptyElements(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "  "+ "'", str5.equals("  "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    outputFormat0.setTrimText(false);
    boolean b3 = outputFormat0.isNewLineAfterDeclaration();
    outputFormat0.setIndent("");
    outputFormat0.setNewLineAfterDeclaration(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    java.lang.String[] str_array5 = new java.lang.String[] { "", "\n" };
    int i7 = outputFormat1.parseOptions(str_array5, (int)(byte)1);
    boolean b8 = outputFormat1.isXHTML();
    boolean b9 = outputFormat1.isTrimText();
    outputFormat1.setXHTML(true);
    boolean b12 = outputFormat1.isExpandEmptyElements();
    outputFormat1.setIndent(true);
    OutputFormat outputFormat15 = OutputFormat.createCompactFormat();
    outputFormat15.setNewlines(false);
    outputFormat15.setXHTML(true);
    outputFormat15.setNewLineAfterDeclaration(false);
    char char22 = outputFormat15.getAttributeQuoteCharacter();
    outputFormat15.setEncoding("\n");
    OutputFormat outputFormat28 = new OutputFormat("", false, "");
    OutputFormat outputFormat29 = OutputFormat.createCompactFormat();
    java.lang.String str30 = outputFormat29.getLineSeparator();
    java.lang.String[] str_array34 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i36 = outputFormat29.parseOptions(str_array34, (int)' ');
    int i38 = outputFormat28.parseOptions(str_array34, (int)(short)0);
    outputFormat28.setOmitEncoding(true);
    boolean b41 = outputFormat28.isOmitEncoding();
    OutputFormat outputFormat43 = new OutputFormat("hi!");
    outputFormat43.setIndent(true);
    outputFormat43.setEncoding("");
    OutputFormat outputFormat48 = OutputFormat.createCompactFormat();
    outputFormat48.setNewlines(false);
    boolean b51 = outputFormat48.isNewLineAfterDeclaration();
    outputFormat48.setNewlines(true);
    outputFormat48.setExpandEmptyElements(true);
    java.lang.String str56 = outputFormat48.getLineSeparator();
    outputFormat48.setNewlines(false);
    outputFormat48.setXHTML(false);
    outputFormat48.setPadText(false);
    OutputFormat outputFormat63 = OutputFormat.createCompactFormat();
    outputFormat63.setNewlines(false);
    boolean b66 = outputFormat63.isNewLineAfterDeclaration();
    outputFormat63.setNewlines(true);
    outputFormat63.setExpandEmptyElements(true);
    java.lang.String str71 = outputFormat63.getLineSeparator();
    outputFormat63.setNewlines(false);
    OutputFormat outputFormat74 = OutputFormat.createCompactFormat();
    java.lang.String str75 = outputFormat74.getLineSeparator();
    java.lang.String[] str_array79 = new java.lang.String[] { "  ", "hi!", "\n" };
    int i81 = outputFormat74.parseOptions(str_array79, (int)' ');
    int i83 = outputFormat63.parseOptions(str_array79, (int)' ');
    int i85 = outputFormat48.parseOptions(str_array79, (int)' ');
    int i87 = outputFormat43.parseOptions(str_array79, 100);
    int i89 = outputFormat28.parseOptions(str_array79, (int)(short)1);
    int i91 = outputFormat15.parseOptions(str_array79, (int)(short)100);
    int i93 = outputFormat1.parseOptions(str_array79, 35);
    
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
    org.junit.Assert.assertNotNull(outputFormat15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char22 == '\"');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "\n"+ "'", str30.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "\n"+ "'", str56.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "\n"+ "'", str71.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(outputFormat74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "\n"+ "'", str75.equals("\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 35);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }


    OutputFormat outputFormat1 = new OutputFormat("hi!");
    boolean b2 = outputFormat1.isOmitEncoding();
    boolean b3 = outputFormat1.isPadText();
    outputFormat1.setNewLineAfterDeclaration(false);
    java.lang.String str6 = outputFormat1.getIndent();
    outputFormat1.setTrimText(true);
    char char9 = outputFormat1.getAttributeQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(char9 == '\"');

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }


    OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
    boolean b1 = outputFormat0.isTrimText();
    boolean b2 = outputFormat0.isSuppressDeclaration();
    outputFormat0.setSuppressDeclaration(true);
    int i5 = outputFormat0.getNewLineAfterNTags();
    boolean b6 = outputFormat0.isExpandEmptyElements();
    outputFormat0.setTrimText(false);
    
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

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }


    OutputFormat outputFormat2 = new OutputFormat("\n", false);
    outputFormat2.setIndent(true);
    boolean b5 = outputFormat2.isNewLineAfterDeclaration();
    java.lang.String str6 = outputFormat2.getLineSeparator();
    outputFormat2.setOmitEncoding(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n"+ "'", str6.equals("\n"));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }


    OutputFormat outputFormat3 = new OutputFormat("                                                                                                    ", false, "                                                                                                    ");

  }

}
