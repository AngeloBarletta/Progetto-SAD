
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.util.Observer observer2 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement1.addObserver(observer2);
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


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement14 = xmlElement1.removeElement((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    int i3 = xmlElement1.count();
    XmlElement xmlElement5 = xmlElement1.getElement("");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str6 = xmlElement5.getData();
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.util.Observer observer2 = null;
    xmlElement1.deleteObserver(observer2);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement5 = xmlElement1.removeElement((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    int i13 = xmlElement12.countObservers();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement15 = xmlElement12.getElement((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    xmlElement1.removeFromParent();
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
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    XmlElement xmlElement8 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement8.getData();
    XmlElement xmlElement12 = xmlElement8.addSubElement("hi!", "hi!");
    boolean b14 = xmlElement8.equals((java.lang.Object)10.0d);
    java.lang.String str15 = xmlElement8.getData();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = xmlElement8.getAttributes();
    XmlElement xmlElement17 = new XmlElement("", hashtable_str_str16);
    xmlElement1.setAttributes(hashtable_str_str16);
    xmlElement1.removeFromParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str16);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    XmlElement xmlElement15 = xmlElement12.addSubElement("", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement17 = xmlElement15.getElement((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    XmlElement xmlElement15 = xmlElement12.addSubElement("", "hi!");
    int i16 = xmlElement15.count();
    XmlElement xmlElement18 = new XmlElement("hi!");
    java.lang.String str19 = xmlElement18.getData();
    XmlElement xmlElement22 = xmlElement18.addSubElement("hi!", "hi!");
    boolean b24 = xmlElement18.equals((java.lang.Object)10.0d);
    java.lang.String str25 = xmlElement18.getData();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = xmlElement18.getAttributes();
    xmlElement18.setName("hi!");
    // The following exception was thrown during execution in test generation
    try {
    xmlElement15.insertElement(xmlElement18, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str26);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    int i6 = xmlElement1.count();
    xmlElement1.deleteObservers();
    xmlElement1.setData("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.String str5 = xmlElement4.getData();
    XmlElement xmlElement8 = xmlElement4.addSubElement("hi!", "hi!");
    boolean b10 = xmlElement4.equals((java.lang.Object)10.0d);
    java.lang.String str11 = xmlElement4.getData();
    XmlElement xmlElement13 = xmlElement4.addSubElement("");
    XmlElement xmlElement16 = xmlElement13.addSubElement("hi!", "hi!");
    XmlElement xmlElement18 = new XmlElement("hi!");
    XmlElement xmlElement20 = new XmlElement("hi!");
    java.lang.String str22 = xmlElement20.getAttribute("hi!");
    xmlElement20.setData("hi!");
    XmlElement xmlElement25 = xmlElement18.removeElement(xmlElement20);
    xmlElement13.append(xmlElement20);
    xmlElement2.append(xmlElement13);
    XmlElement xmlElement29 = new XmlElement("");
    xmlElement29.deleteObservers();
    // The following exception was thrown during execution in test generation
    try {
    xmlElement2.insertElement(xmlElement29, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement25);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.String str6 = xmlElement4.getAttribute("hi!");
    xmlElement1.append(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setName("hi!");
    XmlElement xmlElement7 = xmlElement1.getElement("hi!");
    XmlElement xmlElement9 = new XmlElement("hi!");
    java.lang.String str11 = xmlElement9.getAttribute("hi!");
    xmlElement9.setData("hi!");
    XmlElement xmlElement15 = new XmlElement("hi!");
    java.lang.String str17 = xmlElement15.getAttribute("hi!");
    xmlElement15.setData("hi!");
    XmlElement xmlElement20 = xmlElement9.addSubElement(xmlElement15);
    xmlElement9.setData("hi!");
    java.util.Enumeration enumeration23 = xmlElement9.getAttributeNames();
    // The following exception was thrown during execution in test generation
    try {
    xmlElement7.insertElement(xmlElement9, 100);
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
    org.junit.Assert.assertNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration23);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    XmlElement xmlElement3 = new XmlElement("hi!");
    java.lang.String str5 = xmlElement3.getAttribute("hi!");
    xmlElement3.setData("hi!");
    XmlElement xmlElement8 = xmlElement1.removeElement(xmlElement3);
    // The following exception was thrown during execution in test generation
    try {
    int i9 = xmlElement8.count();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement8);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    xmlElement1.setData("hi!");
    boolean b15 = xmlElement1.hasChanged();
    java.util.Observer observer16 = null;
    xmlElement1.deleteObserver(observer16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    java.util.Enumeration enumeration9 = xmlElement1.getAttributeNames();
    XmlElement xmlElement10 = new XmlElement();
    xmlElement1.notifyObservers((java.lang.Object)xmlElement10);
    XmlElement.printNode(xmlElement10, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    XmlElement xmlElement3 = new XmlElement("hi!");
    java.lang.String str5 = xmlElement3.getAttribute("hi!");
    xmlElement3.setData("hi!");
    XmlElement xmlElement8 = xmlElement1.removeElement(xmlElement3);
    // The following exception was thrown during execution in test generation
    try {
    xmlElement8.setName("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement8);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    XmlElement xmlElement15 = xmlElement12.addSubElement("", "hi!");
    int i16 = xmlElement15.count();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str17 = xmlElement15.getAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str17);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    int i3 = xmlElement1.count();
    XmlElement xmlElement5 = xmlElement1.getElement("");
    int i6 = xmlElement1.countObservers();
    java.util.Observer observer7 = null;
    xmlElement1.deleteObserver(observer7);
    java.util.Enumeration enumeration9 = xmlElement1.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    XmlElement xmlElement14 = new XmlElement("hi!");
    java.lang.String str15 = xmlElement14.getData();
    XmlElement xmlElement18 = xmlElement14.addSubElement("hi!", "hi!");
    boolean b20 = xmlElement14.equals((java.lang.Object)10.0d);
    java.lang.String str21 = xmlElement14.getData();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str22 = xmlElement14.getAttributes();
    xmlElement7.setAttributes(hashtable_str_str22);
    java.lang.String str24 = xmlElement7.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    XmlElement xmlElement10 = xmlElement1.addSubElement("");
    XmlElement xmlElement13 = xmlElement10.addSubElement("hi!", "hi!");
    XmlElement xmlElement15 = new XmlElement("hi!");
    XmlElement xmlElement17 = new XmlElement("hi!");
    java.lang.String str19 = xmlElement17.getAttribute("hi!");
    xmlElement17.setData("hi!");
    XmlElement xmlElement22 = xmlElement15.removeElement(xmlElement17);
    xmlElement10.append(xmlElement17);
    boolean b24 = xmlElement17.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    XmlElement xmlElement8 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement8.getData();
    XmlElement xmlElement12 = xmlElement8.addSubElement("hi!", "hi!");
    boolean b14 = xmlElement8.equals((java.lang.Object)10.0d);
    java.lang.String str15 = xmlElement8.getData();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = xmlElement8.getAttributes();
    XmlElement xmlElement17 = new XmlElement("", hashtable_str_str16);
    xmlElement1.setAttributes(hashtable_str_str16);
    XmlElement xmlElement19 = null;
    xmlElement1.setParent(xmlElement19);
    int i21 = xmlElement1.count();
    java.util.List list22 = xmlElement1.getElements();
    XmlElement xmlElement23 = xmlElement1.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement23);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    XmlElement xmlElement10 = xmlElement1.addSubElement("");
    XmlElement xmlElement13 = xmlElement10.addSubElement("hi!", "hi!");
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
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    int i13 = xmlElement1.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.String str5 = xmlElement4.getData();
    XmlElement xmlElement8 = xmlElement4.addSubElement("hi!", "hi!");
    boolean b10 = xmlElement4.equals((java.lang.Object)10.0d);
    java.lang.String str11 = xmlElement4.getData();
    XmlElement xmlElement13 = xmlElement4.addSubElement("");
    XmlElement xmlElement16 = xmlElement13.addSubElement("hi!", "hi!");
    XmlElement xmlElement18 = new XmlElement("hi!");
    XmlElement xmlElement20 = new XmlElement("hi!");
    java.lang.String str22 = xmlElement20.getAttribute("hi!");
    xmlElement20.setData("hi!");
    XmlElement xmlElement25 = xmlElement18.removeElement(xmlElement20);
    xmlElement13.append(xmlElement20);
    xmlElement2.append(xmlElement13);
    java.util.List list28 = xmlElement13.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list28);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement7 = xmlElement5.removeElement((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    xmlElement1.notifyObservers((java.lang.Object)"");
    java.lang.String str11 = xmlElement1.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    int i3 = xmlElement1.count();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = xmlElement1.getAttributes();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement6 = xmlElement1.removeElement((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str4);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    int i3 = xmlElement1.count();
    java.lang.String str4 = xmlElement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    java.lang.Object obj6 = xmlElement1.clone();
    java.lang.String str7 = xmlElement1.getData();
    java.util.Observer observer8 = null;
    xmlElement1.deleteObserver(observer8);
    java.lang.String str10 = xmlElement1.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    XmlElement xmlElement6 = xmlElement1.getParent();
    // The following exception was thrown during execution in test generation
    try {
    xmlElement6.setName("hi!");
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
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement6);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    XmlElement xmlElement2 = new XmlElement("", "");

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    int i3 = xmlElement1.count();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = xmlElement1.getAttributes();
    xmlElement1.setData("");
    xmlElement1.setData("hi!");
    java.util.Enumeration enumeration9 = xmlElement1.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    int i6 = xmlElement1.count();
    xmlElement1.deleteObservers();
    int i8 = xmlElement1.count();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement10 = xmlElement1.getElement((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    XmlElement xmlElement0 = new XmlElement();
    XmlElement xmlElement2 = xmlElement0.getElement("");
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.util.Observer observer5 = null;
    xmlElement4.deleteObserver(observer5);
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = xmlElement2.equals((java.lang.Object)xmlElement4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement2);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    xmlElement1.setData("hi!");
    boolean b15 = xmlElement1.hasChanged();
    XmlElement xmlElement17 = new XmlElement("hi!");
    java.lang.String str19 = xmlElement17.getAttribute("hi!");
    xmlElement17.setData("hi!");
    java.lang.Object obj22 = xmlElement17.clone();
    java.lang.String str23 = xmlElement17.getData();
    java.util.Observer observer24 = null;
    xmlElement17.deleteObserver(observer24);
    boolean b26 = xmlElement1.addElement(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    XmlElement xmlElement3 = new XmlElement("hi!");
    java.lang.String str5 = xmlElement3.getAttribute("hi!");
    xmlElement3.setData("hi!");
    XmlElement xmlElement8 = xmlElement1.removeElement(xmlElement3);
    xmlElement3.deleteObservers();
    XmlElement xmlElement11 = new XmlElement("hi!");
    XmlElement xmlElement13 = new XmlElement("hi!");
    java.lang.String str15 = xmlElement13.getAttribute("hi!");
    xmlElement13.setData("hi!");
    XmlElement xmlElement18 = xmlElement11.removeElement(xmlElement13);
    xmlElement13.setName("");
    java.util.List list21 = xmlElement13.getElements();
    // The following exception was thrown during execution in test generation
    try {
    xmlElement3.insertElement(xmlElement13, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    int i6 = xmlElement1.count();
    XmlElement xmlElement8 = new XmlElement("hi!");
    java.lang.String str10 = xmlElement8.getAttribute("hi!");
    xmlElement8.setName("hi!");
    XmlElement xmlElement14 = xmlElement8.getElement("hi!");
    // The following exception was thrown during execution in test generation
    try {
    xmlElement1.append(xmlElement14);
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
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement14);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    xmlElement1.notifyObservers((java.lang.Object)"");
    java.util.Enumeration enumeration11 = xmlElement1.getAttributeNames();
    XmlElement xmlElement13 = new XmlElement("hi!");
    java.lang.String str14 = xmlElement13.getData();
    XmlElement xmlElement17 = xmlElement13.addSubElement("hi!", "hi!");
    boolean b19 = xmlElement13.equals((java.lang.Object)10.0d);
    java.lang.String str20 = xmlElement13.getData();
    java.util.Enumeration enumeration21 = xmlElement13.getAttributeNames();
    XmlElement xmlElement22 = new XmlElement();
    xmlElement13.notifyObservers((java.lang.Object)xmlElement22);
    XmlElement.printNode(xmlElement22, "hi!");
    XmlElement xmlElement26 = xmlElement1.addSubElement(xmlElement22);
    java.util.Observer observer27 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement1.addObserver(observer27);
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
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    XmlElement xmlElement3 = new XmlElement("hi!");
    java.lang.String str5 = xmlElement3.getAttribute("hi!");
    xmlElement3.setData("hi!");
    XmlElement xmlElement8 = xmlElement1.removeElement(xmlElement3);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement11 = xmlElement8.addSubElement("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement8);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    java.util.List list6 = xmlElement5.getElements();
    boolean b7 = xmlElement5.hasChanged();
    XmlElement xmlElement9 = new XmlElement("hi!");
    java.lang.String str10 = xmlElement9.getData();
    int i11 = xmlElement9.count();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = xmlElement9.getAttributes();
    xmlElement9.setData("");
    // The following exception was thrown during execution in test generation
    try {
    xmlElement5.insertElement(xmlElement9, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str12);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    int i3 = xmlElement1.count();
    int i4 = xmlElement1.count();
    int i5 = xmlElement1.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    int i3 = xmlElement1.count();
    int i4 = xmlElement1.count();
    xmlElement1.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    java.util.Enumeration enumeration9 = xmlElement1.getAttributeNames();
    XmlElement xmlElement10 = new XmlElement();
    xmlElement1.notifyObservers((java.lang.Object)xmlElement10);
    XmlElement xmlElement13 = new XmlElement("hi!");
    java.lang.String str14 = xmlElement13.getData();
    XmlElement xmlElement17 = xmlElement13.addSubElement("hi!", "hi!");
    boolean b19 = xmlElement13.equals((java.lang.Object)10.0d);
    java.lang.String str20 = xmlElement13.getData();
    xmlElement13.notifyObservers((java.lang.Object)"");
    xmlElement1.append(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    int i13 = xmlElement12.countObservers();
    boolean b14 = xmlElement12.hasChanged();
    XmlElement xmlElement16 = new XmlElement("hi!");
    java.lang.String str18 = xmlElement16.getAttribute("hi!");
    xmlElement16.setData("hi!");
    XmlElement xmlElement22 = new XmlElement("hi!");
    java.lang.String str24 = xmlElement22.getAttribute("hi!");
    xmlElement22.setData("hi!");
    XmlElement xmlElement27 = xmlElement16.addSubElement(xmlElement22);
    java.lang.String str28 = xmlElement27.getName();
    XmlElement xmlElement30 = xmlElement27.getElement("");
    xmlElement12.setParent(xmlElement30);
    java.util.Observer observer32 = null;
    xmlElement12.deleteObserver(observer32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement30);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    int i3 = xmlElement1.count();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = xmlElement1.getAttributes();
    xmlElement1.setData("");
    xmlElement1.setData("hi!");
    xmlElement1.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str4);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    int i6 = xmlElement1.count();
    java.util.List list7 = xmlElement1.getElements();
    XmlElement xmlElement8 = xmlElement1.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement8);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    int i3 = xmlElement1.count();
    int i4 = xmlElement1.count();
    XmlElement xmlElement6 = new XmlElement("hi!");
    java.lang.String str7 = xmlElement6.getData();
    int i8 = xmlElement6.count();
    XmlElement xmlElement9 = xmlElement1.removeElement(xmlElement6);
    // The following exception was thrown during execution in test generation
    try {
    xmlElement9.notifyObservers();
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement9);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    XmlElement xmlElement10 = xmlElement1.addSubElement("");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement12 = xmlElement10.getElement((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    xmlElement1.removeFromParent();
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.String str5 = xmlElement4.getData();
    XmlElement xmlElement8 = xmlElement4.addSubElement("hi!", "hi!");
    boolean b10 = xmlElement4.equals((java.lang.Object)10.0d);
    java.lang.String str11 = xmlElement4.getData();
    java.util.Enumeration enumeration12 = xmlElement4.getAttributeNames();
    XmlElement xmlElement14 = new XmlElement("hi!");
    java.lang.String str16 = xmlElement14.getAttribute("hi!");
    xmlElement14.setData("hi!");
    XmlElement xmlElement20 = new XmlElement("hi!");
    java.lang.String str22 = xmlElement20.getAttribute("hi!");
    xmlElement20.setData("hi!");
    XmlElement xmlElement25 = xmlElement14.addSubElement(xmlElement20);
    java.lang.String str26 = xmlElement25.getName();
    boolean b27 = xmlElement25.hasChanged();
    java.lang.Object obj30 = xmlElement25.addAttribute("hi!", "");
    xmlElement4.setParent(xmlElement25);
    XmlElement xmlElement32 = xmlElement1.addSubElement(xmlElement4);
    java.lang.Object obj33 = xmlElement32.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj33);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    xmlElement1.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    XmlElement xmlElement2 = new XmlElement("", "hi!");
    XmlElement xmlElement4 = xmlElement2.addSubElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    xmlElement1.setData("hi!");
    java.util.Observer observer15 = null;
    xmlElement1.deleteObserver(observer15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    XmlElement xmlElement3 = new XmlElement("hi!");
    java.lang.String str5 = xmlElement3.getAttribute("hi!");
    xmlElement3.setData("hi!");
    XmlElement xmlElement8 = xmlElement1.removeElement(xmlElement3);
    xmlElement3.setName("");
    XmlElement xmlElement12 = xmlElement3.addSubElement("");
    java.util.List list13 = xmlElement12.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    java.util.Enumeration enumeration9 = xmlElement1.getAttributeNames();
    XmlElement xmlElement10 = new XmlElement();
    xmlElement1.notifyObservers((java.lang.Object)xmlElement10);
    java.lang.String str13 = xmlElement10.getAttribute("hi!");
    xmlElement10.setData("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.deleteObservers();
    boolean b3 = xmlElement1.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    java.lang.String str7 = xmlElement1.getAttribute("");
    XmlElement xmlElement10 = xmlElement1.addSubElement("hi!", "hi!");
    XmlElement xmlElement12 = new XmlElement("hi!");
    java.lang.String str13 = xmlElement12.getData();
    int i14 = xmlElement12.count();
    int i15 = xmlElement12.count();
    XmlElement xmlElement17 = new XmlElement("hi!");
    java.lang.String str19 = xmlElement17.getAttribute("hi!");
    xmlElement17.setData("hi!");
    java.lang.Object obj22 = xmlElement17.clone();
    java.lang.String str23 = xmlElement17.getData();
    java.util.Observer observer24 = null;
    xmlElement17.deleteObserver(observer24);
    XmlElement xmlElement26 = xmlElement12.addSubElement(xmlElement17);
    // The following exception was thrown during execution in test generation
    try {
    xmlElement10.insertElement(xmlElement12, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    xmlElement1.notifyObservers((java.lang.Object)"");
    java.util.Enumeration enumeration11 = xmlElement1.getAttributeNames();
    XmlElement xmlElement13 = new XmlElement("hi!");
    java.lang.String str14 = xmlElement13.getData();
    XmlElement xmlElement17 = xmlElement13.addSubElement("hi!", "hi!");
    boolean b19 = xmlElement13.equals((java.lang.Object)10.0d);
    java.lang.String str20 = xmlElement13.getData();
    java.util.Enumeration enumeration21 = xmlElement13.getAttributeNames();
    XmlElement xmlElement22 = new XmlElement();
    xmlElement13.notifyObservers((java.lang.Object)xmlElement22);
    XmlElement.printNode(xmlElement22, "hi!");
    XmlElement xmlElement26 = xmlElement1.addSubElement(xmlElement22);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement28 = xmlElement22.removeElement((int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    java.lang.String str13 = xmlElement12.getName();
    XmlElement xmlElement15 = xmlElement12.getElement("");
    java.lang.String str16 = xmlElement12.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    java.lang.String str13 = xmlElement12.getName();
    XmlElement xmlElement15 = xmlElement12.getElement("");
    XmlElement xmlElement17 = new XmlElement("hi!");
    java.lang.String str19 = xmlElement17.getAttribute("hi!");
    xmlElement17.setData("hi!");
    XmlElement xmlElement23 = new XmlElement("hi!");
    java.lang.String str25 = xmlElement23.getAttribute("hi!");
    xmlElement23.setData("hi!");
    XmlElement xmlElement28 = xmlElement17.addSubElement(xmlElement23);
    boolean b29 = xmlElement12.equals((java.lang.Object)xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    int i13 = xmlElement12.countObservers();
    boolean b14 = xmlElement12.hasChanged();
    XmlElement xmlElement16 = new XmlElement("hi!");
    java.lang.String str18 = xmlElement16.getAttribute("hi!");
    xmlElement16.setData("hi!");
    XmlElement xmlElement22 = new XmlElement("hi!");
    java.lang.String str24 = xmlElement22.getAttribute("hi!");
    xmlElement22.setData("hi!");
    XmlElement xmlElement27 = xmlElement16.addSubElement(xmlElement22);
    java.lang.String str28 = xmlElement27.getName();
    XmlElement xmlElement30 = xmlElement27.getElement("");
    xmlElement12.setParent(xmlElement30);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement.printNode(xmlElement30, "");
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
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement30);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    XmlElement xmlElement15 = xmlElement12.addSubElement("", "hi!");
    java.lang.String str17 = xmlElement12.getAttribute("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    XmlElement xmlElement15 = xmlElement12.addSubElement("", "hi!");
    java.lang.Object obj18 = xmlElement15.addAttribute("", "");
    XmlElement xmlElement19 = xmlElement15.getParent();
    xmlElement15.removeAllElements();
    XmlElement xmlElement22 = new XmlElement("hi!");
    XmlElement xmlElement24 = new XmlElement("hi!");
    java.lang.String str26 = xmlElement24.getAttribute("hi!");
    xmlElement24.setData("hi!");
    XmlElement xmlElement29 = xmlElement22.removeElement(xmlElement24);
    xmlElement24.setName("");
    XmlElement xmlElement33 = xmlElement24.addSubElement("");
    boolean b34 = xmlElement15.addElement(xmlElement33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    xmlElement1.removeFromParent();
    java.lang.String str3 = xmlElement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    java.lang.Object obj6 = xmlElement1.clone();
    java.lang.String str7 = xmlElement1.getData();
    XmlElement xmlElement9 = new XmlElement("hi!");
    java.lang.String str10 = xmlElement9.getData();
    XmlElement xmlElement13 = xmlElement9.addSubElement("hi!", "hi!");
    XmlElement xmlElement16 = new XmlElement("hi!");
    java.lang.String str17 = xmlElement16.getData();
    XmlElement xmlElement20 = xmlElement16.addSubElement("hi!", "hi!");
    boolean b22 = xmlElement16.equals((java.lang.Object)10.0d);
    java.lang.String str23 = xmlElement16.getData();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str24 = xmlElement16.getAttributes();
    XmlElement xmlElement25 = new XmlElement("", hashtable_str_str24);
    xmlElement9.setAttributes(hashtable_str_str24);
    xmlElement1.setAttributes(hashtable_str_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str24);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    XmlElement xmlElement10 = xmlElement1.addSubElement("");
    java.lang.Object obj11 = xmlElement10.clone();
    java.lang.String str14 = xmlElement10.getAttribute("", "");
    xmlElement10.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    XmlElement xmlElement10 = xmlElement1.addSubElement("");
    java.lang.Object obj11 = xmlElement10.clone();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = xmlElement10.getAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str12);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    xmlElement5.removeFromParent();
    java.lang.String str7 = xmlElement5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    java.util.List list6 = xmlElement5.getElements();
    boolean b7 = xmlElement5.hasChanged();
    java.lang.String str10 = xmlElement5.getAttribute("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    XmlElement xmlElement15 = xmlElement12.addSubElement("", "hi!");
    java.lang.Object obj18 = xmlElement15.addAttribute("", "");
    XmlElement xmlElement19 = xmlElement15.getParent();
    java.util.Observer observer20 = null;
    xmlElement19.deleteObserver(observer20);
    xmlElement19.removeFromParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement19);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    XmlElement xmlElement0 = new XmlElement();
    int i1 = xmlElement0.count();
    java.lang.Object obj4 = xmlElement0.addAttribute("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.setData("hi!");
    xmlElement1.setData("hi!");

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    java.util.Enumeration enumeration9 = xmlElement1.getAttributeNames();
    int i10 = xmlElement1.count();
    XmlElement xmlElement12 = new XmlElement("");
    xmlElement12.deleteObservers();
    xmlElement1.append(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    xmlElement1.removeFromParent();
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.String str5 = xmlElement4.getData();
    XmlElement xmlElement8 = xmlElement4.addSubElement("hi!", "hi!");
    boolean b10 = xmlElement4.equals((java.lang.Object)10.0d);
    java.lang.String str11 = xmlElement4.getData();
    java.util.Enumeration enumeration12 = xmlElement4.getAttributeNames();
    XmlElement xmlElement14 = new XmlElement("hi!");
    java.lang.String str16 = xmlElement14.getAttribute("hi!");
    xmlElement14.setData("hi!");
    XmlElement xmlElement20 = new XmlElement("hi!");
    java.lang.String str22 = xmlElement20.getAttribute("hi!");
    xmlElement20.setData("hi!");
    XmlElement xmlElement25 = xmlElement14.addSubElement(xmlElement20);
    java.lang.String str26 = xmlElement25.getName();
    boolean b27 = xmlElement25.hasChanged();
    java.lang.Object obj30 = xmlElement25.addAttribute("hi!", "");
    xmlElement4.setParent(xmlElement25);
    XmlElement xmlElement32 = xmlElement1.addSubElement(xmlElement4);
    XmlElement xmlElement34 = new XmlElement("hi!");
    java.lang.String str35 = xmlElement34.getData();
    XmlElement xmlElement38 = xmlElement34.addSubElement("hi!", "hi!");
    XmlElement xmlElement40 = xmlElement34.getElement((int)(byte)0);
    xmlElement1.setParent(xmlElement34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement40);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    XmlElement xmlElement10 = xmlElement1.addSubElement("");
    java.lang.Object obj11 = xmlElement10.clone();
    java.lang.String str14 = xmlElement10.getAttribute("", "");
    java.util.Enumeration enumeration15 = xmlElement10.getAttributeNames();
    XmlElement xmlElement17 = xmlElement10.getElement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement17);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    int i13 = xmlElement12.countObservers();
    boolean b14 = xmlElement12.hasChanged();
    java.util.Observer observer15 = null;
    xmlElement12.deleteObserver(observer15);
    XmlElement.printNode(xmlElement12, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    java.lang.String str13 = xmlElement12.getName();
    boolean b14 = xmlElement12.hasChanged();
    java.lang.Object obj17 = xmlElement12.addAttribute("hi!", "");
    XmlElement xmlElement19 = new XmlElement("hi!");
    java.lang.String str20 = xmlElement19.getData();
    XmlElement xmlElement23 = xmlElement19.addSubElement("hi!", "hi!");
    boolean b25 = xmlElement19.equals((java.lang.Object)10.0d);
    XmlElement xmlElement26 = xmlElement12.addSubElement(xmlElement19);
    java.util.List list27 = xmlElement26.getElements();
    java.lang.String str30 = xmlElement26.getAttribute("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    XmlElement xmlElement5 = new XmlElement("hi!");
    java.lang.String str7 = xmlElement5.getAttribute("hi!");
    xmlElement5.setData("hi!");
    XmlElement xmlElement11 = new XmlElement("hi!");
    java.lang.String str13 = xmlElement11.getAttribute("hi!");
    xmlElement11.setData("hi!");
    XmlElement xmlElement16 = xmlElement5.addSubElement(xmlElement11);
    java.lang.String str17 = xmlElement16.getName();
    xmlElement1.notifyObservers((java.lang.Object)str17);
    xmlElement1.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    java.lang.Object obj6 = xmlElement1.clone();
    java.lang.String str7 = xmlElement1.getData();
    java.lang.String str8 = xmlElement1.getData();
    java.lang.String str10 = xmlElement1.getAttribute("hi!");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement12 = xmlElement1.getElement(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    XmlElement xmlElement10 = xmlElement1.addSubElement("");
    XmlElement xmlElement13 = xmlElement10.addSubElement("hi!", "hi!");
    java.lang.String str15 = xmlElement13.getAttribute("hi!");
    java.lang.String str17 = xmlElement13.getAttribute("hi!");
    XmlElement xmlElement19 = new XmlElement("hi!");
    java.lang.String str20 = xmlElement19.getData();
    XmlElement xmlElement23 = xmlElement19.addSubElement("hi!", "hi!");
    int i24 = xmlElement19.count();
    XmlElement xmlElement27 = new XmlElement("hi!");
    java.lang.String str28 = xmlElement27.getData();
    XmlElement xmlElement31 = xmlElement27.addSubElement("hi!", "hi!");
    boolean b33 = xmlElement27.equals((java.lang.Object)10.0d);
    java.lang.String str34 = xmlElement27.getData();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str35 = xmlElement27.getAttributes();
    XmlElement xmlElement36 = new XmlElement("", hashtable_str_str35);
    boolean b37 = xmlElement19.addElement(xmlElement36);
    XmlElement xmlElement38 = xmlElement13.removeElement(xmlElement36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement38);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("", hashtable_str_str1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = xmlElement2.getAttribute("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    java.lang.String str13 = xmlElement12.getName();
    XmlElement xmlElement15 = xmlElement12.getElement("");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj16 = xmlElement15.clone();
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
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement15);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    int i3 = xmlElement1.count();
    int i4 = xmlElement1.count();
    xmlElement1.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    XmlElement xmlElement15 = xmlElement12.addSubElement("", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement17 = xmlElement15.removeElement(10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    XmlElement xmlElement10 = xmlElement1.addSubElement("");
    XmlElement xmlElement13 = xmlElement10.addSubElement("hi!", "hi!");
    xmlElement10.deleteObservers();
    java.lang.String str17 = xmlElement10.getAttribute("hi!", "");
    XmlElement xmlElement19 = xmlElement10.addSubElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement19);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    java.lang.Object obj6 = xmlElement1.clone();
    XmlElement.printNode(xmlElement1, "");
    XmlElement xmlElement11 = xmlElement1.addSubElement("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    XmlElement xmlElement10 = xmlElement1.addSubElement("");
    XmlElement xmlElement13 = xmlElement10.addSubElement("hi!", "hi!");
    java.lang.String str15 = xmlElement13.getAttribute("hi!");
    java.util.List list16 = xmlElement13.getElements();
    XmlElement xmlElement18 = xmlElement13.getElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement18);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    java.lang.Object obj6 = xmlElement1.clone();
    java.lang.String str7 = xmlElement1.getData();
    java.util.Observer observer8 = null;
    xmlElement1.deleteObserver(observer8);
    java.lang.String str12 = xmlElement1.getAttribute("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.String str5 = xmlElement4.getData();
    XmlElement xmlElement8 = xmlElement4.addSubElement("hi!", "hi!");
    boolean b10 = xmlElement4.equals((java.lang.Object)10.0d);
    java.lang.String str11 = xmlElement4.getData();
    XmlElement xmlElement13 = xmlElement4.addSubElement("");
    XmlElement xmlElement16 = xmlElement13.addSubElement("hi!", "hi!");
    XmlElement xmlElement18 = new XmlElement("hi!");
    XmlElement xmlElement20 = new XmlElement("hi!");
    java.lang.String str22 = xmlElement20.getAttribute("hi!");
    xmlElement20.setData("hi!");
    XmlElement xmlElement25 = xmlElement18.removeElement(xmlElement20);
    xmlElement13.append(xmlElement20);
    xmlElement2.append(xmlElement13);
    java.lang.String str29 = xmlElement13.getAttribute("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    java.lang.String str13 = xmlElement12.getName();
    int i14 = xmlElement12.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    int i3 = xmlElement1.count();
    int i4 = xmlElement1.count();
    java.util.Enumeration enumeration5 = xmlElement1.getAttributeNames();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement7 = xmlElement1.getElement((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    int i3 = xmlElement1.count();
    XmlElement xmlElement5 = xmlElement1.getElement("");
    // The following exception was thrown during execution in test generation
    try {
    xmlElement5.setData("hi!");
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    int i3 = xmlElement1.count();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = xmlElement1.getAttributes();
    boolean b5 = xmlElement1.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    xmlElement1.setData("hi!");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement16 = xmlElement1.getElement((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    xmlElement1.notifyObservers((java.lang.Object)"");
    java.util.Enumeration enumeration11 = xmlElement1.getAttributeNames();
    XmlElement.printNode(xmlElement1, "hi!");
    XmlElement xmlElement15 = new XmlElement("hi!");
    java.lang.String str16 = xmlElement15.getData();
    XmlElement xmlElement19 = xmlElement15.addSubElement("hi!", "hi!");
    int i20 = xmlElement15.count();
    java.util.List list21 = xmlElement15.getElements();
    boolean b22 = xmlElement1.equals((java.lang.Object)xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    java.lang.String str7 = xmlElement1.getAttribute("");
    XmlElement xmlElement10 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b12 = xmlElement1.equals((java.lang.Object)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    XmlElement xmlElement10 = xmlElement1.addSubElement("");
    XmlElement xmlElement13 = xmlElement10.addSubElement("hi!", "hi!");
    java.lang.String str15 = xmlElement13.getAttribute("hi!");
    java.util.List list16 = xmlElement13.getElements();
    java.lang.String str17 = xmlElement13.getData();
    java.lang.String str19 = xmlElement13.getAttribute("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    int i3 = xmlElement1.count();
    XmlElement xmlElement5 = xmlElement1.getElement("");
    XmlElement xmlElement7 = xmlElement1.getElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement7);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    java.util.Enumeration enumeration9 = xmlElement1.getAttributeNames();
    XmlElement xmlElement11 = new XmlElement("hi!");
    java.lang.String str13 = xmlElement11.getAttribute("hi!");
    xmlElement11.setData("hi!");
    XmlElement xmlElement17 = new XmlElement("hi!");
    java.lang.String str19 = xmlElement17.getAttribute("hi!");
    xmlElement17.setData("hi!");
    XmlElement xmlElement22 = xmlElement11.addSubElement(xmlElement17);
    java.lang.String str23 = xmlElement22.getName();
    boolean b24 = xmlElement22.hasChanged();
    java.lang.Object obj27 = xmlElement22.addAttribute("hi!", "");
    xmlElement1.setParent(xmlElement22);
    java.util.List list29 = xmlElement22.getElements();
    java.util.Enumeration enumeration30 = xmlElement22.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration30);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    int i3 = xmlElement1.count();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = xmlElement1.getAttributes();
    java.lang.String str6 = xmlElement1.getAttribute("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    java.lang.String str13 = xmlElement12.getName();
    XmlElement xmlElement15 = xmlElement12.getElement("");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement17 = xmlElement15.getElement((int)(short)10);
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
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement15);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    XmlElement xmlElement8 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement8.getData();
    XmlElement xmlElement12 = xmlElement8.addSubElement("hi!", "hi!");
    boolean b14 = xmlElement8.equals((java.lang.Object)10.0d);
    java.lang.String str15 = xmlElement8.getData();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = xmlElement8.getAttributes();
    XmlElement xmlElement17 = new XmlElement("", hashtable_str_str16);
    xmlElement1.setAttributes(hashtable_str_str16);
    XmlElement.printNode(xmlElement1, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str16);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.deleteObservers();
    int i3 = xmlElement1.count();
    java.util.Enumeration enumeration4 = xmlElement1.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    java.util.Enumeration enumeration9 = xmlElement1.getAttributeNames();
    XmlElement xmlElement10 = new XmlElement();
    xmlElement1.notifyObservers((java.lang.Object)xmlElement10);
    XmlElement xmlElement13 = new XmlElement("hi!");
    java.lang.String str14 = xmlElement13.getData();
    XmlElement xmlElement17 = xmlElement13.addSubElement("hi!", "hi!");
    boolean b19 = xmlElement13.equals((java.lang.Object)10.0d);
    java.lang.String str20 = xmlElement13.getData();
    java.util.Enumeration enumeration21 = xmlElement13.getAttributeNames();
    XmlElement xmlElement23 = new XmlElement("hi!");
    java.lang.String str25 = xmlElement23.getAttribute("hi!");
    xmlElement23.setData("hi!");
    XmlElement xmlElement29 = new XmlElement("hi!");
    java.lang.String str31 = xmlElement29.getAttribute("hi!");
    xmlElement29.setData("hi!");
    XmlElement xmlElement34 = xmlElement23.addSubElement(xmlElement29);
    java.lang.String str35 = xmlElement34.getName();
    boolean b36 = xmlElement34.hasChanged();
    java.lang.Object obj39 = xmlElement34.addAttribute("hi!", "");
    xmlElement13.setParent(xmlElement34);
    boolean b41 = xmlElement1.addElement(xmlElement34);
    xmlElement1.setData("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.setData("hi!");
    XmlElement xmlElement5 = new XmlElement("hi!");
    java.lang.String str7 = xmlElement5.getAttribute("hi!");
    xmlElement5.setData("hi!");
    XmlElement xmlElement11 = new XmlElement("hi!");
    java.lang.String str13 = xmlElement11.getAttribute("hi!");
    xmlElement11.setData("hi!");
    XmlElement xmlElement16 = xmlElement5.addSubElement(xmlElement11);
    XmlElement xmlElement18 = new XmlElement("hi!");
    java.lang.String str19 = xmlElement18.getData();
    XmlElement xmlElement22 = xmlElement18.addSubElement("hi!", "hi!");
    boolean b24 = xmlElement18.equals((java.lang.Object)10.0d);
    java.lang.String str25 = xmlElement18.getData();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = xmlElement18.getAttributes();
    xmlElement11.setAttributes(hashtable_str_str26);
    xmlElement1.setAttributes(hashtable_str_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str26);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    XmlElement xmlElement14 = new XmlElement("hi!");
    java.lang.String str15 = xmlElement14.getData();
    XmlElement xmlElement18 = xmlElement14.addSubElement("hi!", "hi!");
    boolean b20 = xmlElement14.equals((java.lang.Object)10.0d);
    java.lang.String str21 = xmlElement14.getData();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str22 = xmlElement14.getAttributes();
    xmlElement7.setAttributes(hashtable_str_str22);
    XmlElement xmlElement25 = new XmlElement("hi!");
    java.util.Observer observer26 = null;
    xmlElement25.deleteObserver(observer26);
    // The following exception was thrown during execution in test generation
    try {
    xmlElement7.insertElement(xmlElement25, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str22);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    XmlElement xmlElement8 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement8.getData();
    XmlElement xmlElement12 = xmlElement8.addSubElement("hi!", "hi!");
    boolean b14 = xmlElement8.equals((java.lang.Object)10.0d);
    java.lang.String str15 = xmlElement8.getData();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = xmlElement8.getAttributes();
    XmlElement xmlElement17 = new XmlElement("", hashtable_str_str16);
    xmlElement1.setAttributes(hashtable_str_str16);
    XmlElement xmlElement19 = null;
    xmlElement1.setParent(xmlElement19);
    int i21 = xmlElement1.count();
    int i22 = xmlElement1.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    int i6 = xmlElement1.count();
    xmlElement1.deleteObservers();
    int i8 = xmlElement1.count();
    XmlElement xmlElement10 = new XmlElement("hi!");
    java.lang.String str11 = xmlElement10.getData();
    XmlElement xmlElement14 = xmlElement10.addSubElement("hi!", "hi!");
    int i15 = xmlElement10.count();
    xmlElement10.deleteObservers();
    XmlElement xmlElement17 = xmlElement1.removeElement(xmlElement10);
    java.util.List list18 = xmlElement17.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    xmlElement1.removeFromParent();
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.String str5 = xmlElement4.getData();
    XmlElement xmlElement8 = xmlElement4.addSubElement("hi!", "hi!");
    boolean b10 = xmlElement4.equals((java.lang.Object)10.0d);
    java.lang.String str11 = xmlElement4.getData();
    java.util.Enumeration enumeration12 = xmlElement4.getAttributeNames();
    XmlElement xmlElement14 = new XmlElement("hi!");
    java.lang.String str16 = xmlElement14.getAttribute("hi!");
    xmlElement14.setData("hi!");
    XmlElement xmlElement20 = new XmlElement("hi!");
    java.lang.String str22 = xmlElement20.getAttribute("hi!");
    xmlElement20.setData("hi!");
    XmlElement xmlElement25 = xmlElement14.addSubElement(xmlElement20);
    java.lang.String str26 = xmlElement25.getName();
    boolean b27 = xmlElement25.hasChanged();
    java.lang.Object obj30 = xmlElement25.addAttribute("hi!", "");
    xmlElement4.setParent(xmlElement25);
    XmlElement xmlElement32 = xmlElement1.addSubElement(xmlElement4);
    java.util.Observer observer33 = null;
    xmlElement32.deleteObserver(observer33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement32);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setName("hi!");
    XmlElement xmlElement13 = xmlElement7.getElement("hi!");
    xmlElement5.setParent(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement13);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    int i6 = xmlElement1.count();
    XmlElement xmlElement9 = new XmlElement("hi!");
    java.lang.String str10 = xmlElement9.getData();
    XmlElement xmlElement13 = xmlElement9.addSubElement("hi!", "hi!");
    boolean b15 = xmlElement9.equals((java.lang.Object)10.0d);
    java.lang.String str16 = xmlElement9.getData();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str17 = xmlElement9.getAttributes();
    XmlElement xmlElement18 = new XmlElement("", hashtable_str_str17);
    boolean b19 = xmlElement1.addElement(xmlElement18);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str20 = xmlElement18.getAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str20);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    int i13 = xmlElement12.countObservers();
    XmlElement xmlElement16 = xmlElement12.addSubElement("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement16);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    java.lang.String str13 = xmlElement12.getName();
    java.lang.Object obj14 = xmlElement12.clone();
    XmlElement xmlElement16 = xmlElement12.getElement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.deleteObservers();
    int i3 = xmlElement1.count();
    java.lang.String str6 = xmlElement1.getAttribute("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    XmlElement xmlElement2 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement2.getData();
    XmlElement xmlElement6 = xmlElement2.addSubElement("hi!", "hi!");
    boolean b8 = xmlElement2.equals((java.lang.Object)10.0d);
    java.lang.String str9 = xmlElement2.getData();
    XmlElement xmlElement11 = xmlElement2.addSubElement("");
    java.lang.Object obj12 = xmlElement11.clone();
    boolean b13 = xmlElement11.hasChanged();
    XmlElement xmlElement16 = xmlElement11.addSubElement("hi!", "hi!");
    XmlElement xmlElement19 = new XmlElement("hi!");
    java.lang.String str20 = xmlElement19.getData();
    int i21 = xmlElement19.count();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str22 = xmlElement19.getAttributes();
    XmlElement xmlElement23 = new XmlElement("hi!", hashtable_str_str22);
    xmlElement16.setAttributes(hashtable_str_str22);
    XmlElement xmlElement25 = new XmlElement("hi!", hashtable_str_str22);
    xmlElement25.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str22);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    java.util.Observer observer5 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement1.addObserver(observer5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    int i13 = xmlElement1.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    java.util.Enumeration enumeration9 = xmlElement1.getAttributeNames();
    XmlElement xmlElement11 = new XmlElement("hi!");
    java.lang.String str13 = xmlElement11.getAttribute("hi!");
    xmlElement11.setData("hi!");
    XmlElement xmlElement17 = new XmlElement("hi!");
    java.lang.String str19 = xmlElement17.getAttribute("hi!");
    xmlElement17.setData("hi!");
    XmlElement xmlElement22 = xmlElement11.addSubElement(xmlElement17);
    java.lang.String str23 = xmlElement22.getName();
    boolean b24 = xmlElement22.hasChanged();
    java.lang.Object obj27 = xmlElement22.addAttribute("hi!", "");
    xmlElement1.setParent(xmlElement22);
    XmlElement xmlElement30 = new XmlElement("hi!");
    java.lang.String str31 = xmlElement30.getData();
    XmlElement xmlElement34 = xmlElement30.addSubElement("hi!", "hi!");
    int i35 = xmlElement30.count();
    XmlElement xmlElement38 = new XmlElement("hi!");
    java.lang.String str39 = xmlElement38.getData();
    XmlElement xmlElement42 = xmlElement38.addSubElement("hi!", "hi!");
    boolean b44 = xmlElement38.equals((java.lang.Object)10.0d);
    java.lang.String str45 = xmlElement38.getData();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str46 = xmlElement38.getAttributes();
    XmlElement xmlElement47 = new XmlElement("", hashtable_str_str46);
    boolean b48 = xmlElement30.addElement(xmlElement47);
    xmlElement30.setName("hi!");
    boolean b51 = xmlElement1.addElement(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + ""+ "'", str39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + ""+ "'", str45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str9 = xmlElement1.getAttributes();
    xmlElement1.setName("hi!");
    XmlElement xmlElement13 = xmlElement1.addSubElement("hi!");
    xmlElement1.removeFromParent();
    boolean b16 = xmlElement1.equals((java.lang.Object)10.0f);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement18 = xmlElement1.removeElement((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str4 = xmlElement1.getAttribute("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    XmlElement xmlElement10 = xmlElement1.addSubElement("");
    XmlElement xmlElement11 = xmlElement10.getParent();
    java.util.Observer observer12 = null;
    xmlElement10.deleteObserver(observer12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    XmlElement xmlElement0 = new XmlElement();
    int i1 = xmlElement0.count();
    int i2 = xmlElement0.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    XmlElement xmlElement7 = xmlElement1.getElement((int)(byte)0);
    java.lang.String str9 = xmlElement1.getAttribute("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement7 = xmlElement1.removeElement((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    int i13 = xmlElement12.countObservers();
    boolean b14 = xmlElement12.hasChanged();
    XmlElement xmlElement16 = new XmlElement("hi!");
    java.lang.String str18 = xmlElement16.getAttribute("hi!");
    xmlElement16.setData("hi!");
    XmlElement xmlElement22 = new XmlElement("hi!");
    java.lang.String str24 = xmlElement22.getAttribute("hi!");
    xmlElement22.setData("hi!");
    XmlElement xmlElement27 = xmlElement16.addSubElement(xmlElement22);
    java.lang.String str28 = xmlElement27.getName();
    XmlElement xmlElement30 = xmlElement27.getElement("");
    xmlElement12.setParent(xmlElement30);
    XmlElement xmlElement33 = new XmlElement("hi!");
    java.lang.String str35 = xmlElement33.getAttribute("hi!");
    xmlElement33.setData("hi!");
    java.lang.Object obj38 = xmlElement33.clone();
    java.lang.String str39 = xmlElement33.getData();
    java.util.Observer observer40 = null;
    xmlElement33.deleteObserver(observer40);
    xmlElement12.setParent(xmlElement33);
    java.util.Observer observer43 = null;
    xmlElement12.deleteObserver(observer43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!"+ "'", str39.equals("hi!"));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    int i3 = xmlElement1.count();
    int i4 = xmlElement1.count();
    XmlElement xmlElement6 = new XmlElement("hi!");
    java.lang.String str8 = xmlElement6.getAttribute("hi!");
    xmlElement6.setData("hi!");
    java.lang.Object obj11 = xmlElement6.clone();
    java.lang.String str12 = xmlElement6.getData();
    java.util.Observer observer13 = null;
    xmlElement6.deleteObserver(observer13);
    XmlElement xmlElement15 = xmlElement1.addSubElement(xmlElement6);
    java.util.Observer observer16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement6.addObserver(observer16);
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    int i6 = xmlElement1.count();
    xmlElement1.deleteObservers();
    int i8 = xmlElement1.count();
    XmlElement xmlElement10 = new XmlElement("hi!");
    java.lang.String str11 = xmlElement10.getData();
    XmlElement xmlElement14 = xmlElement10.addSubElement("hi!", "hi!");
    int i15 = xmlElement10.count();
    xmlElement10.deleteObservers();
    XmlElement xmlElement17 = xmlElement1.removeElement(xmlElement10);
    XmlElement xmlElement18 = xmlElement1.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement18);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    XmlElement xmlElement6 = xmlElement1.getParent();
    java.lang.String str8 = xmlElement1.getAttribute("hi!");
    XmlElement xmlElement10 = new XmlElement("hi!");
    java.lang.String str11 = xmlElement10.getData();
    XmlElement xmlElement14 = xmlElement10.addSubElement("hi!", "hi!");
    boolean b16 = xmlElement10.equals((java.lang.Object)10.0d);
    java.lang.String str17 = xmlElement10.getData();
    xmlElement10.notifyObservers((java.lang.Object)"");
    java.lang.Object obj20 = xmlElement10.clone();
    XmlElement xmlElement21 = xmlElement1.removeElement(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    XmlElement xmlElement15 = xmlElement12.addSubElement("", "hi!");
    XmlElement xmlElement17 = xmlElement15.addSubElement("hi!");
    xmlElement15.notifyObservers();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement20 = xmlElement15.getElement((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    XmlElement xmlElement8 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement8.getData();
    XmlElement xmlElement12 = xmlElement8.addSubElement("hi!", "hi!");
    boolean b14 = xmlElement8.equals((java.lang.Object)10.0d);
    java.lang.String str15 = xmlElement8.getData();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = xmlElement8.getAttributes();
    XmlElement xmlElement17 = new XmlElement("", hashtable_str_str16);
    xmlElement1.setAttributes(hashtable_str_str16);
    XmlElement xmlElement19 = null;
    xmlElement1.setParent(xmlElement19);
    int i21 = xmlElement1.count();
    XmlElement.printNode(xmlElement1, "");
    XmlElement xmlElement25 = new XmlElement("hi!");
    XmlElement xmlElement27 = new XmlElement("hi!");
    java.lang.String str29 = xmlElement27.getAttribute("hi!");
    xmlElement27.setData("hi!");
    XmlElement xmlElement32 = xmlElement25.removeElement(xmlElement27);
    java.lang.String str33 = xmlElement27.getData();
    boolean b34 = xmlElement1.equals((java.lang.Object)xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    int i6 = xmlElement1.count();
    xmlElement1.deleteObservers();
    java.util.Enumeration enumeration8 = xmlElement1.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    xmlElement1.notifyObservers((java.lang.Object)10.0f);
    XmlElement xmlElement6 = new XmlElement("hi!");
    java.lang.String str7 = xmlElement6.getData();
    XmlElement xmlElement10 = xmlElement6.addSubElement("hi!", "hi!");
    boolean b12 = xmlElement6.equals((java.lang.Object)10.0d);
    java.lang.String str13 = xmlElement6.getData();
    java.util.Enumeration enumeration14 = xmlElement6.getAttributeNames();
    XmlElement xmlElement15 = new XmlElement();
    xmlElement6.notifyObservers((java.lang.Object)xmlElement15);
    xmlElement1.setParent(xmlElement15);
    xmlElement1.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration14);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setName("hi!");
    XmlElement xmlElement7 = xmlElement1.getElement("hi!");
    XmlElement xmlElement9 = new XmlElement("hi!");
    java.lang.String str11 = xmlElement9.getAttribute("hi!");
    xmlElement9.setName("hi!");
    // The following exception was thrown during execution in test generation
    try {
    xmlElement7.append(xmlElement9);
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
    org.junit.Assert.assertNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    XmlElement xmlElement10 = xmlElement1.addSubElement("");
    XmlElement xmlElement13 = xmlElement10.addSubElement("hi!", "hi!");
    XmlElement xmlElement15 = new XmlElement("hi!");
    XmlElement xmlElement17 = new XmlElement("hi!");
    java.lang.String str19 = xmlElement17.getAttribute("hi!");
    xmlElement17.setData("hi!");
    XmlElement xmlElement22 = xmlElement15.removeElement(xmlElement17);
    xmlElement10.append(xmlElement17);
    XmlElement xmlElement25 = new XmlElement("hi!");
    java.lang.String str27 = xmlElement25.getAttribute("hi!");
    xmlElement25.setData("hi!");
    java.lang.Object obj30 = xmlElement25.clone();
    XmlElement xmlElement31 = xmlElement17.removeElement(xmlElement25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement31);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    int i6 = xmlElement1.count();
    xmlElement1.deleteObservers();
    int i8 = xmlElement1.count();
    XmlElement xmlElement10 = new XmlElement("hi!");
    java.lang.String str11 = xmlElement10.getData();
    XmlElement xmlElement14 = xmlElement10.addSubElement("hi!", "hi!");
    int i15 = xmlElement10.count();
    xmlElement10.deleteObservers();
    XmlElement xmlElement17 = xmlElement1.removeElement(xmlElement10);
    java.lang.String str18 = xmlElement1.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.deleteObservers();
    int i3 = xmlElement1.count();
    XmlElement xmlElement5 = xmlElement1.getElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    xmlElement1.removeFromParent();
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.String str5 = xmlElement4.getData();
    XmlElement xmlElement8 = xmlElement4.addSubElement("hi!", "hi!");
    boolean b10 = xmlElement4.equals((java.lang.Object)10.0d);
    java.lang.String str11 = xmlElement4.getData();
    java.util.Enumeration enumeration12 = xmlElement4.getAttributeNames();
    XmlElement xmlElement14 = new XmlElement("hi!");
    java.lang.String str16 = xmlElement14.getAttribute("hi!");
    xmlElement14.setData("hi!");
    XmlElement xmlElement20 = new XmlElement("hi!");
    java.lang.String str22 = xmlElement20.getAttribute("hi!");
    xmlElement20.setData("hi!");
    XmlElement xmlElement25 = xmlElement14.addSubElement(xmlElement20);
    java.lang.String str26 = xmlElement25.getName();
    boolean b27 = xmlElement25.hasChanged();
    java.lang.Object obj30 = xmlElement25.addAttribute("hi!", "");
    xmlElement4.setParent(xmlElement25);
    XmlElement xmlElement32 = xmlElement1.addSubElement(xmlElement4);
    XmlElement xmlElement35 = new XmlElement("hi!");
    java.lang.String str36 = xmlElement35.getData();
    XmlElement xmlElement39 = xmlElement35.addSubElement("hi!", "hi!");
    XmlElement xmlElement42 = new XmlElement("hi!");
    java.lang.String str43 = xmlElement42.getData();
    XmlElement xmlElement46 = xmlElement42.addSubElement("hi!", "hi!");
    boolean b48 = xmlElement42.equals((java.lang.Object)10.0d);
    java.lang.String str49 = xmlElement42.getData();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str50 = xmlElement42.getAttributes();
    XmlElement xmlElement51 = new XmlElement("", hashtable_str_str50);
    xmlElement35.setAttributes(hashtable_str_str50);
    XmlElement xmlElement53 = new XmlElement("", hashtable_str_str50);
    xmlElement1.notifyObservers((java.lang.Object)hashtable_str_str50);
    XmlElement xmlElement56 = xmlElement1.getElement("hi!");
    XmlElement xmlElement58 = xmlElement56.addSubElement("hi!");
    xmlElement56.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + ""+ "'", str43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + ""+ "'", str49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement58);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    XmlElement xmlElement15 = xmlElement12.addSubElement("", "hi!");
    java.lang.Object obj18 = xmlElement15.addAttribute("", "");
    java.lang.Object obj21 = xmlElement15.addAttribute("", "hi!");
    XmlElement xmlElement23 = new XmlElement("hi!");
    java.lang.String str24 = xmlElement23.getData();
    xmlElement23.notifyObservers((java.lang.Object)10.0f);
    XmlElement xmlElement29 = xmlElement23.addSubElement("", "hi!");
    xmlElement15.setParent(xmlElement23);
    xmlElement23.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj21 + "' != '" + ""+ "'", obj21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement29);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    XmlElement xmlElement2 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement2.getData();
    XmlElement xmlElement6 = xmlElement2.addSubElement("hi!", "hi!");
    boolean b8 = xmlElement2.equals((java.lang.Object)10.0d);
    java.lang.String str9 = xmlElement2.getData();
    XmlElement xmlElement11 = xmlElement2.addSubElement("");
    XmlElement xmlElement12 = xmlElement11.getParent();
    XmlElement xmlElement14 = new XmlElement("hi!");
    java.lang.String str16 = xmlElement14.getAttribute("hi!");
    xmlElement14.setData("hi!");
    XmlElement xmlElement20 = new XmlElement("hi!");
    java.lang.String str22 = xmlElement20.getAttribute("hi!");
    xmlElement20.setData("hi!");
    XmlElement xmlElement25 = xmlElement14.addSubElement(xmlElement20);
    XmlElement xmlElement27 = new XmlElement("hi!");
    java.lang.String str28 = xmlElement27.getData();
    XmlElement xmlElement31 = xmlElement27.addSubElement("hi!", "hi!");
    boolean b33 = xmlElement27.equals((java.lang.Object)10.0d);
    java.lang.String str34 = xmlElement27.getData();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str35 = xmlElement27.getAttributes();
    xmlElement20.setAttributes(hashtable_str_str35);
    xmlElement11.setAttributes(hashtable_str_str35);
    XmlElement xmlElement38 = new XmlElement("hi!", hashtable_str_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str35);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement7 = xmlElement1.addSubElement("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    int i3 = xmlElement1.count();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = xmlElement1.getAttributes();
    xmlElement1.setData("");
    java.util.Enumeration enumeration7 = xmlElement1.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration7);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    XmlElement xmlElement3 = new XmlElement("hi!");
    java.lang.String str4 = xmlElement3.getData();
    int i5 = xmlElement3.count();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement3.getAttributes();
    XmlElement xmlElement7 = new XmlElement("hi!", hashtable_str_str6);
    XmlElement xmlElement8 = new XmlElement("", hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    XmlElement xmlElement2 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement2.getData();
    XmlElement xmlElement6 = xmlElement2.addSubElement("hi!", "hi!");
    XmlElement xmlElement9 = new XmlElement("hi!");
    java.lang.String str10 = xmlElement9.getData();
    XmlElement xmlElement13 = xmlElement9.addSubElement("hi!", "hi!");
    boolean b15 = xmlElement9.equals((java.lang.Object)10.0d);
    java.lang.String str16 = xmlElement9.getData();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str17 = xmlElement9.getAttributes();
    XmlElement xmlElement18 = new XmlElement("", hashtable_str_str17);
    xmlElement2.setAttributes(hashtable_str_str17);
    XmlElement xmlElement20 = new XmlElement("", hashtable_str_str17);
    XmlElement xmlElement22 = xmlElement20.getElement("hi!");
    xmlElement20.setData("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement22);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    XmlElement xmlElement15 = xmlElement12.addSubElement("", "hi!");
    java.lang.Object obj18 = xmlElement15.addAttribute("", "");
    java.lang.Object obj21 = xmlElement15.addAttribute("", "hi!");
    XmlElement xmlElement23 = new XmlElement("hi!");
    java.lang.String str24 = xmlElement23.getData();
    xmlElement23.notifyObservers((java.lang.Object)10.0f);
    XmlElement xmlElement29 = xmlElement23.addSubElement("", "hi!");
    xmlElement15.setParent(xmlElement23);
    XmlElement xmlElement32 = new XmlElement("hi!");
    java.lang.String str33 = xmlElement32.getData();
    XmlElement xmlElement36 = xmlElement32.addSubElement("hi!", "hi!");
    boolean b38 = xmlElement32.equals((java.lang.Object)10.0d);
    java.lang.String str39 = xmlElement32.getData();
    XmlElement xmlElement41 = xmlElement32.addSubElement("");
    XmlElement xmlElement42 = xmlElement41.getParent();
    // The following exception was thrown during execution in test generation
    try {
    xmlElement15.insertElement(xmlElement42, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj21 + "' != '" + ""+ "'", obj21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + ""+ "'", str39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement42);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    XmlElement xmlElement15 = xmlElement12.addSubElement("", "hi!");
    java.lang.Object obj18 = xmlElement15.addAttribute("", "");
    XmlElement xmlElement19 = xmlElement15.getParent();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str20 = xmlElement19.getAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str20);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    XmlElement xmlElement10 = xmlElement1.addSubElement("");
    java.lang.Object obj11 = xmlElement10.clone();
    java.lang.String str14 = xmlElement10.getAttribute("", "");
    xmlElement10.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    java.lang.String str7 = xmlElement1.getAttribute("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = xmlElement1.getAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str8);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    xmlElement1.notifyObservers((java.lang.Object)"");
    java.util.Enumeration enumeration11 = xmlElement1.getAttributeNames();
    XmlElement xmlElement13 = new XmlElement("hi!");
    java.lang.String str14 = xmlElement13.getData();
    XmlElement xmlElement17 = xmlElement13.addSubElement("hi!", "hi!");
    boolean b19 = xmlElement13.equals((java.lang.Object)10.0d);
    java.lang.String str20 = xmlElement13.getData();
    java.util.Enumeration enumeration21 = xmlElement13.getAttributeNames();
    XmlElement xmlElement22 = new XmlElement();
    xmlElement13.notifyObservers((java.lang.Object)xmlElement22);
    XmlElement.printNode(xmlElement22, "hi!");
    XmlElement xmlElement26 = xmlElement1.addSubElement(xmlElement22);
    java.util.List list27 = xmlElement22.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list27);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    XmlElement xmlElement0 = new XmlElement();
    int i1 = xmlElement0.count();
    java.lang.String str2 = xmlElement0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("", hashtable_str_str1);
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.String str5 = xmlElement4.getData();
    XmlElement xmlElement8 = xmlElement4.addSubElement("hi!", "hi!");
    XmlElement xmlElement11 = new XmlElement("hi!");
    java.lang.String str12 = xmlElement11.getData();
    XmlElement xmlElement15 = xmlElement11.addSubElement("hi!", "hi!");
    boolean b17 = xmlElement11.equals((java.lang.Object)10.0d);
    java.lang.String str18 = xmlElement11.getData();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement11.getAttributes();
    XmlElement xmlElement20 = new XmlElement("", hashtable_str_str19);
    xmlElement4.setAttributes(hashtable_str_str19);
    XmlElement xmlElement22 = null;
    xmlElement4.setParent(xmlElement22);
    int i24 = xmlElement4.count();
    java.util.List list25 = xmlElement4.getElements();
    xmlElement2.notifyObservers((java.lang.Object)xmlElement4);
    java.lang.Object obj27 = xmlElement4.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj27);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str2 = xmlElement1.getData();
    XmlElement xmlElement5 = xmlElement1.addSubElement("hi!", "hi!");
    boolean b7 = xmlElement1.equals((java.lang.Object)10.0d);
    java.lang.String str8 = xmlElement1.getData();
    xmlElement1.notifyObservers((java.lang.Object)"");
    java.util.Enumeration enumeration11 = xmlElement1.getAttributeNames();
    java.lang.String str13 = xmlElement1.getAttribute("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.setData("hi!");
    XmlElement xmlElement7 = new XmlElement("hi!");
    java.lang.String str9 = xmlElement7.getAttribute("hi!");
    xmlElement7.setData("hi!");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    XmlElement xmlElement14 = new XmlElement("hi!");
    java.lang.String str15 = xmlElement14.getData();
    XmlElement xmlElement18 = xmlElement14.addSubElement("hi!", "hi!");
    boolean b20 = xmlElement14.equals((java.lang.Object)10.0d);
    java.lang.String str21 = xmlElement14.getData();
    XmlElement xmlElement23 = xmlElement14.addSubElement("");
    java.lang.Object obj24 = xmlElement23.clone();
    boolean b25 = xmlElement7.equals(obj24);
    xmlElement7.setData("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

}
