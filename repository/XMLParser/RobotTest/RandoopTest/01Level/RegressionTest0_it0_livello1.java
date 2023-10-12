
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    java.lang.String str1 = XMLParser.returnSpecial("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    java.lang.String str1 = XMLParser.returnSpecial("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!"+ "'", str1.equals("hi!"));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    XMLParser xMLParser1 = new XMLParser("");
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
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.util.Hashtable hashtable5 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("", "hi!", hashtable5);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str2 = xMLParser1.getXML();
    java.lang.String str3 = xMLParser1.getXML();
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
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str2 = xMLParser1.getXML();
    java.lang.String str3 = xMLParser1.getXML();
    xMLParser1.store();
    java.util.Hashtable hashtable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str2 = xMLParser1.getXML();
    java.lang.String str3 = xMLParser1.getXML();
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
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.util.Hashtable hashtable5 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("hi!", "hi!", hashtable5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.util.Vector vector4 = xMLParser1.getProperty("");
    java.util.Hashtable hashtable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "", hashtable7);
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
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str2 = xMLParser1.getXML();
    java.lang.String str3 = xMLParser1.getXML();
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
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str2 = xMLParser1.getXML();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.util.Vector vector6 = xMLParser1.getProperty("");
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
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.util.Vector vector4 = xMLParser1.getProperty("");
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
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str2 = xMLParser1.getXML();
    java.lang.String str3 = xMLParser1.getXML();
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
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    java.lang.String str1 = XMLParser.returnSpecial("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str1.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.util.Hashtable hashtable5 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("hi!", "hi!", hashtable5);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.util.Vector vector4 = xMLParser1.getProperty("");
    java.lang.String str5 = xMLParser1.getXML();
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
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.util.Vector vector4 = xMLParser1.getProperty("");
    java.lang.String str5 = xMLParser1.getXML();
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
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str2 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getSingleProperty("hi!");
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
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    XMLParser xMLParser1 = new XMLParser("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    java.util.Hashtable hashtable5 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("", "", hashtable5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    XMLParser xMLParser1 = new XMLParser("");
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
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.util.Vector vector4 = xMLParser1.getProperty("");
    java.lang.String str5 = xMLParser1.getXML();
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
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str2 = xMLParser1.getXML();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.util.Hashtable hashtable7 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.addProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable7);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("org.w3c.dom.DOMException")) {
        org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str2 = xMLParser1.getXML();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    java.util.Vector vector7 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.util.Vector vector4 = xMLParser1.getProperty("");
    xMLParser1.store();
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
    org.junit.Assert.assertNotNull(vector4);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.util.Vector vector4 = xMLParser1.getProperty("");
    java.lang.String str6 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
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
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str7.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    XMLParser xMLParser1 = new XMLParser("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
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
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.util.Vector vector4 = xMLParser1.getProperty("");
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.lang.String str8 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    XMLParser xMLParser1 = new XMLParser("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    java.lang.String str4 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str2 = xMLParser1.getXML();
    java.lang.String str3 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str5 = xMLParser1.getXML();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.util.Vector vector4 = xMLParser1.getProperty("");
    java.lang.String str6 = xMLParser1.getSingleProperty("");
    java.util.Vector vector8 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.util.Vector vector4 = xMLParser1.getProperty("");
    java.lang.String str5 = xMLParser1.getXML();
    java.util.Vector vector7 = xMLParser1.getProperty("");
    java.util.Vector vector9 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str2 = xMLParser1.getXML();
    java.util.Vector vector4 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str8 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.util.Vector vector4 = xMLParser1.getProperty("");
    java.lang.String str5 = xMLParser1.getXML();
    java.util.Vector vector7 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.lang.String str10 = xMLParser1.getXML();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str10.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str2 = xMLParser1.getXML();
    java.lang.String str3 = xMLParser1.getXML();
    xMLParser1.store();
    java.util.Vector vector6 = xMLParser1.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector6);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.util.Vector vector4 = xMLParser1.getProperty("");
    java.lang.String str5 = xMLParser1.getXML();
    java.util.Vector vector7 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
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
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    XMLParser xMLParser1 = new XMLParser("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    xMLParser1.store();
    java.lang.String str4 = xMLParser1.getSingleProperty("");
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
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.util.Vector vector4 = xMLParser1.getProperty("");
    java.lang.String str6 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.util.Vector vector8 = xMLParser1.getProperty("hi!");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.util.Vector vector4 = xMLParser1.getProperty("");
    java.lang.String str5 = xMLParser1.getXML();
    java.util.Vector vector7 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    java.lang.String str9 = xMLParser1.getSingleProperty("");
    java.util.Vector vector11 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str5.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str2 = xMLParser1.getXML();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Hashtable hashtable9 = null;
    // The following exception was thrown during execution in test generation
    try {
    xMLParser1.setProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>", hashtable9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    XMLParser xMLParser1 = new XMLParser("");
    xMLParser1.store();
    java.lang.String str3 = xMLParser1.getXML();
    xMLParser1.store();
    java.lang.String str6 = xMLParser1.getSingleProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"+ "'", str3.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


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
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str2 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getSingleProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str2 = xMLParser1.getXML();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str5 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getXML();
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str2 = xMLParser1.getXML();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.util.Vector vector6 = xMLParser1.getProperty("");
    java.lang.String str7 = xMLParser1.getXML();
    java.lang.String str9 = xMLParser1.getSingleProperty("hi!");
    java.lang.String str11 = xMLParser1.getSingleProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str2 = xMLParser1.getXML();
    java.lang.String str3 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getXML();
    java.lang.String str6 = xMLParser1.getSingleProperty("hi!");
    java.util.Vector vector8 = xMLParser1.getProperty("<?xml version=\"1.0\" encoding=\"UTF-8\"?><data/>");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    XMLParser xMLParser1 = new XMLParser("");
    java.lang.String str2 = xMLParser1.getXML();
    java.lang.String str4 = xMLParser1.getSingleProperty("hi!");
    xMLParser1.store();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

}
