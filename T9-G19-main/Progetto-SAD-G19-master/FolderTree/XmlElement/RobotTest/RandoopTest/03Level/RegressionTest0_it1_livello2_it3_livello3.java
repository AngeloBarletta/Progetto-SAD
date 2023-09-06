
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    xmlElement2.deleteObservers();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement5 = xmlElement2.removeElement((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    xmlElement2.deleteObservers();
    XmlElement xmlElement5 = xmlElement2.getElement("hi!");
    XmlElement xmlElement6 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement5.insertElement(xmlElement6, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    XmlElement xmlElement1 = new XmlElement("");
    java.util.Observer observer2 = null;
    xmlElement1.deleteObserver(observer2);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement5 = xmlElement1.removeElement(1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    xmlElement2.deleteObservers();
    XmlElement xmlElement5 = xmlElement2.getElement("hi!");
    // The following exception was thrown during execution in test generation
    try {
    xmlElement5.setData("");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    xmlElement2.deleteObservers();
    XmlElement xmlElement5 = xmlElement2.getElement("hi!");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj6 = xmlElement5.clone();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("hi!", "");
    XmlElement xmlElement6 = new XmlElement("");
    XmlElement xmlElement9 = xmlElement6.addSubElement("hi!", "");
    // The following exception was thrown during execution in test generation
    try {
    xmlElement1.insertElement(xmlElement9, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement9);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    xmlElement2.deleteObservers();
    java.lang.String str4 = xmlElement2.getData();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = null;
    XmlElement xmlElement7 = new XmlElement("hi!", hashtable_str_str6);
    xmlElement7.deleteObservers();
    java.lang.String str9 = xmlElement7.getData();
    XmlElement xmlElement10 = xmlElement2.removeElement(xmlElement7);
    XmlElement xmlElement12 = new XmlElement("");
    xmlElement12.setName("");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement15 = xmlElement10.removeElement(xmlElement12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement10);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.deleteObservers();
    XmlElement xmlElement4 = new XmlElement("");
    XmlElement xmlElement7 = xmlElement4.addSubElement("hi!", "");
    boolean b8 = xmlElement1.addElement(xmlElement7);
    XmlElement xmlElement10 = new XmlElement("");
    xmlElement10.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str13 = xmlElement10.getAttributes();
    xmlElement1.setAttributes(hashtable_str_str13);
    java.lang.String str15 = xmlElement1.getData();
    xmlElement1.setData("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    xmlElement2.deleteObservers();
    XmlElement xmlElement5 = xmlElement2.getElement("hi!");
    java.lang.String str6 = xmlElement2.getData();
    java.util.Observer observer7 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement2.addObserver(observer7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.setData("");
    XmlElement xmlElement4 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement1.append(xmlElement4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.deleteObservers();
    xmlElement1.setName("hi!");
    xmlElement1.setName("");

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    xmlElement2.deleteObservers();
    java.lang.String str4 = xmlElement2.getData();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = null;
    XmlElement xmlElement7 = new XmlElement("hi!", hashtable_str_str6);
    xmlElement7.deleteObservers();
    java.lang.String str9 = xmlElement7.getData();
    XmlElement xmlElement10 = xmlElement2.removeElement(xmlElement7);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = null;
    XmlElement xmlElement13 = new XmlElement("hi!", hashtable_str_str12);
    xmlElement13.deleteObservers();
    // The following exception was thrown during execution in test generation
    try {
    xmlElement10.setParent(xmlElement13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement10);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.removeFromParent();
    XmlElement xmlElement4 = new XmlElement("");
    xmlElement4.setData("");
    boolean b7 = xmlElement1.equals((java.lang.Object)"");
    java.lang.Object obj10 = xmlElement1.addAttribute("hi!", "hi!");
    xmlElement1.setData("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    xmlElement2.deleteObservers();
    XmlElement xmlElement5 = xmlElement2.getElement("hi!");
    xmlElement2.notifyObservers((java.lang.Object)(byte)10);
    XmlElement xmlElement9 = xmlElement2.getElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    XmlElement xmlElement12 = new XmlElement("hi!", hashtable_str_str11);
    xmlElement12.deleteObservers();
    java.lang.String str14 = xmlElement12.getData();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = null;
    XmlElement xmlElement17 = new XmlElement("hi!", hashtable_str_str16);
    xmlElement17.deleteObservers();
    java.lang.String str19 = xmlElement17.getData();
    XmlElement xmlElement20 = xmlElement12.removeElement(xmlElement17);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement21 = xmlElement9.removeElement(xmlElement12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement20);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.removeFromParent();
    XmlElement xmlElement4 = xmlElement1.addSubElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = null;
    XmlElement xmlElement7 = new XmlElement("hi!", hashtable_str_str6);
    xmlElement7.deleteObservers();
    XmlElement xmlElement10 = xmlElement7.getElement("hi!");
    java.lang.String str11 = xmlElement7.getData();
    xmlElement1.setParent(xmlElement7);
    int i13 = xmlElement1.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.removeFromParent();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = null;
    XmlElement xmlElement5 = new XmlElement("hi!", hashtable_str_str4);
    boolean b6 = xmlElement1.equals((java.lang.Object)hashtable_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    xmlElement2.deleteObservers();
    XmlElement xmlElement5 = xmlElement2.getElement("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str7 = null;
    XmlElement xmlElement8 = new XmlElement("hi!", hashtable_str_str7);
    xmlElement8.deleteObservers();
    XmlElement xmlElement11 = xmlElement8.getElement("hi!");
    boolean b12 = xmlElement2.equals((java.lang.Object)xmlElement8);
    java.util.List list13 = xmlElement2.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.deleteObservers();
    XmlElement xmlElement4 = new XmlElement("");
    XmlElement xmlElement7 = xmlElement4.addSubElement("hi!", "");
    boolean b8 = xmlElement1.addElement(xmlElement7);
    java.lang.String str11 = xmlElement7.getAttribute("hi!", "hi!");
    XmlElement xmlElement14 = xmlElement7.addSubElement("", "hi!");
    XmlElement.printNode(xmlElement7, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement14);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    xmlElement2.deleteObservers();
    XmlElement xmlElement5 = xmlElement2.getElement("hi!");
    java.lang.String str6 = xmlElement2.getData();
    XmlElement xmlElement8 = new XmlElement("");
    XmlElement xmlElement11 = xmlElement8.addSubElement("hi!", "");
    xmlElement2.setParent(xmlElement11);
    java.util.Enumeration enumeration13 = xmlElement11.getAttributeNames();
    xmlElement11.setData("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration13);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.removeFromParent();
    XmlElement xmlElement4 = xmlElement1.addSubElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = null;
    XmlElement xmlElement7 = new XmlElement("hi!", hashtable_str_str6);
    xmlElement7.deleteObservers();
    XmlElement xmlElement10 = xmlElement7.getElement("hi!");
    java.lang.String str11 = xmlElement7.getData();
    xmlElement1.setParent(xmlElement7);
    java.util.Observer observer13 = null;
    xmlElement1.deleteObserver(observer13);
    java.lang.Object obj17 = xmlElement1.addAttribute("", "");
    int i18 = xmlElement1.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    java.lang.String str5 = xmlElement2.getAttribute("hi!", "");
    XmlElement xmlElement7 = new XmlElement("");
    xmlElement7.deleteObservers();
    XmlElement xmlElement10 = new XmlElement("");
    XmlElement xmlElement13 = xmlElement10.addSubElement("hi!", "");
    boolean b14 = xmlElement7.addElement(xmlElement13);
    XmlElement xmlElement16 = new XmlElement("");
    xmlElement16.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement16.getAttributes();
    xmlElement7.setAttributes(hashtable_str_str19);
    XmlElement xmlElement22 = new XmlElement("");
    xmlElement22.deleteObservers();
    xmlElement7.insertElement(xmlElement22, (int)(byte)1);
    java.lang.Object obj26 = xmlElement7.clone();
    xmlElement2.append(xmlElement7);
    java.util.List list28 = xmlElement2.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list28);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.setData("");
    XmlElement xmlElement5 = new XmlElement("");
    xmlElement5.deleteObservers();
    XmlElement xmlElement8 = new XmlElement("");
    XmlElement xmlElement11 = xmlElement8.addSubElement("hi!", "");
    boolean b12 = xmlElement5.addElement(xmlElement11);
    java.lang.String str15 = xmlElement11.getAttribute("hi!", "hi!");
    XmlElement xmlElement16 = xmlElement1.removeElement(xmlElement11);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj17 = xmlElement16.clone();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    XmlElement xmlElement1 = new XmlElement("");
    java.util.Observer observer2 = null;
    xmlElement1.deleteObserver(observer2);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    XmlElement xmlElement6 = new XmlElement("hi!", hashtable_str_str5);
    xmlElement6.deleteObservers();
    XmlElement xmlElement9 = xmlElement6.getElement("hi!");
    java.lang.String str10 = xmlElement6.getData();
    java.util.List list11 = xmlElement6.getElements();
    boolean b12 = xmlElement1.equals((java.lang.Object)list11);
    boolean b13 = xmlElement1.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    XmlElement xmlElement1 = new XmlElement("");
    java.util.List list2 = xmlElement1.getElements();
    XmlElement xmlElement4 = xmlElement1.addSubElement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.deleteObservers();
    XmlElement xmlElement4 = new XmlElement("");
    XmlElement xmlElement7 = xmlElement4.addSubElement("hi!", "");
    boolean b8 = xmlElement1.addElement(xmlElement7);
    XmlElement xmlElement10 = new XmlElement("");
    xmlElement10.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str13 = xmlElement10.getAttributes();
    xmlElement1.setAttributes(hashtable_str_str13);
    java.lang.String str15 = xmlElement1.getData();
    java.lang.String str16 = xmlElement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.setData("");
    XmlElement xmlElement5 = new XmlElement("");
    xmlElement5.deleteObservers();
    XmlElement xmlElement8 = new XmlElement("");
    XmlElement xmlElement11 = xmlElement8.addSubElement("hi!", "");
    boolean b12 = xmlElement5.addElement(xmlElement11);
    java.lang.String str15 = xmlElement11.getAttribute("hi!", "hi!");
    XmlElement xmlElement16 = xmlElement1.removeElement(xmlElement11);
    java.lang.String str19 = xmlElement11.getAttribute("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    XmlElement xmlElement2 = new XmlElement("");
    xmlElement2.deleteObservers();
    XmlElement xmlElement5 = new XmlElement("");
    XmlElement xmlElement8 = xmlElement5.addSubElement("hi!", "");
    boolean b9 = xmlElement2.addElement(xmlElement8);
    XmlElement xmlElement11 = new XmlElement("");
    xmlElement11.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str14 = xmlElement11.getAttributes();
    xmlElement2.setAttributes(hashtable_str_str14);
    XmlElement xmlElement16 = new XmlElement("", hashtable_str_str14);
    java.util.Enumeration enumeration17 = xmlElement16.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration17);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    xmlElement2.deleteObservers();
    XmlElement xmlElement5 = xmlElement2.getElement("hi!");
    java.lang.String str6 = xmlElement2.getData();
    XmlElement xmlElement7 = xmlElement2.getParent();
    // The following exception was thrown during execution in test generation
    try {
    java.util.Enumeration enumeration8 = xmlElement7.getAttributeNames();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement7);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = xmlElement2.addSubElement("", "");
    xmlElement2.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.deleteObservers();
    XmlElement xmlElement4 = new XmlElement("");
    XmlElement xmlElement7 = xmlElement4.addSubElement("hi!", "");
    boolean b8 = xmlElement1.addElement(xmlElement7);
    XmlElement xmlElement10 = new XmlElement("");
    xmlElement10.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str13 = xmlElement10.getAttributes();
    xmlElement1.setAttributes(hashtable_str_str13);
    java.lang.Object obj17 = xmlElement1.addAttribute("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    xmlElement2.deleteObservers();
    XmlElement xmlElement5 = xmlElement2.getElement("hi!");
    java.lang.String str6 = xmlElement2.getData();
    XmlElement xmlElement7 = xmlElement2.getParent();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement9 = xmlElement2.getElement((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement7);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.setName("");
    XmlElement xmlElement4 = xmlElement1.getParent();
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
    org.junit.Assert.assertNull(xmlElement4);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    xmlElement2.deleteObservers();
    XmlElement xmlElement5 = xmlElement2.getElement("hi!");
    java.lang.String str6 = xmlElement2.getData();
    java.lang.String str7 = xmlElement2.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.removeFromParent();
    XmlElement xmlElement4 = xmlElement1.addSubElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = null;
    XmlElement xmlElement7 = new XmlElement("hi!", hashtable_str_str6);
    xmlElement7.deleteObservers();
    XmlElement xmlElement10 = xmlElement7.getElement("hi!");
    java.lang.String str11 = xmlElement7.getData();
    xmlElement1.setParent(xmlElement7);
    java.util.List list13 = xmlElement7.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.setName("");
    XmlElement.printNode(xmlElement1, "hi!");

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    XmlElement xmlElement1 = new XmlElement("");
    java.util.Observer observer2 = null;
    xmlElement1.deleteObserver(observer2);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    XmlElement xmlElement6 = new XmlElement("hi!", hashtable_str_str5);
    xmlElement6.deleteObservers();
    XmlElement xmlElement9 = xmlElement6.getElement("hi!");
    java.lang.String str10 = xmlElement6.getData();
    java.util.List list11 = xmlElement6.getElements();
    boolean b12 = xmlElement1.equals((java.lang.Object)list11);
    java.util.List list13 = xmlElement1.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    xmlElement2.deleteObservers();
    XmlElement xmlElement5 = xmlElement2.getElement("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str7 = null;
    XmlElement xmlElement8 = new XmlElement("hi!", hashtable_str_str7);
    xmlElement8.deleteObservers();
    XmlElement xmlElement11 = xmlElement8.getElement("hi!");
    boolean b12 = xmlElement2.equals((java.lang.Object)xmlElement8);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement14 = xmlElement2.getElement((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.deleteObservers();
    XmlElement xmlElement4 = new XmlElement("");
    XmlElement xmlElement7 = xmlElement4.addSubElement("hi!", "");
    boolean b8 = xmlElement1.addElement(xmlElement7);
    XmlElement xmlElement10 = new XmlElement("");
    xmlElement10.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str13 = xmlElement10.getAttributes();
    xmlElement1.append(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str13);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    java.lang.String str5 = xmlElement2.getAttribute("hi!", "");
    XmlElement xmlElement7 = new XmlElement("");
    xmlElement7.deleteObservers();
    XmlElement xmlElement10 = new XmlElement("");
    XmlElement xmlElement13 = xmlElement10.addSubElement("hi!", "");
    boolean b14 = xmlElement7.addElement(xmlElement13);
    XmlElement xmlElement16 = new XmlElement("");
    xmlElement16.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement16.getAttributes();
    xmlElement7.setAttributes(hashtable_str_str19);
    XmlElement xmlElement22 = new XmlElement("");
    xmlElement22.deleteObservers();
    xmlElement7.insertElement(xmlElement22, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    xmlElement2.insertElement(xmlElement7, (int)(short)10);
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
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    java.lang.String str5 = xmlElement2.getAttribute("hi!", "");
    XmlElement xmlElement7 = new XmlElement("");
    xmlElement7.deleteObservers();
    XmlElement xmlElement10 = new XmlElement("");
    XmlElement xmlElement13 = xmlElement10.addSubElement("hi!", "");
    boolean b14 = xmlElement7.addElement(xmlElement13);
    XmlElement xmlElement16 = new XmlElement("");
    xmlElement16.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement16.getAttributes();
    xmlElement7.setAttributes(hashtable_str_str19);
    XmlElement xmlElement22 = new XmlElement("");
    xmlElement22.deleteObservers();
    xmlElement7.insertElement(xmlElement22, (int)(byte)1);
    java.lang.Object obj26 = xmlElement7.clone();
    xmlElement2.append(xmlElement7);
    boolean b28 = xmlElement2.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    java.lang.String str5 = xmlElement2.getAttribute("hi!", "");
    XmlElement xmlElement7 = new XmlElement("");
    xmlElement7.deleteObservers();
    XmlElement xmlElement10 = new XmlElement("");
    XmlElement xmlElement13 = xmlElement10.addSubElement("hi!", "");
    boolean b14 = xmlElement7.addElement(xmlElement13);
    XmlElement xmlElement16 = new XmlElement("");
    xmlElement16.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement16.getAttributes();
    xmlElement7.setAttributes(hashtable_str_str19);
    XmlElement xmlElement22 = new XmlElement("");
    xmlElement22.deleteObservers();
    xmlElement7.insertElement(xmlElement22, (int)(byte)1);
    java.lang.Object obj26 = xmlElement7.clone();
    xmlElement2.append(xmlElement7);
    XmlElement xmlElement30 = xmlElement7.addSubElement("hi!", "");
    java.lang.String str32 = xmlElement30.getAttribute("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.deleteObservers();
    xmlElement1.setName("hi!");
    int i5 = xmlElement1.count();
    java.lang.String str8 = xmlElement1.getAttribute("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    java.lang.String str5 = xmlElement2.getAttribute("hi!", "");
    XmlElement xmlElement7 = new XmlElement("");
    xmlElement7.deleteObservers();
    XmlElement xmlElement10 = new XmlElement("");
    XmlElement xmlElement13 = xmlElement10.addSubElement("hi!", "");
    boolean b14 = xmlElement7.addElement(xmlElement13);
    XmlElement xmlElement16 = new XmlElement("");
    xmlElement16.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement16.getAttributes();
    xmlElement7.setAttributes(hashtable_str_str19);
    XmlElement xmlElement22 = new XmlElement("");
    xmlElement22.deleteObservers();
    xmlElement7.insertElement(xmlElement22, (int)(byte)1);
    java.lang.Object obj26 = xmlElement7.clone();
    xmlElement2.append(xmlElement7);
    XmlElement xmlElement30 = xmlElement7.addSubElement("hi!", "");
    java.util.Observer observer31 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement30.addObserver(observer31);
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
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    java.lang.String str5 = xmlElement2.getAttribute("hi!", "");
    XmlElement xmlElement7 = new XmlElement("");
    xmlElement7.deleteObservers();
    XmlElement xmlElement10 = new XmlElement("");
    XmlElement xmlElement13 = xmlElement10.addSubElement("hi!", "");
    boolean b14 = xmlElement7.addElement(xmlElement13);
    XmlElement xmlElement16 = new XmlElement("");
    xmlElement16.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement16.getAttributes();
    xmlElement7.setAttributes(hashtable_str_str19);
    XmlElement xmlElement22 = new XmlElement("");
    xmlElement22.deleteObservers();
    xmlElement7.insertElement(xmlElement22, (int)(byte)1);
    java.lang.Object obj26 = xmlElement7.clone();
    xmlElement2.append(xmlElement7);
    XmlElement xmlElement30 = xmlElement7.addSubElement("hi!", "");
    XmlElement xmlElement32 = new XmlElement("");
    xmlElement32.deleteObservers();
    XmlElement xmlElement35 = new XmlElement("");
    XmlElement xmlElement38 = xmlElement35.addSubElement("hi!", "");
    boolean b39 = xmlElement32.addElement(xmlElement38);
    XmlElement xmlElement41 = new XmlElement("");
    xmlElement41.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str44 = xmlElement41.getAttributes();
    xmlElement32.setAttributes(hashtable_str_str44);
    XmlElement xmlElement47 = new XmlElement("");
    xmlElement47.deleteObservers();
    xmlElement32.insertElement(xmlElement47, (int)(byte)1);
    java.lang.Object obj51 = xmlElement32.clone();
    XmlElement.printNode(xmlElement32, "hi!");
    XmlElement xmlElement54 = xmlElement30.removeElement(xmlElement32);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str56 = null;
    XmlElement xmlElement57 = new XmlElement("hi!", hashtable_str_str56);
    xmlElement57.deleteObservers();
    XmlElement xmlElement60 = xmlElement57.getElement("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str62 = null;
    XmlElement xmlElement63 = new XmlElement("hi!", hashtable_str_str62);
    xmlElement63.deleteObservers();
    XmlElement xmlElement66 = xmlElement63.getElement("hi!");
    boolean b67 = xmlElement57.equals((java.lang.Object)xmlElement63);
    // The following exception was thrown during execution in test generation
    try {
    xmlElement54.notifyObservers((java.lang.Object)xmlElement57);
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
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.deleteObservers();
    int i3 = xmlElement1.countObservers();
    xmlElement1.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    xmlElement2.deleteObservers();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement5 = xmlElement2.removeElement((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.deleteObservers();
    xmlElement1.setName("hi!");
    XmlElement xmlElement6 = new XmlElement("");
    xmlElement6.deleteObservers();
    XmlElement xmlElement9 = new XmlElement("");
    XmlElement xmlElement12 = xmlElement9.addSubElement("hi!", "");
    boolean b13 = xmlElement6.addElement(xmlElement12);
    XmlElement xmlElement15 = new XmlElement("");
    xmlElement15.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str18 = xmlElement15.getAttributes();
    xmlElement6.setAttributes(hashtable_str_str18);
    XmlElement xmlElement21 = new XmlElement("");
    xmlElement21.deleteObservers();
    xmlElement6.insertElement(xmlElement21, (int)(byte)1);
    java.lang.Object obj25 = xmlElement6.clone();
    xmlElement1.notifyObservers(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj25);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.removeFromParent();
    XmlElement xmlElement4 = xmlElement1.addSubElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = null;
    XmlElement xmlElement7 = new XmlElement("hi!", hashtable_str_str6);
    xmlElement7.deleteObservers();
    XmlElement xmlElement10 = xmlElement7.getElement("hi!");
    java.lang.String str11 = xmlElement7.getData();
    xmlElement1.setParent(xmlElement7);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = xmlElement7.getAttribute("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.setData("");
    java.lang.String str4 = xmlElement1.getName();
    XmlElement xmlElement6 = new XmlElement("");
    XmlElement xmlElement9 = xmlElement6.addSubElement("hi!", "");
    xmlElement9.notifyObservers();
    xmlElement1.append(xmlElement9);
    boolean b12 = xmlElement1.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }


    XmlElement xmlElement1 = new XmlElement("");
    java.util.Observer observer2 = null;
    xmlElement1.deleteObserver(observer2);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    XmlElement xmlElement6 = new XmlElement("hi!", hashtable_str_str5);
    xmlElement6.deleteObservers();
    XmlElement xmlElement9 = xmlElement6.getElement("hi!");
    java.lang.String str10 = xmlElement6.getData();
    java.util.List list11 = xmlElement6.getElements();
    boolean b12 = xmlElement1.equals((java.lang.Object)list11);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement14 = xmlElement1.removeElement(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }


    XmlElement xmlElement1 = new XmlElement("");
    java.util.Observer observer2 = null;
    xmlElement1.deleteObserver(observer2);
    java.lang.String str4 = xmlElement1.getName();
    xmlElement1.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }


    XmlElement xmlElement1 = new XmlElement("");
    java.util.Observer observer2 = null;
    xmlElement1.deleteObserver(observer2);
    java.lang.String str4 = xmlElement1.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = xmlElement1.getAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str5);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.deleteObservers();
    xmlElement1.setName("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = null;
    XmlElement xmlElement7 = new XmlElement("hi!", hashtable_str_str6);
    xmlElement7.deleteObservers();
    XmlElement xmlElement10 = xmlElement7.getElement("hi!");
    java.lang.String str11 = xmlElement7.getData();
    boolean b12 = xmlElement1.addElement(xmlElement7);
    java.util.List list13 = xmlElement1.getElements();
    java.lang.Object obj14 = null;
    boolean b15 = xmlElement1.equals(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    xmlElement2.deleteObservers();
    xmlElement2.removeFromParent();

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("hi!", "");
    XmlElement xmlElement10 = new XmlElement("");
    xmlElement10.deleteObservers();
    XmlElement xmlElement13 = new XmlElement("");
    XmlElement xmlElement16 = xmlElement13.addSubElement("hi!", "");
    boolean b17 = xmlElement10.addElement(xmlElement16);
    XmlElement xmlElement19 = new XmlElement("");
    xmlElement19.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str22 = xmlElement19.getAttributes();
    xmlElement10.setAttributes(hashtable_str_str22);
    XmlElement xmlElement25 = new XmlElement("");
    xmlElement25.deleteObservers();
    xmlElement10.insertElement(xmlElement25, (int)(byte)1);
    java.lang.Object obj29 = xmlElement10.clone();
    xmlElement5.append(xmlElement10);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str31 = xmlElement10.getAttributes();
    XmlElement xmlElement34 = new XmlElement("", "");
    java.lang.String str37 = xmlElement34.getAttribute("hi!", "");
    XmlElement xmlElement39 = new XmlElement("");
    xmlElement39.deleteObservers();
    XmlElement xmlElement42 = new XmlElement("");
    XmlElement xmlElement45 = xmlElement42.addSubElement("hi!", "");
    boolean b46 = xmlElement39.addElement(xmlElement45);
    XmlElement xmlElement48 = new XmlElement("");
    xmlElement48.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str51 = xmlElement48.getAttributes();
    xmlElement39.setAttributes(hashtable_str_str51);
    XmlElement xmlElement54 = new XmlElement("");
    xmlElement54.deleteObservers();
    xmlElement39.insertElement(xmlElement54, (int)(byte)1);
    java.lang.Object obj58 = xmlElement39.clone();
    xmlElement34.append(xmlElement39);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str60 = xmlElement39.getAttributes();
    xmlElement10.setAttributes(hashtable_str_str60);
    xmlElement2.setAttributes(hashtable_str_str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + ""+ "'", str37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str60);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.deleteObservers();
    xmlElement1.setName("hi!");
    XmlElement xmlElement6 = new XmlElement("");
    xmlElement6.deleteObservers();
    XmlElement xmlElement9 = new XmlElement("");
    XmlElement xmlElement12 = xmlElement9.addSubElement("hi!", "");
    boolean b13 = xmlElement6.addElement(xmlElement12);
    XmlElement xmlElement15 = new XmlElement("");
    xmlElement15.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str18 = xmlElement15.getAttributes();
    xmlElement6.setAttributes(hashtable_str_str18);
    java.lang.String str20 = xmlElement6.getData();
    java.lang.Object obj23 = xmlElement6.addAttribute("", "hi!");
    boolean b24 = xmlElement1.addElement(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.setName("");
    XmlElement xmlElement4 = xmlElement1.getParent();
    XmlElement xmlElement7 = xmlElement1.addSubElement("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test58"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    xmlElement2.deleteObservers();
    XmlElement xmlElement5 = xmlElement2.getElement("hi!");
    java.lang.String str6 = xmlElement2.getData();
    java.util.List list7 = xmlElement2.getElements();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str9 = null;
    XmlElement xmlElement10 = new XmlElement("hi!", hashtable_str_str9);
    xmlElement10.deleteObservers();
    XmlElement xmlElement13 = xmlElement10.getElement("hi!");
    java.lang.String str14 = xmlElement10.getData();
    XmlElement xmlElement15 = xmlElement10.getParent();
    XmlElement xmlElement18 = xmlElement10.addSubElement("", "hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str20 = null;
    XmlElement xmlElement21 = new XmlElement("hi!", hashtable_str_str20);
    xmlElement21.deleteObservers();
    XmlElement xmlElement24 = xmlElement21.getElement("hi!");
    java.lang.String str25 = xmlElement21.getData();
    XmlElement xmlElement27 = new XmlElement("");
    XmlElement xmlElement30 = xmlElement27.addSubElement("hi!", "");
    xmlElement21.setParent(xmlElement30);
    XmlElement xmlElement32 = xmlElement10.addSubElement(xmlElement21);
    xmlElement2.setParent(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement32);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test59"); }


    XmlElement xmlElement1 = new XmlElement("");
    java.util.List list2 = xmlElement1.getElements();
    boolean b3 = xmlElement1.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test60"); }


    XmlElement xmlElement1 = new XmlElement("");
    java.lang.Object obj2 = xmlElement1.clone();
    java.util.List list3 = xmlElement1.getElements();
    int i4 = xmlElement1.countObservers();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement6 = xmlElement1.removeElement((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test61"); }


    XmlElement xmlElement1 = new XmlElement("");
    java.util.Observer observer2 = null;
    xmlElement1.deleteObserver(observer2);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    XmlElement xmlElement6 = new XmlElement("hi!", hashtable_str_str5);
    xmlElement6.deleteObservers();
    XmlElement xmlElement9 = xmlElement6.getElement("hi!");
    java.lang.String str10 = xmlElement6.getData();
    java.util.List list11 = xmlElement6.getElements();
    boolean b12 = xmlElement1.equals((java.lang.Object)list11);
    XmlElement xmlElement14 = xmlElement1.getElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement14);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test62"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.deleteObservers();
    XmlElement xmlElement4 = new XmlElement("");
    XmlElement xmlElement7 = xmlElement4.addSubElement("hi!", "");
    boolean b8 = xmlElement1.addElement(xmlElement7);
    java.lang.String str9 = xmlElement7.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test63"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.setData("");
    XmlElement xmlElement5 = new XmlElement("");
    xmlElement5.deleteObservers();
    XmlElement xmlElement8 = new XmlElement("");
    XmlElement xmlElement11 = xmlElement8.addSubElement("hi!", "");
    boolean b12 = xmlElement5.addElement(xmlElement11);
    java.lang.String str15 = xmlElement11.getAttribute("hi!", "hi!");
    XmlElement xmlElement16 = xmlElement1.removeElement(xmlElement11);
    int i17 = xmlElement1.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str18 = xmlElement1.getAttributes();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str20 = null;
    XmlElement xmlElement21 = new XmlElement("hi!", hashtable_str_str20);
    xmlElement21.deleteObservers();
    XmlElement xmlElement24 = xmlElement21.getElement("hi!");
    java.lang.String str25 = xmlElement21.getData();
    XmlElement xmlElement27 = new XmlElement("");
    XmlElement xmlElement30 = xmlElement27.addSubElement("hi!", "");
    xmlElement21.setParent(xmlElement30);
    xmlElement1.setParent(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test64"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    xmlElement2.deleteObservers();
    XmlElement xmlElement5 = xmlElement2.getElement("hi!");
    java.lang.String str6 = xmlElement2.getData();
    XmlElement xmlElement8 = new XmlElement("");
    XmlElement xmlElement11 = xmlElement8.addSubElement("hi!", "");
    xmlElement2.setParent(xmlElement11);
    XmlElement xmlElement14 = xmlElement2.getElement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement14);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test65"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    xmlElement2.deleteObservers();
    XmlElement xmlElement5 = xmlElement2.getElement("hi!");
    java.lang.String str6 = xmlElement2.getData();
    XmlElement xmlElement7 = xmlElement2.getParent();
    XmlElement xmlElement10 = xmlElement2.addSubElement("", "hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = null;
    XmlElement xmlElement13 = new XmlElement("hi!", hashtable_str_str12);
    xmlElement13.deleteObservers();
    XmlElement xmlElement16 = xmlElement13.getElement("hi!");
    java.lang.String str17 = xmlElement13.getData();
    XmlElement xmlElement19 = new XmlElement("");
    XmlElement xmlElement22 = xmlElement19.addSubElement("hi!", "");
    xmlElement13.setParent(xmlElement22);
    XmlElement xmlElement24 = xmlElement2.addSubElement(xmlElement13);
    int i25 = xmlElement24.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test66"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    xmlElement2.deleteObservers();
    XmlElement xmlElement5 = xmlElement2.getElement("hi!");
    java.lang.String str6 = xmlElement2.getData();
    XmlElement xmlElement7 = xmlElement2.getParent();
    XmlElement xmlElement10 = xmlElement2.addSubElement("", "hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = null;
    XmlElement xmlElement13 = new XmlElement("hi!", hashtable_str_str12);
    xmlElement13.deleteObservers();
    XmlElement xmlElement16 = xmlElement13.getElement("hi!");
    java.lang.String str17 = xmlElement13.getData();
    XmlElement xmlElement19 = new XmlElement("");
    XmlElement xmlElement22 = xmlElement19.addSubElement("hi!", "");
    xmlElement13.setParent(xmlElement22);
    XmlElement xmlElement24 = xmlElement2.addSubElement(xmlElement13);
    xmlElement24.setData("hi!");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str28 = xmlElement24.getAttribute("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test67"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    java.util.List list3 = xmlElement2.getElements();
    int i4 = xmlElement2.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test68"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.setData("");
    XmlElement xmlElement5 = new XmlElement("");
    xmlElement5.deleteObservers();
    XmlElement xmlElement8 = new XmlElement("");
    XmlElement xmlElement11 = xmlElement8.addSubElement("hi!", "");
    boolean b12 = xmlElement5.addElement(xmlElement11);
    java.lang.String str15 = xmlElement11.getAttribute("hi!", "hi!");
    XmlElement xmlElement16 = xmlElement1.removeElement(xmlElement11);
    int i17 = xmlElement1.countObservers();
    xmlElement1.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test69"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    xmlElement2.deleteObservers();
    XmlElement xmlElement5 = xmlElement2.getElement("hi!");
    java.lang.String str6 = xmlElement2.getData();
    XmlElement xmlElement7 = xmlElement2.getParent();
    XmlElement xmlElement10 = xmlElement2.addSubElement("", "hi!");
    int i11 = xmlElement10.count();
    XmlElement xmlElement13 = xmlElement10.getElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement13);

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test70"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test71"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    java.lang.String str5 = xmlElement2.getAttribute("hi!", "");
    XmlElement xmlElement7 = new XmlElement("");
    xmlElement7.deleteObservers();
    XmlElement xmlElement10 = new XmlElement("");
    XmlElement xmlElement13 = xmlElement10.addSubElement("hi!", "");
    boolean b14 = xmlElement7.addElement(xmlElement13);
    XmlElement xmlElement16 = new XmlElement("");
    xmlElement16.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement16.getAttributes();
    xmlElement7.setAttributes(hashtable_str_str19);
    XmlElement xmlElement22 = new XmlElement("");
    xmlElement22.deleteObservers();
    xmlElement7.insertElement(xmlElement22, (int)(byte)1);
    java.lang.Object obj26 = xmlElement7.clone();
    xmlElement2.append(xmlElement7);
    XmlElement xmlElement30 = xmlElement7.addSubElement("hi!", "");
    XmlElement xmlElement32 = new XmlElement("");
    xmlElement32.deleteObservers();
    XmlElement xmlElement35 = new XmlElement("");
    XmlElement xmlElement38 = xmlElement35.addSubElement("hi!", "");
    boolean b39 = xmlElement32.addElement(xmlElement38);
    XmlElement xmlElement41 = new XmlElement("");
    xmlElement41.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str44 = xmlElement41.getAttributes();
    xmlElement32.setAttributes(hashtable_str_str44);
    XmlElement xmlElement47 = new XmlElement("");
    xmlElement47.deleteObservers();
    xmlElement32.insertElement(xmlElement47, (int)(byte)1);
    java.lang.Object obj51 = xmlElement32.clone();
    XmlElement.printNode(xmlElement32, "hi!");
    XmlElement xmlElement54 = xmlElement30.removeElement(xmlElement32);
    // The following exception was thrown during execution in test generation
    try {
    xmlElement54.setData("");
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
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement54);

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test72"); }


    XmlElement xmlElement2 = new XmlElement("");
    xmlElement2.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = xmlElement2.getAttributes();
    XmlElement xmlElement6 = new XmlElement("hi!", hashtable_str_str5);
    XmlElement xmlElement7 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement6.append(xmlElement7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str5);

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test73"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.deleteObservers();
    XmlElement xmlElement4 = new XmlElement("");
    XmlElement xmlElement7 = xmlElement4.addSubElement("hi!", "");
    boolean b8 = xmlElement1.addElement(xmlElement7);
    XmlElement xmlElement10 = new XmlElement("");
    xmlElement10.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str13 = xmlElement10.getAttributes();
    xmlElement1.setAttributes(hashtable_str_str13);
    java.lang.String str15 = xmlElement1.getData();
    java.lang.Object obj18 = xmlElement1.addAttribute("", "hi!");
    java.util.Enumeration enumeration19 = xmlElement1.getAttributeNames();
    XmlElement xmlElement22 = xmlElement1.addSubElement("", "");
    java.util.Observer observer23 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement22.addObserver(observer23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test74"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = xmlElement2.addSubElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = xmlElement4.getAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str5);

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test75"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.setData("");
    XmlElement xmlElement5 = new XmlElement("");
    xmlElement5.deleteObservers();
    XmlElement xmlElement8 = new XmlElement("");
    XmlElement xmlElement11 = xmlElement8.addSubElement("hi!", "");
    boolean b12 = xmlElement5.addElement(xmlElement11);
    java.lang.String str15 = xmlElement11.getAttribute("hi!", "hi!");
    XmlElement xmlElement16 = xmlElement1.removeElement(xmlElement11);
    int i17 = xmlElement1.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str18 = xmlElement1.getAttributes();
    XmlElement xmlElement20 = new XmlElement("");
    xmlElement20.deleteObservers();
    XmlElement xmlElement23 = new XmlElement("");
    XmlElement xmlElement26 = xmlElement23.addSubElement("hi!", "");
    boolean b27 = xmlElement20.addElement(xmlElement26);
    XmlElement xmlElement29 = new XmlElement("");
    xmlElement29.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str32 = xmlElement29.getAttributes();
    xmlElement20.setAttributes(hashtable_str_str32);
    java.lang.String str34 = xmlElement20.getData();
    java.util.List list35 = xmlElement20.getElements();
    xmlElement1.notifyObservers((java.lang.Object)list35);
    xmlElement1.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list35);

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test76"); }


    XmlElement xmlElement1 = new XmlElement("");
    java.lang.Object obj2 = xmlElement1.clone();
    java.util.List list3 = xmlElement1.getElements();
    xmlElement1.setName("hi!");
    XmlElement xmlElement7 = new XmlElement("");
    xmlElement7.deleteObservers();
    xmlElement7.setName("hi!");
    xmlElement7.deleteObservers();
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test77"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.removeFromParent();
    XmlElement xmlElement4 = xmlElement1.addSubElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = null;
    XmlElement xmlElement7 = new XmlElement("hi!", hashtable_str_str6);
    xmlElement7.deleteObservers();
    XmlElement xmlElement10 = xmlElement7.getElement("hi!");
    java.lang.String str11 = xmlElement7.getData();
    xmlElement1.setParent(xmlElement7);
    java.util.Observer observer13 = null;
    xmlElement1.deleteObserver(observer13);
    java.util.Enumeration enumeration15 = xmlElement1.getAttributeNames();
    XmlElement xmlElement17 = new XmlElement("");
    xmlElement17.setData("");
    XmlElement xmlElement21 = new XmlElement("");
    xmlElement21.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("");
    XmlElement xmlElement27 = xmlElement24.addSubElement("hi!", "");
    boolean b28 = xmlElement21.addElement(xmlElement27);
    java.lang.String str31 = xmlElement27.getAttribute("hi!", "hi!");
    XmlElement xmlElement32 = xmlElement17.removeElement(xmlElement27);
    int i33 = xmlElement17.countObservers();
    xmlElement1.setParent(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test78"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.removeFromParent();
    XmlElement xmlElement4 = xmlElement1.addSubElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = null;
    XmlElement xmlElement7 = new XmlElement("hi!", hashtable_str_str6);
    xmlElement7.deleteObservers();
    XmlElement xmlElement10 = xmlElement7.getElement("hi!");
    java.lang.String str11 = xmlElement7.getData();
    xmlElement1.setParent(xmlElement7);
    java.lang.String str13 = xmlElement7.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test79"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = xmlElement2.addSubElement("");
    java.util.Observer observer5 = null;
    xmlElement4.deleteObserver(observer5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test80"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    xmlElement2.deleteObservers();
    XmlElement xmlElement5 = xmlElement2.getElement("hi!");
    xmlElement2.notifyObservers((java.lang.Object)(byte)10);
    XmlElement xmlElement9 = new XmlElement("");
    java.util.Observer observer10 = null;
    xmlElement9.deleteObserver(observer10);
    boolean b12 = xmlElement2.equals((java.lang.Object)observer10);
    xmlElement2.setData("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test81"); }


    XmlElement xmlElement1 = new XmlElement("");
    java.util.List list2 = xmlElement1.getElements();
    int i3 = xmlElement1.countObservers();
    XmlElement xmlElement4 = xmlElement1.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement4);

  }

  @Test
  public void test82() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test82"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    java.lang.String str5 = xmlElement2.getAttribute("hi!", "");
    XmlElement xmlElement7 = new XmlElement("");
    xmlElement7.deleteObservers();
    XmlElement xmlElement10 = new XmlElement("");
    XmlElement xmlElement13 = xmlElement10.addSubElement("hi!", "");
    boolean b14 = xmlElement7.addElement(xmlElement13);
    XmlElement xmlElement16 = new XmlElement("");
    xmlElement16.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement16.getAttributes();
    xmlElement7.setAttributes(hashtable_str_str19);
    XmlElement xmlElement22 = new XmlElement("");
    xmlElement22.deleteObservers();
    xmlElement7.insertElement(xmlElement22, (int)(byte)1);
    java.lang.Object obj26 = xmlElement7.clone();
    xmlElement2.append(xmlElement7);
    XmlElement xmlElement30 = xmlElement7.addSubElement("hi!", "");
    XmlElement xmlElement32 = new XmlElement("");
    xmlElement32.deleteObservers();
    XmlElement xmlElement35 = new XmlElement("");
    XmlElement xmlElement38 = xmlElement35.addSubElement("hi!", "");
    boolean b39 = xmlElement32.addElement(xmlElement38);
    XmlElement xmlElement41 = new XmlElement("");
    xmlElement41.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str44 = xmlElement41.getAttributes();
    xmlElement32.setAttributes(hashtable_str_str44);
    XmlElement xmlElement47 = new XmlElement("");
    xmlElement47.deleteObservers();
    xmlElement32.insertElement(xmlElement47, (int)(byte)1);
    java.lang.Object obj51 = xmlElement32.clone();
    XmlElement.printNode(xmlElement32, "hi!");
    XmlElement xmlElement54 = xmlElement30.removeElement(xmlElement32);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement56 = xmlElement30.getElement((int)(byte)1);
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
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement54);

  }

  @Test
  public void test83() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test83"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.setData("");
    java.lang.String str4 = xmlElement1.getName();
    XmlElement xmlElement7 = new XmlElement("", "");
    java.lang.String str10 = xmlElement7.getAttribute("hi!", "");
    XmlElement xmlElement12 = new XmlElement("");
    xmlElement12.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("");
    XmlElement xmlElement18 = xmlElement15.addSubElement("hi!", "");
    boolean b19 = xmlElement12.addElement(xmlElement18);
    XmlElement xmlElement21 = new XmlElement("");
    xmlElement21.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str24 = xmlElement21.getAttributes();
    xmlElement12.setAttributes(hashtable_str_str24);
    XmlElement xmlElement27 = new XmlElement("");
    xmlElement27.deleteObservers();
    xmlElement12.insertElement(xmlElement27, (int)(byte)1);
    java.lang.Object obj31 = xmlElement12.clone();
    xmlElement7.append(xmlElement12);
    xmlElement1.setParent(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj31);

  }

  @Test
  public void test84() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test84"); }


    XmlElement xmlElement3 = new XmlElement("");
    xmlElement3.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("");
    XmlElement xmlElement9 = xmlElement6.addSubElement("hi!", "");
    boolean b10 = xmlElement3.addElement(xmlElement9);
    XmlElement xmlElement12 = new XmlElement("");
    xmlElement12.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str15 = xmlElement12.getAttributes();
    xmlElement3.setAttributes(hashtable_str_str15);
    XmlElement xmlElement17 = new XmlElement("", hashtable_str_str15);
    XmlElement xmlElement18 = new XmlElement("", hashtable_str_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str15);

  }

  @Test
  public void test85() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test85"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.deleteObservers();
    XmlElement xmlElement4 = new XmlElement("");
    XmlElement xmlElement7 = xmlElement4.addSubElement("hi!", "");
    boolean b8 = xmlElement1.addElement(xmlElement7);
    XmlElement xmlElement10 = new XmlElement("");
    xmlElement10.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str13 = xmlElement10.getAttributes();
    xmlElement1.setAttributes(hashtable_str_str13);
    java.lang.String str15 = xmlElement1.getData();
    java.util.List list16 = xmlElement1.getElements();
    xmlElement1.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test86() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test86"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    java.lang.String str5 = xmlElement2.getAttribute("hi!", "");
    XmlElement xmlElement7 = new XmlElement("");
    xmlElement7.deleteObservers();
    XmlElement xmlElement10 = new XmlElement("");
    XmlElement xmlElement13 = xmlElement10.addSubElement("hi!", "");
    boolean b14 = xmlElement7.addElement(xmlElement13);
    XmlElement xmlElement16 = new XmlElement("");
    xmlElement16.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement16.getAttributes();
    xmlElement7.setAttributes(hashtable_str_str19);
    XmlElement xmlElement22 = new XmlElement("");
    xmlElement22.deleteObservers();
    xmlElement7.insertElement(xmlElement22, (int)(byte)1);
    java.lang.Object obj26 = xmlElement7.clone();
    xmlElement2.append(xmlElement7);
    XmlElement xmlElement30 = xmlElement7.addSubElement("hi!", "");
    int i31 = xmlElement7.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);

  }

  @Test
  public void test87() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test87"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.lang.String str3 = xmlElement2.getData();
    java.lang.Object obj4 = xmlElement2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);

  }

  @Test
  public void test88() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test88"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = xmlElement1.getAttributes();
    XmlElement.printNode(xmlElement1, "hi!");
    xmlElement1.notifyObservers((java.lang.Object)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str4);

  }

  @Test
  public void test89() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test89"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    java.lang.String str5 = xmlElement2.getAttribute("hi!", "");
    XmlElement xmlElement7 = new XmlElement("");
    xmlElement7.deleteObservers();
    XmlElement xmlElement10 = new XmlElement("");
    XmlElement xmlElement13 = xmlElement10.addSubElement("hi!", "");
    boolean b14 = xmlElement7.addElement(xmlElement13);
    XmlElement xmlElement16 = new XmlElement("");
    xmlElement16.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement16.getAttributes();
    xmlElement7.setAttributes(hashtable_str_str19);
    XmlElement xmlElement22 = new XmlElement("");
    xmlElement22.deleteObservers();
    xmlElement7.insertElement(xmlElement22, (int)(byte)1);
    java.lang.Object obj26 = xmlElement7.clone();
    xmlElement2.append(xmlElement7);
    XmlElement xmlElement30 = xmlElement7.addSubElement("hi!", "");
    XmlElement xmlElement32 = new XmlElement("");
    xmlElement32.deleteObservers();
    XmlElement xmlElement35 = new XmlElement("");
    XmlElement xmlElement38 = xmlElement35.addSubElement("hi!", "");
    boolean b39 = xmlElement32.addElement(xmlElement38);
    XmlElement xmlElement41 = new XmlElement("");
    xmlElement41.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str44 = xmlElement41.getAttributes();
    xmlElement32.setAttributes(hashtable_str_str44);
    XmlElement xmlElement47 = new XmlElement("");
    xmlElement47.deleteObservers();
    xmlElement32.insertElement(xmlElement47, (int)(byte)1);
    java.lang.Object obj51 = xmlElement32.clone();
    XmlElement.printNode(xmlElement32, "hi!");
    XmlElement xmlElement54 = xmlElement30.removeElement(xmlElement32);
    boolean b56 = xmlElement32.equals((java.lang.Object)(byte)100);
    XmlElement xmlElement59 = new XmlElement("", "");
    java.lang.String str62 = xmlElement59.getAttribute("hi!", "");
    XmlElement xmlElement64 = new XmlElement("");
    xmlElement64.deleteObservers();
    XmlElement xmlElement67 = new XmlElement("");
    XmlElement xmlElement70 = xmlElement67.addSubElement("hi!", "");
    boolean b71 = xmlElement64.addElement(xmlElement70);
    XmlElement xmlElement73 = new XmlElement("");
    xmlElement73.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str76 = xmlElement73.getAttributes();
    xmlElement64.setAttributes(hashtable_str_str76);
    XmlElement xmlElement79 = new XmlElement("");
    xmlElement79.deleteObservers();
    xmlElement64.insertElement(xmlElement79, (int)(byte)1);
    java.lang.Object obj83 = xmlElement64.clone();
    xmlElement59.append(xmlElement64);
    boolean b85 = xmlElement32.addElement(xmlElement64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + ""+ "'", str62.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);

  }

  @Test
  public void test90() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test90"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.setData("");
    XmlElement xmlElement5 = new XmlElement("");
    xmlElement5.deleteObservers();
    XmlElement xmlElement8 = new XmlElement("");
    XmlElement xmlElement11 = xmlElement8.addSubElement("hi!", "");
    boolean b12 = xmlElement5.addElement(xmlElement11);
    java.lang.String str15 = xmlElement11.getAttribute("hi!", "hi!");
    XmlElement xmlElement16 = xmlElement1.removeElement(xmlElement11);
    int i17 = xmlElement1.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str18 = xmlElement1.getAttributes();
    XmlElement xmlElement20 = new XmlElement("");
    xmlElement20.deleteObservers();
    XmlElement xmlElement23 = new XmlElement("");
    XmlElement xmlElement26 = xmlElement23.addSubElement("hi!", "");
    boolean b27 = xmlElement20.addElement(xmlElement26);
    XmlElement xmlElement29 = new XmlElement("");
    xmlElement29.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str32 = xmlElement29.getAttributes();
    xmlElement20.setAttributes(hashtable_str_str32);
    java.lang.String str34 = xmlElement20.getData();
    java.util.List list35 = xmlElement20.getElements();
    xmlElement1.notifyObservers((java.lang.Object)list35);
    XmlElement xmlElement38 = new XmlElement("");
    xmlElement38.deleteObservers();
    XmlElement xmlElement41 = new XmlElement("");
    XmlElement xmlElement44 = xmlElement41.addSubElement("hi!", "");
    boolean b45 = xmlElement38.addElement(xmlElement44);
    XmlElement xmlElement47 = new XmlElement("");
    xmlElement47.setName("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str50 = xmlElement47.getAttributes();
    xmlElement38.setAttributes(hashtable_str_str50);
    xmlElement1.setAttributes(hashtable_str_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str50);

  }

  @Test
  public void test91() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test91"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("hi!", "");
    xmlElement4.notifyObservers();
    xmlElement4.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);

  }

  @Test
  public void test92() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test92"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    xmlElement2.deleteObservers();
    java.lang.String str4 = xmlElement2.getData();
    xmlElement2.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test93() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test93"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.deleteObservers();
    XmlElement xmlElement4 = new XmlElement("");
    XmlElement xmlElement7 = xmlElement4.addSubElement("hi!", "");
    boolean b8 = xmlElement1.addElement(xmlElement7);
    java.util.Observer observer9 = null;
    xmlElement1.deleteObserver(observer9);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = xmlElement1.getAttributes();
    XmlElement xmlElement13 = xmlElement1.getElement("hi!");
    XmlElement xmlElement15 = new XmlElement("");
    java.util.Observer observer16 = null;
    xmlElement15.deleteObserver(observer16);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str18 = null;
    xmlElement15.setAttributes(hashtable_str_str18);
    XmlElement xmlElement21 = new XmlElement("");
    xmlElement21.deleteObservers();
    XmlElement xmlElement23 = xmlElement15.removeElement(xmlElement21);
    XmlElement xmlElement24 = xmlElement1.removeElement(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);

  }

}
