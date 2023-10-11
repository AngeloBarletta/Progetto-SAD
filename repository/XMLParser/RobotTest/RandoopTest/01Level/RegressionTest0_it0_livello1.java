
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    // The following exception was thrown during execution in test generation
    try {
    XMLParser xMLParser1 = new XMLParser("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    java.lang.String str1 = XMLParser.returnSpecial("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!"+ "'", str1.equals("hi!"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    java.lang.String str1 = XMLParser.returnSpecial("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
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
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
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

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.util.Hashtable hashtable5 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
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

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
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
    org.junit.Assert.assertNotNull(vector5);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
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
    org.junit.Assert.assertNotNull(vector3);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
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
    org.junit.Assert.assertNotNull(vector5);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.util.Hashtable hashtable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Hashtable hashtable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable4);
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


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    java.lang.String str1 = XMLParser.returnSpecial("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str1.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str4 = xMLParser1.getXML();
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
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
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
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable10);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    XMLParser xMLParser1 = new XMLParser("");
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
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable10);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable9 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.util.Hashtable hashtable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "hi!", hashtable11);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    XMLParser xMLParser1 = new XMLParser("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Hashtable hashtable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable4);
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


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str6 = xMLParser1.getXML();
    java.util.Hashtable hashtable9 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable9);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str6.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
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
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    java.lang.String str7 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable10);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str9 = xMLParser1.getXML();
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
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
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str7 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str8 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "hi!", hashtable13);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable8);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable9 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable9);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "hi!", hashtable11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "hi!", hashtable11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable8);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable13);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str11 = xMLParser1.getXML();
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str11.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector9 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    XMLParser xMLParser1 = new XMLParser("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    java.util.Hashtable hashtable5 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "hi!", hashtable13);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Hashtable hashtable4 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable4);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector13 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getXML();
    xMLParser1.store();
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str8.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "hi!", hashtable13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str10 = xMLParser1.getXML();
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable13);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    XMLParser xMLParser1 = new XMLParser("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Vector vector3 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Hashtable hashtable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "hi!", hashtable14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getXML();
    xMLParser1.store();
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable12);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str8.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str12 = xMLParser1.getXML();
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable15);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str12.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
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
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector13 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Vector vector15 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable18);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    xMLParser1.store();
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
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getXML();
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str8.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.lang.String str11 = xMLParser1.getXML();
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
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str11.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str6 = xMLParser1.getXML();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable11);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str6.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str4 = xMLParser1.getXML();
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
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
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
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    java.lang.String str7 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str9 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str3 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    java.lang.String str8 = xMLParser1.getXML();
    java.lang.String str10 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getXML();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str6 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    java.lang.String str7 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    java.lang.String str7 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "", hashtable10);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    java.lang.String str7 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
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
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable9 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable9);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str10 = xMLParser1.getXML();
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str10.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
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
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.lang.String str10 = xMLParser1.getXML();
    java.lang.String str11 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str10.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str11.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    java.util.Vector vector9 = xMLParser1.getProperty("");
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector13 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Vector vector15 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str12 = xMLParser1.getXML();
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
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str12.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str6 = xMLParser1.getXML();
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
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str6.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "hi!", hashtable11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    java.lang.String str7 = xMLParser1.getSingleProperty("");
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
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getXML();
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str8.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable13);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector11 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "hi!", hashtable13);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    XMLParser xMLParser1 = new XMLParser("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    java.util.Hashtable hashtable5 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable5);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    XMLParser xMLParser1 = new XMLParser("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Vector vector3 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Hashtable hashtable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable6);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str6 = xMLParser1.getXML();
    java.util.Hashtable hashtable9 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "hi!", hashtable9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str6.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str12 = xMLParser1.getXML();
    java.util.Vector vector14 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str12.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    java.util.Vector vector9 = xMLParser1.getProperty("");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str6 = xMLParser1.getXML();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.util.Vector vector10 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str6.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    java.lang.String str8 = xMLParser1.getXML();
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    java.lang.String str7 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.lang.String str11 = xMLParser1.getXML();
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str11.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getXML();
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector13 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Vector vector15 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str6 = xMLParser1.getXML();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str6.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable12);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str12 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
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
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getXML();
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str14 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Hashtable hashtable17 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable17);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str8.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getXML();
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "hi!", hashtable12);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str12 = xMLParser1.getXML();
    java.lang.String str14 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str8.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str12.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.lang.String str10 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str6 = xMLParser1.getXML();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str6.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getXML();
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str8 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str9 = xMLParser1.getXML();
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str10 = xMLParser1.getXML();
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable13);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("hi!");
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.lang.String str10 = xMLParser1.getXML();
    java.util.Hashtable hashtable13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "hi!", hashtable13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str10.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable12);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str6 = xMLParser1.getXML();
    java.util.Hashtable hashtable9 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable9);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str6.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "hi!", hashtable8);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
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
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.util.Hashtable hashtable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable7);
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
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("");
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable11);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str6 = xMLParser1.getXML();
    xMLParser1.store();
    java.util.Vector vector9 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str6.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str11.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str11 = xMLParser1.getXML();
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "hi!", hashtable14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str11.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("hi!");
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "hi!", hashtable8);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }


    XMLParser xMLParser1 = new XMLParser("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Vector vector7 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str12 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str12.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }


    XMLParser xMLParser1 = new XMLParser("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str12 = xMLParser1.getXML();
    java.lang.String str13 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str12.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str13.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    java.lang.String str7 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str10 = xMLParser1.getXML();
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable15);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str10.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str8.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str8.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.lang.String str14 = xMLParser1.getXML();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str14.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.util.Vector vector6 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector6);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getXML();
    xMLParser1.store();
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str8.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str8 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str8 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str9 = xMLParser1.getXML();
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector13 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str14 = xMLParser1.getXML();
    java.lang.String str16 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str14.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
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
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.lang.String str10 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str7.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str10.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str6.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector13 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str14 = xMLParser1.getXML();
    java.util.Vector vector16 = xMLParser1.getProperty("");
    java.util.Vector vector18 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str14.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector18);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.util.Hashtable hashtable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "", hashtable7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str8 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str12 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable9 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable9);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.lang.String str9 = xMLParser1.getXML();
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable12);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.util.Vector vector6 = xMLParser1.getProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    java.lang.String str8 = xMLParser1.getXML();
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str8 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str8.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str15 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str10 = xMLParser1.getXML();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str10.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getXML();
    java.util.Vector vector7 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }


    XMLParser xMLParser1 = new XMLParser("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str7 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Vector vector9 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    
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
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str6 = xMLParser1.getXML();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str6.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.util.Hashtable hashtable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str10 = xMLParser1.getXML();
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.lang.String str14 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str10.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.lang.String str12 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str6 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.util.Vector vector12 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str13 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str13.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str7 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str7.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.util.Vector vector10 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.lang.String str11 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str11.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    java.lang.String str8 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str12 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str12.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.util.Vector vector6 = xMLParser1.getProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    java.lang.String str8 = xMLParser1.getXML();
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable11);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str6 = xMLParser1.getXML();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable11);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str6.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str6 = xMLParser1.getXML();
    xMLParser1.store();
    java.util.Vector vector9 = xMLParser1.getProperty("hi!");
    java.util.Hashtable hashtable12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable12);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str6.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str6 = xMLParser1.getXML();
    java.util.Vector vector8 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str6.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable18);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str4 = xMLParser1.getXML();
    java.util.Vector vector6 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector6);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "hi!", hashtable16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    java.lang.String str13 = xMLParser1.getSingleProperty("");
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str14 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str14.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str10 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str10.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector15 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable16);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str11 = xMLParser1.getXML();
    java.lang.String str13 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    java.lang.String str7 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Vector vector9 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    java.lang.String str7 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str11 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str12 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    java.util.Vector vector9 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str7.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str12 = xMLParser1.getSingleProperty("");
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("");
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getXML();
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str8.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.util.Vector vector12 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str10 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Vector vector12 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str13 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str13.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.lang.String str11 = xMLParser1.getXML();
    java.lang.String str13 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str11.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str10 = xMLParser1.getXML();
    java.lang.String str12 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable11 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    java.lang.String str7 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str3 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    xMLParser1.store();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.lang.String str11 = xMLParser1.getXML();
    xMLParser1.store();
    java.util.Vector vector14 = xMLParser1.getProperty("");
    java.lang.String str15 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str11.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str15.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str6 = xMLParser1.getXML();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str10 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str6.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str10.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    java.lang.String str7 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getXML();
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.util.Vector vector12 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Vector vector14 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str10 = xMLParser1.getXML();
    java.lang.String str11 = xMLParser1.getXML();
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str10.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str11.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.lang.String str11 = xMLParser1.getXML();
    java.lang.String str12 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str11.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str12.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    java.lang.String str8 = xMLParser1.getXML();
    xMLParser1.store();
    java.util.Vector vector11 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.lang.String str11 = xMLParser1.getXML();
    xMLParser1.store();
    java.util.Vector vector14 = xMLParser1.getProperty("");
    java.util.Vector vector16 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str11.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector11 = xMLParser1.getProperty("");
    java.util.Vector vector13 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str12 = xMLParser1.getXML();
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str16 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str12.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    java.util.Hashtable hashtable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }


    XMLParser xMLParser1 = new XMLParser("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    xMLParser1.store();
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

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str8 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str9 = xMLParser1.getXML();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    java.util.Vector vector9 = xMLParser1.getProperty("");
    java.lang.String str11 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.util.Vector vector7 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str15 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable18);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str8 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("");
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    java.lang.String str7 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getXML();
    java.util.Vector vector11 = xMLParser1.getProperty("");
    java.lang.String str12 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str12.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str10 = xMLParser1.getXML();
    java.lang.String str12 = xMLParser1.getSingleProperty("hi!");
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str10.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str12 = xMLParser1.getXML();
    java.lang.String str14 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str12.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getXML();
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str13 = xMLParser1.getXML();
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable16);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str8.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str13.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str8 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getXML();
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.lang.String str12 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str8.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.lang.String str12 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str12.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str10 = xMLParser1.getXML();
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str12 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getXML();
    java.util.Hashtable hashtable16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable16);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.util.Vector vector12 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str13 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str13.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable10 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "hi!", hashtable10);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Hashtable hashtable15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getXML();
    xMLParser1.store();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str6.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getXML();
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector12 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str14 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str15 = xMLParser1.getXML();
    java.util.Hashtable hashtable18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable18);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str8.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str15.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.util.Vector vector14 = xMLParser1.getProperty("hi!");
    java.lang.String str15 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str15.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }


    XMLParser xMLParser1 = new XMLParser("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    java.util.Hashtable hashtable5 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable5);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    java.lang.String str7 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str10 = xMLParser1.getXML();
    java.util.Vector vector12 = xMLParser1.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.lang.String str12 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.lang.String str11 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str14 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str11.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getXML();
    xMLParser1.store();
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str8.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str10 = xMLParser1.getXML();
    java.lang.String str11 = xMLParser1.getXML();
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "hi!", hashtable14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str10.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str11.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str11 = xMLParser1.getSingleProperty("");
    java.lang.String str13 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str15 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str13 = xMLParser1.getSingleProperty("");
    java.lang.String str15 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
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
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("");
    java.lang.String str11 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }


    XMLParser xMLParser1 = new XMLParser("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Vector vector3 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Hashtable hashtable6 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }


    XMLParser xMLParser1 = new XMLParser("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    java.lang.String str4 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.util.Hashtable hashtable8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable8);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.lang.String str10 = xMLParser1.getXML();
    xMLParser1.store();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str10.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str11 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str11.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
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
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str4.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getXML();
    java.lang.String str10 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str8.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("");
    java.lang.String str6 = xMLParser1.getXML();
    java.util.Vector vector8 = xMLParser1.getProperty("");
    java.util.Vector vector10 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str6.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str6 = xMLParser1.getXML();
    java.lang.String str7 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str6.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str7.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable9 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str10 = xMLParser1.getXML();
    java.lang.String str11 = xMLParser1.getXML();
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str9.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str10.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str11.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }


    XMLParser xMLParser1 = new XMLParser("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    java.util.Vector vector4 = xMLParser1.getProperty("hi!");
    java.lang.String str6 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.lang.String str11 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str13 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str11.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str13.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.lang.String str10 = xMLParser1.getXML();
    xMLParser1.store();
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str10.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str11 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str11.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector13 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector12 = xMLParser1.getProperty("");
    java.lang.String str13 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str13.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    xMLParser1.store();
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    java.lang.String str11 = xMLParser1.getXML();
    java.lang.String str12 = xMLParser1.getXML();
    java.util.Vector vector14 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str11.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str12.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str2 = xMLParser1.getXML();
    java.util.Hashtable hashtable5 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable5);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str8 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str9 = xMLParser1.getXML();
    java.lang.String str10 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str13 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.util.Hashtable hashtable9 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "hi!", hashtable9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.util.Vector vector3 = xMLParser1.getProperty("hi!");
    java.lang.String str4 = xMLParser1.getXML();
    java.util.Vector vector6 = xMLParser1.getProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    java.lang.String str8 = xMLParser1.getXML();
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
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
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
    org.junit.Assert.assertNotNull(vector5);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str2 = xMLParser1.getXML();
    java.util.Vector vector4 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector13 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Vector vector15 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str19 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
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
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    xMLParser1.store();
    xMLParser1.store();
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.util.Vector vector10 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector13 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Vector vector15 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str17 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable20 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable20);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    java.lang.String str10 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    xMLParser1.store();
    java.lang.String str8 = xMLParser1.getSingleProperty("");
    xMLParser1.store();
    java.util.Vector vector11 = xMLParser1.getProperty("");
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
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    xMLParser1.store();
    java.util.Vector vector5 = xMLParser1.getProperty("");
    java.lang.String str7 = xMLParser1.getSingleProperty("");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Hashtable hashtable14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

}
