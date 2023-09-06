
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("", hashtable_str_str1);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Enumeration enumeration3 = xmlElement2.getAttributeNames();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    java.util.Observer observer3 = null;
    xmlElement2.deleteObserver(observer3);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement6 = xmlElement2.getElement((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    xmlElement2.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    java.util.Observer observer14 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement13.addObserver(observer14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    XmlElement xmlElement1 = new XmlElement("");
    java.lang.String str2 = xmlElement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Observer observer1 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement0.addObserver(observer1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    xmlElement4.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement3 = xmlElement1.removeElement(10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    XmlElement xmlElement11 = xmlElement4.addSubElement("hi!");
    xmlElement4.notifyObservers((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("", hashtable_str_str1);
    int i3 = xmlElement2.count();
    java.util.Observer observer4 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement2.addObserver(observer4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    XmlElement xmlElement11 = xmlElement4.addSubElement("hi!");
    java.lang.String str12 = xmlElement11.getData();
    java.util.Observer observer13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement11.addObserver(observer13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    XmlElement xmlElement3 = new XmlElement("hi!");
    xmlElement1.append(xmlElement3);
    XmlElement xmlElement6 = xmlElement1.addSubElement("hi!");
    boolean b7 = xmlElement1.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement15 = xmlElement4.getElement((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    XmlElement xmlElement3 = new XmlElement("hi!");
    xmlElement1.append(xmlElement3);
    java.lang.String str7 = xmlElement3.getAttribute("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str9 = null;
    XmlElement xmlElement10 = new XmlElement("hi!", hashtable_str_str9);
    XmlElement xmlElement12 = new XmlElement("hi!");
    java.lang.Object obj15 = xmlElement12.addAttribute("", "");
    xmlElement10.setParent(xmlElement12);
    java.lang.String str17 = xmlElement12.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = null;
    XmlElement xmlElement20 = new XmlElement("", hashtable_str_str19);
    XmlElement xmlElement21 = xmlElement12.addSubElement(xmlElement20);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str22 = xmlElement12.getAttributes();
    // The following exception was thrown during execution in test generation
    try {
    xmlElement3.insertElement(xmlElement12, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str22);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    XmlElement xmlElement3 = new XmlElement("hi!");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = null;
    XmlElement xmlElement7 = new XmlElement("hi!", hashtable_str_str6);
    XmlElement xmlElement9 = new XmlElement("hi!");
    java.lang.Object obj12 = xmlElement9.addAttribute("", "");
    xmlElement7.setParent(xmlElement9);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str15 = null;
    XmlElement xmlElement16 = new XmlElement("hi!", hashtable_str_str15);
    java.util.Observer observer17 = null;
    xmlElement16.deleteObserver(observer17);
    xmlElement7.setParent(xmlElement16);
    XmlElement xmlElement21 = xmlElement16.getElement("hi!");
    xmlElement3.append(xmlElement16);
    boolean b23 = xmlElement3.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    java.util.Observer observer3 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement2.addObserver(observer3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = null;
    XmlElement xmlElement11 = new XmlElement("hi!", hashtable_str_str10);
    java.util.Observer observer12 = null;
    xmlElement11.deleteObserver(observer12);
    xmlElement2.setParent(xmlElement11);
    XmlElement xmlElement16 = xmlElement11.getElement("hi!");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement.printNode(xmlElement11, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = null;
    XmlElement xmlElement11 = new XmlElement("hi!", hashtable_str_str10);
    java.util.Observer observer12 = null;
    xmlElement11.deleteObserver(observer12);
    xmlElement2.setParent(xmlElement11);
    XmlElement xmlElement16 = xmlElement11.getElement("");
    java.util.Observer observer17 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement11.addObserver(observer17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    XmlElement xmlElement16 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement4.addSubElement(xmlElement16);
    XmlElement xmlElement18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement16.insertElement(xmlElement18, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    XmlElement xmlElement3 = new XmlElement("hi!");
    xmlElement1.append(xmlElement3);
    XmlElement xmlElement6 = xmlElement1.addSubElement("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = null;
    XmlElement xmlElement9 = new XmlElement("hi!", hashtable_str_str8);
    XmlElement xmlElement11 = new XmlElement("hi!");
    java.lang.Object obj14 = xmlElement11.addAttribute("", "");
    xmlElement9.setParent(xmlElement11);
    java.lang.String str16 = xmlElement11.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str18 = null;
    XmlElement xmlElement19 = new XmlElement("", hashtable_str_str18);
    XmlElement xmlElement20 = xmlElement11.addSubElement(xmlElement19);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = xmlElement11.getAttributes();
    xmlElement6.setAttributes(hashtable_str_str21);
    int i23 = xmlElement6.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    xmlElement13.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("", hashtable_str_str1);
    int i3 = xmlElement2.count();
    XmlElement xmlElement6 = xmlElement2.addSubElement("hi!", "hi!");
    XmlElement xmlElement7 = xmlElement6.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    XmlElement xmlElement11 = xmlElement4.addSubElement("hi!");
    int i12 = xmlElement11.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = null;
    XmlElement xmlElement11 = new XmlElement("hi!", hashtable_str_str10);
    java.util.Observer observer12 = null;
    xmlElement11.deleteObserver(observer12);
    xmlElement2.setParent(xmlElement11);
    XmlElement xmlElement16 = xmlElement2.addSubElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement16);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    XmlElement xmlElement3 = new XmlElement("hi!");
    xmlElement1.append(xmlElement3);
    java.lang.String str7 = xmlElement3.getAttribute("hi!", "");
    int i8 = xmlElement3.countObservers();
    java.lang.String str9 = xmlElement3.getData();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement11 = xmlElement3.removeElement((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    XmlElement xmlElement14 = xmlElement12.getParent();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = null;
    XmlElement xmlElement17 = new XmlElement("hi!", hashtable_str_str16);
    XmlElement xmlElement19 = new XmlElement("hi!");
    java.lang.Object obj22 = xmlElement19.addAttribute("", "");
    xmlElement17.setParent(xmlElement19);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str25 = null;
    XmlElement xmlElement26 = new XmlElement("hi!", hashtable_str_str25);
    java.util.Observer observer27 = null;
    xmlElement26.deleteObserver(observer27);
    xmlElement17.setParent(xmlElement26);
    XmlElement xmlElement31 = xmlElement26.getElement("hi!");
    // The following exception was thrown during execution in test generation
    try {
    xmlElement12.append(xmlElement31);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement31);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.Object obj4 = xmlElement1.addAttribute("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = null;
    XmlElement xmlElement7 = new XmlElement("hi!", hashtable_str_str6);
    XmlElement xmlElement9 = new XmlElement("hi!");
    java.lang.Object obj12 = xmlElement9.addAttribute("", "");
    xmlElement7.setParent(xmlElement9);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str15 = null;
    XmlElement xmlElement16 = new XmlElement("hi!", hashtable_str_str15);
    java.util.Observer observer17 = null;
    xmlElement16.deleteObserver(observer17);
    xmlElement7.setParent(xmlElement16);
    XmlElement xmlElement20 = xmlElement1.removeElement(xmlElement16);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = xmlElement20.getAttributes();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement20);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.util.Enumeration enumeration2 = xmlElement1.getAttributeNames();
    xmlElement1.removeFromParent();
    xmlElement1.setData("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    XmlElement xmlElement3 = new XmlElement("hi!");
    xmlElement1.append(xmlElement3);
    XmlElement xmlElement6 = xmlElement1.addSubElement("hi!");
    xmlElement6.removeFromParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("", hashtable_str_str1);
    int i3 = xmlElement2.count();
    boolean b4 = xmlElement2.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    XmlElement xmlElement16 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement4.addSubElement(xmlElement16);
    XmlElement xmlElement20 = xmlElement16.addSubElement("", "hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = xmlElement16.getAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str21);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.Object obj4 = xmlElement1.addAttribute("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = null;
    XmlElement xmlElement7 = new XmlElement("hi!", hashtable_str_str6);
    XmlElement xmlElement9 = new XmlElement("hi!");
    java.lang.Object obj12 = xmlElement9.addAttribute("", "");
    xmlElement7.setParent(xmlElement9);
    java.lang.String str14 = xmlElement9.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = null;
    XmlElement xmlElement17 = new XmlElement("", hashtable_str_str16);
    XmlElement xmlElement18 = xmlElement9.addSubElement(xmlElement17);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement9.getAttributes();
    xmlElement1.setAttributes(hashtable_str_str19);
    int i21 = xmlElement1.countObservers();
    XmlElement.printNode(xmlElement1, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    XmlElement xmlElement16 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement4.addSubElement(xmlElement16);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = null;
    XmlElement xmlElement20 = new XmlElement("hi!", hashtable_str_str19);
    XmlElement xmlElement22 = new XmlElement("hi!");
    java.lang.Object obj25 = xmlElement22.addAttribute("", "");
    xmlElement20.setParent(xmlElement22);
    java.lang.String str27 = xmlElement22.getName();
    XmlElement xmlElement29 = xmlElement22.addSubElement("hi!");
    xmlElement16.setParent(xmlElement29);
    XmlElement xmlElement32 = xmlElement16.getElement("hi!");
    boolean b33 = xmlElement16.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    XmlElement xmlElement3 = new XmlElement("hi!");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = null;
    XmlElement xmlElement7 = new XmlElement("hi!", hashtable_str_str6);
    XmlElement xmlElement9 = new XmlElement("hi!");
    java.lang.Object obj12 = xmlElement9.addAttribute("", "");
    xmlElement7.setParent(xmlElement9);
    java.lang.String str14 = xmlElement9.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = null;
    XmlElement xmlElement17 = new XmlElement("", hashtable_str_str16);
    XmlElement xmlElement18 = xmlElement9.addSubElement(xmlElement17);
    XmlElement xmlElement19 = xmlElement17.getParent();
    boolean b20 = xmlElement1.addElement(xmlElement19);
    java.lang.Object obj23 = xmlElement1.addAttribute("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str15 = null;
    XmlElement xmlElement16 = new XmlElement("", hashtable_str_str15);
    int i17 = xmlElement16.count();
    XmlElement xmlElement20 = xmlElement16.addSubElement("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    xmlElement12.insertElement(xmlElement20, (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    XmlElement xmlElement3 = new XmlElement("hi!");
    xmlElement1.append(xmlElement3);
    java.lang.Object obj5 = xmlElement3.clone();
    xmlElement3.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.Object obj4 = xmlElement1.addAttribute("", "");
    XmlElement xmlElement6 = new XmlElement("hi!");
    XmlElement xmlElement8 = new XmlElement("hi!");
    xmlElement6.append(xmlElement8);
    XmlElement xmlElement11 = new XmlElement("hi!");
    java.lang.Object obj14 = xmlElement11.addAttribute("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = null;
    XmlElement xmlElement17 = new XmlElement("hi!", hashtable_str_str16);
    XmlElement xmlElement19 = new XmlElement("hi!");
    java.lang.Object obj22 = xmlElement19.addAttribute("", "");
    xmlElement17.setParent(xmlElement19);
    java.lang.String str24 = xmlElement19.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = null;
    XmlElement xmlElement27 = new XmlElement("", hashtable_str_str26);
    XmlElement xmlElement28 = xmlElement19.addSubElement(xmlElement27);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str29 = xmlElement19.getAttributes();
    xmlElement11.setAttributes(hashtable_str_str29);
    xmlElement8.setAttributes(hashtable_str_str29);
    xmlElement1.setAttributes(hashtable_str_str29);
    java.util.List list33 = xmlElement1.getElements();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str34 = xmlElement1.getAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str34);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    XmlElement xmlElement0 = new XmlElement();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement2 = xmlElement0.removeElement((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    xmlElement1.removeAllElements();
    java.lang.String str4 = xmlElement1.getAttribute("");
    int i5 = xmlElement1.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    XmlElement xmlElement11 = xmlElement4.addSubElement("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str13 = null;
    XmlElement xmlElement14 = new XmlElement("hi!", hashtable_str_str13);
    XmlElement xmlElement16 = new XmlElement("hi!");
    java.lang.Object obj19 = xmlElement16.addAttribute("", "");
    xmlElement14.setParent(xmlElement16);
    java.lang.String str21 = xmlElement16.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str23 = null;
    XmlElement xmlElement24 = new XmlElement("", hashtable_str_str23);
    XmlElement xmlElement25 = xmlElement16.addSubElement(xmlElement24);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = xmlElement16.getAttributes();
    xmlElement4.setAttributes(hashtable_str_str26);
    int i28 = xmlElement4.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    XmlElement xmlElement11 = xmlElement4.addSubElement("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str13 = null;
    XmlElement xmlElement14 = new XmlElement("hi!", hashtable_str_str13);
    XmlElement xmlElement16 = new XmlElement("hi!");
    java.lang.Object obj19 = xmlElement16.addAttribute("", "");
    xmlElement14.setParent(xmlElement16);
    XmlElement xmlElement22 = new XmlElement("hi!");
    XmlElement xmlElement24 = new XmlElement("hi!");
    xmlElement22.append(xmlElement24);
    XmlElement xmlElement27 = xmlElement22.addSubElement("hi!");
    XmlElement xmlElement28 = xmlElement14.addSubElement(xmlElement22);
    XmlElement xmlElement29 = xmlElement11.removeElement(xmlElement22);
    // The following exception was thrown during execution in test generation
    try {
    xmlElement29.setName("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement29);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    xmlElement1.removeAllElements();
    java.lang.String str4 = xmlElement1.getAttribute("");
    java.util.Observer observer5 = null;
    xmlElement1.deleteObserver(observer5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    XmlElement xmlElement16 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement4.addSubElement(xmlElement16);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = null;
    XmlElement xmlElement20 = new XmlElement("hi!", hashtable_str_str19);
    XmlElement xmlElement22 = new XmlElement("hi!");
    java.lang.Object obj25 = xmlElement22.addAttribute("", "");
    xmlElement20.setParent(xmlElement22);
    java.lang.String str27 = xmlElement22.getName();
    XmlElement xmlElement29 = xmlElement22.addSubElement("hi!");
    xmlElement16.setParent(xmlElement29);
    XmlElement xmlElement31 = xmlElement29.getParent();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str33 = null;
    XmlElement xmlElement34 = new XmlElement("hi!", hashtable_str_str33);
    XmlElement xmlElement36 = new XmlElement("hi!");
    java.lang.Object obj39 = xmlElement36.addAttribute("", "");
    xmlElement34.setParent(xmlElement36);
    java.lang.String str41 = xmlElement36.getName();
    XmlElement xmlElement43 = xmlElement36.addSubElement("hi!");
    java.util.List list44 = xmlElement43.getElements();
    XmlElement xmlElement45 = xmlElement31.addSubElement(xmlElement43);
    XmlElement xmlElement47 = xmlElement31.addSubElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement47);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    XmlElement xmlElement3 = new XmlElement("hi!");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = null;
    XmlElement xmlElement7 = new XmlElement("hi!", hashtable_str_str6);
    XmlElement xmlElement9 = new XmlElement("hi!");
    java.lang.Object obj12 = xmlElement9.addAttribute("", "");
    xmlElement7.setParent(xmlElement9);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str15 = null;
    XmlElement xmlElement16 = new XmlElement("hi!", hashtable_str_str15);
    java.util.Observer observer17 = null;
    xmlElement16.deleteObserver(observer17);
    xmlElement7.setParent(xmlElement16);
    XmlElement xmlElement21 = xmlElement16.getElement("hi!");
    xmlElement3.append(xmlElement16);
    java.lang.Object obj23 = xmlElement3.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj23);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    java.lang.Object obj3 = xmlElement2.clone();
    java.util.List list4 = xmlElement2.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("", hashtable_str_str1);
    int i3 = xmlElement2.count();
    XmlElement xmlElement6 = xmlElement2.addSubElement("hi!", "hi!");
    XmlElement xmlElement9 = new XmlElement("", "");
    java.lang.Object obj10 = xmlElement9.clone();
    XmlElement xmlElement11 = xmlElement6.addSubElement(xmlElement9);
    int i12 = xmlElement11.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.Object obj4 = xmlElement1.addAttribute("", "");
    XmlElement xmlElement6 = new XmlElement("hi!");
    XmlElement xmlElement8 = new XmlElement("hi!");
    xmlElement6.append(xmlElement8);
    XmlElement xmlElement11 = new XmlElement("hi!");
    java.lang.Object obj14 = xmlElement11.addAttribute("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = null;
    XmlElement xmlElement17 = new XmlElement("hi!", hashtable_str_str16);
    XmlElement xmlElement19 = new XmlElement("hi!");
    java.lang.Object obj22 = xmlElement19.addAttribute("", "");
    xmlElement17.setParent(xmlElement19);
    java.lang.String str24 = xmlElement19.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = null;
    XmlElement xmlElement27 = new XmlElement("", hashtable_str_str26);
    XmlElement xmlElement28 = xmlElement19.addSubElement(xmlElement27);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str29 = xmlElement19.getAttributes();
    xmlElement11.setAttributes(hashtable_str_str29);
    xmlElement8.setAttributes(hashtable_str_str29);
    xmlElement1.setAttributes(hashtable_str_str29);
    java.util.List list33 = xmlElement1.getElements();
    xmlElement1.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list33);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    xmlElement12.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    XmlElement xmlElement16 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement4.addSubElement(xmlElement16);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = null;
    XmlElement xmlElement20 = new XmlElement("hi!", hashtable_str_str19);
    XmlElement xmlElement22 = new XmlElement("hi!");
    java.lang.Object obj25 = xmlElement22.addAttribute("", "");
    xmlElement20.setParent(xmlElement22);
    java.lang.String str27 = xmlElement22.getName();
    XmlElement xmlElement29 = xmlElement22.addSubElement("hi!");
    xmlElement16.setParent(xmlElement29);
    XmlElement xmlElement32 = xmlElement16.getElement("hi!");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj35 = xmlElement32.addAttribute("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement32);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    XmlElement xmlElement0 = new XmlElement();
    XmlElement xmlElement2 = new XmlElement("hi!");
    XmlElement xmlElement4 = new XmlElement("hi!");
    xmlElement2.append(xmlElement4);
    java.lang.Object obj6 = xmlElement4.clone();
    xmlElement0.append(xmlElement4);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str9 = null;
    XmlElement xmlElement10 = new XmlElement("hi!", hashtable_str_str9);
    XmlElement xmlElement12 = new XmlElement("hi!");
    java.lang.Object obj15 = xmlElement12.addAttribute("", "");
    xmlElement10.setParent(xmlElement12);
    java.lang.String str17 = xmlElement12.getName();
    java.util.Observer observer18 = null;
    xmlElement12.deleteObserver(observer18);
    XmlElement xmlElement20 = xmlElement0.addSubElement(xmlElement12);
    xmlElement0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    xmlElement13.removeFromParent();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str15 = xmlElement13.getAttributes();
    // The following exception was thrown during execution in test generation
    try {
    java.util.Enumeration enumeration16 = xmlElement13.getAttributeNames();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashtable_str_str15);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    XmlElement xmlElement0 = new XmlElement();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement2 = xmlElement0.removeElement((int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    xmlElement1.removeAllElements();
    java.lang.String str5 = xmlElement1.getAttribute("", "hi!");
    java.util.Enumeration enumeration6 = xmlElement1.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    xmlElement1.removeAllElements();
    java.lang.Object obj5 = xmlElement1.addAttribute("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.Object obj4 = xmlElement1.addAttribute("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = null;
    XmlElement xmlElement7 = new XmlElement("hi!", hashtable_str_str6);
    XmlElement xmlElement9 = new XmlElement("hi!");
    java.lang.Object obj12 = xmlElement9.addAttribute("", "");
    xmlElement7.setParent(xmlElement9);
    java.lang.String str14 = xmlElement9.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = null;
    XmlElement xmlElement17 = new XmlElement("", hashtable_str_str16);
    XmlElement xmlElement18 = xmlElement9.addSubElement(xmlElement17);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement9.getAttributes();
    xmlElement1.setAttributes(hashtable_str_str19);
    xmlElement1.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    XmlElement xmlElement14 = xmlElement12.getParent();
    int i15 = xmlElement12.count();
    XmlElement xmlElement17 = new XmlElement("hi!");
    XmlElement xmlElement19 = new XmlElement("hi!");
    xmlElement17.append(xmlElement19);
    XmlElement xmlElement22 = xmlElement17.addSubElement("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str24 = null;
    XmlElement xmlElement25 = new XmlElement("hi!", hashtable_str_str24);
    XmlElement xmlElement27 = new XmlElement("hi!");
    java.lang.Object obj30 = xmlElement27.addAttribute("", "");
    xmlElement25.setParent(xmlElement27);
    java.lang.String str32 = xmlElement27.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str34 = null;
    XmlElement xmlElement35 = new XmlElement("", hashtable_str_str34);
    XmlElement xmlElement36 = xmlElement27.addSubElement(xmlElement35);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str37 = xmlElement27.getAttributes();
    xmlElement22.setAttributes(hashtable_str_str37);
    xmlElement12.setAttributes(hashtable_str_str37);
    XmlElement xmlElement40 = null;
    xmlElement12.setParent(xmlElement40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str37);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    java.util.Observer observer3 = null;
    xmlElement2.deleteObserver(observer3);
    java.lang.String str5 = xmlElement2.getName();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = xmlElement2.getAttribute("");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    xmlElement1.removeAllElements();
    java.lang.String str5 = xmlElement1.getAttribute("", "hi!");
    xmlElement1.removeFromParent();
    xmlElement1.notifyObservers((java.lang.Object)0.0d);
    java.util.Enumeration enumeration9 = xmlElement1.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    boolean b3 = xmlElement2.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    XmlElement xmlElement2 = new XmlElement("hi!");
    XmlElement xmlElement4 = new XmlElement("hi!");
    xmlElement2.append(xmlElement4);
    XmlElement xmlElement7 = xmlElement2.addSubElement("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str9 = null;
    XmlElement xmlElement10 = new XmlElement("hi!", hashtable_str_str9);
    XmlElement xmlElement12 = new XmlElement("hi!");
    java.lang.Object obj15 = xmlElement12.addAttribute("", "");
    xmlElement10.setParent(xmlElement12);
    java.lang.String str17 = xmlElement12.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = null;
    XmlElement xmlElement20 = new XmlElement("", hashtable_str_str19);
    XmlElement xmlElement21 = xmlElement12.addSubElement(xmlElement20);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str22 = xmlElement12.getAttributes();
    xmlElement7.setAttributes(hashtable_str_str22);
    XmlElement xmlElement24 = new XmlElement("", hashtable_str_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str22);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    boolean b3 = xmlElement2.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    XmlElement xmlElement16 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement4.addSubElement(xmlElement16);
    XmlElement xmlElement20 = xmlElement16.addSubElement("", "hi!");
    boolean b21 = xmlElement16.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.util.Enumeration enumeration2 = xmlElement1.getAttributeNames();
    xmlElement1.removeFromParent();
    XmlElement.printNode(xmlElement1, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.Object obj4 = xmlElement1.addAttribute("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = null;
    XmlElement xmlElement7 = new XmlElement("hi!", hashtable_str_str6);
    XmlElement xmlElement9 = new XmlElement("hi!");
    java.lang.Object obj12 = xmlElement9.addAttribute("", "");
    xmlElement7.setParent(xmlElement9);
    java.lang.String str14 = xmlElement9.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = null;
    XmlElement xmlElement17 = new XmlElement("", hashtable_str_str16);
    XmlElement xmlElement18 = xmlElement9.addSubElement(xmlElement17);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement9.getAttributes();
    xmlElement1.setAttributes(hashtable_str_str19);
    XmlElement xmlElement22 = xmlElement1.addSubElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    XmlElement xmlElement0 = new XmlElement();
    XmlElement.printNode(xmlElement0, "");
    int i3 = xmlElement0.count();
    XmlElement xmlElement6 = xmlElement0.addSubElement("hi!", "");
    XmlElement xmlElement8 = new XmlElement("hi!");
    xmlElement8.removeAllElements();
    java.lang.String str11 = xmlElement8.getAttribute("");
    xmlElement0.append(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    xmlElement1.removeAllElements();
    java.lang.String str5 = xmlElement1.getAttribute("", "hi!");
    java.lang.String str8 = xmlElement1.getAttribute("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    XmlElement xmlElement3 = new XmlElement("hi!");
    xmlElement1.append(xmlElement3);
    XmlElement xmlElement6 = xmlElement1.addSubElement("hi!");
    xmlElement1.notifyObservers();
    java.lang.Object obj10 = xmlElement1.addAttribute("hi!", "hi!");
    java.util.Observer observer11 = null;
    xmlElement1.deleteObserver(observer11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    XmlElement xmlElement0 = new XmlElement();
    XmlElement.printNode(xmlElement0, "");
    int i3 = xmlElement0.count();
    java.lang.String str4 = xmlElement0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    XmlElement xmlElement14 = xmlElement12.getParent();
    int i15 = xmlElement12.count();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str17 = null;
    XmlElement xmlElement18 = new XmlElement("hi!", hashtable_str_str17);
    XmlElement xmlElement20 = new XmlElement("hi!");
    java.lang.Object obj23 = xmlElement20.addAttribute("", "");
    xmlElement18.setParent(xmlElement20);
    java.lang.String str25 = xmlElement20.getName();
    XmlElement xmlElement27 = xmlElement20.addSubElement("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str29 = null;
    XmlElement xmlElement30 = new XmlElement("hi!", hashtable_str_str29);
    XmlElement xmlElement32 = new XmlElement("hi!");
    java.lang.Object obj35 = xmlElement32.addAttribute("", "");
    xmlElement30.setParent(xmlElement32);
    java.lang.String str37 = xmlElement32.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str39 = null;
    XmlElement xmlElement40 = new XmlElement("", hashtable_str_str39);
    XmlElement xmlElement41 = xmlElement32.addSubElement(xmlElement40);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str42 = xmlElement32.getAttributes();
    xmlElement20.setAttributes(hashtable_str_str42);
    xmlElement20.setData("");
    XmlElement xmlElement46 = xmlElement12.removeElement(xmlElement20);
    XmlElement xmlElement48 = new XmlElement("hi!");
    XmlElement xmlElement50 = new XmlElement("hi!");
    xmlElement48.append(xmlElement50);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str53 = null;
    XmlElement xmlElement54 = new XmlElement("hi!", hashtable_str_str53);
    XmlElement xmlElement56 = new XmlElement("hi!");
    java.lang.Object obj59 = xmlElement56.addAttribute("", "");
    xmlElement54.setParent(xmlElement56);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str62 = null;
    XmlElement xmlElement63 = new XmlElement("hi!", hashtable_str_str62);
    java.util.Observer observer64 = null;
    xmlElement63.deleteObserver(observer64);
    xmlElement54.setParent(xmlElement63);
    XmlElement xmlElement68 = xmlElement63.getElement("hi!");
    xmlElement50.append(xmlElement63);
    boolean b70 = xmlElement20.equals((java.lang.Object)xmlElement63);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement72 = xmlElement63.removeElement(0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    XmlElement xmlElement0 = new XmlElement();
    XmlElement.printNode(xmlElement0, "");
    int i3 = xmlElement0.count();
    XmlElement.printNode(xmlElement0, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    XmlElement xmlElement0 = new XmlElement();
    XmlElement.printNode(xmlElement0, "");
    int i3 = xmlElement0.count();
    XmlElement xmlElement6 = xmlElement0.addSubElement("hi!", "");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement8 = xmlElement6.getElement((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    XmlElement xmlElement14 = xmlElement12.getParent();
    int i15 = xmlElement12.count();
    xmlElement12.setData("");
    boolean b19 = xmlElement12.equals((java.lang.Object)(byte)-1);
    xmlElement12.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = null;
    XmlElement xmlElement11 = new XmlElement("hi!", hashtable_str_str10);
    java.util.Observer observer12 = null;
    xmlElement11.deleteObserver(observer12);
    xmlElement2.setParent(xmlElement11);
    int i15 = xmlElement11.countObservers();
    XmlElement xmlElement18 = new XmlElement("", "hi!");
    XmlElement xmlElement19 = xmlElement18.getParent();
    boolean b20 = xmlElement11.addElement(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.Object obj4 = xmlElement1.addAttribute("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = null;
    XmlElement xmlElement7 = new XmlElement("hi!", hashtable_str_str6);
    XmlElement xmlElement9 = new XmlElement("hi!");
    java.lang.Object obj12 = xmlElement9.addAttribute("", "");
    xmlElement7.setParent(xmlElement9);
    java.lang.String str14 = xmlElement9.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = null;
    XmlElement xmlElement17 = new XmlElement("", hashtable_str_str16);
    XmlElement xmlElement18 = xmlElement9.addSubElement(xmlElement17);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement9.getAttributes();
    xmlElement1.setAttributes(hashtable_str_str19);
    java.lang.String str22 = xmlElement1.getAttribute("");
    java.util.List list23 = xmlElement1.getElements();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str25 = null;
    XmlElement xmlElement26 = new XmlElement("hi!", hashtable_str_str25);
    XmlElement xmlElement28 = new XmlElement("hi!");
    java.lang.Object obj31 = xmlElement28.addAttribute("", "");
    xmlElement26.setParent(xmlElement28);
    java.lang.String str33 = xmlElement28.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str35 = null;
    XmlElement xmlElement36 = new XmlElement("", hashtable_str_str35);
    XmlElement xmlElement37 = xmlElement28.addSubElement(xmlElement36);
    XmlElement xmlElement40 = new XmlElement("", "");
    XmlElement xmlElement41 = xmlElement28.addSubElement(xmlElement40);
    XmlElement xmlElement42 = xmlElement1.addSubElement(xmlElement41);
    java.lang.String str43 = xmlElement1.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + ""+ "'", str43.equals(""));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    XmlElement xmlElement3 = new XmlElement("hi!");
    xmlElement1.append(xmlElement3);
    XmlElement xmlElement6 = new XmlElement("hi!");
    XmlElement xmlElement8 = new XmlElement("hi!");
    xmlElement6.append(xmlElement8);
    XmlElement xmlElement11 = new XmlElement("hi!");
    java.lang.Object obj14 = xmlElement11.addAttribute("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = null;
    XmlElement xmlElement17 = new XmlElement("hi!", hashtable_str_str16);
    XmlElement xmlElement19 = new XmlElement("hi!");
    java.lang.Object obj22 = xmlElement19.addAttribute("", "");
    xmlElement17.setParent(xmlElement19);
    java.lang.String str24 = xmlElement19.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = null;
    XmlElement xmlElement27 = new XmlElement("", hashtable_str_str26);
    XmlElement xmlElement28 = xmlElement19.addSubElement(xmlElement27);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str29 = xmlElement19.getAttributes();
    xmlElement11.setAttributes(hashtable_str_str29);
    xmlElement8.setAttributes(hashtable_str_str29);
    xmlElement3.append(xmlElement8);
    XmlElement xmlElement34 = xmlElement8.addSubElement("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str36 = null;
    XmlElement xmlElement37 = new XmlElement("hi!", hashtable_str_str36);
    XmlElement xmlElement39 = new XmlElement("hi!");
    java.lang.Object obj42 = xmlElement39.addAttribute("", "");
    xmlElement37.setParent(xmlElement39);
    java.lang.String str44 = xmlElement39.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str46 = null;
    XmlElement xmlElement47 = new XmlElement("", hashtable_str_str46);
    XmlElement xmlElement48 = xmlElement39.addSubElement(xmlElement47);
    XmlElement xmlElement49 = xmlElement8.removeElement(xmlElement39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!"+ "'", str44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement49);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    XmlElement xmlElement2 = new XmlElement("", "hi!");
    XmlElement xmlElement3 = xmlElement2.getParent();
    int i4 = xmlElement2.countObservers();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement6 = xmlElement2.getElement((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    XmlElement xmlElement11 = xmlElement4.addSubElement("hi!");
    XmlElement xmlElement13 = new XmlElement("hi!");
    xmlElement13.removeAllElements();
    java.lang.String str16 = xmlElement13.getAttribute("");
    // The following exception was thrown during execution in test generation
    try {
    xmlElement11.insertElement(xmlElement13, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.Object obj4 = xmlElement1.addAttribute("", "");
    XmlElement xmlElement6 = new XmlElement("hi!");
    XmlElement xmlElement8 = new XmlElement("hi!");
    xmlElement6.append(xmlElement8);
    XmlElement xmlElement11 = new XmlElement("hi!");
    java.lang.Object obj14 = xmlElement11.addAttribute("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = null;
    XmlElement xmlElement17 = new XmlElement("hi!", hashtable_str_str16);
    XmlElement xmlElement19 = new XmlElement("hi!");
    java.lang.Object obj22 = xmlElement19.addAttribute("", "");
    xmlElement17.setParent(xmlElement19);
    java.lang.String str24 = xmlElement19.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = null;
    XmlElement xmlElement27 = new XmlElement("", hashtable_str_str26);
    XmlElement xmlElement28 = xmlElement19.addSubElement(xmlElement27);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str29 = xmlElement19.getAttributes();
    xmlElement11.setAttributes(hashtable_str_str29);
    xmlElement8.setAttributes(hashtable_str_str29);
    xmlElement1.setAttributes(hashtable_str_str29);
    java.util.List list33 = xmlElement1.getElements();
    XmlElement xmlElement34 = xmlElement1.getParent();
    xmlElement1.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement34);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.Object obj4 = xmlElement1.addAttribute("", "");
    XmlElement xmlElement6 = new XmlElement("hi!");
    XmlElement xmlElement8 = new XmlElement("hi!");
    xmlElement6.append(xmlElement8);
    XmlElement xmlElement11 = new XmlElement("hi!");
    java.lang.Object obj14 = xmlElement11.addAttribute("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = null;
    XmlElement xmlElement17 = new XmlElement("hi!", hashtable_str_str16);
    XmlElement xmlElement19 = new XmlElement("hi!");
    java.lang.Object obj22 = xmlElement19.addAttribute("", "");
    xmlElement17.setParent(xmlElement19);
    java.lang.String str24 = xmlElement19.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = null;
    XmlElement xmlElement27 = new XmlElement("", hashtable_str_str26);
    XmlElement xmlElement28 = xmlElement19.addSubElement(xmlElement27);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str29 = xmlElement19.getAttributes();
    xmlElement11.setAttributes(hashtable_str_str29);
    xmlElement8.setAttributes(hashtable_str_str29);
    xmlElement1.setAttributes(hashtable_str_str29);
    xmlElement1.setData("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str29);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    XmlElement xmlElement16 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement4.addSubElement(xmlElement16);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = null;
    XmlElement xmlElement20 = new XmlElement("hi!", hashtable_str_str19);
    XmlElement xmlElement22 = new XmlElement("hi!");
    java.lang.Object obj25 = xmlElement22.addAttribute("", "");
    xmlElement20.setParent(xmlElement22);
    java.lang.String str27 = xmlElement22.getName();
    XmlElement xmlElement29 = xmlElement22.addSubElement("hi!");
    xmlElement16.setParent(xmlElement29);
    XmlElement xmlElement32 = xmlElement16.getElement("hi!");
    java.util.Enumeration enumeration33 = xmlElement16.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration33);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    XmlElement xmlElement2 = new XmlElement("", "hi!");
    XmlElement xmlElement3 = xmlElement2.getParent();
    // The following exception was thrown during execution in test generation
    try {
    int i4 = xmlElement3.count();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement3);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    XmlElement xmlElement16 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement4.addSubElement(xmlElement16);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = null;
    XmlElement xmlElement20 = new XmlElement("hi!", hashtable_str_str19);
    XmlElement xmlElement22 = new XmlElement("hi!");
    java.lang.Object obj25 = xmlElement22.addAttribute("", "");
    xmlElement20.setParent(xmlElement22);
    java.lang.String str27 = xmlElement22.getName();
    XmlElement xmlElement29 = xmlElement22.addSubElement("hi!");
    xmlElement16.setParent(xmlElement29);
    XmlElement xmlElement31 = xmlElement29.getParent();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str33 = null;
    XmlElement xmlElement34 = new XmlElement("hi!", hashtable_str_str33);
    XmlElement xmlElement36 = new XmlElement("hi!");
    java.lang.Object obj39 = xmlElement36.addAttribute("", "");
    xmlElement34.setParent(xmlElement36);
    java.lang.String str41 = xmlElement36.getName();
    XmlElement xmlElement43 = xmlElement36.addSubElement("hi!");
    java.util.List list44 = xmlElement43.getElements();
    XmlElement xmlElement45 = xmlElement31.addSubElement(xmlElement43);
    XmlElement xmlElement47 = xmlElement31.getElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement47);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    XmlElement xmlElement3 = new XmlElement("hi!");
    xmlElement1.append(xmlElement3);
    XmlElement xmlElement6 = new XmlElement("hi!");
    java.lang.Object obj9 = xmlElement6.addAttribute("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("hi!", hashtable_str_str11);
    XmlElement xmlElement14 = new XmlElement("hi!");
    java.lang.Object obj17 = xmlElement14.addAttribute("", "");
    xmlElement12.setParent(xmlElement14);
    java.lang.String str19 = xmlElement14.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = null;
    XmlElement xmlElement22 = new XmlElement("", hashtable_str_str21);
    XmlElement xmlElement23 = xmlElement14.addSubElement(xmlElement22);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str24 = xmlElement14.getAttributes();
    xmlElement6.setAttributes(hashtable_str_str24);
    xmlElement3.setAttributes(hashtable_str_str24);
    java.util.Observer observer27 = null;
    xmlElement3.deleteObserver(observer27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str24);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("", hashtable_str_str1);
    int i3 = xmlElement2.count();
    XmlElement xmlElement6 = xmlElement2.addSubElement("hi!", "hi!");
    java.util.List list7 = xmlElement6.getElements();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str9 = null;
    XmlElement xmlElement10 = new XmlElement("hi!", hashtable_str_str9);
    XmlElement xmlElement12 = new XmlElement("hi!");
    java.lang.Object obj15 = xmlElement12.addAttribute("", "");
    xmlElement10.setParent(xmlElement12);
    java.lang.String str17 = xmlElement12.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = null;
    XmlElement xmlElement20 = new XmlElement("", hashtable_str_str19);
    XmlElement xmlElement21 = xmlElement12.addSubElement(xmlElement20);
    XmlElement xmlElement22 = xmlElement20.getParent();
    int i23 = xmlElement20.count();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str25 = null;
    XmlElement xmlElement26 = new XmlElement("hi!", hashtable_str_str25);
    XmlElement xmlElement28 = new XmlElement("hi!");
    java.lang.Object obj31 = xmlElement28.addAttribute("", "");
    xmlElement26.setParent(xmlElement28);
    java.lang.String str33 = xmlElement28.getName();
    XmlElement xmlElement35 = xmlElement28.addSubElement("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str37 = null;
    XmlElement xmlElement38 = new XmlElement("hi!", hashtable_str_str37);
    XmlElement xmlElement40 = new XmlElement("hi!");
    java.lang.Object obj43 = xmlElement40.addAttribute("", "");
    xmlElement38.setParent(xmlElement40);
    java.lang.String str45 = xmlElement40.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str47 = null;
    XmlElement xmlElement48 = new XmlElement("", hashtable_str_str47);
    XmlElement xmlElement49 = xmlElement40.addSubElement(xmlElement48);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str50 = xmlElement40.getAttributes();
    xmlElement28.setAttributes(hashtable_str_str50);
    xmlElement28.setData("");
    XmlElement xmlElement54 = xmlElement20.removeElement(xmlElement28);
    XmlElement xmlElement55 = xmlElement6.removeElement(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!"+ "'", str45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement55);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str2 = null;
    XmlElement xmlElement3 = new XmlElement("hi!", hashtable_str_str2);
    XmlElement xmlElement5 = new XmlElement("hi!");
    java.lang.Object obj8 = xmlElement5.addAttribute("", "");
    xmlElement3.setParent(xmlElement5);
    java.lang.String str10 = xmlElement5.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = null;
    XmlElement xmlElement13 = new XmlElement("", hashtable_str_str12);
    XmlElement xmlElement14 = xmlElement5.addSubElement(xmlElement13);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str15 = xmlElement5.getAttributes();
    XmlElement xmlElement16 = new XmlElement("hi!", hashtable_str_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str15);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    XmlElement xmlElement16 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement4.addSubElement(xmlElement16);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement.printNode(xmlElement4, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    XmlElement xmlElement0 = new XmlElement();
    XmlElement xmlElement2 = new XmlElement("hi!");
    XmlElement xmlElement4 = new XmlElement("hi!");
    xmlElement2.append(xmlElement4);
    java.lang.Object obj6 = xmlElement4.clone();
    xmlElement0.append(xmlElement4);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str9 = null;
    XmlElement xmlElement10 = new XmlElement("hi!", hashtable_str_str9);
    XmlElement xmlElement12 = new XmlElement("hi!");
    java.lang.Object obj15 = xmlElement12.addAttribute("", "");
    xmlElement10.setParent(xmlElement12);
    java.lang.String str17 = xmlElement12.getName();
    java.util.Observer observer18 = null;
    xmlElement12.deleteObserver(observer18);
    XmlElement xmlElement20 = xmlElement0.addSubElement(xmlElement12);
    XmlElement.printNode(xmlElement20, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    XmlElement xmlElement16 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement4.addSubElement(xmlElement16);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = null;
    XmlElement xmlElement20 = new XmlElement("hi!", hashtable_str_str19);
    XmlElement xmlElement22 = new XmlElement("hi!");
    java.lang.Object obj25 = xmlElement22.addAttribute("", "");
    xmlElement20.setParent(xmlElement22);
    java.lang.String str27 = xmlElement22.getName();
    XmlElement xmlElement29 = xmlElement22.addSubElement("hi!");
    xmlElement16.setParent(xmlElement29);
    java.lang.Object obj31 = xmlElement16.clone();
    java.lang.String str32 = xmlElement16.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    XmlElement xmlElement0 = new XmlElement();
    XmlElement xmlElement2 = new XmlElement("hi!");
    XmlElement xmlElement4 = new XmlElement("hi!");
    xmlElement2.append(xmlElement4);
    java.lang.Object obj6 = xmlElement4.clone();
    xmlElement0.append(xmlElement4);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str9 = null;
    XmlElement xmlElement10 = new XmlElement("hi!", hashtable_str_str9);
    XmlElement xmlElement12 = new XmlElement("hi!");
    java.lang.Object obj15 = xmlElement12.addAttribute("", "");
    xmlElement10.setParent(xmlElement12);
    java.lang.String str17 = xmlElement12.getName();
    java.util.Observer observer18 = null;
    xmlElement12.deleteObserver(observer18);
    XmlElement xmlElement20 = xmlElement0.addSubElement(xmlElement12);
    XmlElement xmlElement21 = xmlElement12.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    java.util.Observer observer3 = null;
    xmlElement2.deleteObserver(observer3);
    java.lang.String str5 = xmlElement2.getName();
    XmlElement xmlElement6 = xmlElement2.getParent();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = null;
    XmlElement xmlElement9 = new XmlElement("hi!", hashtable_str_str8);
    XmlElement xmlElement11 = new XmlElement("hi!");
    java.lang.Object obj14 = xmlElement11.addAttribute("", "");
    xmlElement9.setParent(xmlElement11);
    XmlElement xmlElement17 = new XmlElement("hi!");
    XmlElement xmlElement19 = new XmlElement("hi!");
    xmlElement17.append(xmlElement19);
    XmlElement xmlElement22 = xmlElement17.addSubElement("hi!");
    XmlElement xmlElement23 = xmlElement9.addSubElement(xmlElement17);
    java.lang.String str24 = xmlElement17.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = null;
    XmlElement xmlElement27 = new XmlElement("hi!", hashtable_str_str26);
    XmlElement xmlElement29 = new XmlElement("hi!");
    java.lang.Object obj32 = xmlElement29.addAttribute("", "");
    xmlElement27.setParent(xmlElement29);
    java.lang.String str34 = xmlElement29.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str36 = null;
    XmlElement xmlElement37 = new XmlElement("", hashtable_str_str36);
    XmlElement xmlElement38 = xmlElement29.addSubElement(xmlElement37);
    XmlElement xmlElement41 = new XmlElement("", "");
    XmlElement xmlElement42 = xmlElement29.addSubElement(xmlElement41);
    XmlElement xmlElement45 = xmlElement41.addSubElement("", "hi!");
    XmlElement xmlElement47 = new XmlElement("hi!");
    java.lang.Object obj50 = xmlElement47.addAttribute("", "");
    XmlElement xmlElement52 = new XmlElement("hi!");
    XmlElement xmlElement54 = new XmlElement("hi!");
    xmlElement52.append(xmlElement54);
    XmlElement xmlElement57 = new XmlElement("hi!");
    java.lang.Object obj60 = xmlElement57.addAttribute("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str62 = null;
    XmlElement xmlElement63 = new XmlElement("hi!", hashtable_str_str62);
    XmlElement xmlElement65 = new XmlElement("hi!");
    java.lang.Object obj68 = xmlElement65.addAttribute("", "");
    xmlElement63.setParent(xmlElement65);
    java.lang.String str70 = xmlElement65.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str72 = null;
    XmlElement xmlElement73 = new XmlElement("", hashtable_str_str72);
    XmlElement xmlElement74 = xmlElement65.addSubElement(xmlElement73);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str75 = xmlElement65.getAttributes();
    xmlElement57.setAttributes(hashtable_str_str75);
    xmlElement54.setAttributes(hashtable_str_str75);
    xmlElement47.setAttributes(hashtable_str_str75);
    xmlElement41.setAttributes(hashtable_str_str75);
    xmlElement17.setAttributes(hashtable_str_str75);
    xmlElement2.notifyObservers((java.lang.Object)hashtable_str_str75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "hi!"+ "'", str70.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str75);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    XmlElement xmlElement16 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement4.addSubElement(xmlElement16);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = null;
    XmlElement xmlElement20 = new XmlElement("hi!", hashtable_str_str19);
    XmlElement xmlElement22 = new XmlElement("hi!");
    java.lang.Object obj25 = xmlElement22.addAttribute("", "");
    xmlElement20.setParent(xmlElement22);
    java.lang.String str27 = xmlElement22.getName();
    XmlElement xmlElement29 = xmlElement22.addSubElement("hi!");
    xmlElement16.setParent(xmlElement29);
    XmlElement xmlElement31 = xmlElement29.getParent();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str33 = null;
    XmlElement xmlElement34 = new XmlElement("hi!", hashtable_str_str33);
    XmlElement xmlElement36 = new XmlElement("hi!");
    java.lang.Object obj39 = xmlElement36.addAttribute("", "");
    xmlElement34.setParent(xmlElement36);
    java.lang.String str41 = xmlElement36.getName();
    XmlElement xmlElement43 = xmlElement36.addSubElement("hi!");
    java.util.List list44 = xmlElement43.getElements();
    XmlElement xmlElement45 = xmlElement31.addSubElement(xmlElement43);
    java.lang.String str46 = xmlElement31.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + ""+ "'", str46.equals(""));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Observer observer3 = null;
    xmlElement2.deleteObserver(observer3);
    xmlElement2.setName("");

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    XmlElement xmlElement10 = new XmlElement("hi!");
    XmlElement xmlElement12 = new XmlElement("hi!");
    xmlElement10.append(xmlElement12);
    XmlElement xmlElement15 = xmlElement10.addSubElement("hi!");
    XmlElement xmlElement16 = xmlElement2.addSubElement(xmlElement10);
    XmlElement xmlElement18 = new XmlElement("hi!");
    XmlElement xmlElement20 = new XmlElement("hi!");
    xmlElement18.append(xmlElement20);
    XmlElement xmlElement23 = new XmlElement("hi!");
    java.lang.Object obj26 = xmlElement23.addAttribute("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str28 = null;
    XmlElement xmlElement29 = new XmlElement("hi!", hashtable_str_str28);
    XmlElement xmlElement31 = new XmlElement("hi!");
    java.lang.Object obj34 = xmlElement31.addAttribute("", "");
    xmlElement29.setParent(xmlElement31);
    java.lang.String str36 = xmlElement31.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str38 = null;
    XmlElement xmlElement39 = new XmlElement("", hashtable_str_str38);
    XmlElement xmlElement40 = xmlElement31.addSubElement(xmlElement39);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str41 = xmlElement31.getAttributes();
    xmlElement23.setAttributes(hashtable_str_str41);
    xmlElement20.setAttributes(hashtable_str_str41);
    xmlElement16.setAttributes(hashtable_str_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str41);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    XmlElement xmlElement3 = new XmlElement("hi!");
    xmlElement1.append(xmlElement3);
    XmlElement xmlElement6 = new XmlElement("hi!");
    XmlElement xmlElement8 = new XmlElement("hi!");
    xmlElement6.append(xmlElement8);
    XmlElement xmlElement11 = new XmlElement("hi!");
    java.lang.Object obj14 = xmlElement11.addAttribute("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = null;
    XmlElement xmlElement17 = new XmlElement("hi!", hashtable_str_str16);
    XmlElement xmlElement19 = new XmlElement("hi!");
    java.lang.Object obj22 = xmlElement19.addAttribute("", "");
    xmlElement17.setParent(xmlElement19);
    java.lang.String str24 = xmlElement19.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = null;
    XmlElement xmlElement27 = new XmlElement("", hashtable_str_str26);
    XmlElement xmlElement28 = xmlElement19.addSubElement(xmlElement27);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str29 = xmlElement19.getAttributes();
    xmlElement11.setAttributes(hashtable_str_str29);
    xmlElement8.setAttributes(hashtable_str_str29);
    xmlElement3.append(xmlElement8);
    java.lang.String str34 = xmlElement3.getAttribute("hi!");
    java.util.Observer observer35 = null;
    xmlElement3.deleteObserver(observer35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    XmlElement xmlElement0 = new XmlElement();
    XmlElement xmlElement2 = new XmlElement("hi!");
    XmlElement xmlElement4 = new XmlElement("hi!");
    xmlElement2.append(xmlElement4);
    java.lang.Object obj6 = xmlElement4.clone();
    xmlElement0.append(xmlElement4);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str9 = null;
    XmlElement xmlElement10 = new XmlElement("hi!", hashtable_str_str9);
    XmlElement xmlElement12 = new XmlElement("hi!");
    java.lang.Object obj15 = xmlElement12.addAttribute("", "");
    xmlElement10.setParent(xmlElement12);
    java.lang.String str17 = xmlElement12.getName();
    java.util.Observer observer18 = null;
    xmlElement12.deleteObserver(observer18);
    XmlElement xmlElement20 = xmlElement0.addSubElement(xmlElement12);
    xmlElement0.setData("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    xmlElement1.removeAllElements();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = null;
    XmlElement xmlElement5 = new XmlElement("", hashtable_str_str4);
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.Object obj10 = xmlElement7.addAttribute("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = null;
    XmlElement xmlElement13 = new XmlElement("hi!", hashtable_str_str12);
    XmlElement xmlElement15 = new XmlElement("hi!");
    java.lang.Object obj18 = xmlElement15.addAttribute("", "");
    xmlElement13.setParent(xmlElement15);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = null;
    XmlElement xmlElement22 = new XmlElement("hi!", hashtable_str_str21);
    java.util.Observer observer23 = null;
    xmlElement22.deleteObserver(observer23);
    xmlElement13.setParent(xmlElement22);
    XmlElement xmlElement26 = xmlElement7.removeElement(xmlElement22);
    XmlElement xmlElement28 = xmlElement7.addSubElement("");
    XmlElement xmlElement29 = xmlElement5.addSubElement(xmlElement7);
    XmlElement xmlElement30 = xmlElement1.addSubElement(xmlElement5);
    java.lang.Object obj31 = xmlElement5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj31);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("", hashtable_str_str1);
    int i3 = xmlElement2.count();
    java.lang.String str4 = xmlElement2.getData();
    boolean b5 = xmlElement2.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    xmlElement1.removeAllElements();
    java.lang.String str5 = xmlElement1.getAttribute("", "hi!");
    xmlElement1.removeFromParent();
    xmlElement1.notifyObservers((java.lang.Object)0.0d);
    XmlElement.printNode(xmlElement1, "");
    xmlElement1.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    XmlElement xmlElement11 = xmlElement4.addSubElement("hi!");
    int i12 = xmlElement4.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    XmlElement xmlElement2 = new XmlElement("", "hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = null;
    XmlElement xmlElement5 = new XmlElement("hi!", hashtable_str_str4);
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.Object obj10 = xmlElement7.addAttribute("", "");
    xmlElement5.setParent(xmlElement7);
    java.lang.String str12 = xmlElement7.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str14 = null;
    XmlElement xmlElement15 = new XmlElement("", hashtable_str_str14);
    XmlElement xmlElement16 = xmlElement7.addSubElement(xmlElement15);
    XmlElement xmlElement19 = new XmlElement("", "");
    XmlElement xmlElement20 = xmlElement7.addSubElement(xmlElement19);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str22 = null;
    XmlElement xmlElement23 = new XmlElement("hi!", hashtable_str_str22);
    XmlElement xmlElement25 = new XmlElement("hi!");
    java.lang.Object obj28 = xmlElement25.addAttribute("", "");
    xmlElement23.setParent(xmlElement25);
    java.lang.String str30 = xmlElement25.getName();
    XmlElement xmlElement32 = xmlElement25.addSubElement("hi!");
    xmlElement19.setParent(xmlElement32);
    XmlElement xmlElement34 = xmlElement32.getParent();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str36 = null;
    XmlElement xmlElement37 = new XmlElement("hi!", hashtable_str_str36);
    XmlElement xmlElement39 = new XmlElement("hi!");
    java.lang.Object obj42 = xmlElement39.addAttribute("", "");
    xmlElement37.setParent(xmlElement39);
    java.lang.String str44 = xmlElement39.getName();
    XmlElement xmlElement46 = xmlElement39.addSubElement("hi!");
    java.util.List list47 = xmlElement46.getElements();
    XmlElement xmlElement48 = xmlElement34.addSubElement(xmlElement46);
    java.lang.String str49 = xmlElement46.getName();
    boolean b50 = xmlElement2.addElement(xmlElement46);
    XmlElement xmlElement52 = xmlElement2.getElement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!"+ "'", str44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!"+ "'", str49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement52);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    XmlElement xmlElement3 = new XmlElement("hi!");
    xmlElement1.append(xmlElement3);
    java.lang.Object obj5 = xmlElement3.clone();
    XmlElement xmlElement8 = new XmlElement("", "");
    java.lang.Object obj9 = xmlElement8.clone();
    xmlElement8.setName("hi!");
    xmlElement3.notifyObservers((java.lang.Object)xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    xmlElement1.removeAllElements();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = null;
    XmlElement xmlElement5 = new XmlElement("", hashtable_str_str4);
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.Object obj10 = xmlElement7.addAttribute("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = null;
    XmlElement xmlElement13 = new XmlElement("hi!", hashtable_str_str12);
    XmlElement xmlElement15 = new XmlElement("hi!");
    java.lang.Object obj18 = xmlElement15.addAttribute("", "");
    xmlElement13.setParent(xmlElement15);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = null;
    XmlElement xmlElement22 = new XmlElement("hi!", hashtable_str_str21);
    java.util.Observer observer23 = null;
    xmlElement22.deleteObserver(observer23);
    xmlElement13.setParent(xmlElement22);
    XmlElement xmlElement26 = xmlElement7.removeElement(xmlElement22);
    XmlElement xmlElement28 = xmlElement7.addSubElement("");
    XmlElement xmlElement29 = xmlElement5.addSubElement(xmlElement7);
    XmlElement xmlElement30 = xmlElement1.addSubElement(xmlElement5);
    XmlElement xmlElement33 = new XmlElement("", "hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str35 = null;
    XmlElement xmlElement36 = new XmlElement("hi!", hashtable_str_str35);
    XmlElement xmlElement38 = new XmlElement("hi!");
    java.lang.Object obj41 = xmlElement38.addAttribute("", "");
    xmlElement36.setParent(xmlElement38);
    java.lang.String str43 = xmlElement38.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str45 = null;
    XmlElement xmlElement46 = new XmlElement("", hashtable_str_str45);
    XmlElement xmlElement47 = xmlElement38.addSubElement(xmlElement46);
    XmlElement xmlElement50 = new XmlElement("", "");
    XmlElement xmlElement51 = xmlElement38.addSubElement(xmlElement50);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str53 = null;
    XmlElement xmlElement54 = new XmlElement("hi!", hashtable_str_str53);
    XmlElement xmlElement56 = new XmlElement("hi!");
    java.lang.Object obj59 = xmlElement56.addAttribute("", "");
    xmlElement54.setParent(xmlElement56);
    java.lang.String str61 = xmlElement56.getName();
    XmlElement xmlElement63 = xmlElement56.addSubElement("hi!");
    xmlElement50.setParent(xmlElement63);
    XmlElement xmlElement65 = xmlElement63.getParent();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str67 = null;
    XmlElement xmlElement68 = new XmlElement("hi!", hashtable_str_str67);
    XmlElement xmlElement70 = new XmlElement("hi!");
    java.lang.Object obj73 = xmlElement70.addAttribute("", "");
    xmlElement68.setParent(xmlElement70);
    java.lang.String str75 = xmlElement70.getName();
    XmlElement xmlElement77 = xmlElement70.addSubElement("hi!");
    java.util.List list78 = xmlElement77.getElements();
    XmlElement xmlElement79 = xmlElement65.addSubElement(xmlElement77);
    java.lang.String str80 = xmlElement77.getName();
    boolean b81 = xmlElement33.addElement(xmlElement77);
    xmlElement1.append(xmlElement77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!"+ "'", str43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!"+ "'", str61.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "hi!"+ "'", str75.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "hi!"+ "'", str80.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    xmlElement1.removeAllElements();
    java.lang.String str5 = xmlElement1.getAttribute("", "hi!");
    xmlElement1.removeFromParent();
    java.lang.Object obj9 = xmlElement1.addAttribute("", "");
    XmlElement xmlElement12 = xmlElement1.addSubElement("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "hi!"+ "'", obj9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.Object obj4 = xmlElement1.addAttribute("", "");
    XmlElement xmlElement6 = new XmlElement("hi!");
    XmlElement xmlElement8 = new XmlElement("hi!");
    xmlElement6.append(xmlElement8);
    XmlElement xmlElement11 = new XmlElement("hi!");
    java.lang.Object obj14 = xmlElement11.addAttribute("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = null;
    XmlElement xmlElement17 = new XmlElement("hi!", hashtable_str_str16);
    XmlElement xmlElement19 = new XmlElement("hi!");
    java.lang.Object obj22 = xmlElement19.addAttribute("", "");
    xmlElement17.setParent(xmlElement19);
    java.lang.String str24 = xmlElement19.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = null;
    XmlElement xmlElement27 = new XmlElement("", hashtable_str_str26);
    XmlElement xmlElement28 = xmlElement19.addSubElement(xmlElement27);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str29 = xmlElement19.getAttributes();
    xmlElement11.setAttributes(hashtable_str_str29);
    xmlElement8.setAttributes(hashtable_str_str29);
    xmlElement1.setAttributes(hashtable_str_str29);
    java.util.List list33 = xmlElement1.getElements();
    XmlElement xmlElement34 = xmlElement1.getParent();
    boolean b35 = xmlElement1.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    xmlElement1.removeAllElements();
    java.lang.String str5 = xmlElement1.getAttribute("", "hi!");
    xmlElement1.removeFromParent();
    xmlElement1.notifyObservers((java.lang.Object)0.0d);
    java.util.List list9 = xmlElement1.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    XmlElement xmlElement0 = new XmlElement();
    XmlElement.printNode(xmlElement0, "");
    int i3 = xmlElement0.count();
    XmlElement xmlElement6 = xmlElement0.addSubElement("hi!", "");
    XmlElement xmlElement8 = xmlElement0.removeElement(0);
    java.lang.String str9 = xmlElement8.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    XmlElement xmlElement3 = new XmlElement("hi!");
    XmlElement xmlElement5 = new XmlElement("hi!");
    xmlElement3.append(xmlElement5);
    XmlElement xmlElement8 = xmlElement3.addSubElement("hi!");
    xmlElement1.notifyObservers((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = null;
    XmlElement xmlElement11 = new XmlElement("hi!", hashtable_str_str10);
    java.util.Observer observer12 = null;
    xmlElement11.deleteObserver(observer12);
    xmlElement2.setParent(xmlElement11);
    XmlElement xmlElement16 = xmlElement11.getElement("hi!");
    boolean b17 = xmlElement11.hasChanged();
    XmlElement xmlElement19 = xmlElement11.addSubElement("");
    xmlElement19.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement19);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    XmlElement xmlElement16 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement4.addSubElement(xmlElement16);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = null;
    XmlElement xmlElement20 = new XmlElement("hi!", hashtable_str_str19);
    XmlElement xmlElement22 = new XmlElement("hi!");
    java.lang.Object obj25 = xmlElement22.addAttribute("", "");
    xmlElement20.setParent(xmlElement22);
    java.lang.String str27 = xmlElement22.getName();
    XmlElement xmlElement29 = xmlElement22.addSubElement("hi!");
    xmlElement16.setParent(xmlElement29);
    XmlElement xmlElement31 = xmlElement29.getParent();
    int i32 = xmlElement31.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    xmlElement1.removeAllElements();
    java.lang.String str5 = xmlElement1.getAttribute("", "hi!");
    xmlElement1.removeFromParent();
    java.lang.Object obj9 = xmlElement1.addAttribute("", "");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement11 = xmlElement1.getElement(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "hi!"+ "'", obj9.equals("hi!"));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    XmlElement xmlElement10 = new XmlElement("hi!");
    XmlElement xmlElement12 = new XmlElement("hi!");
    xmlElement10.append(xmlElement12);
    XmlElement xmlElement15 = xmlElement10.addSubElement("hi!");
    XmlElement xmlElement16 = xmlElement2.addSubElement(xmlElement10);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str18 = null;
    XmlElement xmlElement19 = new XmlElement("hi!", hashtable_str_str18);
    XmlElement xmlElement21 = new XmlElement("hi!");
    java.lang.Object obj24 = xmlElement21.addAttribute("", "");
    xmlElement19.setParent(xmlElement21);
    java.lang.String str26 = xmlElement21.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str28 = null;
    XmlElement xmlElement29 = new XmlElement("", hashtable_str_str28);
    XmlElement xmlElement30 = xmlElement21.addSubElement(xmlElement29);
    XmlElement xmlElement33 = new XmlElement("", "");
    XmlElement xmlElement34 = xmlElement21.addSubElement(xmlElement33);
    XmlElement xmlElement37 = xmlElement33.addSubElement("", "hi!");
    XmlElement xmlElement39 = new XmlElement("hi!");
    java.lang.Object obj42 = xmlElement39.addAttribute("", "");
    XmlElement xmlElement44 = new XmlElement("hi!");
    XmlElement xmlElement46 = new XmlElement("hi!");
    xmlElement44.append(xmlElement46);
    XmlElement xmlElement49 = new XmlElement("hi!");
    java.lang.Object obj52 = xmlElement49.addAttribute("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str54 = null;
    XmlElement xmlElement55 = new XmlElement("hi!", hashtable_str_str54);
    XmlElement xmlElement57 = new XmlElement("hi!");
    java.lang.Object obj60 = xmlElement57.addAttribute("", "");
    xmlElement55.setParent(xmlElement57);
    java.lang.String str62 = xmlElement57.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str64 = null;
    XmlElement xmlElement65 = new XmlElement("", hashtable_str_str64);
    XmlElement xmlElement66 = xmlElement57.addSubElement(xmlElement65);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str67 = xmlElement57.getAttributes();
    xmlElement49.setAttributes(hashtable_str_str67);
    xmlElement46.setAttributes(hashtable_str_str67);
    xmlElement39.setAttributes(hashtable_str_str67);
    xmlElement33.setAttributes(hashtable_str_str67);
    xmlElement16.setAttributes(hashtable_str_str67);
    XmlElement xmlElement74 = new XmlElement("hi!");
    java.lang.Object obj77 = xmlElement74.addAttribute("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str79 = null;
    XmlElement xmlElement80 = new XmlElement("hi!", hashtable_str_str79);
    XmlElement xmlElement82 = new XmlElement("hi!");
    java.lang.Object obj85 = xmlElement82.addAttribute("", "");
    xmlElement80.setParent(xmlElement82);
    java.lang.String str87 = xmlElement82.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str89 = null;
    XmlElement xmlElement90 = new XmlElement("", hashtable_str_str89);
    XmlElement xmlElement91 = xmlElement82.addSubElement(xmlElement90);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str92 = xmlElement82.getAttributes();
    xmlElement74.setAttributes(hashtable_str_str92);
    int i94 = xmlElement74.countObservers();
    xmlElement16.append(xmlElement74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "hi!"+ "'", str62.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str87 + "' != '" + "hi!"+ "'", str87.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = null;
    XmlElement xmlElement11 = new XmlElement("hi!", hashtable_str_str10);
    java.util.Observer observer12 = null;
    xmlElement11.deleteObserver(observer12);
    xmlElement2.setParent(xmlElement11);
    int i15 = xmlElement11.countObservers();
    java.util.Observer observer16 = null;
    xmlElement11.deleteObserver(observer16);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = xmlElement11.getAttribute("");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    XmlElement xmlElement3 = new XmlElement("hi!");
    xmlElement1.append(xmlElement3);
    XmlElement xmlElement6 = new XmlElement("hi!");
    XmlElement xmlElement8 = new XmlElement("hi!");
    xmlElement6.append(xmlElement8);
    XmlElement xmlElement11 = new XmlElement("hi!");
    java.lang.Object obj14 = xmlElement11.addAttribute("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = null;
    XmlElement xmlElement17 = new XmlElement("hi!", hashtable_str_str16);
    XmlElement xmlElement19 = new XmlElement("hi!");
    java.lang.Object obj22 = xmlElement19.addAttribute("", "");
    xmlElement17.setParent(xmlElement19);
    java.lang.String str24 = xmlElement19.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = null;
    XmlElement xmlElement27 = new XmlElement("", hashtable_str_str26);
    XmlElement xmlElement28 = xmlElement19.addSubElement(xmlElement27);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str29 = xmlElement19.getAttributes();
    xmlElement11.setAttributes(hashtable_str_str29);
    xmlElement8.setAttributes(hashtable_str_str29);
    xmlElement3.append(xmlElement8);
    java.util.Observer observer33 = null;
    xmlElement8.deleteObserver(observer33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str29);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    XmlElement xmlElement3 = new XmlElement("hi!");
    xmlElement1.append(xmlElement3);
    java.lang.Object obj5 = xmlElement3.clone();
    XmlElement xmlElement8 = xmlElement3.addSubElement("", "hi!");
    int i9 = xmlElement3.count();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement11 = xmlElement3.removeElement((int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("", hashtable_str_str1);
    int i3 = xmlElement2.count();
    XmlElement xmlElement6 = xmlElement2.addSubElement("hi!", "hi!");
    XmlElement xmlElement9 = new XmlElement("", "");
    java.lang.Object obj10 = xmlElement9.clone();
    XmlElement xmlElement11 = xmlElement6.addSubElement(xmlElement9);
    XmlElement xmlElement13 = xmlElement6.addSubElement("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str15 = null;
    XmlElement xmlElement16 = new XmlElement("hi!", hashtable_str_str15);
    java.util.Observer observer17 = null;
    xmlElement16.deleteObserver(observer17);
    xmlElement6.insertElement(xmlElement16, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Observer observer1 = null;
    xmlElement0.deleteObserver(observer1);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    XmlElement xmlElement16 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement4.addSubElement(xmlElement16);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = null;
    XmlElement xmlElement20 = new XmlElement("hi!", hashtable_str_str19);
    XmlElement xmlElement22 = new XmlElement("hi!");
    java.lang.Object obj25 = xmlElement22.addAttribute("", "");
    xmlElement20.setParent(xmlElement22);
    java.lang.String str27 = xmlElement22.getName();
    XmlElement xmlElement29 = xmlElement22.addSubElement("hi!");
    xmlElement16.setParent(xmlElement29);
    XmlElement.printNode(xmlElement16, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement29);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("", hashtable_str_str1);
    int i3 = xmlElement2.count();
    XmlElement xmlElement6 = xmlElement2.addSubElement("hi!", "hi!");
    XmlElement xmlElement9 = new XmlElement("", "");
    java.lang.Object obj10 = xmlElement9.clone();
    XmlElement xmlElement11 = xmlElement6.addSubElement(xmlElement9);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement13 = xmlElement6.getElement(10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    int i9 = xmlElement2.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    XmlElement xmlElement3 = new XmlElement("hi!");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = null;
    XmlElement xmlElement7 = new XmlElement("hi!", hashtable_str_str6);
    XmlElement xmlElement9 = new XmlElement("hi!");
    java.lang.Object obj12 = xmlElement9.addAttribute("", "");
    xmlElement7.setParent(xmlElement9);
    java.lang.String str14 = xmlElement9.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = null;
    XmlElement xmlElement17 = new XmlElement("", hashtable_str_str16);
    XmlElement xmlElement18 = xmlElement9.addSubElement(xmlElement17);
    XmlElement xmlElement19 = xmlElement17.getParent();
    boolean b20 = xmlElement1.addElement(xmlElement19);
    java.lang.String str21 = xmlElement1.getName();
    java.lang.String str22 = xmlElement1.getName();
    java.lang.String str24 = xmlElement1.getAttribute("");
    java.util.Observer observer25 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement1.addObserver(observer25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    XmlElement xmlElement11 = xmlElement4.addSubElement("hi!");
    java.util.List list12 = xmlElement11.getElements();
    XmlElement xmlElement14 = new XmlElement("hi!");
    XmlElement xmlElement16 = new XmlElement("hi!");
    xmlElement14.append(xmlElement16);
    java.lang.String str20 = xmlElement16.getAttribute("hi!", "");
    int i21 = xmlElement16.countObservers();
    java.lang.String str22 = xmlElement16.getData();
    xmlElement11.notifyObservers((java.lang.Object)xmlElement16);
    XmlElement xmlElement25 = new XmlElement("hi!");
    XmlElement xmlElement27 = new XmlElement("hi!");
    xmlElement25.append(xmlElement27);
    XmlElement xmlElement30 = xmlElement25.addSubElement("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str32 = null;
    XmlElement xmlElement33 = new XmlElement("hi!", hashtable_str_str32);
    XmlElement xmlElement35 = new XmlElement("hi!");
    java.lang.Object obj38 = xmlElement35.addAttribute("", "");
    xmlElement33.setParent(xmlElement35);
    java.lang.String str40 = xmlElement35.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str42 = null;
    XmlElement xmlElement43 = new XmlElement("", hashtable_str_str42);
    XmlElement xmlElement44 = xmlElement35.addSubElement(xmlElement43);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str45 = xmlElement35.getAttributes();
    xmlElement30.setAttributes(hashtable_str_str45);
    xmlElement16.notifyObservers((java.lang.Object)xmlElement30);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement49 = xmlElement30.removeElement((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!"+ "'", str40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str45);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    XmlElement xmlElement0 = new XmlElement();
    XmlElement xmlElement2 = new XmlElement("hi!");
    XmlElement xmlElement4 = new XmlElement("hi!");
    xmlElement2.append(xmlElement4);
    java.lang.Object obj6 = xmlElement4.clone();
    xmlElement0.append(xmlElement4);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str9 = null;
    XmlElement xmlElement10 = new XmlElement("hi!", hashtable_str_str9);
    XmlElement xmlElement12 = new XmlElement("hi!");
    java.lang.Object obj15 = xmlElement12.addAttribute("", "");
    xmlElement10.setParent(xmlElement12);
    java.lang.String str17 = xmlElement12.getName();
    java.util.Observer observer18 = null;
    xmlElement12.deleteObserver(observer18);
    XmlElement xmlElement20 = xmlElement0.addSubElement(xmlElement12);
    XmlElement xmlElement22 = xmlElement12.getElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement22);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    XmlElement xmlElement16 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement4.addSubElement(xmlElement16);
    java.lang.Object obj18 = xmlElement17.clone();
    XmlElement xmlElement21 = xmlElement17.addSubElement("hi!", "hi!");
    xmlElement17.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    XmlElement xmlElement11 = xmlElement4.addSubElement("hi!");
    java.util.List list12 = xmlElement11.getElements();
    xmlElement11.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    xmlElement1.removeAllElements();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement4 = xmlElement1.getElement((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    XmlElement xmlElement3 = new XmlElement("hi!");
    xmlElement1.append(xmlElement3);
    XmlElement xmlElement6 = new XmlElement("hi!");
    java.lang.Object obj9 = xmlElement6.addAttribute("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("hi!", hashtable_str_str11);
    XmlElement xmlElement14 = new XmlElement("hi!");
    java.lang.Object obj17 = xmlElement14.addAttribute("", "");
    xmlElement12.setParent(xmlElement14);
    java.lang.String str19 = xmlElement14.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = null;
    XmlElement xmlElement22 = new XmlElement("", hashtable_str_str21);
    XmlElement xmlElement23 = xmlElement14.addSubElement(xmlElement22);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str24 = xmlElement14.getAttributes();
    xmlElement6.setAttributes(hashtable_str_str24);
    xmlElement3.setAttributes(hashtable_str_str24);
    int i27 = xmlElement3.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    XmlElement xmlElement14 = xmlElement12.getParent();
    int i15 = xmlElement12.count();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str17 = null;
    XmlElement xmlElement18 = new XmlElement("hi!", hashtable_str_str17);
    XmlElement xmlElement20 = new XmlElement("hi!");
    java.lang.Object obj23 = xmlElement20.addAttribute("", "");
    xmlElement18.setParent(xmlElement20);
    java.lang.String str25 = xmlElement20.getName();
    XmlElement xmlElement27 = xmlElement20.addSubElement("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str29 = null;
    XmlElement xmlElement30 = new XmlElement("hi!", hashtable_str_str29);
    XmlElement xmlElement32 = new XmlElement("hi!");
    java.lang.Object obj35 = xmlElement32.addAttribute("", "");
    xmlElement30.setParent(xmlElement32);
    java.lang.String str37 = xmlElement32.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str39 = null;
    XmlElement xmlElement40 = new XmlElement("", hashtable_str_str39);
    XmlElement xmlElement41 = xmlElement32.addSubElement(xmlElement40);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str42 = xmlElement32.getAttributes();
    xmlElement20.setAttributes(hashtable_str_str42);
    xmlElement20.setData("");
    XmlElement xmlElement46 = xmlElement12.removeElement(xmlElement20);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement48 = xmlElement46.getElement("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement46);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    XmlElement xmlElement16 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement4.addSubElement(xmlElement16);
    java.lang.Object obj18 = xmlElement17.clone();
    XmlElement xmlElement21 = xmlElement17.addSubElement("hi!", "hi!");
    XmlElement xmlElement23 = xmlElement21.getElement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement23);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = null;
    XmlElement xmlElement11 = new XmlElement("hi!", hashtable_str_str10);
    java.util.Observer observer12 = null;
    xmlElement11.deleteObserver(observer12);
    xmlElement2.setParent(xmlElement11);
    XmlElement xmlElement16 = xmlElement11.getElement("hi!");
    boolean b17 = xmlElement11.hasChanged();
    XmlElement xmlElement19 = xmlElement11.addSubElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = null;
    XmlElement xmlElement22 = new XmlElement("hi!", hashtable_str_str21);
    XmlElement xmlElement24 = new XmlElement("hi!");
    java.lang.Object obj27 = xmlElement24.addAttribute("", "");
    xmlElement22.setParent(xmlElement24);
    java.lang.String str29 = xmlElement24.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str31 = null;
    XmlElement xmlElement32 = new XmlElement("", hashtable_str_str31);
    XmlElement xmlElement33 = xmlElement24.addSubElement(xmlElement32);
    XmlElement xmlElement36 = new XmlElement("", "");
    XmlElement xmlElement37 = xmlElement24.addSubElement(xmlElement36);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str39 = null;
    XmlElement xmlElement40 = new XmlElement("hi!", hashtable_str_str39);
    XmlElement xmlElement42 = new XmlElement("hi!");
    java.lang.Object obj45 = xmlElement42.addAttribute("", "");
    xmlElement40.setParent(xmlElement42);
    java.lang.String str47 = xmlElement42.getName();
    XmlElement xmlElement49 = xmlElement42.addSubElement("hi!");
    xmlElement36.setParent(xmlElement49);
    // The following exception was thrown during execution in test generation
    try {
    xmlElement19.insertElement(xmlElement49, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!"+ "'", str47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement49);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    XmlElement xmlElement10 = new XmlElement("hi!");
    XmlElement xmlElement12 = new XmlElement("hi!");
    xmlElement10.append(xmlElement12);
    XmlElement xmlElement15 = xmlElement10.addSubElement("hi!");
    XmlElement xmlElement16 = xmlElement2.addSubElement(xmlElement10);
    XmlElement xmlElement18 = new XmlElement("hi!");
    java.lang.Object obj21 = xmlElement18.addAttribute("", "");
    XmlElement xmlElement23 = new XmlElement("hi!");
    XmlElement xmlElement25 = new XmlElement("hi!");
    xmlElement23.append(xmlElement25);
    XmlElement xmlElement28 = new XmlElement("hi!");
    java.lang.Object obj31 = xmlElement28.addAttribute("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str33 = null;
    XmlElement xmlElement34 = new XmlElement("hi!", hashtable_str_str33);
    XmlElement xmlElement36 = new XmlElement("hi!");
    java.lang.Object obj39 = xmlElement36.addAttribute("", "");
    xmlElement34.setParent(xmlElement36);
    java.lang.String str41 = xmlElement36.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str43 = null;
    XmlElement xmlElement44 = new XmlElement("", hashtable_str_str43);
    XmlElement xmlElement45 = xmlElement36.addSubElement(xmlElement44);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str46 = xmlElement36.getAttributes();
    xmlElement28.setAttributes(hashtable_str_str46);
    xmlElement25.setAttributes(hashtable_str_str46);
    xmlElement18.setAttributes(hashtable_str_str46);
    xmlElement2.setAttributes(hashtable_str_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str46);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("", hashtable_str_str1);
    xmlElement2.setData("hi!");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement.printNode(xmlElement2, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    XmlElement xmlElement2 = new XmlElement("hi!");
    XmlElement xmlElement4 = new XmlElement("hi!");
    xmlElement2.append(xmlElement4);
    XmlElement xmlElement7 = xmlElement2.addSubElement("hi!");
    xmlElement2.notifyObservers();
    java.lang.Object obj11 = xmlElement2.addAttribute("hi!", "hi!");
    XmlElement xmlElement13 = new XmlElement("hi!");
    XmlElement xmlElement15 = new XmlElement("hi!");
    xmlElement13.append(xmlElement15);
    XmlElement xmlElement18 = new XmlElement("hi!");
    java.lang.Object obj21 = xmlElement18.addAttribute("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str23 = null;
    XmlElement xmlElement24 = new XmlElement("hi!", hashtable_str_str23);
    XmlElement xmlElement26 = new XmlElement("hi!");
    java.lang.Object obj29 = xmlElement26.addAttribute("", "");
    xmlElement24.setParent(xmlElement26);
    java.lang.String str31 = xmlElement26.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str33 = null;
    XmlElement xmlElement34 = new XmlElement("", hashtable_str_str33);
    XmlElement xmlElement35 = xmlElement26.addSubElement(xmlElement34);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str36 = xmlElement26.getAttributes();
    xmlElement18.setAttributes(hashtable_str_str36);
    xmlElement15.setAttributes(hashtable_str_str36);
    xmlElement2.setAttributes(hashtable_str_str36);
    XmlElement xmlElement40 = new XmlElement("", hashtable_str_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str36);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    XmlElement xmlElement11 = xmlElement4.addSubElement("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str13 = null;
    XmlElement xmlElement14 = new XmlElement("hi!", hashtable_str_str13);
    XmlElement xmlElement16 = new XmlElement("hi!");
    java.lang.Object obj19 = xmlElement16.addAttribute("", "");
    xmlElement14.setParent(xmlElement16);
    java.lang.String str21 = xmlElement16.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str23 = null;
    XmlElement xmlElement24 = new XmlElement("", hashtable_str_str23);
    XmlElement xmlElement25 = xmlElement16.addSubElement(xmlElement24);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = xmlElement16.getAttributes();
    xmlElement4.setAttributes(hashtable_str_str26);
    java.lang.Object obj30 = xmlElement4.addAttribute("hi!", "hi!");
    XmlElement xmlElement32 = xmlElement4.addSubElement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement32);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = xmlElement2.getAttribute("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = null;
    XmlElement xmlElement11 = new XmlElement("hi!", hashtable_str_str10);
    java.util.Observer observer12 = null;
    xmlElement11.deleteObserver(observer12);
    xmlElement2.setParent(xmlElement11);
    XmlElement xmlElement16 = xmlElement11.getElement("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str18 = null;
    XmlElement xmlElement19 = new XmlElement("hi!", hashtable_str_str18);
    java.util.Observer observer20 = null;
    xmlElement19.deleteObserver(observer20);
    java.lang.String str22 = xmlElement19.getName();
    int i23 = xmlElement19.countObservers();
    xmlElement11.setParent(xmlElement19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str14 = xmlElement4.getAttributes();
    java.lang.Object obj17 = xmlElement4.addAttribute("", "hi!");
    boolean b18 = xmlElement4.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + ""+ "'", obj17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.Object obj7 = xmlElement4.addAttribute("", "");
    xmlElement2.setParent(xmlElement4);
    java.lang.String str9 = xmlElement4.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str11);
    XmlElement xmlElement13 = xmlElement4.addSubElement(xmlElement12);
    XmlElement xmlElement14 = xmlElement12.getParent();
    int i15 = xmlElement12.count();
    XmlElement xmlElement17 = xmlElement12.addSubElement("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = null;
    XmlElement xmlElement20 = new XmlElement("", hashtable_str_str19);
    int i21 = xmlElement20.count();
    XmlElement xmlElement24 = xmlElement20.addSubElement("hi!", "hi!");
    java.util.List list25 = xmlElement24.getElements();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str27 = null;
    XmlElement xmlElement28 = new XmlElement("hi!", hashtable_str_str27);
    XmlElement xmlElement30 = new XmlElement("hi!");
    java.lang.Object obj33 = xmlElement30.addAttribute("", "");
    xmlElement28.setParent(xmlElement30);
    java.lang.String str35 = xmlElement30.getName();
    XmlElement xmlElement37 = xmlElement30.addSubElement("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str39 = null;
    XmlElement xmlElement40 = new XmlElement("hi!", hashtable_str_str39);
    XmlElement xmlElement42 = new XmlElement("hi!");
    java.lang.Object obj45 = xmlElement42.addAttribute("", "");
    xmlElement40.setParent(xmlElement42);
    java.lang.String str47 = xmlElement42.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str49 = null;
    XmlElement xmlElement50 = new XmlElement("", hashtable_str_str49);
    XmlElement xmlElement51 = xmlElement42.addSubElement(xmlElement50);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str52 = xmlElement42.getAttributes();
    xmlElement30.setAttributes(hashtable_str_str52);
    xmlElement24.setAttributes(hashtable_str_str52);
    xmlElement17.setParent(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!"+ "'", str47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str52);

  }

}
