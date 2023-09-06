
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    java.lang.String str1 = XMLParser.returnSpecial("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    java.io.File file0 = null;
    // The following exception was thrown during execution in test generation
    try {
    XMLParser xMLParser1 = new XMLParser(file0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    java.lang.String str1 = XMLParser.returnSpecial("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!"+ "'", str1.equals("hi!"));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.util.Hashtable hashtable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable4);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.util.Hashtable hashtable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable4);
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


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.util.Hashtable hashtable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable4);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    XMLParser xMLParser1 = new XMLParser("");
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.store();
      org.junit.Assert.fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.io.IOException")) {
        org.junit.Assert.fail("Expected exception of type java.io.IOException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable8);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Hashtable hashtable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable4);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable6);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Hashtable hashtable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable4);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Hashtable hashtable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable4);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable10);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable8);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable11);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable9 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable9);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Hashtable hashtable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable4);
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


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable7);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable10);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable15);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable9 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable9);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable12);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable10);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable12);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.store();
      org.junit.Assert.fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.io.IOException")) {
        org.junit.Assert.fail("Expected exception of type java.io.IOException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable10);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable12);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable8);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable6);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable17 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable11);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable12);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable12);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable15);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable12);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable11);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable17 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable13);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable7);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.store();
      org.junit.Assert.fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.io.IOException")) {
        org.junit.Assert.fail("Expected exception of type java.io.IOException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable9 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable9);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable8);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable10);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable8);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable6);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable12);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable11);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable12);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable8);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.store();
      org.junit.Assert.fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.io.IOException")) {
        org.junit.Assert.fail("Expected exception of type java.io.IOException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable16);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable17 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable17);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable15);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable12);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable11);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable8);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable12);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable15);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    java.util.Vector vector17 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable20 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable20);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable18);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable11);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable20 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable20);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable10);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable17 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable17);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable15);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable12);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable20 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("");
    java.util.Vector vector16 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable19 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable19);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("");
    java.util.Vector vector16 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable19 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable9 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable18);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector6 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable9 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector6);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    java.util.Vector vector17 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable20 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable20);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str13 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable9 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable13);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector11 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable8);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable15);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable13);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable17 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable11);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable10);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str15 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable18);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable17 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable17);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str19 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable22 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable22);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector16 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.util.Vector vector5 = xMLParser1.getProperty("");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector19 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable22 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector19);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable9 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable9);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable8);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable13);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("");
    java.lang.String str12 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable17 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector13 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable16);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    java.util.Vector vector17 = xMLParser1.getProperty("hi!");
    java.util.Vector vector19 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector19);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Vector vector17 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Vector vector20 = xMLParser1.getProperty("hi!");
    java.lang.String str22 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.lang.String str10 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable12);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable6);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str19 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable22 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector12 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable12);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("hi!");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable17 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable17);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str15 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable13);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable8);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("hi!");
    java.util.Vector vector17 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable20 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable20);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable13);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable13);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable17 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable16);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Hashtable hashtable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector15 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable15);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable7);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable16);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    java.util.Vector vector17 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str21 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable24 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    java.util.Vector vector17 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable22 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable22);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str14 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable17 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable17);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("");
    java.lang.String str16 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable19 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable19);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str17 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str15 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Vector vector17 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Vector vector20 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable24 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable24);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector20);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    java.util.Vector vector17 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str21 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector23 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable26 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable26);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector23);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable7);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector13 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable17 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable17);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable16);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("");
    java.util.Vector vector16 = xMLParser1.getProperty("hi!");
    java.lang.String str18 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable21 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable21);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable15);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str18 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector14 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str14 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("");
    java.lang.String str16 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable19 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable19);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str15 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str14 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("");
    java.util.Vector vector16 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable19 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable19);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    java.util.Vector vector16 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable19 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable19);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    java.util.Vector vector16 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable19 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector13 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable16);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str16 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable21 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable21);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable16);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector13 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector16 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Vector vector16 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable19 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable19);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable5 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable5);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector11 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable15);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable16);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str17 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable20 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable20);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Vector vector17 = xMLParser1.getProperty("");
    java.lang.String str19 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str17 = xMLParser1.getSingleProperty("");
    java.util.Vector vector19 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector19);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector11 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str15 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector19 = xMLParser1.getProperty("");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector19);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable15);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable19 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable11);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.util.Vector vector12 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable15);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.util.Vector vector12 = xMLParser1.getProperty("hi!");
    java.util.Vector vector14 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector14 = xMLParser1.getProperty("hi!");
    java.lang.String str16 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable18);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str13 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    java.util.Vector vector16 = xMLParser1.getProperty("");
    java.lang.String str18 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable21 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable21);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    java.util.Vector vector17 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable22 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable22);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable17 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable12);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable19 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable19);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable10);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector17 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable21 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable21);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable16);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable16);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector6 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable11);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str15 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable20 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    java.util.Vector vector17 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable20 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable20);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable15);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    java.util.Vector vector17 = xMLParser1.getProperty("hi!");
    java.lang.String str19 = xMLParser1.getSingleProperty("");
    java.util.Vector vector21 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector21);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector19 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable22 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable22);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector19);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.util.Vector vector12 = xMLParser1.getProperty("hi!");
    java.lang.String str14 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable17 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable15);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable21 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable21);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable20 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector16 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("hi!");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    java.util.Vector vector16 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable11);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str15 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str15 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector19 = xMLParser1.getProperty("");
    java.lang.String str21 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector23 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector23);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable17 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    java.util.Vector vector16 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable19 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable19);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("hi!");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable18);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str16 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector6 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str14 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable17 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable17);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str16 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable19 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable19);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable20 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable20);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable20 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable20);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector18 = xMLParser1.getProperty("");
    java.util.Vector vector20 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector20);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str15 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str19 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str16 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str18 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str14 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable15);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.util.Vector vector12 = xMLParser1.getProperty("hi!");
    java.lang.String str14 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str17 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector13 = xMLParser1.getProperty("");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str18 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str13 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable18);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.util.Vector vector12 = xMLParser1.getProperty("hi!");
    java.lang.String str14 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable17 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable20 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable20);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str15 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector19 = xMLParser1.getProperty("");
    java.lang.String str21 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str23 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("");
    java.util.Vector vector16 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable19 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable19);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable12);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str14 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str16 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable19 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable11);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str17 = xMLParser1.getSingleProperty("");
    java.lang.String str19 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable22 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("");
    java.util.Vector vector12 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.lang.String str12 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    java.lang.String str16 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable8);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    java.util.Vector vector17 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable23 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable13);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable17 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable17 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable17);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector14 = xMLParser1.getProperty("");
    java.lang.String str16 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable19 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable19);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector11 = xMLParser1.getProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector15 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable19 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable19);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector19 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector19);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str16 = xMLParser1.getSingleProperty("");
    java.lang.String str18 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector11 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector18 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable21 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable21);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector18);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str19 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str21 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.lang.String str12 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable18);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable17 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector11 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector15 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable11);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable11);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    java.util.Vector vector17 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.lang.String str12 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    java.util.Vector vector16 = xMLParser1.getProperty("hi!");
    java.util.Vector vector18 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector18);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.lang.String str10 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable18);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable11);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector6 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable20 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable20);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str15 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector17 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable20 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable20);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    java.util.Vector vector17 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable22 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable22);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable17 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable17);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str13 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    java.util.Vector vector17 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("");
    java.util.Vector vector16 = xMLParser1.getProperty("hi!");
    java.util.Vector vector18 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable21 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector18);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str19 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str21 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector23 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable26 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable26);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector23);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable19 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable19);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str16 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable15);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("hi!");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    java.lang.String str16 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable16);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("hi!");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable18);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str16 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable19 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable19);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    java.util.Vector vector17 = xMLParser1.getProperty("");
    java.util.Vector vector19 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Vector vector22 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector22);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str16 = xMLParser1.getSingleProperty("");
    java.util.Vector vector18 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector18);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable18);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str15 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str16 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str15 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable20 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable20);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable12);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    java.util.Vector vector17 = xMLParser1.getProperty("");
    java.util.Vector vector19 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str22 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str15 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector17 = xMLParser1.getProperty("hi!");
    java.util.Vector vector19 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector19);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("hi!");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector17 = xMLParser1.getProperty("");
    java.util.Vector vector19 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector19);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Vector vector17 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Vector vector20 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable24 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector20);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable16);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable20 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str16 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable19 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable19);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    xMLParser1.store();
    java.util.Vector vector4 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector19 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector19);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable15);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.util.Vector vector5 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str20 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable11);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector19 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable23 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable23);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector19);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable15);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str12 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("");
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.store();
      org.junit.Assert.fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.io.IOException")) {
        org.junit.Assert.fail("Expected exception of type java.io.IOException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector14 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable17 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable17);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable13);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str13 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector15 = xMLParser1.getProperty("");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector15 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    java.util.Vector vector16 = xMLParser1.getProperty("");
    java.util.Vector vector18 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector18);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable9 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable9);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.store();
      org.junit.Assert.fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.io.IOException")) {
        org.junit.Assert.fail("Expected exception of type java.io.IOException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.util.Vector vector13 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable16);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("");
    java.lang.String str12 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector6 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.util.Vector vector12 = xMLParser1.getProperty("hi!");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable19 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable19);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("");
    java.util.Vector vector16 = xMLParser1.getProperty("hi!");
    java.lang.String str18 = xMLParser1.getSingleProperty("");
    java.util.Vector vector20 = xMLParser1.getProperty("");
    java.lang.String str22 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str24 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str16 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector18 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable21 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable21);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector18);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable8);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    java.lang.String str16 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("");
    java.util.Vector vector17 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str21 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector23 = xMLParser1.getProperty("");
    java.util.Vector vector25 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector25);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str14 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    java.util.Vector vector16 = xMLParser1.getProperty("");
    java.lang.String str18 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable21 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "", hashtable21);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.lang.String str12 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable9 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable9);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable17 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable17);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }


    XMLParser xMLParser1 = new XMLParser("hi!");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector14 = xMLParser1.getProperty("");
    java.lang.String str16 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

}
