
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    int i5 = xmlElement1.countObservers();
    xmlElement1.notifyObservers((java.lang.Object)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    int i5 = xmlElement1.count();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement7 = xmlElement1.removeElement(1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.Object obj7 = xmlElement1.clone();
    xmlElement1.removeAllElements();
    XmlElement xmlElement11 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement13 = new XmlElement("");
    XmlElement xmlElement15 = new XmlElement("");
    xmlElement13.append(xmlElement15);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str17 = null;
    xmlElement13.setAttributes(hashtable_str_str17);
    java.lang.Object obj19 = xmlElement13.clone();
    xmlElement13.removeAllElements();
    XmlElement xmlElement21 = xmlElement1.removeElement(xmlElement13);
    java.util.Observer observer22 = null;
    xmlElement1.deleteObserver(observer22);
    java.util.Observer observer24 = null;
    xmlElement1.deleteObserver(observer24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    int i5 = xmlElement1.count();
    XmlElement xmlElement8 = xmlElement1.addSubElement("", "");
    java.util.Enumeration enumeration9 = xmlElement1.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    int i5 = xmlElement1.count();
    xmlElement1.removeFromParent();
    java.lang.Object obj9 = xmlElement1.addAttribute("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.Object obj7 = xmlElement1.clone();
    xmlElement1.removeAllElements();
    XmlElement xmlElement11 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement13 = new XmlElement("");
    XmlElement xmlElement15 = new XmlElement("");
    xmlElement13.append(xmlElement15);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str17 = null;
    xmlElement13.setAttributes(hashtable_str_str17);
    java.lang.Object obj19 = xmlElement13.clone();
    xmlElement13.removeAllElements();
    XmlElement xmlElement21 = xmlElement1.removeElement(xmlElement13);
    java.lang.String str22 = xmlElement1.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    XmlElement xmlElement2 = new XmlElement("", "hi!");
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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.Object obj7 = xmlElement1.clone();
    xmlElement1.removeAllElements();
    XmlElement xmlElement11 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement13 = new XmlElement("");
    XmlElement xmlElement15 = new XmlElement("");
    xmlElement13.append(xmlElement15);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str17 = null;
    xmlElement13.setAttributes(hashtable_str_str17);
    java.lang.Object obj19 = xmlElement13.clone();
    xmlElement13.removeAllElements();
    XmlElement xmlElement21 = xmlElement1.removeElement(xmlElement13);
    java.util.Observer observer22 = null;
    xmlElement1.deleteObserver(observer22);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement25 = xmlElement1.removeElement((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.Object obj7 = xmlElement1.clone();
    xmlElement1.removeAllElements();
    XmlElement xmlElement11 = xmlElement1.addSubElement("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = xmlElement11.getAttributes();
    int i13 = xmlElement11.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    XmlElement xmlElement0 = new XmlElement();
    XmlElement xmlElement2 = new XmlElement("");
    XmlElement xmlElement4 = new XmlElement("");
    xmlElement2.append(xmlElement4);
    XmlElement xmlElement7 = new XmlElement("");
    XmlElement xmlElement9 = new XmlElement("");
    xmlElement7.append(xmlElement9);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    xmlElement7.setAttributes(hashtable_str_str11);
    java.lang.Object obj13 = xmlElement7.clone();
    boolean b14 = xmlElement2.addElement(xmlElement7);
    // The following exception was thrown during execution in test generation
    try {
    xmlElement0.insertElement(xmlElement2, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    XmlElement xmlElement6 = new XmlElement("");
    XmlElement xmlElement8 = new XmlElement("");
    xmlElement6.append(xmlElement8);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = null;
    xmlElement6.setAttributes(hashtable_str_str10);
    java.lang.Object obj12 = xmlElement6.clone();
    boolean b13 = xmlElement1.addElement(xmlElement6);
    XmlElement xmlElement15 = new XmlElement("");
    XmlElement xmlElement17 = new XmlElement("");
    xmlElement15.append(xmlElement17);
    int i19 = xmlElement15.count();
    XmlElement xmlElement22 = xmlElement15.addSubElement("", "");
    xmlElement22.setName("hi!");
    xmlElement22.notifyObservers();
    XmlElement xmlElement26 = xmlElement6.addSubElement(xmlElement22);
    java.util.List list27 = xmlElement22.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list27);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    int i5 = xmlElement1.count();
    XmlElement xmlElement8 = xmlElement1.addSubElement("", "");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement10 = xmlElement8.removeElement((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    XmlElement xmlElement2 = new XmlElement("", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement4 = xmlElement2.removeElement((int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    xmlElement2.setData("");
    xmlElement2.setData("");
    java.lang.String str8 = xmlElement2.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    XmlElement xmlElement1 = new XmlElement("hi!");

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    xmlElement2.setData("");
    java.lang.String str6 = xmlElement2.getData();
    XmlElement xmlElement8 = xmlElement2.getElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement8);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    int i5 = xmlElement1.count();
    XmlElement xmlElement8 = xmlElement1.addSubElement("", "");
    xmlElement8.setName("hi!");
    XmlElement xmlElement13 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str14 = xmlElement13.getAttributes();
    xmlElement8.setAttributes(hashtable_str_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str14);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.String str7 = xmlElement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    XmlElement xmlElement8 = new XmlElement("");
    XmlElement xmlElement10 = new XmlElement("");
    xmlElement8.append(xmlElement10);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = null;
    xmlElement8.setAttributes(hashtable_str_str12);
    java.lang.Object obj14 = xmlElement8.clone();
    xmlElement1.setParent(xmlElement8);
    java.util.Observer observer16 = null;
    xmlElement8.deleteObserver(observer16);
    XmlElement xmlElement19 = new XmlElement("");
    XmlElement xmlElement21 = new XmlElement("");
    xmlElement19.append(xmlElement21);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str23 = null;
    xmlElement19.setAttributes(hashtable_str_str23);
    java.lang.Object obj25 = xmlElement19.clone();
    xmlElement19.removeAllElements();
    XmlElement xmlElement29 = xmlElement19.addSubElement("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str30 = xmlElement29.getAttributes();
    xmlElement8.setAttributes(hashtable_str_str30);
    java.util.Enumeration enumeration32 = xmlElement8.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration32);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    int i5 = xmlElement1.countObservers();
    XmlElement xmlElement7 = xmlElement1.getElement("hi!");
    xmlElement1.setData("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement7);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    XmlElement xmlElement1 = new XmlElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str2 = null;
    xmlElement1.setAttributes(hashtable_str_str2);
    xmlElement1.setName("");
    XmlElement xmlElement6 = xmlElement1.getParent();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement8 = xmlElement6.removeElement(10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement6);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    XmlElement xmlElement8 = new XmlElement("");
    XmlElement xmlElement10 = new XmlElement("");
    xmlElement8.append(xmlElement10);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = null;
    xmlElement8.setAttributes(hashtable_str_str12);
    java.lang.Object obj14 = xmlElement8.clone();
    xmlElement1.setParent(xmlElement8);
    java.util.Observer observer16 = null;
    xmlElement8.deleteObserver(observer16);
    XmlElement xmlElement19 = xmlElement8.getElement((int)(short)0);
    XmlElement xmlElement21 = new XmlElement("");
    XmlElement xmlElement23 = new XmlElement("");
    xmlElement21.append(xmlElement23);
    xmlElement8.append(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement19);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.Object obj7 = xmlElement1.clone();
    xmlElement1.removeAllElements();
    XmlElement xmlElement11 = xmlElement1.addSubElement("", "");
    java.util.List list12 = xmlElement11.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = xmlElement1.getAttributes();
    XmlElement.printNode(xmlElement1, "hi!");
    java.util.List list8 = xmlElement1.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.Object obj7 = xmlElement1.clone();
    xmlElement1.removeAllElements();
    XmlElement xmlElement11 = xmlElement1.addSubElement("", "");
    boolean b12 = xmlElement11.hasChanged();
    XmlElement xmlElement14 = xmlElement11.getElement("");
    // The following exception was thrown during execution in test generation
    try {
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str15 = xmlElement14.getAttributes();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement14);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.Object obj7 = xmlElement1.clone();
    xmlElement1.removeAllElements();
    XmlElement xmlElement10 = new XmlElement("");
    XmlElement xmlElement12 = new XmlElement("");
    xmlElement10.append(xmlElement12);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str14 = null;
    xmlElement10.setAttributes(hashtable_str_str14);
    java.lang.Object obj16 = xmlElement10.clone();
    xmlElement10.removeAllElements();
    XmlElement xmlElement20 = xmlElement10.addSubElement("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = xmlElement20.getAttributes();
    xmlElement1.setAttributes(hashtable_str_str21);
    XmlElement xmlElement23 = xmlElement1.getParent();
    java.util.List list24 = xmlElement1.getElements();
    XmlElement xmlElement26 = new XmlElement("");
    XmlElement xmlElement28 = new XmlElement("");
    xmlElement26.append(xmlElement28);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str30 = null;
    xmlElement26.setAttributes(hashtable_str_str30);
    java.lang.Object obj32 = xmlElement26.clone();
    xmlElement26.removeAllElements();
    XmlElement xmlElement36 = xmlElement26.addSubElement("", "");
    XmlElement xmlElement38 = new XmlElement("");
    XmlElement xmlElement40 = new XmlElement("");
    xmlElement38.append(xmlElement40);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str42 = null;
    xmlElement38.setAttributes(hashtable_str_str42);
    java.lang.Object obj44 = xmlElement38.clone();
    xmlElement38.removeAllElements();
    XmlElement xmlElement46 = xmlElement26.removeElement(xmlElement38);
    xmlElement1.notifyObservers((java.lang.Object)xmlElement38);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj50 = xmlElement38.addAttribute("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement46);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    XmlElement xmlElement6 = new XmlElement("");
    XmlElement xmlElement8 = new XmlElement("");
    xmlElement6.append(xmlElement8);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = null;
    xmlElement6.setAttributes(hashtable_str_str10);
    java.lang.Object obj12 = xmlElement6.clone();
    boolean b13 = xmlElement1.addElement(xmlElement6);
    XmlElement xmlElement15 = new XmlElement("");
    XmlElement xmlElement17 = new XmlElement("");
    xmlElement15.append(xmlElement17);
    int i19 = xmlElement15.count();
    XmlElement xmlElement22 = xmlElement15.addSubElement("", "");
    xmlElement22.setName("hi!");
    xmlElement22.notifyObservers();
    XmlElement xmlElement26 = xmlElement6.addSubElement(xmlElement22);
    xmlElement6.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    XmlElement xmlElement6 = xmlElement1.addSubElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.setData("");
    boolean b4 = xmlElement1.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.Object obj7 = xmlElement1.clone();
    xmlElement1.removeAllElements();
    XmlElement xmlElement11 = xmlElement1.addSubElement("", "");
    xmlElement11.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.Object obj7 = xmlElement1.clone();
    xmlElement1.removeAllElements();
    XmlElement xmlElement11 = xmlElement1.addSubElement("", "");
    java.lang.String str12 = xmlElement1.getData();
    java.util.Observer observer13 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement1.addObserver(observer13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    xmlElement2.setData("");
    java.lang.String str6 = xmlElement2.getData();
    int i7 = xmlElement2.count();
    java.lang.String str8 = xmlElement2.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    xmlElement2.setData("");
    XmlElement xmlElement7 = new XmlElement("");
    XmlElement xmlElement9 = new XmlElement("");
    xmlElement7.append(xmlElement9);
    int i11 = xmlElement7.countObservers();
    java.util.List list12 = xmlElement7.getElements();
    XmlElement xmlElement14 = new XmlElement("");
    XmlElement xmlElement16 = new XmlElement("");
    xmlElement14.append(xmlElement16);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str18 = null;
    xmlElement14.setAttributes(hashtable_str_str18);
    java.lang.Object obj20 = xmlElement14.clone();
    xmlElement14.removeAllElements();
    XmlElement xmlElement23 = new XmlElement("");
    XmlElement xmlElement25 = new XmlElement("");
    xmlElement23.append(xmlElement25);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str27 = null;
    xmlElement23.setAttributes(hashtable_str_str27);
    java.lang.Object obj29 = xmlElement23.clone();
    xmlElement23.removeAllElements();
    XmlElement xmlElement33 = xmlElement23.addSubElement("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str34 = xmlElement33.getAttributes();
    xmlElement14.setAttributes(hashtable_str_str34);
    XmlElement xmlElement36 = xmlElement14.getParent();
    java.util.List list37 = xmlElement14.getElements();
    XmlElement xmlElement39 = new XmlElement("");
    XmlElement xmlElement41 = new XmlElement("");
    xmlElement39.append(xmlElement41);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str43 = null;
    xmlElement39.setAttributes(hashtable_str_str43);
    java.lang.Object obj45 = xmlElement39.clone();
    xmlElement39.removeAllElements();
    XmlElement xmlElement49 = xmlElement39.addSubElement("", "");
    XmlElement xmlElement51 = new XmlElement("");
    XmlElement xmlElement53 = new XmlElement("");
    xmlElement51.append(xmlElement53);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str55 = null;
    xmlElement51.setAttributes(hashtable_str_str55);
    java.lang.Object obj57 = xmlElement51.clone();
    xmlElement51.removeAllElements();
    XmlElement xmlElement59 = xmlElement39.removeElement(xmlElement51);
    xmlElement14.notifyObservers((java.lang.Object)xmlElement51);
    XmlElement xmlElement62 = xmlElement14.getElement("hi!");
    XmlElement xmlElement63 = xmlElement7.removeElement(xmlElement14);
    XmlElement xmlElement65 = xmlElement7.addSubElement("");
    xmlElement2.setParent(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement65);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    XmlElement xmlElement8 = new XmlElement("");
    XmlElement xmlElement10 = new XmlElement("");
    xmlElement8.append(xmlElement10);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = null;
    xmlElement8.setAttributes(hashtable_str_str12);
    java.lang.Object obj14 = xmlElement8.clone();
    xmlElement1.setParent(xmlElement8);
    java.util.Observer observer16 = null;
    xmlElement8.deleteObserver(observer16);
    XmlElement xmlElement19 = new XmlElement("");
    XmlElement xmlElement21 = new XmlElement("");
    xmlElement19.append(xmlElement21);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str23 = null;
    xmlElement19.setAttributes(hashtable_str_str23);
    java.lang.Object obj25 = xmlElement19.clone();
    xmlElement19.removeAllElements();
    XmlElement xmlElement29 = xmlElement19.addSubElement("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str30 = xmlElement29.getAttributes();
    xmlElement8.setAttributes(hashtable_str_str30);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str32 = xmlElement8.getAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str32);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    XmlElement xmlElement9 = xmlElement1.addSubElement("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement9);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    xmlElement2.setData("");
    java.lang.String str6 = xmlElement2.getData();
    int i7 = xmlElement2.count();
    XmlElement xmlElement9 = new XmlElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = null;
    xmlElement9.setAttributes(hashtable_str_str10);
    xmlElement9.setName("");
    XmlElement xmlElement15 = new XmlElement("");
    XmlElement xmlElement17 = new XmlElement("");
    xmlElement15.append(xmlElement17);
    int i19 = xmlElement15.countObservers();
    java.util.Enumeration enumeration20 = xmlElement15.getAttributeNames();
    boolean b21 = xmlElement9.equals((java.lang.Object)xmlElement15);
    XmlElement xmlElement22 = xmlElement2.addSubElement(xmlElement15);
    xmlElement22.removeFromParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    XmlElement xmlElement1 = new XmlElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str2 = null;
    xmlElement1.setAttributes(hashtable_str_str2);
    xmlElement1.setName("");
    XmlElement xmlElement7 = new XmlElement("");
    XmlElement xmlElement9 = new XmlElement("");
    xmlElement7.append(xmlElement9);
    int i11 = xmlElement7.countObservers();
    java.util.Enumeration enumeration12 = xmlElement7.getAttributeNames();
    boolean b13 = xmlElement1.equals((java.lang.Object)xmlElement7);
    XmlElement xmlElement15 = new XmlElement("");
    XmlElement xmlElement17 = new XmlElement("");
    xmlElement15.append(xmlElement17);
    int i19 = xmlElement15.count();
    XmlElement xmlElement22 = xmlElement15.addSubElement("", "");
    int i23 = xmlElement22.countObservers();
    XmlElement xmlElement24 = xmlElement7.removeElement(xmlElement22);
    int i25 = xmlElement24.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.Object obj7 = xmlElement1.clone();
    XmlElement xmlElement9 = xmlElement1.getElement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement9);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.lang.String str4 = xmlElement2.getAttribute("");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement6 = xmlElement2.getElement((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    int i5 = xmlElement1.countObservers();
    XmlElement xmlElement7 = xmlElement1.getElement("hi!");
    // The following exception was thrown during execution in test generation
    try {
    xmlElement7.removeFromParent();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement7);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    XmlElement xmlElement1 = new XmlElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str2 = null;
    xmlElement1.setAttributes(hashtable_str_str2);
    xmlElement1.setName("");
    XmlElement xmlElement7 = new XmlElement("");
    XmlElement xmlElement9 = new XmlElement("");
    xmlElement7.append(xmlElement9);
    int i11 = xmlElement7.countObservers();
    java.util.Enumeration enumeration12 = xmlElement7.getAttributeNames();
    boolean b13 = xmlElement1.equals((java.lang.Object)xmlElement7);
    int i14 = xmlElement1.count();
    XmlElement xmlElement17 = xmlElement1.addSubElement("hi!", "hi!");
    int i18 = xmlElement1.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.Object obj7 = xmlElement1.clone();
    xmlElement1.removeAllElements();
    XmlElement xmlElement10 = new XmlElement("");
    XmlElement xmlElement12 = new XmlElement("");
    xmlElement10.append(xmlElement12);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str14 = null;
    xmlElement10.setAttributes(hashtable_str_str14);
    java.lang.Object obj16 = xmlElement10.clone();
    xmlElement10.removeAllElements();
    XmlElement xmlElement20 = xmlElement10.addSubElement("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = xmlElement20.getAttributes();
    xmlElement1.setAttributes(hashtable_str_str21);
    XmlElement xmlElement23 = xmlElement1.getParent();
    java.util.List list24 = xmlElement1.getElements();
    XmlElement xmlElement26 = new XmlElement("");
    XmlElement xmlElement28 = new XmlElement("");
    xmlElement26.append(xmlElement28);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str30 = null;
    xmlElement26.setAttributes(hashtable_str_str30);
    java.lang.Object obj32 = xmlElement26.clone();
    xmlElement26.removeAllElements();
    XmlElement xmlElement36 = xmlElement26.addSubElement("", "");
    XmlElement xmlElement38 = new XmlElement("");
    XmlElement xmlElement40 = new XmlElement("");
    xmlElement38.append(xmlElement40);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str42 = null;
    xmlElement38.setAttributes(hashtable_str_str42);
    java.lang.Object obj44 = xmlElement38.clone();
    xmlElement38.removeAllElements();
    XmlElement xmlElement46 = xmlElement26.removeElement(xmlElement38);
    xmlElement1.notifyObservers((java.lang.Object)xmlElement38);
    xmlElement1.removeFromParent();
    XmlElement xmlElement50 = new XmlElement("");
    XmlElement xmlElement52 = new XmlElement("");
    xmlElement50.append(xmlElement52);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str54 = null;
    xmlElement50.setAttributes(hashtable_str_str54);
    java.lang.Object obj56 = xmlElement50.clone();
    xmlElement50.removeAllElements();
    XmlElement xmlElement60 = xmlElement50.addSubElement("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str61 = xmlElement60.getAttributes();
    // The following exception was thrown during execution in test generation
    try {
    xmlElement1.insertElement(xmlElement60, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str61);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    XmlElement xmlElement9 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    xmlElement9.setData("");
    java.lang.String str13 = xmlElement9.getData();
    int i14 = xmlElement9.count();
    XmlElement xmlElement16 = new XmlElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str17 = null;
    xmlElement16.setAttributes(hashtable_str_str17);
    xmlElement16.setName("");
    XmlElement xmlElement22 = new XmlElement("");
    XmlElement xmlElement24 = new XmlElement("");
    xmlElement22.append(xmlElement24);
    int i26 = xmlElement22.countObservers();
    java.util.Enumeration enumeration27 = xmlElement22.getAttributeNames();
    boolean b28 = xmlElement16.equals((java.lang.Object)xmlElement22);
    XmlElement xmlElement29 = xmlElement9.addSubElement(xmlElement22);
    java.lang.String str30 = xmlElement9.getData();
    XmlElement xmlElement31 = xmlElement1.addSubElement(xmlElement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement31);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.Object obj7 = xmlElement1.clone();
    xmlElement1.removeAllElements();
    XmlElement xmlElement10 = new XmlElement("");
    XmlElement xmlElement12 = new XmlElement("");
    xmlElement10.append(xmlElement12);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str14 = null;
    xmlElement10.setAttributes(hashtable_str_str14);
    java.lang.Object obj16 = xmlElement10.clone();
    xmlElement10.removeAllElements();
    XmlElement xmlElement20 = xmlElement10.addSubElement("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = xmlElement20.getAttributes();
    xmlElement1.setAttributes(hashtable_str_str21);
    XmlElement xmlElement23 = xmlElement1.getParent();
    java.util.List list24 = xmlElement1.getElements();
    XmlElement xmlElement26 = new XmlElement("");
    XmlElement xmlElement28 = new XmlElement("");
    xmlElement26.append(xmlElement28);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str30 = null;
    xmlElement26.setAttributes(hashtable_str_str30);
    java.lang.Object obj32 = xmlElement26.clone();
    xmlElement26.removeAllElements();
    XmlElement xmlElement36 = xmlElement26.addSubElement("", "");
    XmlElement xmlElement38 = new XmlElement("");
    XmlElement xmlElement40 = new XmlElement("");
    xmlElement38.append(xmlElement40);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str42 = null;
    xmlElement38.setAttributes(hashtable_str_str42);
    java.lang.Object obj44 = xmlElement38.clone();
    xmlElement38.removeAllElements();
    XmlElement xmlElement46 = xmlElement26.removeElement(xmlElement38);
    xmlElement1.notifyObservers((java.lang.Object)xmlElement38);
    XmlElement xmlElement48 = null;
    XmlElement xmlElement49 = xmlElement1.removeElement(xmlElement48);
    // The following exception was thrown during execution in test generation
    try {
    int i50 = xmlElement49.countObservers();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement49);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    XmlElement xmlElement1 = new XmlElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str2 = null;
    xmlElement1.setAttributes(hashtable_str_str2);
    xmlElement1.setName("");
    XmlElement xmlElement7 = new XmlElement("");
    XmlElement xmlElement9 = new XmlElement("");
    xmlElement7.append(xmlElement9);
    int i11 = xmlElement7.countObservers();
    java.util.Enumeration enumeration12 = xmlElement7.getAttributeNames();
    boolean b13 = xmlElement1.equals((java.lang.Object)xmlElement7);
    XmlElement xmlElement14 = xmlElement1.getParent();
    java.util.Observer observer15 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement14.deleteObserver(observer15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement14);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.Object obj7 = xmlElement1.clone();
    xmlElement1.removeAllElements();
    XmlElement xmlElement11 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement13 = new XmlElement("");
    XmlElement xmlElement15 = new XmlElement("");
    xmlElement13.append(xmlElement15);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str17 = null;
    xmlElement13.setAttributes(hashtable_str_str17);
    java.lang.Object obj19 = xmlElement13.clone();
    xmlElement13.removeAllElements();
    XmlElement xmlElement21 = xmlElement1.removeElement(xmlElement13);
    XmlElement xmlElement23 = new XmlElement("");
    XmlElement xmlElement25 = new XmlElement("");
    xmlElement23.append(xmlElement25);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str27 = null;
    xmlElement23.setAttributes(hashtable_str_str27);
    java.lang.Object obj29 = xmlElement23.clone();
    xmlElement23.removeAllElements();
    XmlElement xmlElement33 = xmlElement23.addSubElement("", "");
    XmlElement xmlElement35 = new XmlElement("");
    XmlElement xmlElement37 = new XmlElement("");
    xmlElement35.append(xmlElement37);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str39 = null;
    xmlElement35.setAttributes(hashtable_str_str39);
    java.lang.Object obj41 = xmlElement35.clone();
    xmlElement35.removeAllElements();
    XmlElement xmlElement43 = xmlElement23.removeElement(xmlElement35);
    java.util.Observer observer44 = null;
    xmlElement23.deleteObserver(observer44);
    xmlElement1.notifyObservers((java.lang.Object)xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement43);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    xmlElement2.setData("");
    java.lang.String str6 = xmlElement2.getData();
    int i7 = xmlElement2.count();
    XmlElement xmlElement9 = new XmlElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = null;
    xmlElement9.setAttributes(hashtable_str_str10);
    xmlElement9.setName("");
    XmlElement xmlElement15 = new XmlElement("");
    XmlElement xmlElement17 = new XmlElement("");
    xmlElement15.append(xmlElement17);
    int i19 = xmlElement15.countObservers();
    java.util.Enumeration enumeration20 = xmlElement15.getAttributeNames();
    boolean b21 = xmlElement9.equals((java.lang.Object)xmlElement15);
    XmlElement xmlElement22 = xmlElement2.addSubElement(xmlElement15);
    java.util.Enumeration enumeration23 = xmlElement2.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration23);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }


    XmlElement xmlElement1 = new XmlElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str2 = null;
    xmlElement1.setAttributes(hashtable_str_str2);
    xmlElement1.setName("");
    int i6 = xmlElement1.countObservers();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement8 = xmlElement1.getElement((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }


    XmlElement xmlElement1 = new XmlElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str2 = null;
    xmlElement1.setAttributes(hashtable_str_str2);
    xmlElement1.setName("");
    XmlElement xmlElement7 = new XmlElement("");
    XmlElement xmlElement9 = new XmlElement("");
    xmlElement7.append(xmlElement9);
    int i11 = xmlElement7.countObservers();
    java.util.Enumeration enumeration12 = xmlElement7.getAttributeNames();
    boolean b13 = xmlElement1.equals((java.lang.Object)xmlElement7);
    XmlElement xmlElement16 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str17 = xmlElement16.getAttributes();
    xmlElement16.setData("");
    java.lang.String str20 = xmlElement16.getData();
    int i21 = xmlElement16.count();
    XmlElement xmlElement23 = new XmlElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str24 = null;
    xmlElement23.setAttributes(hashtable_str_str24);
    xmlElement23.setName("");
    XmlElement xmlElement29 = new XmlElement("");
    XmlElement xmlElement31 = new XmlElement("");
    xmlElement29.append(xmlElement31);
    int i33 = xmlElement29.countObservers();
    java.util.Enumeration enumeration34 = xmlElement29.getAttributeNames();
    boolean b35 = xmlElement23.equals((java.lang.Object)xmlElement29);
    XmlElement xmlElement36 = xmlElement16.addSubElement(xmlElement29);
    boolean b37 = xmlElement1.addElement(xmlElement29);
    XmlElement xmlElement39 = xmlElement29.removeElement((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement39);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.Object obj7 = xmlElement1.clone();
    xmlElement1.removeAllElements();
    XmlElement xmlElement10 = new XmlElement("");
    XmlElement xmlElement12 = new XmlElement("");
    xmlElement10.append(xmlElement12);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str14 = null;
    xmlElement10.setAttributes(hashtable_str_str14);
    java.lang.Object obj16 = xmlElement10.clone();
    xmlElement10.removeAllElements();
    XmlElement xmlElement20 = xmlElement10.addSubElement("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = xmlElement20.getAttributes();
    xmlElement1.setAttributes(hashtable_str_str21);
    XmlElement xmlElement23 = xmlElement1.getParent();
    java.util.List list24 = xmlElement1.getElements();
    java.lang.String str25 = xmlElement1.getName();
    java.util.List list26 = xmlElement1.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list26);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.Object obj7 = xmlElement1.clone();
    xmlElement1.removeAllElements();
    XmlElement xmlElement10 = new XmlElement("");
    XmlElement xmlElement12 = new XmlElement("");
    xmlElement10.append(xmlElement12);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str14 = null;
    xmlElement10.setAttributes(hashtable_str_str14);
    java.lang.Object obj16 = xmlElement10.clone();
    xmlElement10.removeAllElements();
    XmlElement xmlElement20 = xmlElement10.addSubElement("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = xmlElement20.getAttributes();
    xmlElement1.setAttributes(hashtable_str_str21);
    XmlElement xmlElement23 = xmlElement1.getParent();
    java.util.Enumeration enumeration24 = xmlElement1.getAttributeNames();
    int i25 = xmlElement1.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    int i5 = xmlElement1.countObservers();
    java.util.List list6 = xmlElement1.getElements();
    XmlElement xmlElement10 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = xmlElement10.getAttributes();
    XmlElement xmlElement12 = new XmlElement("hi!", hashtable_str_str11);
    xmlElement1.setAttributes(hashtable_str_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str11);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    xmlElement2.setData("");
    java.lang.String str6 = xmlElement2.getData();
    int i7 = xmlElement2.count();
    XmlElement xmlElement9 = new XmlElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = null;
    xmlElement9.setAttributes(hashtable_str_str10);
    xmlElement9.setName("");
    XmlElement xmlElement15 = new XmlElement("");
    XmlElement xmlElement17 = new XmlElement("");
    xmlElement15.append(xmlElement17);
    int i19 = xmlElement15.countObservers();
    java.util.Enumeration enumeration20 = xmlElement15.getAttributeNames();
    boolean b21 = xmlElement9.equals((java.lang.Object)xmlElement15);
    XmlElement xmlElement22 = xmlElement2.addSubElement(xmlElement15);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str23 = xmlElement15.getAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str23);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.Object obj7 = xmlElement1.clone();
    xmlElement1.setData("hi!");
    xmlElement1.deleteObservers();
    XmlElement xmlElement12 = new XmlElement("");
    XmlElement xmlElement14 = new XmlElement("");
    xmlElement12.append(xmlElement14);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = null;
    xmlElement12.setAttributes(hashtable_str_str16);
    XmlElement xmlElement19 = new XmlElement("");
    XmlElement xmlElement21 = new XmlElement("");
    xmlElement19.append(xmlElement21);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str23 = null;
    xmlElement19.setAttributes(hashtable_str_str23);
    java.lang.Object obj25 = xmlElement19.clone();
    xmlElement12.setParent(xmlElement19);
    java.util.Observer observer27 = null;
    xmlElement19.deleteObserver(observer27);
    XmlElement xmlElement30 = xmlElement19.getElement((int)(short)0);
    boolean b31 = xmlElement1.addElement(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.Object obj7 = xmlElement1.clone();
    xmlElement1.removeAllElements();
    XmlElement xmlElement11 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement13 = new XmlElement("");
    XmlElement xmlElement15 = new XmlElement("");
    xmlElement13.append(xmlElement15);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str17 = null;
    xmlElement13.setAttributes(hashtable_str_str17);
    java.lang.Object obj19 = xmlElement13.clone();
    xmlElement13.removeAllElements();
    XmlElement xmlElement21 = xmlElement1.removeElement(xmlElement13);
    java.lang.Object obj22 = null;
    xmlElement21.notifyObservers(obj22);
    xmlElement21.deleteObservers();
    XmlElement xmlElement25 = xmlElement21.getParent();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement27 = xmlElement25.getElement(1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement25);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.Object obj7 = xmlElement1.clone();
    xmlElement1.removeAllElements();
    XmlElement xmlElement10 = new XmlElement("");
    XmlElement xmlElement12 = new XmlElement("");
    xmlElement10.append(xmlElement12);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str14 = null;
    xmlElement10.setAttributes(hashtable_str_str14);
    java.lang.Object obj16 = xmlElement10.clone();
    xmlElement10.removeAllElements();
    XmlElement xmlElement20 = xmlElement10.addSubElement("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = xmlElement20.getAttributes();
    xmlElement1.setAttributes(hashtable_str_str21);
    XmlElement xmlElement23 = xmlElement1.getParent();
    java.util.List list24 = xmlElement1.getElements();
    XmlElement xmlElement26 = new XmlElement("");
    XmlElement xmlElement28 = new XmlElement("");
    xmlElement26.append(xmlElement28);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str30 = null;
    xmlElement26.setAttributes(hashtable_str_str30);
    java.lang.Object obj32 = xmlElement26.clone();
    xmlElement26.removeAllElements();
    XmlElement xmlElement36 = xmlElement26.addSubElement("", "");
    XmlElement xmlElement38 = new XmlElement("");
    XmlElement xmlElement40 = new XmlElement("");
    xmlElement38.append(xmlElement40);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str42 = null;
    xmlElement38.setAttributes(hashtable_str_str42);
    java.lang.Object obj44 = xmlElement38.clone();
    xmlElement38.removeAllElements();
    XmlElement xmlElement46 = xmlElement26.removeElement(xmlElement38);
    xmlElement1.notifyObservers((java.lang.Object)xmlElement38);
    XmlElement xmlElement48 = null;
    XmlElement xmlElement49 = xmlElement1.removeElement(xmlElement48);
    // The following exception was thrown during execution in test generation
    try {
    xmlElement49.setData("");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement49);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.Object obj7 = xmlElement1.clone();
    xmlElement1.removeAllElements();
    XmlElement xmlElement11 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement13 = new XmlElement("");
    XmlElement xmlElement15 = new XmlElement("");
    xmlElement13.append(xmlElement15);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str17 = null;
    xmlElement13.setAttributes(hashtable_str_str17);
    java.lang.Object obj19 = xmlElement13.clone();
    xmlElement13.removeAllElements();
    XmlElement xmlElement21 = xmlElement1.removeElement(xmlElement13);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj24 = xmlElement13.addAttribute("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test58"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.Object obj7 = xmlElement1.clone();
    xmlElement1.removeAllElements();
    XmlElement xmlElement11 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement12 = xmlElement11.getParent();
    XmlElement xmlElement14 = new XmlElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str15 = null;
    xmlElement14.setAttributes(hashtable_str_str15);
    xmlElement14.setName("");
    int i19 = xmlElement14.countObservers();
    boolean b20 = xmlElement12.equals((java.lang.Object)i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test59"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    int i5 = xmlElement1.countObservers();
    java.util.List list6 = xmlElement1.getElements();
    XmlElement xmlElement8 = new XmlElement("");
    XmlElement xmlElement10 = new XmlElement("");
    xmlElement8.append(xmlElement10);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = null;
    xmlElement8.setAttributes(hashtable_str_str12);
    java.lang.Object obj14 = xmlElement8.clone();
    xmlElement8.removeAllElements();
    XmlElement xmlElement17 = new XmlElement("");
    XmlElement xmlElement19 = new XmlElement("");
    xmlElement17.append(xmlElement19);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = null;
    xmlElement17.setAttributes(hashtable_str_str21);
    java.lang.Object obj23 = xmlElement17.clone();
    xmlElement17.removeAllElements();
    XmlElement xmlElement27 = xmlElement17.addSubElement("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str28 = xmlElement27.getAttributes();
    xmlElement8.setAttributes(hashtable_str_str28);
    XmlElement xmlElement30 = xmlElement8.getParent();
    java.util.List list31 = xmlElement8.getElements();
    XmlElement xmlElement33 = new XmlElement("");
    XmlElement xmlElement35 = new XmlElement("");
    xmlElement33.append(xmlElement35);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str37 = null;
    xmlElement33.setAttributes(hashtable_str_str37);
    java.lang.Object obj39 = xmlElement33.clone();
    xmlElement33.removeAllElements();
    XmlElement xmlElement43 = xmlElement33.addSubElement("", "");
    XmlElement xmlElement45 = new XmlElement("");
    XmlElement xmlElement47 = new XmlElement("");
    xmlElement45.append(xmlElement47);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str49 = null;
    xmlElement45.setAttributes(hashtable_str_str49);
    java.lang.Object obj51 = xmlElement45.clone();
    xmlElement45.removeAllElements();
    XmlElement xmlElement53 = xmlElement33.removeElement(xmlElement45);
    xmlElement8.notifyObservers((java.lang.Object)xmlElement45);
    XmlElement xmlElement56 = xmlElement8.getElement("hi!");
    XmlElement xmlElement57 = xmlElement1.removeElement(xmlElement8);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement59 = xmlElement8.getElement((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement57);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test60"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement.printNode(xmlElement2, "hi!");
    XmlElement xmlElement6 = new XmlElement("");
    XmlElement xmlElement8 = new XmlElement("");
    xmlElement6.append(xmlElement8);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = null;
    xmlElement6.setAttributes(hashtable_str_str10);
    xmlElement2.notifyObservers((java.lang.Object)hashtable_str_str10);
    XmlElement xmlElement15 = xmlElement2.addSubElement("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test61"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    XmlElement xmlElement8 = new XmlElement("");
    XmlElement xmlElement10 = new XmlElement("");
    xmlElement8.append(xmlElement10);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = null;
    xmlElement8.setAttributes(hashtable_str_str12);
    java.lang.Object obj14 = xmlElement8.clone();
    xmlElement1.setParent(xmlElement8);
    java.util.Observer observer16 = null;
    xmlElement8.deleteObserver(observer16);
    XmlElement xmlElement19 = new XmlElement("");
    XmlElement xmlElement21 = new XmlElement("");
    xmlElement19.append(xmlElement21);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str23 = null;
    xmlElement19.setAttributes(hashtable_str_str23);
    java.lang.Object obj25 = xmlElement19.clone();
    xmlElement19.removeAllElements();
    XmlElement xmlElement29 = xmlElement19.addSubElement("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str30 = xmlElement29.getAttributes();
    xmlElement8.setAttributes(hashtable_str_str30);
    XmlElement xmlElement32 = null;
    xmlElement8.setParent(xmlElement32);
    boolean b34 = xmlElement8.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test62"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    XmlElement xmlElement8 = new XmlElement("");
    XmlElement xmlElement10 = new XmlElement("");
    xmlElement8.append(xmlElement10);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = null;
    xmlElement8.setAttributes(hashtable_str_str12);
    java.lang.Object obj14 = xmlElement8.clone();
    xmlElement1.setParent(xmlElement8);
    java.util.Observer observer16 = null;
    xmlElement8.deleteObserver(observer16);
    XmlElement xmlElement19 = xmlElement8.addSubElement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement19);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test63"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    int i5 = xmlElement3.countObservers();
    java.util.Observer observer6 = null;
    xmlElement3.deleteObserver(observer6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test64"); }


    XmlElement xmlElement3 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = xmlElement3.getAttributes();
    XmlElement xmlElement5 = new XmlElement("hi!", hashtable_str_str4);
    XmlElement xmlElement7 = new XmlElement("");
    XmlElement xmlElement9 = new XmlElement("");
    xmlElement7.append(xmlElement9);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = null;
    xmlElement7.setAttributes(hashtable_str_str11);
    java.lang.Object obj13 = xmlElement7.clone();
    xmlElement7.removeAllElements();
    XmlElement xmlElement17 = xmlElement7.addSubElement("", "");
    XmlElement xmlElement19 = new XmlElement("");
    XmlElement xmlElement21 = new XmlElement("");
    xmlElement19.append(xmlElement21);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str23 = null;
    xmlElement19.setAttributes(hashtable_str_str23);
    java.lang.Object obj25 = xmlElement19.clone();
    xmlElement19.removeAllElements();
    XmlElement xmlElement27 = xmlElement7.removeElement(xmlElement19);
    // The following exception was thrown during execution in test generation
    try {
    xmlElement5.insertElement(xmlElement19, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test65"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    int i5 = xmlElement1.countObservers();
    java.util.List list6 = xmlElement1.getElements();
    XmlElement xmlElement8 = new XmlElement("");
    XmlElement xmlElement10 = new XmlElement("");
    xmlElement8.append(xmlElement10);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = null;
    xmlElement8.setAttributes(hashtable_str_str12);
    java.lang.Object obj14 = xmlElement8.clone();
    xmlElement8.removeAllElements();
    XmlElement xmlElement17 = new XmlElement("");
    XmlElement xmlElement19 = new XmlElement("");
    xmlElement17.append(xmlElement19);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = null;
    xmlElement17.setAttributes(hashtable_str_str21);
    java.lang.Object obj23 = xmlElement17.clone();
    xmlElement17.removeAllElements();
    XmlElement xmlElement27 = xmlElement17.addSubElement("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str28 = xmlElement27.getAttributes();
    xmlElement8.setAttributes(hashtable_str_str28);
    XmlElement xmlElement30 = xmlElement8.getParent();
    java.util.List list31 = xmlElement8.getElements();
    XmlElement xmlElement33 = new XmlElement("");
    XmlElement xmlElement35 = new XmlElement("");
    xmlElement33.append(xmlElement35);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str37 = null;
    xmlElement33.setAttributes(hashtable_str_str37);
    java.lang.Object obj39 = xmlElement33.clone();
    xmlElement33.removeAllElements();
    XmlElement xmlElement43 = xmlElement33.addSubElement("", "");
    XmlElement xmlElement45 = new XmlElement("");
    XmlElement xmlElement47 = new XmlElement("");
    xmlElement45.append(xmlElement47);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str49 = null;
    xmlElement45.setAttributes(hashtable_str_str49);
    java.lang.Object obj51 = xmlElement45.clone();
    xmlElement45.removeAllElements();
    XmlElement xmlElement53 = xmlElement33.removeElement(xmlElement45);
    xmlElement8.notifyObservers((java.lang.Object)xmlElement45);
    XmlElement xmlElement56 = xmlElement8.getElement("hi!");
    XmlElement xmlElement57 = xmlElement1.removeElement(xmlElement8);
    XmlElement xmlElement59 = xmlElement1.addSubElement("");
    java.lang.String str60 = xmlElement1.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + ""+ "'", str60.equals(""));

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test66"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    xmlElement2.setData("");
    java.lang.String str6 = xmlElement2.getData();
    int i7 = xmlElement2.count();
    XmlElement xmlElement9 = new XmlElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = null;
    xmlElement9.setAttributes(hashtable_str_str10);
    xmlElement9.setName("");
    XmlElement xmlElement15 = new XmlElement("");
    XmlElement xmlElement17 = new XmlElement("");
    xmlElement15.append(xmlElement17);
    int i19 = xmlElement15.countObservers();
    java.util.Enumeration enumeration20 = xmlElement15.getAttributeNames();
    boolean b21 = xmlElement9.equals((java.lang.Object)xmlElement15);
    XmlElement xmlElement22 = xmlElement2.addSubElement(xmlElement15);
    XmlElement xmlElement24 = xmlElement2.addSubElement("");
    XmlElement xmlElement26 = xmlElement2.addSubElement("");
    java.util.Observer observer27 = null;
    xmlElement2.deleteObserver(observer27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test67"); }


    XmlElement xmlElement1 = new XmlElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str2 = null;
    xmlElement1.setAttributes(hashtable_str_str2);
    xmlElement1.setName("");
    XmlElement xmlElement7 = new XmlElement("");
    XmlElement xmlElement9 = new XmlElement("");
    xmlElement7.append(xmlElement9);
    int i11 = xmlElement7.countObservers();
    java.util.Enumeration enumeration12 = xmlElement7.getAttributeNames();
    boolean b13 = xmlElement1.equals((java.lang.Object)xmlElement7);
    XmlElement xmlElement15 = new XmlElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = null;
    xmlElement15.setAttributes(hashtable_str_str16);
    xmlElement1.setParent(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test68"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    xmlElement2.setData("");
    java.lang.String str6 = xmlElement2.getData();
    int i7 = xmlElement2.count();
    XmlElement xmlElement9 = new XmlElement("");
    XmlElement xmlElement11 = new XmlElement("");
    xmlElement9.append(xmlElement11);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str13 = null;
    xmlElement9.setAttributes(hashtable_str_str13);
    java.lang.Object obj15 = xmlElement9.clone();
    int i16 = xmlElement9.countObservers();
    java.lang.String str17 = xmlElement9.getData();
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement9);
    XmlElement xmlElement19 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement2.insertElement(xmlElement19, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test69"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    xmlElement2.setData("");
    java.lang.String str6 = xmlElement2.getData();
    int i7 = xmlElement2.count();
    XmlElement xmlElement9 = new XmlElement("");
    XmlElement xmlElement11 = new XmlElement("");
    xmlElement9.append(xmlElement11);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str13 = null;
    xmlElement9.setAttributes(hashtable_str_str13);
    java.lang.Object obj15 = xmlElement9.clone();
    int i16 = xmlElement9.countObservers();
    java.lang.String str17 = xmlElement9.getData();
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement9);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement9.getAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashtable_str_str19);

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test70"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement.printNode(xmlElement2, "hi!");
    XmlElement xmlElement6 = new XmlElement("");
    XmlElement xmlElement8 = new XmlElement("");
    xmlElement6.append(xmlElement8);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = null;
    xmlElement6.setAttributes(hashtable_str_str10);
    xmlElement2.notifyObservers((java.lang.Object)hashtable_str_str10);
    XmlElement xmlElement14 = xmlElement2.addSubElement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement14);

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test71"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    java.lang.String str5 = xmlElement2.getAttribute("");
    int i6 = xmlElement2.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test72"); }


    XmlElement xmlElement1 = new XmlElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str2 = null;
    xmlElement1.setAttributes(hashtable_str_str2);
    xmlElement1.setName("");
    int i6 = xmlElement1.countObservers();
    xmlElement1.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test73"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement.printNode(xmlElement2, "hi!");
    java.util.Enumeration enumeration5 = xmlElement2.getAttributeNames();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement2.getAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test74"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    XmlElement xmlElement6 = new XmlElement("");
    XmlElement xmlElement8 = new XmlElement("");
    xmlElement6.append(xmlElement8);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = null;
    xmlElement6.setAttributes(hashtable_str_str10);
    java.lang.Object obj12 = xmlElement6.clone();
    boolean b13 = xmlElement1.addElement(xmlElement6);
    XmlElement xmlElement15 = new XmlElement("");
    XmlElement xmlElement17 = new XmlElement("");
    xmlElement15.append(xmlElement17);
    int i19 = xmlElement15.count();
    XmlElement xmlElement22 = xmlElement15.addSubElement("", "");
    xmlElement22.setName("hi!");
    xmlElement22.notifyObservers();
    XmlElement xmlElement26 = xmlElement6.addSubElement(xmlElement22);
    XmlElement xmlElement29 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str30 = xmlElement29.getAttributes();
    xmlElement29.setData("");
    java.lang.String str33 = xmlElement29.getData();
    int i34 = xmlElement29.count();
    XmlElement xmlElement37 = xmlElement29.addSubElement("", "");
    xmlElement22.setParent(xmlElement37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement37);

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test75"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.Object obj7 = xmlElement1.clone();
    xmlElement1.removeAllElements();
    XmlElement xmlElement10 = new XmlElement("");
    XmlElement xmlElement12 = new XmlElement("");
    xmlElement10.append(xmlElement12);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str14 = null;
    xmlElement10.setAttributes(hashtable_str_str14);
    java.lang.Object obj16 = xmlElement10.clone();
    xmlElement10.removeAllElements();
    XmlElement xmlElement20 = xmlElement10.addSubElement("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = xmlElement20.getAttributes();
    xmlElement1.setAttributes(hashtable_str_str21);
    XmlElement xmlElement23 = xmlElement1.getParent();
    java.util.List list24 = xmlElement1.getElements();
    java.lang.String str25 = xmlElement1.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = xmlElement1.getAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str26);

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test76"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.Object obj7 = xmlElement1.clone();
    xmlElement1.removeAllElements();
    XmlElement xmlElement10 = new XmlElement("");
    XmlElement xmlElement12 = new XmlElement("");
    xmlElement10.append(xmlElement12);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str14 = null;
    xmlElement10.setAttributes(hashtable_str_str14);
    java.lang.Object obj16 = xmlElement10.clone();
    xmlElement10.removeAllElements();
    XmlElement xmlElement20 = xmlElement10.addSubElement("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = xmlElement20.getAttributes();
    xmlElement1.setAttributes(hashtable_str_str21);
    XmlElement xmlElement23 = xmlElement1.getParent();
    xmlElement1.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement23);

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test77"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement.printNode(xmlElement2, "hi!");
    XmlElement xmlElement6 = new XmlElement("");
    XmlElement xmlElement8 = new XmlElement("");
    xmlElement6.append(xmlElement8);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = null;
    xmlElement6.setAttributes(hashtable_str_str10);
    xmlElement2.notifyObservers((java.lang.Object)hashtable_str_str10);
    XmlElement xmlElement15 = xmlElement2.addSubElement("hi!", "hi!");
    XmlElement xmlElement17 = new XmlElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str18 = null;
    xmlElement17.setAttributes(hashtable_str_str18);
    xmlElement17.setName("");
    XmlElement xmlElement23 = new XmlElement("");
    XmlElement xmlElement25 = new XmlElement("");
    xmlElement23.append(xmlElement25);
    int i27 = xmlElement23.countObservers();
    java.util.Enumeration enumeration28 = xmlElement23.getAttributeNames();
    boolean b29 = xmlElement17.equals((java.lang.Object)xmlElement23);
    int i30 = xmlElement17.count();
    xmlElement15.append(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test78"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement.printNode(xmlElement2, "hi!");
    java.util.Enumeration enumeration5 = xmlElement2.getAttributeNames();
    int i6 = xmlElement2.count();
    xmlElement2.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test79"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    int i5 = xmlElement1.count();
    XmlElement xmlElement8 = xmlElement1.addSubElement("", "");
    xmlElement8.setName("hi!");
    xmlElement8.notifyObservers();
    xmlElement8.setName("");
    int i14 = xmlElement8.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test80"); }


    XmlElement xmlElement2 = new XmlElement("");
    XmlElement xmlElement4 = new XmlElement("");
    xmlElement2.append(xmlElement4);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = null;
    xmlElement2.setAttributes(hashtable_str_str6);
    java.lang.Object obj8 = xmlElement2.clone();
    xmlElement2.removeAllElements();
    XmlElement xmlElement12 = xmlElement2.addSubElement("", "");
    XmlElement xmlElement14 = new XmlElement("");
    XmlElement xmlElement16 = new XmlElement("");
    xmlElement14.append(xmlElement16);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str18 = null;
    xmlElement14.setAttributes(hashtable_str_str18);
    java.lang.Object obj20 = xmlElement14.clone();
    xmlElement14.removeAllElements();
    XmlElement xmlElement22 = xmlElement2.removeElement(xmlElement14);
    java.lang.Object obj23 = null;
    xmlElement22.notifyObservers(obj23);
    XmlElement xmlElement28 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str29 = xmlElement28.getAttributes();
    XmlElement xmlElement30 = new XmlElement("hi!", hashtable_str_str29);
    xmlElement22.setAttributes(hashtable_str_str29);
    XmlElement xmlElement32 = new XmlElement("", hashtable_str_str29);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement34 = xmlElement32.removeElement((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str29);

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test81"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.Object obj7 = xmlElement1.clone();
    xmlElement1.removeAllElements();
    XmlElement xmlElement11 = xmlElement1.addSubElement("", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = xmlElement11.getAttributes();
    XmlElement xmlElement15 = xmlElement11.addSubElement("hi!", "");
    java.lang.String str17 = xmlElement15.getAttribute("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test82() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test82"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("");
    xmlElement1.append(xmlElement3);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = null;
    xmlElement1.setAttributes(hashtable_str_str5);
    java.lang.Object obj7 = xmlElement1.clone();
    xmlElement1.removeAllElements();
    XmlElement xmlElement11 = xmlElement1.addSubElement("", "");
    java.util.List list12 = xmlElement1.getElements();
    java.lang.String str13 = xmlElement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

}
