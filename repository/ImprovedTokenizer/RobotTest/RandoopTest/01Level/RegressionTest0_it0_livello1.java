
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    int i0 = ImprovedTokenizer.STATE_START;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    int i0 = ImprovedTokenizer.BUF_SIZE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 128);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    int i0 = ImprovedTokenizer.STATE_BEFORE_TOKEN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    int i0 = ImprovedTokenizer.STATE_STOP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    int i4 = improvedTokenizer2.beforeToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    int i0 = ImprovedTokenizer.STATE_MATCHING_TOKEN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 3);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    int i0 = ImprovedTokenizer.STATE_MATCH_STOP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 5);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    int i4 = improvedTokenizer2.beforeToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i3 = improvedTokenizer2.stop();
    java.io.InputStream inputStream4 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream4, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i3 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    // The following exception was thrown during execution in test generation
    try {
    int i9 = improvedTokenizer2.afterToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    int i0 = ImprovedTokenizer.STATE_AFTER_TOKEN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    // The following exception was thrown during execution in test generation
    try {
    int i8 = improvedTokenizer2.afterToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "");
    // The following exception was thrown during execution in test generation
    try {
    int i4 = improvedTokenizer2.afterToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i3 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i5 = improvedTokenizer2.matchingToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    // The following exception was thrown during execution in test generation
    try {
    int i11 = improvedTokenizer2.matchingToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i3 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i5 = improvedTokenizer2.afterToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.io.InputStream inputStream3 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream3, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    boolean b8 = improvedTokenizer2.keepParsing(5);
    java.io.InputStream inputStream9 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream9, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    // The following exception was thrown during execution in test generation
    try {
    int i11 = improvedTokenizer2.beforeToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.io.InputStream inputStream4 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream4, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    boolean b8 = improvedTokenizer2.keepParsing(5);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i9 = improvedTokenizer2.start(' ');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i9 = improvedTokenizer2.start(' ');
    int i10 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i12 = improvedTokenizer2.afterToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    int i7 = improvedTokenizer2.afterToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i3 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    // The following exception was thrown during execution in test generation
    try {
    int i9 = improvedTokenizer2.afterToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    int i7 = improvedTokenizer2.beforeToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)100);
    int i9 = improvedTokenizer2.beforeToken('#');
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    boolean b9 = improvedTokenizer2.keepParsing((int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    int i11 = improvedTokenizer2.beforeToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    // The following exception was thrown during execution in test generation
    try {
    int i8 = improvedTokenizer2.beforeToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    java.io.InputStream inputStream3 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream3, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i9 = improvedTokenizer2.start(' ');
    int i10 = improvedTokenizer2.stop();
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "");
    // The following exception was thrown during execution in test generation
    try {
    int i15 = improvedTokenizer2.matchingToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    // The following exception was thrown during execution in test generation
    try {
    int i11 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    int i4 = improvedTokenizer2.afterToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    boolean b3 = improvedTokenizer2.advance();
    boolean b5 = improvedTokenizer2.keepParsing(4);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str6 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str6 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    int i8 = improvedTokenizer2.start('4');
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    java.io.InputStream inputStream8 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream8, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    int i7 = improvedTokenizer2.start('a');
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    // The following exception was thrown during execution in test generation
    try {
    int i4 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    boolean b8 = improvedTokenizer2.keepParsing(5);
    // The following exception was thrown during execution in test generation
    try {
    int i10 = improvedTokenizer2.matchingToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    boolean b9 = improvedTokenizer2.keepParsing((int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    java.io.Reader reader10 = null;
    improvedTokenizer2.initialize(reader10, "");
    java.io.InputStream inputStream13 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream13, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    java.io.InputStream inputStream11 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream11, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('#');
    // The following exception was thrown during execution in test generation
    try {
    int i13 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream5 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream5, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i5 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i7 = improvedTokenizer2.afterToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.io.InputStream inputStream7 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream7, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    int i12 = improvedTokenizer2.afterToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream5 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream5, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "hi!");
    int i6 = improvedTokenizer2.stop();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    boolean b3 = improvedTokenizer2.advance();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    java.lang.String str5 = improvedTokenizer2.next();
    java.io.InputStream inputStream6 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream6, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "");
    // The following exception was thrown during execution in test generation
    try {
    int i4 = improvedTokenizer2.beforeToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('a');
    // The following exception was thrown during execution in test generation
    try {
    int i13 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('a');
    boolean b13 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    int i14 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    java.lang.String str5 = improvedTokenizer2.next();
    java.io.InputStream inputStream6 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream6, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    // The following exception was thrown during execution in test generation
    try {
    int i13 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream5 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream5, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    int i8 = improvedTokenizer2.afterToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    java.lang.String str5 = improvedTokenizer2.next();
    // The following exception was thrown during execution in test generation
    try {
    int i6 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    int i7 = improvedTokenizer2.stop();
    int i8 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i10 = improvedTokenizer2.matchingToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i9 = improvedTokenizer2.start(' ');
    int i10 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i9 = improvedTokenizer2.start(' ');
    int i10 = improvedTokenizer2.stop();
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "");
    java.io.InputStream inputStream14 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream14, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    boolean b8 = improvedTokenizer2.keepParsing(4);
    // The following exception was thrown during execution in test generation
    try {
    int i10 = improvedTokenizer2.matchingToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    // The following exception was thrown during execution in test generation
    try {
    int i9 = improvedTokenizer2.beforeToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.beforeToken('4');
    int i10 = improvedTokenizer2.afterToken('a');
    java.io.InputStream inputStream11 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream11, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    int i7 = improvedTokenizer2.afterToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    int i8 = improvedTokenizer2.matchingToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    int i8 = improvedTokenizer2.beforeToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('#');
    int i14 = improvedTokenizer2.beforeToken('a');
    java.io.InputStream inputStream15 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream15, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    // The following exception was thrown during execution in test generation
    try {
    int i6 = improvedTokenizer2.afterToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "hi!");
    int i6 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    boolean b3 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream4 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream4, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i8 = improvedTokenizer2.afterToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    java.io.InputStream inputStream3 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream3, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    // The following exception was thrown during execution in test generation
    try {
    int i9 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    int i8 = improvedTokenizer2.beforeToken('#');
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken('#');
    // The following exception was thrown during execution in test generation
    try {
    int i13 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream6 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream6, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    boolean b8 = improvedTokenizer2.keepParsing((int)(short)100);
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "");
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    boolean b6 = improvedTokenizer2.keepParsing((int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    java.lang.String str8 = improvedTokenizer2.next();
    int i10 = improvedTokenizer2.start('4');
    // The following exception was thrown during execution in test generation
    try {
    int i11 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " "+ "'", str7.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, " ");
    int i3 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    int i7 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    int i7 = improvedTokenizer2.start('a');
    boolean b9 = improvedTokenizer2.keepParsing((int)(byte)-1);
    java.io.InputStream inputStream10 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream10, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    java.io.Reader reader10 = null;
    improvedTokenizer2.initialize(reader10, "");
    java.io.InputStream inputStream13 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream13, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    java.io.InputStream inputStream13 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream13, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.start('#');
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    int i7 = improvedTokenizer2.stop();
    int i8 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.beforeToken(' ');
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "hi!");
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, " ");
    boolean b15 = improvedTokenizer2.keepParsing(10);
    java.io.InputStream inputStream16 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream16, "4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    boolean b8 = improvedTokenizer2.keepParsing(5);
    // The following exception was thrown during execution in test generation
    try {
    int i10 = improvedTokenizer2.matchingToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    // The following exception was thrown during execution in test generation
    try {
    int i13 = improvedTokenizer2.afterToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.beforeToken(' ');
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    int i12 = improvedTokenizer2.matchingToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.beforeToken(' ');
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i3 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i5 = improvedTokenizer2.beforeToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.InputStream inputStream5 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream5, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    java.io.InputStream inputStream4 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream4, "4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    int i8 = improvedTokenizer2.start('4');
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, " ");
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    boolean b8 = improvedTokenizer2.keepParsing(4);
    // The following exception was thrown during execution in test generation
    try {
    int i10 = improvedTokenizer2.afterToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "");
    boolean b3 = improvedTokenizer2.advance();
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.beforeToken('4');
    int i10 = improvedTokenizer2.afterToken('a');
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, " ");
    java.io.InputStream inputStream14 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream14, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    int i5 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str6 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.beforeToken('4');
    // The following exception was thrown during execution in test generation
    try {
    int i9 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i8 = improvedTokenizer2.stop();
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    java.io.InputStream inputStream10 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream10, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " "+ "'", str7.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    boolean b8 = improvedTokenizer2.keepParsing(4);
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", " ");
    boolean b3 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    java.lang.String str9 = improvedTokenizer2.next();
    int i11 = improvedTokenizer2.beforeToken('4');
    boolean b13 = improvedTokenizer2.keepParsing((int)(byte)100);
    int i15 = improvedTokenizer2.start(' ');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    java.lang.String str9 = improvedTokenizer2.next();
    int i11 = improvedTokenizer2.beforeToken('4');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "hi!");
    int i6 = improvedTokenizer2.stop();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i8 = improvedTokenizer2.stop();
    java.io.InputStream inputStream9 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream9, "4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken('#');
    java.io.InputStream inputStream13 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream13, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.matchingToken('a');
    int i8 = improvedTokenizer2.matchingToken('a');
    int i10 = improvedTokenizer2.beforeToken(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)100);
    int i9 = improvedTokenizer2.afterToken(' ');
    java.lang.String str10 = improvedTokenizer2.next();
    java.io.InputStream inputStream11 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream11, "4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i9 = improvedTokenizer2.start(' ');
    int i10 = improvedTokenizer2.stop();
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "");
    int i15 = improvedTokenizer2.start('a');
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "");
    int i4 = improvedTokenizer2.start(' ');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    boolean b9 = improvedTokenizer2.keepParsing((int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    int i11 = improvedTokenizer2.beforeToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.start('#');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "");
    // The following exception was thrown during execution in test generation
    try {
    int i20 = improvedTokenizer2.afterToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('4');
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    boolean b8 = improvedTokenizer2.keepParsing(4);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    java.lang.String str9 = improvedTokenizer2.next();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    int i7 = improvedTokenizer2.stop();
    int i8 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i10 = improvedTokenizer2.matchingToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, " ");
    // The following exception was thrown during execution in test generation
    try {
    int i4 = improvedTokenizer2.matchingToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "hi!");
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    int i8 = improvedTokenizer2.matchingToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    java.io.Reader reader10 = null;
    improvedTokenizer2.initialize(reader10, "");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.beforeToken(' ');
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "hi!");
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, " ");
    boolean b15 = improvedTokenizer2.keepParsing((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", " ");
    java.io.InputStream inputStream3 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream3, "a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    boolean b5 = improvedTokenizer2.hasNext();
    boolean b7 = improvedTokenizer2.keepParsing(0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "4");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str3 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "a");
    boolean b3 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    int i4 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.InputStream inputStream5 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream5, "a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.beforeToken(' ');
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "hi!");
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, " ");
    boolean b15 = improvedTokenizer2.keepParsing(10);
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "");
    // The following exception was thrown during execution in test generation
    try {
    int i20 = improvedTokenizer2.afterToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.beforeToken(' ');
    // The following exception was thrown during execution in test generation
    try {
    int i8 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.matchingToken('a');
    boolean b7 = improvedTokenizer2.advance();
    int i9 = improvedTokenizer2.start('4');
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    // The following exception was thrown during execution in test generation
    try {
    int i9 = improvedTokenizer2.beforeToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.beforeToken('4');
    boolean b9 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    boolean b3 = improvedTokenizer2.advance();
    boolean b4 = improvedTokenizer2.advance();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('#');
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('a');
    int i14 = improvedTokenizer2.afterToken('a');
    boolean b15 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    int i16 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "hi!");
    int i6 = improvedTokenizer2.stop();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i8 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    int i13 = improvedTokenizer2.start(' ');
    int i15 = improvedTokenizer2.start('a');
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    int i4 = improvedTokenizer2.stop();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    boolean b7 = improvedTokenizer2.keepParsing((int)(byte)100);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('#');
    int i14 = improvedTokenizer2.start(' ');
    java.io.InputStream inputStream15 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream15, "a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    int i8 = improvedTokenizer2.start(' ');
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    int i10 = improvedTokenizer2.stop();
    java.io.InputStream inputStream11 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream11, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    int i7 = improvedTokenizer2.matchingToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", "4");
    java.lang.String str3 = improvedTokenizer2.next();
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "a"+ "'", str3.equals("a"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i9 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.beforeToken(' ');
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "hi!");
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, " ");
    boolean b15 = improvedTokenizer2.keepParsing(10);
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "");
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('#');
    int i14 = improvedTokenizer2.start(' ');
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('a');
    int i14 = improvedTokenizer2.beforeToken('4');
    java.io.InputStream inputStream15 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream15, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "");
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('a');
    boolean b13 = improvedTokenizer2.hasNext();
    int i15 = improvedTokenizer2.start('a');
    // The following exception was thrown during execution in test generation
    try {
    int i16 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    int i7 = improvedTokenizer2.start('a');
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    int i13 = improvedTokenizer2.start(' ');
    int i15 = improvedTokenizer2.start('a');
    int i17 = improvedTokenizer2.matchingToken('4');
    java.io.InputStream inputStream18 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream18, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    java.lang.String str9 = improvedTokenizer2.next();
    int i11 = improvedTokenizer2.beforeToken('4');
    int i13 = improvedTokenizer2.matchingToken(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.start('#');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "");
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    int i8 = improvedTokenizer2.afterToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "hi!");
    int i6 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i9 = improvedTokenizer2.beforeToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    boolean b3 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.start('#');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str6 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "");
    java.io.InputStream inputStream3 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream3, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream6 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream6, "4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b6 = improvedTokenizer2.keepParsing(0);
    java.io.InputStream inputStream7 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream7, "a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    int i16 = improvedTokenizer2.beforeToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)100);
    java.io.InputStream inputStream8 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream8, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    int i4 = improvedTokenizer2.stop();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    boolean b7 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b8 = improvedTokenizer2.advance();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b6 = improvedTokenizer2.keepParsing(0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i9 = improvedTokenizer2.start(' ');
    int i10 = improvedTokenizer2.stop();
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "");
    int i15 = improvedTokenizer2.start('a');
    int i17 = improvedTokenizer2.start(' ');
    int i18 = improvedTokenizer2.stop();
    int i20 = improvedTokenizer2.start(' ');
    java.io.InputStream inputStream21 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream21, "a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    int i7 = improvedTokenizer2.start('a');
    int i9 = improvedTokenizer2.matchingToken('4');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    boolean b3 = improvedTokenizer2.advance();
    boolean b4 = improvedTokenizer2.advance();
    boolean b5 = improvedTokenizer2.advance();
    java.io.Reader reader6 = null;
    improvedTokenizer2.initialize(reader6, "");
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    java.lang.String str5 = improvedTokenizer2.next();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    int i7 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i9 = improvedTokenizer2.stop();
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    int i12 = improvedTokenizer2.matchingToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    int i13 = improvedTokenizer2.start(' ');
    java.io.Reader reader14 = null;
    improvedTokenizer2.initialize(reader14, "");
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "a");
    // The following exception was thrown during execution in test generation
    try {
    int i4 = improvedTokenizer2.beforeToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.afterToken('a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.keepParsing((int)(byte)0);
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    boolean b11 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream12 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream12, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " "+ "'", str7.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " "+ "'", str10.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    java.io.InputStream inputStream4 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream4, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    // The following exception was thrown during execution in test generation
    try {
    int i11 = improvedTokenizer2.beforeToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, " ");
    int i3 = improvedTokenizer2.stop();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    java.io.InputStream inputStream5 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream5, "4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.beforeToken(' ');
    boolean b8 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream9 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream9, "4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.keepParsing((int)(byte)0);
    java.io.Reader reader10 = null;
    improvedTokenizer2.initialize(reader10, " ");
    // The following exception was thrown during execution in test generation
    try {
    int i14 = improvedTokenizer2.afterToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " "+ "'", str7.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    boolean b8 = improvedTokenizer2.keepParsing(4);
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    int i13 = improvedTokenizer2.afterToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.keepParsing((int)(byte)0);
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " "+ "'", str7.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " "+ "'", str10.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + " "+ "'", str11.equals(" "));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.beforeToken(' ');
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "hi!");
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i8 = improvedTokenizer2.stop();
    java.io.InputStream inputStream9 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream9, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " "+ "'", str7.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    int i4 = improvedTokenizer2.stop();
    boolean b5 = improvedTokenizer2.advance();
    java.io.Reader reader6 = null;
    improvedTokenizer2.initialize(reader6, " ");
    // The following exception was thrown during execution in test generation
    try {
    int i10 = improvedTokenizer2.matchingToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i9 = improvedTokenizer2.stop();
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    int i12 = improvedTokenizer2.beforeToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i3 = improvedTokenizer2.stop();
    java.io.InputStream inputStream4 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream4, "a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.afterToken('a');
    java.io.InputStream inputStream11 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream11, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    java.lang.String str9 = improvedTokenizer2.next();
    int i11 = improvedTokenizer2.beforeToken('4');
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "");
    // The following exception was thrown during execution in test generation
    try {
    int i16 = improvedTokenizer2.afterToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.start('#');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.matchingToken('a');
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i9 = improvedTokenizer2.stop();
    int i10 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i12 = improvedTokenizer2.beforeToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "");
    int i4 = improvedTokenizer2.start(' ');
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "");
    java.lang.String str3 = improvedTokenizer2.next();
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4"+ "'", str3.equals("4"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "4");
    int i3 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    // The following exception was thrown during execution in test generation
    try {
    int i6 = improvedTokenizer2.matchingToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)100);
    boolean b8 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    int i9 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.start('#');
    int i16 = improvedTokenizer2.beforeToken('#');
    int i18 = improvedTokenizer2.start('a');
    // The following exception was thrown during execution in test generation
    try {
    int i19 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing((int)(short)-1);
    int i6 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i9 = improvedTokenizer2.stop();
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    int i12 = improvedTokenizer2.afterToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "");
    java.lang.String str3 = improvedTokenizer2.next();
    java.io.InputStream inputStream4 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream4, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    java.lang.String str8 = improvedTokenizer2.next();
    boolean b10 = improvedTokenizer2.keepParsing((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    int i11 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " "+ "'", str7.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    java.lang.String str9 = improvedTokenizer2.next();
    int i11 = improvedTokenizer2.beforeToken('4');
    int i13 = improvedTokenizer2.afterToken('a');
    int i15 = improvedTokenizer2.beforeToken(' ');
    int i17 = improvedTokenizer2.afterToken('a');
    java.io.InputStream inputStream18 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream18, "a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    int i4 = improvedTokenizer2.stop();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.stop();
    java.io.InputStream inputStream7 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream7, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing((int)(short)-1);
    java.io.InputStream inputStream6 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream6, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "hi!");
    int i6 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)100);
    int i9 = improvedTokenizer2.beforeToken('#');
    // The following exception was thrown during execution in test generation
    try {
    int i10 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.beforeToken('4');
    int i10 = improvedTokenizer2.beforeToken('4');
    boolean b11 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.beforeToken('4');
    // The following exception was thrown during execution in test generation
    try {
    int i8 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    boolean b8 = improvedTokenizer2.keepParsing(4);
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    int i13 = improvedTokenizer2.beforeToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)0);
    java.io.InputStream inputStream15 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream15, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    int i4 = improvedTokenizer2.stop();
    boolean b5 = improvedTokenizer2.advance();
    java.io.Reader reader6 = null;
    improvedTokenizer2.initialize(reader6, " ");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    java.io.InputStream inputStream8 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream8, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " "+ "'", str7.equals(" "));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    int i8 = improvedTokenizer2.start('#');
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i9 = improvedTokenizer2.start(' ');
    int i11 = improvedTokenizer2.matchingToken(' ');
    int i13 = improvedTokenizer2.start('a');
    int i15 = improvedTokenizer2.beforeToken('a');
    int i16 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i18 = improvedTokenizer2.matchingToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    boolean b6 = improvedTokenizer2.keepParsing((int)(short)100);
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "hi!");
    int i15 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    int i8 = improvedTokenizer2.afterToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i5 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    int i4 = improvedTokenizer2.stop();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    boolean b7 = improvedTokenizer2.keepParsing((int)(byte)100);
    int i8 = improvedTokenizer2.stop();
    int i10 = improvedTokenizer2.start('#');
    boolean b11 = improvedTokenizer2.advance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    boolean b9 = improvedTokenizer2.keepParsing((int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, " ");
    int i3 = improvedTokenizer2.stop();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.beforeToken(' ');
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "hi!");
    int i12 = improvedTokenizer2.start('4');
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i8 = improvedTokenizer2.beforeToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('a');
    int i14 = improvedTokenizer2.afterToken('a');
    boolean b15 = improvedTokenizer2.hasNext();
    boolean b16 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    int i17 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    boolean b8 = improvedTokenizer2.keepParsing((int)(short)100);
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "");
    java.io.InputStream inputStream12 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream12, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i9 = improvedTokenizer2.stop();
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.afterToken('a');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i3 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i5 = improvedTokenizer2.afterToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.beforeToken(' ');
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "a"+ "'", str8.equals("a"));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    java.lang.String str9 = improvedTokenizer2.next();
    int i11 = improvedTokenizer2.beforeToken('4');
    int i13 = improvedTokenizer2.afterToken('a');
    int i15 = improvedTokenizer2.beforeToken(' ');
    int i17 = improvedTokenizer2.beforeToken('a');
    boolean b18 = improvedTokenizer2.advance();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "hi!");
    int i6 = improvedTokenizer2.stop();
    int i7 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i9 = improvedTokenizer2.start(' ');
    int i11 = improvedTokenizer2.beforeToken('4');
    int i12 = improvedTokenizer2.stop();
    java.io.InputStream inputStream13 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream13, "4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.start('#');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    int i18 = improvedTokenizer2.matchingToken('a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i3 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i5 = improvedTokenizer2.beforeToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.keepParsing((int)(byte)0);
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    int i12 = improvedTokenizer2.afterToken('a');
    java.lang.String str13 = improvedTokenizer2.next();
    boolean b15 = improvedTokenizer2.keepParsing((int)'4');
    boolean b17 = improvedTokenizer2.keepParsing(128);
    java.io.InputStream inputStream18 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream18, "4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " "+ "'", str7.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " "+ "'", str10.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "");
    int i4 = improvedTokenizer2.start(' ');
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    java.io.InputStream inputStream8 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream8, "a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.beforeToken(' ');
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "hi!");
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, " ");
    java.io.InputStream inputStream14 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream14, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.keepParsing((int)(byte)0);
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    java.lang.String str11 = improvedTokenizer2.next();
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "4");
    java.io.InputStream inputStream15 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream15, "a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " "+ "'", str7.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " "+ "'", str10.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i9 = improvedTokenizer2.stop();
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    int i12 = improvedTokenizer2.afterToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    java.lang.String str8 = improvedTokenizer2.next();
    // The following exception was thrown during execution in test generation
    try {
    int i9 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " "+ "'", str7.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    boolean b3 = improvedTokenizer2.advance();
    boolean b4 = improvedTokenizer2.advance();
    boolean b5 = improvedTokenizer2.advance();
    java.io.Reader reader6 = null;
    improvedTokenizer2.initialize(reader6, "");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('a');
    boolean b13 = improvedTokenizer2.hasNext();
    java.io.Reader reader14 = null;
    improvedTokenizer2.initialize(reader14, "4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.beforeToken('4');
    boolean b10 = improvedTokenizer2.keepParsing(1);
    // The following exception was thrown during execution in test generation
    try {
    int i11 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    java.io.Reader reader4 = null;
    improvedTokenizer2.initialize(reader4, "4");
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    int i5 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    int i7 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(128);
    boolean b7 = improvedTokenizer2.keepParsing((int)(byte)100);
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.beforeToken('4');
    int i10 = improvedTokenizer2.afterToken('a');
    int i12 = improvedTokenizer2.beforeToken('4');
    java.lang.String str13 = improvedTokenizer2.next();
    boolean b15 = improvedTokenizer2.keepParsing(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('#');
    int i14 = improvedTokenizer2.beforeToken('a');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#"+ "'", str15.equals("#"));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.keepParsing((int)(byte)0);
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    int i12 = improvedTokenizer2.afterToken('a');
    java.lang.String str13 = improvedTokenizer2.next();
    // The following exception was thrown during execution in test generation
    try {
    int i14 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " "+ "'", str7.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " "+ "'", str10.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing((int)(short)-1);
    java.io.Reader reader6 = null;
    improvedTokenizer2.initialize(reader6, "a");
    int i10 = improvedTokenizer2.start(' ');
    java.io.InputStream inputStream11 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream11, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    boolean b4 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    int i5 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    int i16 = improvedTokenizer2.beforeToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.beforeToken(' ');
    boolean b8 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.matchingToken('#');
    java.io.InputStream inputStream11 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream11, "4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i8 = improvedTokenizer2.stop();
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    boolean b10 = improvedTokenizer2.advance();
    java.io.InputStream inputStream11 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream11, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " "+ "'", str7.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    java.io.InputStream inputStream9 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream9, "4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " "+ "'", str7.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " "+ "'", str8.equals(" "));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('#');
    int i14 = improvedTokenizer2.matchingToken('4');
    int i16 = improvedTokenizer2.start('a');
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    boolean b8 = improvedTokenizer2.keepParsing(10);
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, " ");
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "hi!");
    int i15 = improvedTokenizer2.stop();
    boolean b17 = improvedTokenizer2.keepParsing((int)(short)-1);
    java.io.Reader reader18 = null;
    improvedTokenizer2.initialize(reader18, "a");
    // The following exception was thrown during execution in test generation
    try {
    int i22 = improvedTokenizer2.matchingToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    int i4 = improvedTokenizer2.stop();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.stop();
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "4");
    boolean b11 = improvedTokenizer2.keepParsing((int)(short)1);
    int i13 = improvedTokenizer2.start('a');
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    boolean b3 = improvedTokenizer2.advance();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.start('a');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    int i13 = improvedTokenizer2.start(' ');
    int i15 = improvedTokenizer2.start('a');
    int i16 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.start('#');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "");
    // The following exception was thrown during execution in test generation
    try {
    int i20 = improvedTokenizer2.afterToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    java.lang.String str9 = improvedTokenizer2.next();
    int i11 = improvedTokenizer2.beforeToken('4');
    boolean b13 = improvedTokenizer2.keepParsing((int)(byte)100);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)100);
    int i9 = improvedTokenizer2.afterToken(' ');
    boolean b11 = improvedTokenizer2.keepParsing(3);
    int i13 = improvedTokenizer2.start('a');
    int i15 = improvedTokenizer2.matchingToken('4');
    java.io.InputStream inputStream16 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream16, "#");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.keepParsing((int)(byte)0);
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    int i11 = improvedTokenizer2.stop();
    java.io.InputStream inputStream12 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream12, "a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " "+ "'", str7.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " "+ "'", str10.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.matchingToken('a');
    java.io.InputStream inputStream8 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream8, "a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i9 = improvedTokenizer2.start(' ');
    int i10 = improvedTokenizer2.stop();
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "");
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i9 = improvedTokenizer2.start(' ');
    int i10 = improvedTokenizer2.stop();
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken('#');
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    int i15 = improvedTokenizer2.beforeToken('a');
    java.io.InputStream inputStream16 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream16, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "a"+ "'", str13.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i9 = improvedTokenizer2.start(' ');
    int i11 = improvedTokenizer2.matchingToken(' ');
    int i13 = improvedTokenizer2.start('a');
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    int i15 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('a');
    int i14 = improvedTokenizer2.afterToken('a');
    boolean b15 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.start('#');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "");
    int i19 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i21 = improvedTokenizer2.matchingToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str6 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    int i4 = improvedTokenizer2.stop();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    boolean b7 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b9 = improvedTokenizer2.keepParsing((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "a");
    boolean b3 = improvedTokenizer2.hasNext();
    int i5 = improvedTokenizer2.start(' ');
    java.io.InputStream inputStream6 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream6, "#");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    boolean b8 = improvedTokenizer2.keepParsing(4);
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "hi!");
    int i12 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i14 = improvedTokenizer2.beforeToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    // The following exception was thrown during execution in test generation
    try {
    int i13 = improvedTokenizer2.afterToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "4");
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.start('a');
    boolean b10 = improvedTokenizer2.advance();
    java.io.InputStream inputStream11 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream11, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "4");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "4");
    java.io.Reader reader6 = null;
    improvedTokenizer2.initialize(reader6, " ");
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.afterToken('a');
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    int i7 = improvedTokenizer2.start(' ');
    int i9 = improvedTokenizer2.start('a');
    java.io.InputStream inputStream10 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream10, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    int i8 = improvedTokenizer2.beforeToken('4');
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)100);
    int i9 = improvedTokenizer2.beforeToken('#');
    boolean b11 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b13 = improvedTokenizer2.keepParsing((int)' ');
    boolean b14 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream15 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream15, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    int i4 = improvedTokenizer2.stop();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    boolean b7 = improvedTokenizer2.keepParsing((int)(byte)100);
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    int i12 = improvedTokenizer2.matchingToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.beforeToken('4');
    int i10 = improvedTokenizer2.afterToken('a');
    int i12 = improvedTokenizer2.beforeToken('4');
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "#");
    java.io.InputStream inputStream3 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream3, "4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    int i4 = improvedTokenizer2.stop();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    int i7 = improvedTokenizer2.start('#');
    int i9 = improvedTokenizer2.afterToken('a');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "4");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "");
    // The following exception was thrown during execution in test generation
    try {
    int i7 = improvedTokenizer2.matchingToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "");
    int i4 = improvedTokenizer2.start(' ');
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    java.io.InputStream inputStream6 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream6, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    java.lang.String str9 = improvedTokenizer2.next();
    int i11 = improvedTokenizer2.beforeToken('4');
    boolean b12 = improvedTokenizer2.advance();
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "hi!");
    int i15 = improvedTokenizer2.stop();
    boolean b17 = improvedTokenizer2.keepParsing((int)(short)-1);
    java.io.Reader reader18 = null;
    improvedTokenizer2.initialize(reader18, "a");
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.matchingToken('a');
    int i7 = improvedTokenizer2.stop();
    boolean b9 = improvedTokenizer2.keepParsing((int)(byte)0);
    java.io.InputStream inputStream10 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream10, "a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    int i16 = improvedTokenizer2.afterToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.matchingToken('a');
    int i8 = improvedTokenizer2.matchingToken('a');
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "4");
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    boolean b3 = improvedTokenizer2.advance();
    java.io.Reader reader4 = null;
    improvedTokenizer2.initialize(reader4, "a");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.beforeToken(' ');
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "hi!");
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, " ");
    boolean b15 = improvedTokenizer2.keepParsing(10);
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", " ");
    boolean b3 = improvedTokenizer2.hasNext();
    boolean b4 = improvedTokenizer2.hasNext();
    int i6 = improvedTokenizer2.start('#');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "hi!");
    java.io.InputStream inputStream10 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream10, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    int i4 = improvedTokenizer2.stop();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream8 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream8, "a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    int i7 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i9 = improvedTokenizer2.beforeToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.beforeToken('4');
    boolean b9 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    int i10 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.start('#');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "");
    int i19 = improvedTokenizer2.stop();
    int i20 = improvedTokenizer2.stop();
    int i22 = improvedTokenizer2.start('#');
    // The following exception was thrown during execution in test generation
    try {
    boolean b23 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 3);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "hi!");
    int i6 = improvedTokenizer2.stop();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i8 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    java.io.InputStream inputStream7 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream7, "#");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    boolean b10 = improvedTokenizer2.keepParsing((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    int i11 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i9 = improvedTokenizer2.start(' ');
    int i11 = improvedTokenizer2.matchingToken(' ');
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, " ");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    int i7 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)100);
    int i9 = improvedTokenizer2.beforeToken('#');
    boolean b11 = improvedTokenizer2.keepParsing((int)(byte)100);
    java.lang.String str12 = improvedTokenizer2.next();
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "a"+ "'", str13.equals("a"));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.start('#');
    int i10 = improvedTokenizer2.afterToken('4');
    java.lang.String str11 = improvedTokenizer2.next();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.start('#');
    int i16 = improvedTokenizer2.beforeToken('#');
    int i18 = improvedTokenizer2.start('a');
    boolean b19 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream20 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream20, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    java.lang.String str9 = improvedTokenizer2.next();
    int i11 = improvedTokenizer2.beforeToken('4');
    boolean b13 = improvedTokenizer2.keepParsing((int)(byte)100);
    java.io.Reader reader14 = null;
    improvedTokenizer2.initialize(reader14, "");
    java.io.InputStream inputStream17 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream17, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    int i4 = improvedTokenizer2.stop();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    boolean b7 = improvedTokenizer2.keepParsing((int)(byte)100);
    int i8 = improvedTokenizer2.stop();
    int i10 = improvedTokenizer2.start('#');
    boolean b11 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream12 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream12, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.start('#');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    int i17 = improvedTokenizer2.beforeToken('4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)100);
    int i9 = improvedTokenizer2.afterToken(' ');
    boolean b11 = improvedTokenizer2.keepParsing(3);
    int i13 = improvedTokenizer2.start('a');
    java.io.InputStream inputStream14 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream14, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    int i8 = improvedTokenizer2.start('#');
    boolean b10 = improvedTokenizer2.keepParsing(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.beforeToken('4');
    int i10 = improvedTokenizer2.afterToken('a');
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    int i12 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "4"+ "'", str11.equals("4"));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    int i4 = improvedTokenizer2.stop();
    boolean b5 = improvedTokenizer2.advance();
    java.io.Reader reader6 = null;
    improvedTokenizer2.initialize(reader6, " ");
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "4");
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    int i11 = improvedTokenizer2.start('4');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.start('#');
    int i16 = improvedTokenizer2.beforeToken('#');
    int i18 = improvedTokenizer2.start('a');
    boolean b19 = improvedTokenizer2.hasNext();
    boolean b20 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('#');
    int i14 = improvedTokenizer2.beforeToken('a');
    boolean b16 = improvedTokenizer2.keepParsing((int)(byte)1);
    int i18 = improvedTokenizer2.matchingToken(' ');
    // The following exception was thrown during execution in test generation
    try {
    int i19 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.beforeToken('4');
    int i10 = improvedTokenizer2.afterToken('a');
    java.lang.String str11 = improvedTokenizer2.next();
    boolean b13 = improvedTokenizer2.keepParsing((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    boolean b9 = improvedTokenizer2.keepParsing((int)(byte)-1);
    int i11 = improvedTokenizer2.start('a');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    int i8 = improvedTokenizer2.start(' ');
    boolean b9 = improvedTokenizer2.advance();
    java.io.Reader reader10 = null;
    improvedTokenizer2.initialize(reader10, " ");
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.matchingToken('a');
    int i7 = improvedTokenizer2.stop();
    int i8 = improvedTokenizer2.stop();
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    java.lang.String str10 = improvedTokenizer2.next();
    // The following exception was thrown during execution in test generation
    try {
    int i11 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('a');
    java.io.Reader reader13 = null;
    improvedTokenizer2.initialize(reader13, "a");
    boolean b17 = improvedTokenizer2.keepParsing(0);
    // The following exception was thrown during execution in test generation
    try {
    int i19 = improvedTokenizer2.afterToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader13 = null;
    improvedTokenizer2.initialize(reader13, "");
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)100);
    int i9 = improvedTokenizer2.afterToken(' ');
    boolean b11 = improvedTokenizer2.keepParsing(3);
    int i13 = improvedTokenizer2.start('a');
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    java.lang.String str4 = improvedTokenizer2.previousDelimiter();
    java.io.InputStream inputStream5 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream5, "4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken('#');
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    int i15 = improvedTokenizer2.beforeToken('a');
    int i17 = improvedTokenizer2.beforeToken('4');
    // The following exception was thrown during execution in test generation
    try {
    int i18 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "a"+ "'", str13.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    int i8 = improvedTokenizer2.start('4');
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, " ");
    // The following exception was thrown during execution in test generation
    try {
    int i13 = improvedTokenizer2.afterToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    int i4 = improvedTokenizer2.stop();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.stop();
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "4");
    boolean b11 = improvedTokenizer2.keepParsing((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)100);
    int i9 = improvedTokenizer2.beforeToken('#');
    boolean b11 = improvedTokenizer2.keepParsing((int)(byte)100);
    int i13 = improvedTokenizer2.beforeToken('#');
    boolean b15 = improvedTokenizer2.keepParsing((int)(byte)-1);
    java.io.InputStream inputStream16 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream16, "4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i9 = improvedTokenizer2.start(' ');
    int i11 = improvedTokenizer2.matchingToken(' ');
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, " ");
    // The following exception was thrown during execution in test generation
    try {
    int i16 = improvedTokenizer2.matchingToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    int i6 = improvedTokenizer2.start('4');
    // The following exception was thrown during execution in test generation
    try {
    int i7 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('a');
    int i14 = improvedTokenizer2.afterToken('a');
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    int i13 = improvedTokenizer2.start(' ');
    boolean b15 = improvedTokenizer2.keepParsing(0);
    int i17 = improvedTokenizer2.start(' ');
    java.io.InputStream inputStream18 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream18, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing((int)(short)-1);
    java.io.Reader reader6 = null;
    improvedTokenizer2.initialize(reader6, "a");
    // The following exception was thrown during execution in test generation
    try {
    int i10 = improvedTokenizer2.matchingToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('#');
    java.lang.String str13 = improvedTokenizer2.previousDelimiter();
    int i15 = improvedTokenizer2.start(' ');
    boolean b17 = improvedTokenizer2.keepParsing(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('a');
    boolean b7 = improvedTokenizer2.advance();
    boolean b9 = improvedTokenizer2.keepParsing((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    int i4 = improvedTokenizer2.stop();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.stop();
    boolean b7 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream8 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream8, "4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "a");
    boolean b3 = improvedTokenizer2.hasNext();
    int i5 = improvedTokenizer2.start(' ');
    int i7 = improvedTokenizer2.beforeToken(' ');
    // The following exception was thrown during execution in test generation
    try {
    int i8 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    int i8 = improvedTokenizer2.start('4');
    boolean b9 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream10 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream10, "#");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.start('#');
    int i16 = improvedTokenizer2.beforeToken('#');
    int i18 = improvedTokenizer2.start('a');
    java.io.InputStream inputStream19 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream19, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "a");
    boolean b3 = improvedTokenizer2.hasNext();
    int i5 = improvedTokenizer2.start(' ');
    java.io.InputStream inputStream6 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream6, "a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    java.lang.String str9 = improvedTokenizer2.next();
    java.io.InputStream inputStream10 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream10, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " "+ "'", str7.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " "+ "'", str8.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('#');
    int i14 = improvedTokenizer2.beforeToken('a');
    // The following exception was thrown during execution in test generation
    try {
    int i15 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "4");
    int i3 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.beforeToken('4');
    boolean b9 = improvedTokenizer2.hasNext();
    java.lang.String str10 = improvedTokenizer2.next();
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "");
    java.io.InputStream inputStream14 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream14, "#4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i10 = improvedTokenizer2.afterToken('a');
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    int i15 = improvedTokenizer2.afterToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    java.lang.String str5 = improvedTokenizer2.next();
    int i7 = improvedTokenizer2.start(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    java.lang.String str9 = improvedTokenizer2.next();
    int i11 = improvedTokenizer2.beforeToken('4');
    int i13 = improvedTokenizer2.afterToken('a');
    int i15 = improvedTokenizer2.beforeToken(' ');
    int i17 = improvedTokenizer2.beforeToken('a');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "hi!");
    int i15 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i17 = improvedTokenizer2.beforeToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)100);
    int i9 = improvedTokenizer2.beforeToken('#');
    boolean b11 = improvedTokenizer2.keepParsing((int)(byte)100);
    java.lang.String str12 = improvedTokenizer2.next();
    java.io.Reader reader13 = null;
    improvedTokenizer2.initialize(reader13, "");
    int i16 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", " ");
    boolean b3 = improvedTokenizer2.hasNext();
    boolean b4 = improvedTokenizer2.hasNext();
    int i6 = improvedTokenizer2.start('#');
    // The following exception was thrown during execution in test generation
    try {
    int i7 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)100);
    int i9 = improvedTokenizer2.beforeToken('#');
    boolean b11 = improvedTokenizer2.keepParsing((int)(byte)100);
    int i13 = improvedTokenizer2.beforeToken('#');
    boolean b15 = improvedTokenizer2.keepParsing((int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    int i16 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i9 = improvedTokenizer2.start(' ');
    int i10 = improvedTokenizer2.stop();
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "");
    int i15 = improvedTokenizer2.start('4');
    boolean b17 = improvedTokenizer2.keepParsing(0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i9 = improvedTokenizer2.start(' ');
    int i10 = improvedTokenizer2.stop();
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "");
    int i15 = improvedTokenizer2.start('a');
    int i17 = improvedTokenizer2.start(' ');
    int i18 = improvedTokenizer2.stop();
    int i20 = improvedTokenizer2.start(' ');
    boolean b22 = improvedTokenizer2.keepParsing((int)(byte)100);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.matchingToken('a');
    boolean b8 = improvedTokenizer2.keepParsing((int)(byte)0);
    int i9 = improvedTokenizer2.stop();
    java.io.InputStream inputStream10 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream10, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.beforeToken(' ');
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "hi!");
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, " ");
    // The following exception was thrown during execution in test generation
    try {
    int i15 = improvedTokenizer2.matchingToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    int i4 = improvedTokenizer2.stop();
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "4");
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    int i13 = improvedTokenizer2.start(' ');
    boolean b15 = improvedTokenizer2.keepParsing(0);
    java.lang.String str16 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "hi!");
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    boolean b9 = improvedTokenizer2.keepParsing((int)(byte)-1);
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    java.io.InputStream inputStream11 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream11, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    int i8 = improvedTokenizer2.beforeToken('#');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "");
    boolean b3 = improvedTokenizer2.advance();
    int i5 = improvedTokenizer2.start('4');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.matchingToken('a');
    // The following exception was thrown during execution in test generation
    try {
    int i9 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    int i5 = improvedTokenizer2.start('4');
    java.io.InputStream inputStream6 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream6, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.beforeToken(' ');
    boolean b8 = improvedTokenizer2.hasNext();
    int i10 = improvedTokenizer2.matchingToken('#');
    // The following exception was thrown during execution in test generation
    try {
    int i11 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    java.lang.String str5 = improvedTokenizer2.next();
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.start('#');
    int i10 = improvedTokenizer2.afterToken('4');
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, " ");
    // The following exception was thrown during execution in test generation
    try {
    int i15 = improvedTokenizer2.afterToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken('#');
    boolean b14 = improvedTokenizer2.keepParsing(3);
    int i16 = improvedTokenizer2.afterToken(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    int i4 = improvedTokenizer2.stop();
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "4");
    java.io.InputStream inputStream8 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream8, "#4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "4");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.matchingToken('a');
    boolean b7 = improvedTokenizer2.advance();
    // The following exception was thrown during execution in test generation
    try {
    int i8 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)100);
    int i9 = improvedTokenizer2.afterToken(' ');
    java.lang.String str10 = improvedTokenizer2.next();
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "a");
    // The following exception was thrown during execution in test generation
    try {
    int i15 = improvedTokenizer2.afterToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    int i13 = improvedTokenizer2.start(' ');
    boolean b15 = improvedTokenizer2.keepParsing(0);
    int i17 = improvedTokenizer2.start(' ');
    int i18 = improvedTokenizer2.stop();
    java.io.Reader reader19 = null;
    improvedTokenizer2.initialize(reader19, "");
    // The following exception was thrown during execution in test generation
    try {
    int i23 = improvedTokenizer2.beforeToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.keepParsing((int)(byte)0);
    java.lang.String str10 = improvedTokenizer2.previousDelimiter();
    int i12 = improvedTokenizer2.matchingToken('4');
    int i14 = improvedTokenizer2.beforeToken(' ');
    java.io.InputStream inputStream15 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream15, "#");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " "+ "'", str7.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " "+ "'", str10.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('a');
    int i14 = improvedTokenizer2.afterToken('a');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    int i20 = improvedTokenizer2.matchingToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "a"+ "'", str15.equals("a"));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)0);
    java.io.InputStream inputStream15 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream15, "#");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    java.lang.String str8 = improvedTokenizer2.next();
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)1);
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    java.io.InputStream inputStream12 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream12, "4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " "+ "'", str7.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "#");
    int i3 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    int i8 = improvedTokenizer2.afterToken('#');
    int i9 = improvedTokenizer2.stop();
    int i10 = improvedTokenizer2.stop();
    boolean b12 = improvedTokenizer2.keepParsing((int)'#');
    java.io.InputStream inputStream13 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream13, "#4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    int i9 = improvedTokenizer2.stop();
    boolean b10 = improvedTokenizer2.advance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " "+ "'", str7.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " "+ "'", str8.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    java.lang.String str8 = improvedTokenizer2.next();
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    boolean b10 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " "+ "'", str7.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    boolean b8 = improvedTokenizer2.keepParsing((int)(short)100);
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "");
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.matchingToken('a');
    boolean b7 = improvedTokenizer2.advance();
    int i9 = improvedTokenizer2.start('4');
    int i11 = improvedTokenizer2.matchingToken('a');
    java.io.InputStream inputStream12 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream12, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "hi!");
    int i6 = improvedTokenizer2.stop();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    int i8 = improvedTokenizer2.stop();
    boolean b10 = improvedTokenizer2.keepParsing((int)'#');
    // The following exception was thrown during execution in test generation
    try {
    int i12 = improvedTokenizer2.afterToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)100);
    int i9 = improvedTokenizer2.beforeToken('#');
    boolean b11 = improvedTokenizer2.keepParsing((int)(byte)100);
    java.lang.String str12 = improvedTokenizer2.next();
    java.io.Reader reader13 = null;
    improvedTokenizer2.initialize(reader13, "");
    int i16 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i18 = improvedTokenizer2.matchingToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i3 = improvedTokenizer2.stop();
    java.io.InputStream inputStream4 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream4, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    boolean b8 = improvedTokenizer2.keepParsing(10);
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, " ");
    // The following exception was thrown during execution in test generation
    try {
    int i13 = improvedTokenizer2.afterToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "");
    int i4 = improvedTokenizer2.start(' ');
    boolean b5 = improvedTokenizer2.hasNext();
    java.io.Reader reader6 = null;
    improvedTokenizer2.initialize(reader6, " ");
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    int i7 = improvedTokenizer2.stop();
    int i8 = improvedTokenizer2.stop();
    java.io.InputStream inputStream9 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream9, "#4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken('#');
    int i14 = improvedTokenizer2.matchingToken('a');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    int i16 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "a"+ "'", str15.equals("a"));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    java.lang.String str9 = improvedTokenizer2.next();
    int i11 = improvedTokenizer2.beforeToken('4');
    boolean b13 = improvedTokenizer2.keepParsing((int)(byte)100);
    java.io.Reader reader14 = null;
    improvedTokenizer2.initialize(reader14, "");
    int i17 = improvedTokenizer2.stop();
    java.lang.String str18 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    int i20 = improvedTokenizer2.beforeToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    boolean b8 = improvedTokenizer2.keepParsing(4);
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "hi!");
    int i12 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i14 = improvedTokenizer2.matchingToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "");
    int i4 = improvedTokenizer2.start(' ');
    boolean b5 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream6 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream6, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.beforeToken(' ');
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "hi!");
    int i12 = improvedTokenizer2.start('4');
    java.io.InputStream inputStream13 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream13, "#");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    java.lang.String str9 = improvedTokenizer2.next();
    int i11 = improvedTokenizer2.beforeToken('4');
    int i13 = improvedTokenizer2.afterToken('a');
    java.io.Reader reader14 = null;
    improvedTokenizer2.initialize(reader14, "");
    java.io.InputStream inputStream17 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream17, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)100);
    int i9 = improvedTokenizer2.beforeToken('#');
    boolean b11 = improvedTokenizer2.keepParsing((int)(byte)100);
    int i13 = improvedTokenizer2.beforeToken('#');
    boolean b15 = improvedTokenizer2.keepParsing((int)(byte)-1);
    boolean b17 = improvedTokenizer2.keepParsing(10);
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('a');
    int i14 = improvedTokenizer2.afterToken('a');
    boolean b15 = improvedTokenizer2.hasNext();
    boolean b16 = improvedTokenizer2.hasNext();
    java.lang.String str17 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader18 = null;
    improvedTokenizer2.initialize(reader18, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "a"+ "'", str17.equals("a"));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i9 = improvedTokenizer2.start(' ');
    int i11 = improvedTokenizer2.matchingToken(' ');
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, " ");
    // The following exception was thrown during execution in test generation
    try {
    int i16 = improvedTokenizer2.matchingToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    int i7 = improvedTokenizer2.beforeToken(' ');
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "hi!");
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, " ");
    boolean b15 = improvedTokenizer2.keepParsing(10);
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "");
    java.lang.String str19 = improvedTokenizer2.previousDelimiter();
    boolean b21 = improvedTokenizer2.keepParsing(5);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    int i8 = improvedTokenizer2.beforeToken('#');
    boolean b10 = improvedTokenizer2.keepParsing(128);
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, "");
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    boolean b8 = improvedTokenizer2.keepParsing((int)(short)100);
    java.io.Reader reader9 = null;
    improvedTokenizer2.initialize(reader9, "");
    int i12 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i14 = improvedTokenizer2.matchingToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "a");
    int i4 = improvedTokenizer2.start('4');
    int i5 = improvedTokenizer2.stop();
    java.io.Reader reader6 = null;
    improvedTokenizer2.initialize(reader6, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    java.lang.String str8 = improvedTokenizer2.next();
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)1);
    java.lang.String str11 = improvedTokenizer2.previousDelimiter();
    java.io.InputStream inputStream12 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream12, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " "+ "'", str7.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i9 = improvedTokenizer2.start(' ');
    int i11 = improvedTokenizer2.matchingToken(' ');
    int i13 = improvedTokenizer2.start(' ');
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    int i8 = improvedTokenizer2.start('4');
    boolean b9 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "hi!");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "");
    int i4 = improvedTokenizer2.start(' ');
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "4");
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    int i6 = improvedTokenizer2.afterToken('4');
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    java.lang.String str8 = improvedTokenizer2.next();
    boolean b10 = improvedTokenizer2.keepParsing((int)(byte)10);
    int i12 = improvedTokenizer2.start(' ');
    java.io.InputStream inputStream13 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream13, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " "+ "'", str7.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "a");
    java.io.InputStream inputStream3 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream3, "#4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "a");
    int i4 = improvedTokenizer2.start('#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    java.lang.String str9 = improvedTokenizer2.next();
    int i11 = improvedTokenizer2.beforeToken('4');
    int i13 = improvedTokenizer2.afterToken('a');
    int i15 = improvedTokenizer2.beforeToken(' ');
    int i17 = improvedTokenizer2.beforeToken('a');
    java.io.InputStream inputStream18 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream18, "a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    boolean b3 = improvedTokenizer2.advance();
    boolean b4 = improvedTokenizer2.advance();
    boolean b5 = improvedTokenizer2.advance();
    boolean b6 = improvedTokenizer2.advance();
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, " ");
    int i10 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i12 = improvedTokenizer2.matchingToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('#');
    int i14 = improvedTokenizer2.start(' ');
    java.lang.String str15 = improvedTokenizer2.next();
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "4");
    java.io.Reader reader19 = null;
    improvedTokenizer2.initialize(reader19, "a");
    // The following exception was thrown during execution in test generation
    try {
    int i23 = improvedTokenizer2.beforeToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "");
    int i4 = improvedTokenizer2.start(' ');
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    java.io.Reader reader8 = null;
    improvedTokenizer2.initialize(reader8, "4");
    java.io.Reader reader11 = null;
    improvedTokenizer2.initialize(reader11, " ");
    // The following exception was thrown during execution in test generation
    try {
    int i15 = improvedTokenizer2.matchingToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('#');
    int i14 = improvedTokenizer2.start(' ');
    int i16 = improvedTokenizer2.afterToken(' ');
    int i18 = improvedTokenizer2.afterToken('#');
    // The following exception was thrown during execution in test generation
    try {
    int i19 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, "");
    int i9 = improvedTokenizer2.start(' ');
    int i11 = improvedTokenizer2.matchingToken(' ');
    int i13 = improvedTokenizer2.beforeToken('a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    int i13 = improvedTokenizer2.start(' ');
    boolean b15 = improvedTokenizer2.keepParsing(0);
    int i17 = improvedTokenizer2.start('a');
    int i19 = improvedTokenizer2.start('4');
    // The following exception was thrown during execution in test generation
    try {
    boolean b20 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    int i4 = improvedTokenizer2.stop();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    int i7 = improvedTokenizer2.start('#');
    boolean b9 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b10 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream11 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream11, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "a");
    boolean b3 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    boolean b8 = improvedTokenizer2.keepParsing(4);
    int i10 = improvedTokenizer2.start('a');
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    int i4 = improvedTokenizer2.stop();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    int i6 = improvedTokenizer2.stop();
    int i8 = improvedTokenizer2.start('#');
    java.io.InputStream inputStream9 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream9, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    int i7 = improvedTokenizer2.stop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(" ", "");
    boolean b3 = improvedTokenizer2.advance();
    boolean b5 = improvedTokenizer2.keepParsing((int)(byte)0);
    boolean b7 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b8 = improvedTokenizer2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    java.io.Reader reader5 = null;
    improvedTokenizer2.initialize(reader5, " ");
    boolean b9 = improvedTokenizer2.keepParsing((int)(short)100);
    boolean b11 = improvedTokenizer2.keepParsing(2);
    // The following exception was thrown during execution in test generation
    try {
    int i13 = improvedTokenizer2.matchingToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    java.lang.String str9 = improvedTokenizer2.next();
    int i11 = improvedTokenizer2.beforeToken('4');
    int i13 = improvedTokenizer2.afterToken('4');
    java.lang.String str14 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "4"+ "'", str14.equals("4"));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    int i13 = improvedTokenizer2.start(' ');
    boolean b15 = improvedTokenizer2.keepParsing(0);
    int i17 = improvedTokenizer2.start(' ');
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b5 = improvedTokenizer2.keepParsing(128);
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", " ");
    int i3 = improvedTokenizer2.stop();
    java.io.InputStream inputStream4 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream4, "#4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str3 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.start('#');
    int i16 = improvedTokenizer2.beforeToken('#');
    int i18 = improvedTokenizer2.start('a');
    int i20 = improvedTokenizer2.afterToken('#');
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 3);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    int i8 = improvedTokenizer2.afterToken('#');
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "");
    int i4 = improvedTokenizer2.start(' ');
    java.io.InputStream inputStream5 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream5, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    int i13 = improvedTokenizer2.start(' ');
    boolean b15 = improvedTokenizer2.keepParsing(0);
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, " ");
    java.lang.String str19 = improvedTokenizer2.previousDelimiter();
    boolean b21 = improvedTokenizer2.keepParsing(5);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b7 = improvedTokenizer2.keepParsing((int)(short)100);
    int i9 = improvedTokenizer2.beforeToken('#');
    boolean b11 = improvedTokenizer2.keepParsing((int)(byte)100);
    int i13 = improvedTokenizer2.beforeToken('#');
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    java.io.Reader reader13 = null;
    improvedTokenizer2.initialize(reader13, "a");
    // The following exception was thrown during execution in test generation
    try {
    int i17 = improvedTokenizer2.matchingToken('4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.start('#');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    java.lang.String str16 = improvedTokenizer2.next();
    java.io.Reader reader17 = null;
    improvedTokenizer2.initialize(reader17, " ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    int i11 = improvedTokenizer2.afterToken('#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "a");
    boolean b3 = improvedTokenizer2.advance();
    // The following exception was thrown during execution in test generation
    try {
    int i4 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    int i13 = improvedTokenizer2.start(' ');
    boolean b15 = improvedTokenizer2.keepParsing(0);
    int i17 = improvedTokenizer2.start(' ');
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    int i11 = improvedTokenizer2.start('4');
    java.lang.String str12 = improvedTokenizer2.previousDelimiter();
    int i14 = improvedTokenizer2.beforeToken(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("a", "#4");

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    java.lang.String str9 = improvedTokenizer2.next();
    int i11 = improvedTokenizer2.matchingToken(' ');
    boolean b13 = improvedTokenizer2.keepParsing(100);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    java.io.Reader reader12 = null;
    improvedTokenizer2.initialize(reader12, "hi!");
    int i15 = improvedTokenizer2.stop();
    boolean b17 = improvedTokenizer2.keepParsing((int)(short)-1);
    java.io.Reader reader18 = null;
    improvedTokenizer2.initialize(reader18, "a");
    java.io.InputStream inputStream21 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream21, " ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "a");
    boolean b3 = improvedTokenizer2.hasNext();
    int i5 = improvedTokenizer2.start(' ');
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.start('#');
    java.lang.String str15 = improvedTokenizer2.next();
    boolean b17 = improvedTokenizer2.keepParsing((int)(byte)1);
    java.io.InputStream inputStream18 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream18, "#");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    int i4 = improvedTokenizer2.stop();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    boolean b7 = improvedTokenizer2.keepParsing((int)(byte)100);
    boolean b9 = improvedTokenizer2.keepParsing((int)(byte)1);
    java.io.Reader reader10 = null;
    improvedTokenizer2.initialize(reader10, "#");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    boolean b5 = improvedTokenizer2.hasNext();
    java.lang.String str6 = improvedTokenizer2.next();
    java.lang.String str7 = improvedTokenizer2.previousDelimiter();
    boolean b9 = improvedTokenizer2.keepParsing((int)(short)-1);
    int i11 = improvedTokenizer2.start(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    int i13 = improvedTokenizer2.start(' ');
    boolean b15 = improvedTokenizer2.keepParsing(0);
    java.io.InputStream inputStream16 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream16, "#4");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    int i8 = improvedTokenizer2.start('4');
    boolean b10 = improvedTokenizer2.keepParsing((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "hi!");
    int i6 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("", "hi!");
    java.lang.String str3 = improvedTokenizer2.next();
    boolean b4 = improvedTokenizer2.hasNext();
    java.lang.String str5 = improvedTokenizer2.previousDelimiter();
    int i7 = improvedTokenizer2.start('#');
    int i9 = improvedTokenizer2.matchingToken('a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    int i4 = improvedTokenizer2.start(' ');
    boolean b5 = improvedTokenizer2.hasNext();
    boolean b6 = improvedTokenizer2.hasNext();
    java.io.InputStream inputStream7 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream7, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.beforeToken('4');
    int i10 = improvedTokenizer2.afterToken('a');
    int i12 = improvedTokenizer2.beforeToken('4');
    java.io.Reader reader13 = null;
    improvedTokenizer2.initialize(reader13, "");
    // The following exception was thrown during execution in test generation
    try {
    int i17 = improvedTokenizer2.afterToken('a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    int i13 = improvedTokenizer2.start(' ');
    boolean b15 = improvedTokenizer2.keepParsing(0);
    int i17 = improvedTokenizer2.start('a');
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = improvedTokenizer2.hasNext();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    java.io.Reader reader3 = null;
    improvedTokenizer2.initialize(reader3, "4");
    // The following exception was thrown during execution in test generation
    try {
    int i7 = improvedTokenizer2.matchingToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("4", "");
    int i4 = improvedTokenizer2.start(' ');
    boolean b5 = improvedTokenizer2.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    int i6 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.start('#');
    int i14 = improvedTokenizer2.start(' ');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    int i17 = improvedTokenizer2.start(' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    int i14 = improvedTokenizer2.start('#');
    java.lang.String str15 = improvedTokenizer2.previousDelimiter();
    java.io.Reader reader16 = null;
    improvedTokenizer2.initialize(reader16, "");
    int i19 = improvedTokenizer2.stop();
    int i20 = improvedTokenizer2.stop();
    // The following exception was thrown during execution in test generation
    try {
    int i22 = improvedTokenizer2.beforeToken(' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    boolean b4 = improvedTokenizer2.keepParsing(0);
    boolean b6 = improvedTokenizer2.keepParsing((int)'4');
    java.io.Reader reader7 = null;
    improvedTokenizer2.initialize(reader7, "");
    boolean b11 = improvedTokenizer2.keepParsing((int)' ');
    int i13 = improvedTokenizer2.start(' ');
    boolean b15 = improvedTokenizer2.keepParsing(0);
    int i17 = improvedTokenizer2.start('a');
    int i19 = improvedTokenizer2.start('4');
    java.io.InputStream inputStream20 = null;
    // The following exception was thrown during execution in test generation
    try {
    improvedTokenizer2.initialize(inputStream20, "a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i5 = improvedTokenizer2.stop();
    java.lang.String str6 = improvedTokenizer2.previousDelimiter();
    int i7 = improvedTokenizer2.stop();
    java.lang.String str8 = improvedTokenizer2.previousDelimiter();
    java.lang.String str9 = improvedTokenizer2.previousDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    java.lang.String str3 = improvedTokenizer2.next();
    int i5 = improvedTokenizer2.start('a');
    boolean b6 = improvedTokenizer2.hasNext();
    int i8 = improvedTokenizer2.afterToken(' ');
    int i10 = improvedTokenizer2.matchingToken('#');
    int i12 = improvedTokenizer2.matchingToken(' ');
    boolean b14 = improvedTokenizer2.keepParsing((int)(short)0);
    int i16 = improvedTokenizer2.matchingToken('a');
    // The following exception was thrown during execution in test generation
    try {
    int i17 = improvedTokenizer2.stop();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.RuntimeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }


    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer("hi!", "");
    boolean b4 = improvedTokenizer2.keepParsing((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    java.lang.String str3 = improvedTokenizer2.previousDelimiter();
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = improvedTokenizer2.advance();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }


    java.io.Reader reader0 = null;
    ImprovedTokenizer improvedTokenizer2 = new ImprovedTokenizer(reader0, "hi!");
    int i4 = improvedTokenizer2.start('#');
    int i6 = improvedTokenizer2.beforeToken('a');
    int i8 = improvedTokenizer2.beforeToken('#');
    boolean b10 = improvedTokenizer2.keepParsing(128);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = improvedTokenizer2.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

}