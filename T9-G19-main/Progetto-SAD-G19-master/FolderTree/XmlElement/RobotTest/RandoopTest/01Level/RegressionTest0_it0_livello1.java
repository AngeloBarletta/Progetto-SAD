
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    xmlElement2.deleteObservers();

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    java.lang.String str7 = xmlElement5.getData();
    java.lang.String str9 = xmlElement5.getAttribute("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    java.lang.String str7 = xmlElement5.getData();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement9 = xmlElement5.getElement((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    XmlElement xmlElement8 = new XmlElement("hi!", "");
    xmlElement5.setParent(xmlElement8);
    java.lang.String str10 = xmlElement8.getData();
    int i11 = xmlElement8.count();
    XmlElement xmlElement12 = xmlElement2.addSubElement(xmlElement8);
    xmlElement12.deleteObservers();
    java.util.Enumeration enumeration14 = xmlElement12.getAttributeNames();
    java.lang.Object obj15 = xmlElement12.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    XmlElement xmlElement1 = new XmlElement("hi!");

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj3 = xmlElement0.addAttribute("", "hi!");
    XmlElement xmlElement5 = xmlElement0.addSubElement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    XmlElement xmlElement3 = new XmlElement("hi!", "");
    XmlElement xmlElement6 = new XmlElement("hi!", "");
    xmlElement3.setParent(xmlElement6);
    XmlElement xmlElement10 = new XmlElement("hi!", "");
    XmlElement xmlElement13 = new XmlElement("hi!", "");
    xmlElement10.setParent(xmlElement13);
    java.lang.String str15 = xmlElement13.getData();
    int i16 = xmlElement13.count();
    XmlElement xmlElement17 = xmlElement3.removeElement(xmlElement13);
    XmlElement xmlElement20 = new XmlElement("hi!", "");
    XmlElement xmlElement23 = new XmlElement("hi!", "");
    xmlElement20.setParent(xmlElement23);
    java.lang.String str25 = xmlElement23.getData();
    XmlElement xmlElement28 = new XmlElement("hi!", "");
    XmlElement xmlElement31 = new XmlElement("hi!", "");
    xmlElement28.setParent(xmlElement31);
    java.lang.String str33 = xmlElement31.getData();
    xmlElement23.setParent(xmlElement31);
    XmlElement xmlElement37 = new XmlElement("hi!", "");
    XmlElement xmlElement38 = xmlElement23.removeElement(xmlElement37);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str39 = xmlElement23.getAttributes();
    xmlElement3.setAttributes(hashtable_str_str39);
    XmlElement xmlElement41 = new XmlElement("hi!", hashtable_str_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str39);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    XmlElement xmlElement9 = new XmlElement("hi!", "");
    XmlElement xmlElement12 = new XmlElement("hi!", "");
    xmlElement9.setParent(xmlElement12);
    java.lang.String str14 = xmlElement12.getData();
    int i15 = xmlElement12.count();
    XmlElement xmlElement16 = xmlElement2.removeElement(xmlElement12);
    // The following exception was thrown during execution in test generation
    try {
    xmlElement16.setData("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    java.lang.String str7 = xmlElement5.getData();
    XmlElement xmlElement10 = xmlElement5.addSubElement("hi!", "");
    XmlElement xmlElement13 = new XmlElement("hi!", "");
    XmlElement xmlElement16 = new XmlElement("hi!", "");
    XmlElement xmlElement19 = new XmlElement("hi!", "");
    xmlElement16.setParent(xmlElement19);
    java.lang.String str21 = xmlElement19.getData();
    int i22 = xmlElement19.count();
    XmlElement xmlElement23 = xmlElement13.addSubElement(xmlElement19);
    boolean b24 = xmlElement10.equals((java.lang.Object)xmlElement19);
    java.util.List list25 = xmlElement19.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list25);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    XmlElement xmlElement9 = new XmlElement("hi!", "");
    XmlElement xmlElement12 = new XmlElement("hi!", "");
    xmlElement9.setParent(xmlElement12);
    java.lang.String str14 = xmlElement12.getData();
    int i15 = xmlElement12.count();
    XmlElement xmlElement16 = xmlElement2.removeElement(xmlElement12);
    XmlElement xmlElement19 = new XmlElement("hi!", "");
    XmlElement xmlElement22 = new XmlElement("hi!", "");
    xmlElement19.setParent(xmlElement22);
    java.lang.String str24 = xmlElement22.getData();
    XmlElement xmlElement27 = new XmlElement("hi!", "");
    XmlElement xmlElement30 = new XmlElement("hi!", "");
    xmlElement27.setParent(xmlElement30);
    java.lang.String str32 = xmlElement30.getData();
    xmlElement22.setParent(xmlElement30);
    XmlElement xmlElement36 = new XmlElement("hi!", "");
    XmlElement xmlElement37 = xmlElement22.removeElement(xmlElement36);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str38 = xmlElement22.getAttributes();
    xmlElement2.setAttributes(hashtable_str_str38);
    java.lang.String str40 = xmlElement2.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + ""+ "'", str40.equals(""));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    XmlElement xmlElement8 = new XmlElement("hi!", "");
    xmlElement5.setParent(xmlElement8);
    java.lang.String str10 = xmlElement8.getData();
    int i11 = xmlElement8.count();
    XmlElement xmlElement12 = xmlElement2.addSubElement(xmlElement8);
    xmlElement12.deleteObservers();
    java.util.Enumeration enumeration14 = xmlElement12.getAttributeNames();
    XmlElement xmlElement17 = new XmlElement("hi!", "");
    XmlElement xmlElement20 = new XmlElement("hi!", "");
    xmlElement17.setParent(xmlElement20);
    java.lang.String str22 = xmlElement20.getData();
    int i23 = xmlElement20.count();
    // The following exception was thrown during execution in test generation
    try {
    xmlElement12.insertElement(xmlElement20, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    XmlElement xmlElement8 = new XmlElement("hi!", "");
    xmlElement5.setParent(xmlElement8);
    java.lang.String str12 = xmlElement5.getAttribute("", "hi!");
    XmlElement.printNode(xmlElement5, "hi!");
    xmlElement2.setParent(xmlElement5);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement17 = xmlElement2.removeElement(1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    XmlElement xmlElement9 = new XmlElement("hi!", "");
    XmlElement xmlElement12 = new XmlElement("hi!", "");
    xmlElement9.setParent(xmlElement12);
    java.lang.String str14 = xmlElement12.getData();
    int i15 = xmlElement12.count();
    XmlElement xmlElement16 = xmlElement2.removeElement(xmlElement12);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement18 = xmlElement12.getElement((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    XmlElement xmlElement8 = new XmlElement("hi!", "");
    xmlElement5.setParent(xmlElement8);
    java.lang.String str12 = xmlElement5.getAttribute("", "hi!");
    XmlElement.printNode(xmlElement5, "hi!");
    xmlElement2.setParent(xmlElement5);
    XmlElement xmlElement18 = new XmlElement("hi!", "");
    XmlElement xmlElement21 = new XmlElement("hi!", "");
    xmlElement18.setParent(xmlElement21);
    XmlElement xmlElement25 = new XmlElement("hi!", "");
    XmlElement xmlElement28 = new XmlElement("hi!", "");
    xmlElement25.setParent(xmlElement28);
    java.lang.String str30 = xmlElement28.getData();
    int i31 = xmlElement28.count();
    XmlElement xmlElement32 = xmlElement18.removeElement(xmlElement28);
    java.util.List list33 = xmlElement18.getElements();
    // The following exception was thrown during execution in test generation
    try {
    xmlElement2.insertElement(xmlElement18, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list33);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    java.lang.Object obj9 = xmlElement2.addAttribute("", "hi!");
    xmlElement2.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("");
    java.util.Observer observer5 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement4.addObserver(observer5);
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
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    java.lang.Object obj3 = null;
    xmlElement2.notifyObservers(obj3);
    XmlElement.printNode(xmlElement2, "");

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("");
    XmlElement xmlElement7 = new XmlElement("hi!", "");
    XmlElement xmlElement10 = new XmlElement("hi!", "");
    XmlElement xmlElement13 = new XmlElement("hi!", "");
    xmlElement10.setParent(xmlElement13);
    java.lang.String str15 = xmlElement13.getData();
    int i16 = xmlElement13.count();
    XmlElement xmlElement17 = xmlElement7.addSubElement(xmlElement13);
    xmlElement4.setParent(xmlElement13);
    java.lang.Object obj19 = xmlElement13.clone();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement21 = xmlElement13.removeElement(1);
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    XmlElement xmlElement1 = new XmlElement("");

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("", hashtable_str_str1);
    XmlElement xmlElement4 = xmlElement2.addSubElement("");
    XmlElement xmlElement6 = xmlElement4.getElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement6);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement4 = xmlElement2.getElement((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    XmlElement xmlElement3 = new XmlElement("hi!", "");
    XmlElement xmlElement6 = new XmlElement("hi!", "");
    xmlElement3.setParent(xmlElement6);
    java.lang.String str10 = xmlElement3.getAttribute("", "hi!");
    XmlElement.printNode(xmlElement3, "hi!");
    XmlElement xmlElement15 = new XmlElement("hi!", "");
    XmlElement xmlElement18 = new XmlElement("hi!", "");
    xmlElement15.setParent(xmlElement18);
    java.lang.String str20 = xmlElement18.getData();
    XmlElement xmlElement23 = new XmlElement("hi!", "");
    XmlElement xmlElement26 = new XmlElement("hi!", "");
    xmlElement23.setParent(xmlElement26);
    java.lang.String str28 = xmlElement26.getData();
    xmlElement18.setParent(xmlElement26);
    XmlElement xmlElement32 = new XmlElement("hi!", "");
    XmlElement xmlElement33 = xmlElement18.removeElement(xmlElement32);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str34 = xmlElement18.getAttributes();
    xmlElement3.setAttributes(hashtable_str_str34);
    XmlElement xmlElement36 = new XmlElement("", hashtable_str_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str34);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    XmlElement xmlElement9 = new XmlElement("hi!", "");
    XmlElement xmlElement12 = new XmlElement("hi!", "");
    xmlElement9.setParent(xmlElement12);
    java.lang.String str14 = xmlElement12.getData();
    int i15 = xmlElement12.count();
    XmlElement xmlElement16 = xmlElement2.removeElement(xmlElement12);
    XmlElement xmlElement19 = new XmlElement("hi!", "");
    XmlElement xmlElement22 = new XmlElement("hi!", "");
    xmlElement19.setParent(xmlElement22);
    java.lang.String str24 = xmlElement22.getData();
    XmlElement xmlElement27 = new XmlElement("hi!", "");
    XmlElement xmlElement30 = new XmlElement("hi!", "");
    xmlElement27.setParent(xmlElement30);
    java.lang.String str32 = xmlElement30.getData();
    xmlElement22.setParent(xmlElement30);
    XmlElement xmlElement36 = new XmlElement("hi!", "");
    XmlElement xmlElement37 = xmlElement22.removeElement(xmlElement36);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str38 = xmlElement22.getAttributes();
    xmlElement2.setAttributes(hashtable_str_str38);
    XmlElement xmlElement42 = new XmlElement("hi!", "");
    XmlElement xmlElement45 = new XmlElement("hi!", "");
    XmlElement xmlElement48 = new XmlElement("hi!", "");
    xmlElement45.setParent(xmlElement48);
    java.lang.String str50 = xmlElement48.getData();
    int i51 = xmlElement48.count();
    XmlElement xmlElement52 = xmlElement42.addSubElement(xmlElement48);
    XmlElement xmlElement53 = xmlElement2.removeElement(xmlElement52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + ""+ "'", str50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement53);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    XmlElement.printNode(xmlElement5, "");

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("", hashtable_str_str1);
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    XmlElement xmlElement8 = new XmlElement("hi!", "");
    xmlElement5.setParent(xmlElement8);
    XmlElement xmlElement12 = xmlElement8.addSubElement("", "");
    xmlElement2.insertElement(xmlElement12, 0);
    java.lang.Object obj15 = xmlElement2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    java.util.List list7 = xmlElement5.getElements();
    java.lang.String str10 = xmlElement5.getAttribute("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    XmlElement xmlElement9 = xmlElement5.addSubElement("", "");
    XmlElement.printNode(xmlElement9, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement9);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("", hashtable_str_str1);
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    XmlElement xmlElement8 = new XmlElement("hi!", "");
    xmlElement5.setParent(xmlElement8);
    XmlElement xmlElement12 = xmlElement8.addSubElement("", "");
    xmlElement2.insertElement(xmlElement12, 0);
    XmlElement xmlElement17 = new XmlElement("hi!", "");
    XmlElement xmlElement20 = new XmlElement("hi!", "");
    XmlElement xmlElement23 = new XmlElement("hi!", "");
    xmlElement20.setParent(xmlElement23);
    java.lang.String str25 = xmlElement23.getData();
    int i26 = xmlElement23.count();
    XmlElement xmlElement27 = xmlElement17.addSubElement(xmlElement23);
    xmlElement27.deleteObservers();
    // The following exception was thrown during execution in test generation
    try {
    xmlElement2.insertElement(xmlElement27, (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    java.lang.String str7 = xmlElement5.getData();
    XmlElement xmlElement10 = new XmlElement("hi!", "");
    XmlElement xmlElement13 = new XmlElement("hi!", "");
    xmlElement10.setParent(xmlElement13);
    java.lang.String str15 = xmlElement13.getData();
    xmlElement5.setParent(xmlElement13);
    xmlElement5.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("");
    XmlElement xmlElement7 = new XmlElement("hi!", "");
    XmlElement xmlElement10 = new XmlElement("hi!", "");
    XmlElement xmlElement13 = new XmlElement("hi!", "");
    xmlElement10.setParent(xmlElement13);
    java.lang.String str15 = xmlElement13.getData();
    int i16 = xmlElement13.count();
    XmlElement xmlElement17 = xmlElement7.addSubElement(xmlElement13);
    xmlElement4.setParent(xmlElement13);
    java.lang.Object obj19 = xmlElement13.clone();
    xmlElement13.removeAllElements();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement22 = xmlElement13.getElement((int)(byte)1);
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    xmlElement2.setData("");

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("", hashtable_str_str1);
    XmlElement xmlElement4 = xmlElement2.addSubElement("");
    XmlElement xmlElement5 = null;
    XmlElement xmlElement6 = xmlElement4.removeElement(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement6);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    java.lang.String str9 = xmlElement2.getAttribute("", "hi!");
    XmlElement.printNode(xmlElement2, "hi!");
    java.util.List list12 = xmlElement2.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    XmlElement xmlElement8 = new XmlElement("hi!", "");
    xmlElement5.setParent(xmlElement8);
    java.lang.String str10 = xmlElement8.getData();
    int i11 = xmlElement8.count();
    XmlElement xmlElement12 = xmlElement2.addSubElement(xmlElement8);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement14 = xmlElement8.getElement((int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("");
    XmlElement xmlElement7 = new XmlElement("hi!", "");
    XmlElement xmlElement10 = new XmlElement("hi!", "");
    XmlElement xmlElement13 = new XmlElement("hi!", "");
    xmlElement10.setParent(xmlElement13);
    java.lang.String str15 = xmlElement13.getData();
    int i16 = xmlElement13.count();
    XmlElement xmlElement17 = xmlElement7.addSubElement(xmlElement13);
    xmlElement4.setParent(xmlElement13);
    java.lang.Object obj19 = xmlElement13.clone();
    xmlElement13.removeAllElements();
    java.lang.String str23 = xmlElement13.getAttribute("", "");
    XmlElement xmlElement26 = new XmlElement("hi!", "");
    XmlElement xmlElement29 = new XmlElement("hi!", "");
    xmlElement26.setParent(xmlElement29);
    java.lang.String str33 = xmlElement26.getAttribute("", "hi!");
    XmlElement.printNode(xmlElement26, "hi!");
    XmlElement xmlElement38 = new XmlElement("hi!", "");
    XmlElement xmlElement41 = new XmlElement("hi!", "");
    xmlElement38.setParent(xmlElement41);
    java.lang.String str43 = xmlElement41.getData();
    XmlElement xmlElement46 = new XmlElement("hi!", "");
    XmlElement xmlElement49 = new XmlElement("hi!", "");
    xmlElement46.setParent(xmlElement49);
    java.lang.String str51 = xmlElement49.getData();
    xmlElement41.setParent(xmlElement49);
    XmlElement xmlElement55 = new XmlElement("hi!", "");
    XmlElement xmlElement56 = xmlElement41.removeElement(xmlElement55);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str57 = xmlElement41.getAttributes();
    xmlElement26.setAttributes(hashtable_str_str57);
    xmlElement13.setAttributes(hashtable_str_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + ""+ "'", str43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + ""+ "'", str51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str57);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    java.lang.String str7 = xmlElement5.getData();
    int i8 = xmlElement5.count();
    XmlElement xmlElement11 = new XmlElement("hi!", "");
    XmlElement xmlElement14 = new XmlElement("hi!", "");
    xmlElement11.setParent(xmlElement14);
    xmlElement5.append(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    XmlElement xmlElement9 = new XmlElement("hi!", "");
    XmlElement xmlElement12 = new XmlElement("hi!", "");
    xmlElement9.setParent(xmlElement12);
    java.lang.String str14 = xmlElement12.getData();
    int i15 = xmlElement12.count();
    XmlElement xmlElement16 = xmlElement2.removeElement(xmlElement12);
    java.lang.String str17 = xmlElement2.getData();
    XmlElement xmlElement20 = new XmlElement("hi!", "");
    XmlElement xmlElement23 = new XmlElement("hi!", "");
    xmlElement20.setParent(xmlElement23);
    XmlElement xmlElement27 = new XmlElement("hi!", "");
    XmlElement xmlElement30 = new XmlElement("hi!", "");
    xmlElement27.setParent(xmlElement30);
    java.lang.String str32 = xmlElement30.getData();
    int i33 = xmlElement30.count();
    XmlElement xmlElement34 = xmlElement20.removeElement(xmlElement30);
    XmlElement xmlElement37 = new XmlElement("hi!", "");
    XmlElement xmlElement40 = new XmlElement("hi!", "");
    xmlElement37.setParent(xmlElement40);
    java.lang.String str42 = xmlElement40.getData();
    XmlElement xmlElement45 = new XmlElement("hi!", "");
    XmlElement xmlElement48 = new XmlElement("hi!", "");
    xmlElement45.setParent(xmlElement48);
    java.lang.String str50 = xmlElement48.getData();
    xmlElement40.setParent(xmlElement48);
    XmlElement xmlElement54 = new XmlElement("hi!", "");
    XmlElement xmlElement55 = xmlElement40.removeElement(xmlElement54);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str56 = xmlElement40.getAttributes();
    xmlElement20.setAttributes(hashtable_str_str56);
    xmlElement2.notifyObservers((java.lang.Object)xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + ""+ "'", str42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + ""+ "'", str50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str56);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    XmlElement xmlElement8 = new XmlElement("hi!", "");
    xmlElement5.setParent(xmlElement8);
    java.lang.String str10 = xmlElement8.getData();
    int i11 = xmlElement8.count();
    XmlElement xmlElement12 = xmlElement2.addSubElement(xmlElement8);
    java.lang.String str14 = xmlElement8.getAttribute("");
    XmlElement xmlElement17 = new XmlElement("hi!", "");
    XmlElement xmlElement20 = new XmlElement("hi!", "");
    xmlElement17.setParent(xmlElement20);
    java.lang.String str22 = xmlElement20.getData();
    XmlElement xmlElement25 = xmlElement20.addSubElement("hi!", "");
    xmlElement8.notifyObservers((java.lang.Object)xmlElement25);
    XmlElement xmlElement28 = xmlElement25.getElement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement28);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("");
    XmlElement xmlElement7 = new XmlElement("hi!", "");
    XmlElement xmlElement10 = new XmlElement("hi!", "");
    XmlElement xmlElement13 = new XmlElement("hi!", "");
    xmlElement10.setParent(xmlElement13);
    java.lang.String str15 = xmlElement13.getData();
    int i16 = xmlElement13.count();
    XmlElement xmlElement17 = xmlElement7.addSubElement(xmlElement13);
    xmlElement4.setParent(xmlElement13);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement13.getAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    XmlElement xmlElement9 = xmlElement5.addSubElement("", "");
    java.lang.String str10 = xmlElement9.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    XmlElement xmlElement9 = xmlElement5.addSubElement("", "");
    XmlElement xmlElement10 = xmlElement9.getParent();
    java.lang.String str11 = xmlElement9.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    XmlElement xmlElement9 = new XmlElement("hi!", "");
    XmlElement xmlElement12 = new XmlElement("hi!", "");
    xmlElement9.setParent(xmlElement12);
    java.lang.String str14 = xmlElement12.getData();
    int i15 = xmlElement12.count();
    XmlElement xmlElement16 = xmlElement2.removeElement(xmlElement12);
    int i17 = xmlElement2.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("");
    XmlElement xmlElement7 = new XmlElement("hi!", "");
    XmlElement xmlElement10 = new XmlElement("hi!", "");
    XmlElement xmlElement13 = new XmlElement("hi!", "");
    xmlElement10.setParent(xmlElement13);
    java.lang.String str15 = xmlElement13.getData();
    int i16 = xmlElement13.count();
    XmlElement xmlElement17 = xmlElement7.addSubElement(xmlElement13);
    xmlElement4.setParent(xmlElement13);
    XmlElement xmlElement20 = xmlElement13.addSubElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    XmlElement xmlElement9 = new XmlElement("hi!", "");
    XmlElement xmlElement12 = new XmlElement("hi!", "");
    xmlElement9.setParent(xmlElement12);
    java.lang.String str14 = xmlElement12.getData();
    int i15 = xmlElement12.count();
    XmlElement xmlElement16 = xmlElement2.removeElement(xmlElement12);
    java.lang.String str17 = xmlElement2.getData();
    int i18 = xmlElement2.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    java.lang.Object obj3 = null;
    xmlElement2.notifyObservers(obj3);
    java.util.Observer observer5 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement2.addObserver(observer5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    XmlElement xmlElement8 = new XmlElement("hi!", "");
    xmlElement5.setParent(xmlElement8);
    java.lang.String str10 = xmlElement8.getData();
    int i11 = xmlElement8.count();
    XmlElement xmlElement12 = xmlElement2.addSubElement(xmlElement8);
    xmlElement12.deleteObservers();
    java.lang.Object obj16 = xmlElement12.addAttribute("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    java.lang.String str9 = xmlElement2.getAttribute("", "hi!");
    XmlElement.printNode(xmlElement2, "hi!");
    XmlElement xmlElement14 = new XmlElement("hi!", "");
    XmlElement xmlElement17 = new XmlElement("hi!", "");
    xmlElement14.setParent(xmlElement17);
    java.lang.String str19 = xmlElement17.getData();
    XmlElement xmlElement22 = new XmlElement("hi!", "");
    XmlElement xmlElement25 = new XmlElement("hi!", "");
    xmlElement22.setParent(xmlElement25);
    java.lang.String str27 = xmlElement25.getData();
    xmlElement17.setParent(xmlElement25);
    XmlElement xmlElement31 = new XmlElement("hi!", "");
    XmlElement xmlElement32 = xmlElement17.removeElement(xmlElement31);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str33 = xmlElement17.getAttributes();
    xmlElement2.setAttributes(hashtable_str_str33);
    xmlElement2.setName("hi!");
    int i37 = xmlElement2.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    int i7 = xmlElement2.count();
    xmlElement2.removeFromParent();
    java.util.Observer observer9 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement2.addObserver(observer9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    XmlElement xmlElement9 = new XmlElement("", "");
    XmlElement xmlElement12 = new XmlElement("hi!", "");
    XmlElement xmlElement15 = new XmlElement("hi!", "");
    xmlElement12.setParent(xmlElement15);
    java.lang.String str19 = xmlElement12.getAttribute("", "hi!");
    XmlElement.printNode(xmlElement12, "hi!");
    xmlElement9.setParent(xmlElement12);
    xmlElement2.setParent(xmlElement9);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement25 = xmlElement9.removeElement((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    int i7 = xmlElement2.count();
    java.lang.String str9 = xmlElement2.getAttribute("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("");
    XmlElement xmlElement7 = new XmlElement("hi!", "");
    XmlElement xmlElement10 = new XmlElement("hi!", "");
    XmlElement xmlElement13 = new XmlElement("hi!", "");
    xmlElement10.setParent(xmlElement13);
    java.lang.String str15 = xmlElement13.getData();
    int i16 = xmlElement13.count();
    XmlElement xmlElement17 = xmlElement7.addSubElement(xmlElement13);
    xmlElement4.setParent(xmlElement13);
    xmlElement4.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    XmlElement xmlElement8 = new XmlElement("hi!", "");
    xmlElement5.setParent(xmlElement8);
    java.lang.String str10 = xmlElement8.getData();
    int i11 = xmlElement8.count();
    XmlElement xmlElement12 = xmlElement2.addSubElement(xmlElement8);
    int i13 = xmlElement12.count();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement15 = xmlElement12.getElement((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    java.lang.String str7 = xmlElement5.getData();
    XmlElement xmlElement10 = new XmlElement("hi!", "");
    XmlElement xmlElement13 = new XmlElement("hi!", "");
    xmlElement10.setParent(xmlElement13);
    java.lang.String str15 = xmlElement13.getData();
    xmlElement5.setParent(xmlElement13);
    XmlElement xmlElement19 = new XmlElement("hi!", "");
    XmlElement xmlElement20 = xmlElement5.removeElement(xmlElement19);
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
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement20);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("", hashtable_str_str1);
    XmlElement xmlElement4 = xmlElement2.addSubElement("");
    XmlElement xmlElement7 = new XmlElement("hi!", "");
    XmlElement xmlElement10 = new XmlElement("hi!", "");
    XmlElement xmlElement13 = new XmlElement("hi!", "");
    xmlElement10.setParent(xmlElement13);
    java.lang.String str15 = xmlElement13.getData();
    int i16 = xmlElement13.count();
    XmlElement xmlElement17 = xmlElement7.addSubElement(xmlElement13);
    int i18 = xmlElement17.count();
    XmlElement xmlElement19 = xmlElement2.addSubElement(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement19);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("");
    XmlElement xmlElement7 = new XmlElement("hi!", "");
    XmlElement xmlElement10 = new XmlElement("hi!", "");
    XmlElement xmlElement13 = new XmlElement("hi!", "");
    xmlElement10.setParent(xmlElement13);
    java.lang.String str15 = xmlElement13.getData();
    int i16 = xmlElement13.count();
    XmlElement xmlElement17 = xmlElement7.addSubElement(xmlElement13);
    xmlElement4.setParent(xmlElement13);
    java.lang.Object obj19 = xmlElement13.clone();
    xmlElement13.removeAllElements();
    java.lang.String str23 = xmlElement13.getAttribute("", "");
    XmlElement xmlElement26 = new XmlElement("hi!", "hi!");
    java.lang.Object obj27 = xmlElement26.clone();
    xmlElement13.append(xmlElement26);
    java.lang.String str29 = xmlElement26.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    XmlElement xmlElement8 = new XmlElement("hi!", "");
    xmlElement5.setParent(xmlElement8);
    java.lang.String str10 = xmlElement8.getData();
    int i11 = xmlElement8.count();
    XmlElement xmlElement12 = xmlElement2.addSubElement(xmlElement8);
    java.lang.String str14 = xmlElement8.getAttribute("");
    XmlElement xmlElement17 = new XmlElement("hi!", "");
    XmlElement xmlElement20 = new XmlElement("hi!", "");
    xmlElement17.setParent(xmlElement20);
    java.lang.String str22 = xmlElement20.getData();
    XmlElement xmlElement25 = xmlElement20.addSubElement("hi!", "");
    xmlElement8.notifyObservers((java.lang.Object)xmlElement25);
    XmlElement xmlElement29 = new XmlElement("hi!", "");
    XmlElement xmlElement32 = new XmlElement("hi!", "");
    XmlElement xmlElement35 = new XmlElement("hi!", "");
    xmlElement32.setParent(xmlElement35);
    java.lang.String str37 = xmlElement35.getData();
    int i38 = xmlElement35.count();
    XmlElement xmlElement39 = xmlElement29.addSubElement(xmlElement35);
    xmlElement39.deleteObservers();
    xmlElement25.notifyObservers((java.lang.Object)xmlElement39);
    xmlElement39.removeFromParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + ""+ "'", str37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement39);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("");
    XmlElement xmlElement7 = new XmlElement("hi!", "");
    XmlElement xmlElement10 = new XmlElement("hi!", "");
    XmlElement xmlElement13 = new XmlElement("hi!", "");
    xmlElement10.setParent(xmlElement13);
    java.lang.String str15 = xmlElement13.getData();
    int i16 = xmlElement13.count();
    XmlElement xmlElement17 = xmlElement7.addSubElement(xmlElement13);
    xmlElement4.setParent(xmlElement13);
    java.lang.Object obj19 = xmlElement13.clone();
    XmlElement xmlElement22 = new XmlElement("hi!", "");
    XmlElement xmlElement25 = new XmlElement("hi!", "");
    XmlElement xmlElement28 = new XmlElement("hi!", "");
    xmlElement25.setParent(xmlElement28);
    java.lang.String str30 = xmlElement28.getData();
    int i31 = xmlElement28.count();
    XmlElement xmlElement32 = xmlElement22.addSubElement(xmlElement28);
    xmlElement13.notifyObservers((java.lang.Object)xmlElement22);
    XmlElement xmlElement36 = new XmlElement("hi!", "");
    XmlElement xmlElement38 = xmlElement36.addSubElement("");
    XmlElement xmlElement41 = new XmlElement("hi!", "");
    XmlElement xmlElement44 = new XmlElement("hi!", "");
    XmlElement xmlElement47 = new XmlElement("hi!", "");
    xmlElement44.setParent(xmlElement47);
    java.lang.String str49 = xmlElement47.getData();
    int i50 = xmlElement47.count();
    XmlElement xmlElement51 = xmlElement41.addSubElement(xmlElement47);
    xmlElement38.setParent(xmlElement47);
    boolean b53 = xmlElement13.equals((java.lang.Object)xmlElement47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + ""+ "'", str49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test58"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    java.lang.String str7 = xmlElement5.getData();
    XmlElement xmlElement10 = xmlElement5.addSubElement("hi!", "");
    java.lang.Object obj13 = xmlElement5.addAttribute("hi!", "");
    java.util.List list14 = xmlElement5.getElements();
    java.lang.String str17 = xmlElement5.getAttribute("hi!", "");
    java.util.Observer observer18 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement5.addObserver(observer18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test59"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    java.lang.String str9 = xmlElement2.getAttribute("", "hi!");
    XmlElement.printNode(xmlElement2, "hi!");
    xmlElement2.setData("");
    boolean b14 = xmlElement2.hasChanged();
    XmlElement xmlElement16 = xmlElement2.getElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test60"); }


    XmlElement xmlElement0 = new XmlElement();
    XmlElement xmlElement3 = new XmlElement("hi!", "");
    XmlElement xmlElement6 = new XmlElement("hi!", "");
    XmlElement xmlElement9 = new XmlElement("hi!", "");
    xmlElement6.setParent(xmlElement9);
    java.lang.String str11 = xmlElement9.getData();
    int i12 = xmlElement9.count();
    XmlElement xmlElement13 = xmlElement3.addSubElement(xmlElement9);
    java.lang.String str15 = xmlElement9.getAttribute("");
    XmlElement xmlElement18 = new XmlElement("hi!", "");
    XmlElement xmlElement21 = new XmlElement("hi!", "");
    xmlElement18.setParent(xmlElement21);
    java.lang.String str23 = xmlElement21.getData();
    XmlElement xmlElement26 = xmlElement21.addSubElement("hi!", "");
    xmlElement9.notifyObservers((java.lang.Object)xmlElement26);
    XmlElement xmlElement30 = new XmlElement("hi!", "");
    XmlElement xmlElement33 = new XmlElement("hi!", "");
    XmlElement xmlElement36 = new XmlElement("hi!", "");
    xmlElement33.setParent(xmlElement36);
    java.lang.String str38 = xmlElement36.getData();
    int i39 = xmlElement36.count();
    XmlElement xmlElement40 = xmlElement30.addSubElement(xmlElement36);
    xmlElement40.deleteObservers();
    xmlElement26.notifyObservers((java.lang.Object)xmlElement40);
    XmlElement xmlElement43 = xmlElement0.addSubElement(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + ""+ "'", str38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement43);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test61"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("hi!");
    xmlElement4.setData("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test62"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    xmlElement2.setParent(xmlElement5);
    java.lang.String str7 = xmlElement5.getData();
    XmlElement xmlElement10 = new XmlElement("hi!", "");
    XmlElement xmlElement13 = new XmlElement("hi!", "");
    xmlElement10.setParent(xmlElement13);
    java.lang.String str15 = xmlElement13.getData();
    xmlElement5.setParent(xmlElement13);
    XmlElement xmlElement19 = new XmlElement("hi!", "");
    XmlElement xmlElement20 = xmlElement5.removeElement(xmlElement19);
    xmlElement5.notifyObservers();
    java.lang.Object obj22 = xmlElement5.clone();
    int i23 = xmlElement5.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test63"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("", hashtable_str_str1);
    XmlElement xmlElement4 = xmlElement2.addSubElement("");
    xmlElement2.removeFromParent();
    int i6 = xmlElement2.countObservers();
    xmlElement2.setName("");
    XmlElement xmlElement11 = new XmlElement("hi!", "");
    XmlElement xmlElement14 = new XmlElement("hi!", "");
    xmlElement11.setParent(xmlElement14);
    XmlElement xmlElement18 = new XmlElement("", "");
    XmlElement xmlElement21 = new XmlElement("hi!", "");
    XmlElement xmlElement24 = new XmlElement("hi!", "");
    xmlElement21.setParent(xmlElement24);
    java.lang.String str28 = xmlElement21.getAttribute("", "hi!");
    XmlElement.printNode(xmlElement21, "hi!");
    xmlElement18.setParent(xmlElement21);
    xmlElement11.setParent(xmlElement18);
    boolean b33 = xmlElement2.equals((java.lang.Object)xmlElement18);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str35 = null;
    XmlElement xmlElement36 = new XmlElement("", hashtable_str_str35);
    XmlElement xmlElement38 = xmlElement36.addSubElement("");
    xmlElement18.insertElement(xmlElement38, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement38);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test64"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    XmlElement xmlElement8 = new XmlElement("hi!", "");
    xmlElement5.setParent(xmlElement8);
    java.lang.String str12 = xmlElement5.getAttribute("", "hi!");
    XmlElement.printNode(xmlElement5, "hi!");
    xmlElement2.setParent(xmlElement5);
    XmlElement xmlElement18 = new XmlElement("hi!", "");
    XmlElement xmlElement21 = new XmlElement("hi!", "");
    xmlElement18.setParent(xmlElement21);
    XmlElement xmlElement25 = xmlElement21.addSubElement("", "");
    XmlElement xmlElement26 = xmlElement25.getParent();
    XmlElement xmlElement27 = xmlElement25.getParent();
    xmlElement5.setParent(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);

  }

}
