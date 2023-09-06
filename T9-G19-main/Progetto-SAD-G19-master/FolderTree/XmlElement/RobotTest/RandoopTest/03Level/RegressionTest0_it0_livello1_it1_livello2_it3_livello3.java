
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    java.util.Enumeration enumeration3 = xmlElement2.getAttributeNames();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement5 = xmlElement2.getElement(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration3);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    XmlElement.printNode(xmlElement0, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    java.util.Enumeration enumeration3 = xmlElement2.getAttributeNames();
    java.lang.Object obj4 = xmlElement2.clone();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    java.util.Enumeration enumeration4 = xmlElement0.getAttributeNames();
    XmlElement xmlElement5 = new XmlElement();
    xmlElement5.notifyObservers();
    boolean b7 = xmlElement0.addElement(xmlElement5);
    java.lang.String str9 = xmlElement0.getAttribute("hi!");
    XmlElement xmlElement10 = new XmlElement();
    xmlElement10.setData("");
    xmlElement10.notifyObservers((java.lang.Object)'4');
    XmlElement xmlElement15 = xmlElement0.removeElement(xmlElement10);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement17 = xmlElement10.removeElement((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    java.util.Enumeration enumeration3 = xmlElement2.getAttributeNames();
    XmlElement.printNode(xmlElement2, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration3);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "hi!");
    java.util.Enumeration enumeration6 = xmlElement5.getAttributeNames();
    XmlElement xmlElement7 = xmlElement2.addSubElement(xmlElement5);
    boolean b8 = xmlElement7.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    java.util.Enumeration enumeration4 = xmlElement0.getAttributeNames();
    XmlElement xmlElement5 = new XmlElement();
    xmlElement5.notifyObservers();
    boolean b7 = xmlElement0.addElement(xmlElement5);
    java.lang.String str9 = xmlElement0.getAttribute("hi!");
    XmlElement xmlElement10 = new XmlElement();
    xmlElement10.setData("");
    xmlElement10.notifyObservers((java.lang.Object)'4');
    XmlElement xmlElement15 = xmlElement0.removeElement(xmlElement10);
    xmlElement15.notifyObservers((java.lang.Object)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.lang.String str5 = xmlElement2.getAttribute("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement7 = xmlElement2.removeElement((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    java.util.Enumeration enumeration4 = xmlElement0.getAttributeNames();
    xmlElement0.removeAllElements();
    XmlElement xmlElement6 = new XmlElement();
    java.lang.String str9 = xmlElement6.getAttribute("hi!", "");
    java.util.Enumeration enumeration10 = xmlElement6.getAttributeNames();
    XmlElement xmlElement11 = new XmlElement();
    xmlElement11.notifyObservers();
    boolean b13 = xmlElement6.addElement(xmlElement11);
    java.lang.String str15 = xmlElement6.getAttribute("hi!");
    XmlElement xmlElement16 = new XmlElement();
    xmlElement16.setData("");
    xmlElement16.notifyObservers((java.lang.Object)'4');
    XmlElement xmlElement21 = xmlElement6.removeElement(xmlElement16);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str22 = xmlElement6.getAttributes();
    xmlElement0.notifyObservers((java.lang.Object)hashtable_str_str22);
    int i24 = xmlElement0.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = xmlElement0.getAttributes();
    XmlElement xmlElement6 = xmlElement0.addSubElement("");
    XmlElement.printNode(xmlElement6, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "hi!");
    java.util.Enumeration enumeration6 = xmlElement5.getAttributeNames();
    XmlElement xmlElement7 = xmlElement2.addSubElement(xmlElement5);
    java.util.List list8 = xmlElement5.getElements();
    xmlElement5.notifyObservers((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    XmlElement xmlElement1 = new XmlElement();
    java.lang.String str4 = xmlElement1.getAttribute("hi!", "");
    java.util.Enumeration enumeration5 = xmlElement1.getAttributeNames();
    XmlElement xmlElement6 = new XmlElement();
    xmlElement6.notifyObservers();
    boolean b8 = xmlElement1.addElement(xmlElement6);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str9 = xmlElement6.getAttributes();
    XmlElement xmlElement10 = new XmlElement("hi!", hashtable_str_str9);
    XmlElement xmlElement11 = new XmlElement();
    java.lang.String str14 = xmlElement11.getAttribute("hi!", "");
    java.util.Enumeration enumeration15 = xmlElement11.getAttributeNames();
    XmlElement xmlElement16 = new XmlElement();
    xmlElement16.notifyObservers();
    boolean b18 = xmlElement11.addElement(xmlElement16);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement16.getAttributes();
    XmlElement xmlElement20 = xmlElement10.addSubElement(xmlElement16);
    java.util.List list21 = xmlElement20.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    java.util.Enumeration enumeration3 = xmlElement2.getAttributeNames();
    XmlElement xmlElement6 = xmlElement2.addSubElement("", "");
    xmlElement2.removeFromParent();
    xmlElement2.removeFromParent();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement10 = xmlElement2.removeElement((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = xmlElement0.getAttributes();
    XmlElement xmlElement7 = xmlElement0.addSubElement("", "");
    XmlElement xmlElement8 = new XmlElement();
    java.lang.String str11 = xmlElement8.getAttribute("hi!", "");
    java.util.Enumeration enumeration12 = xmlElement8.getAttributeNames();
    int i13 = xmlElement8.count();
    boolean b15 = xmlElement8.equals((java.lang.Object)10.0f);
    boolean b16 = xmlElement7.addElement(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    XmlElement xmlElement0 = new XmlElement();
    xmlElement0.notifyObservers();
    xmlElement0.notifyObservers((java.lang.Object)true);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    java.util.Enumeration enumeration4 = xmlElement0.getAttributeNames();
    XmlElement xmlElement5 = new XmlElement();
    xmlElement5.notifyObservers();
    boolean b7 = xmlElement0.addElement(xmlElement5);
    java.lang.String str9 = xmlElement0.getAttribute("hi!");
    XmlElement xmlElement10 = new XmlElement();
    xmlElement10.setData("");
    xmlElement10.notifyObservers((java.lang.Object)'4');
    XmlElement xmlElement15 = xmlElement0.removeElement(xmlElement10);
    xmlElement15.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = xmlElement0.getAttributes();
    XmlElement xmlElement7 = xmlElement0.addSubElement("", "");
    XmlElement xmlElement8 = new XmlElement();
    xmlElement8.notifyObservers();
    // The following exception was thrown during execution in test generation
    try {
    xmlElement0.insertElement(xmlElement8, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    java.util.Enumeration enumeration3 = xmlElement2.getAttributeNames();
    java.lang.Object obj4 = xmlElement2.clone();
    boolean b5 = xmlElement2.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    java.util.Observer observer4 = null;
    xmlElement0.deleteObserver(observer4);
    java.lang.Object obj6 = xmlElement0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    java.util.Enumeration enumeration4 = xmlElement0.getAttributeNames();
    XmlElement xmlElement5 = new XmlElement();
    xmlElement5.notifyObservers();
    boolean b7 = xmlElement0.addElement(xmlElement5);
    java.lang.String str9 = xmlElement0.getAttribute("hi!");
    XmlElement xmlElement10 = new XmlElement();
    xmlElement10.setData("");
    xmlElement10.notifyObservers((java.lang.Object)'4');
    XmlElement xmlElement15 = xmlElement0.removeElement(xmlElement10);
    XmlElement xmlElement18 = new XmlElement("hi!", "hi!");
    java.util.Enumeration enumeration19 = xmlElement18.getAttributeNames();
    XmlElement xmlElement22 = xmlElement18.addSubElement("", "");
    xmlElement18.removeFromParent();
    xmlElement10.setParent(xmlElement18);
    XmlElement xmlElement26 = new XmlElement();
    java.lang.String str29 = xmlElement26.getAttribute("hi!", "");
    java.util.Enumeration enumeration30 = xmlElement26.getAttributeNames();
    XmlElement xmlElement31 = new XmlElement();
    xmlElement31.notifyObservers();
    boolean b33 = xmlElement26.addElement(xmlElement31);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str34 = xmlElement31.getAttributes();
    XmlElement xmlElement35 = new XmlElement("hi!", hashtable_str_str34);
    XmlElement xmlElement36 = new XmlElement();
    java.lang.String str39 = xmlElement36.getAttribute("hi!", "");
    java.util.Enumeration enumeration40 = xmlElement36.getAttributeNames();
    XmlElement xmlElement41 = new XmlElement();
    xmlElement41.notifyObservers();
    boolean b43 = xmlElement36.addElement(xmlElement41);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str44 = xmlElement41.getAttributes();
    XmlElement xmlElement45 = xmlElement35.addSubElement(xmlElement41);
    XmlElement xmlElement46 = xmlElement10.removeElement(xmlElement45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + ""+ "'", str39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement46);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    XmlElement xmlElement1 = new XmlElement();
    java.lang.String str4 = xmlElement1.getAttribute("hi!", "");
    java.util.Enumeration enumeration5 = xmlElement1.getAttributeNames();
    XmlElement xmlElement6 = new XmlElement();
    xmlElement6.notifyObservers();
    boolean b8 = xmlElement1.addElement(xmlElement6);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str9 = xmlElement6.getAttributes();
    XmlElement xmlElement10 = new XmlElement("hi!", hashtable_str_str9);
    XmlElement xmlElement11 = new XmlElement();
    java.lang.String str14 = xmlElement11.getAttribute("hi!", "");
    java.util.Enumeration enumeration15 = xmlElement11.getAttributeNames();
    XmlElement xmlElement16 = new XmlElement();
    xmlElement16.notifyObservers();
    boolean b18 = xmlElement11.addElement(xmlElement16);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement16.getAttributes();
    XmlElement xmlElement20 = xmlElement10.addSubElement(xmlElement16);
    XmlElement xmlElement21 = xmlElement20.getParent();
    java.util.Observer observer22 = null;
    xmlElement20.deleteObserver(observer22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    java.util.Enumeration enumeration4 = xmlElement0.getAttributeNames();
    XmlElement xmlElement5 = new XmlElement();
    xmlElement5.notifyObservers();
    boolean b7 = xmlElement0.addElement(xmlElement5);
    int i8 = xmlElement0.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    XmlElement xmlElement1 = new XmlElement();
    java.lang.String str4 = xmlElement1.getAttribute("hi!", "");
    java.util.Enumeration enumeration5 = xmlElement1.getAttributeNames();
    XmlElement xmlElement6 = new XmlElement();
    xmlElement6.notifyObservers();
    boolean b8 = xmlElement1.addElement(xmlElement6);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str9 = xmlElement6.getAttributes();
    XmlElement xmlElement10 = new XmlElement("hi!", hashtable_str_str9);
    XmlElement xmlElement11 = new XmlElement();
    java.lang.String str14 = xmlElement11.getAttribute("hi!", "");
    java.util.Enumeration enumeration15 = xmlElement11.getAttributeNames();
    XmlElement xmlElement16 = new XmlElement();
    xmlElement16.notifyObservers();
    boolean b18 = xmlElement11.addElement(xmlElement16);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement16.getAttributes();
    XmlElement xmlElement20 = xmlElement10.addSubElement(xmlElement16);
    XmlElement xmlElement21 = xmlElement20.getParent();
    java.util.List list22 = xmlElement21.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    XmlElement xmlElement1 = new XmlElement();
    java.lang.String str4 = xmlElement1.getAttribute("hi!", "");
    java.util.Enumeration enumeration5 = xmlElement1.getAttributeNames();
    XmlElement xmlElement6 = new XmlElement();
    xmlElement6.notifyObservers();
    boolean b8 = xmlElement1.addElement(xmlElement6);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str9 = xmlElement6.getAttributes();
    XmlElement xmlElement10 = new XmlElement("hi!", hashtable_str_str9);
    XmlElement xmlElement11 = new XmlElement();
    java.lang.String str14 = xmlElement11.getAttribute("hi!", "");
    java.util.Enumeration enumeration15 = xmlElement11.getAttributeNames();
    XmlElement xmlElement16 = new XmlElement();
    xmlElement16.notifyObservers();
    boolean b18 = xmlElement11.addElement(xmlElement16);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement16.getAttributes();
    XmlElement xmlElement20 = xmlElement10.addSubElement(xmlElement16);
    XmlElement xmlElement21 = xmlElement20.getParent();
    XmlElement xmlElement22 = new XmlElement();
    XmlElement xmlElement23 = new XmlElement();
    java.lang.String str26 = xmlElement23.getAttribute("hi!", "");
    java.util.Enumeration enumeration27 = xmlElement23.getAttributeNames();
    XmlElement xmlElement28 = new XmlElement();
    xmlElement28.notifyObservers();
    boolean b30 = xmlElement23.addElement(xmlElement28);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str31 = xmlElement28.getAttributes();
    xmlElement22.insertElement(xmlElement28, 0);
    xmlElement20.notifyObservers((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str31);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    java.util.Enumeration enumeration4 = xmlElement0.getAttributeNames();
    XmlElement xmlElement5 = new XmlElement();
    xmlElement5.notifyObservers();
    boolean b7 = xmlElement0.addElement(xmlElement5);
    java.lang.String str9 = xmlElement0.getAttribute("hi!");
    XmlElement xmlElement10 = new XmlElement();
    xmlElement10.setData("");
    xmlElement10.notifyObservers((java.lang.Object)'4');
    XmlElement xmlElement15 = xmlElement0.removeElement(xmlElement10);
    java.lang.Object obj16 = xmlElement0.clone();
    XmlElement xmlElement17 = new XmlElement();
    java.lang.String str20 = xmlElement17.getAttribute("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = xmlElement17.getAttributes();
    XmlElement xmlElement24 = xmlElement17.addSubElement("", "");
    XmlElement xmlElement25 = new XmlElement();
    java.lang.String str28 = xmlElement25.getAttribute("hi!", "");
    java.util.Enumeration enumeration29 = xmlElement25.getAttributeNames();
    XmlElement xmlElement30 = new XmlElement();
    xmlElement30.notifyObservers();
    boolean b32 = xmlElement25.addElement(xmlElement30);
    java.lang.String str34 = xmlElement25.getAttribute("hi!");
    XmlElement xmlElement35 = new XmlElement();
    xmlElement35.setData("");
    xmlElement35.notifyObservers((java.lang.Object)'4');
    XmlElement xmlElement40 = xmlElement25.removeElement(xmlElement35);
    boolean b41 = xmlElement24.addElement(xmlElement25);
    xmlElement0.append(xmlElement25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    java.util.Enumeration enumeration4 = xmlElement0.getAttributeNames();
    XmlElement xmlElement5 = new XmlElement();
    xmlElement5.notifyObservers();
    boolean b7 = xmlElement0.addElement(xmlElement5);
    boolean b9 = xmlElement5.equals((java.lang.Object)0.0f);
    java.lang.String str11 = xmlElement5.getAttribute("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = xmlElement0.getAttributes();
    XmlElement xmlElement6 = xmlElement0.addSubElement("");
    java.lang.String str7 = xmlElement6.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    java.util.Observer observer4 = null;
    xmlElement0.deleteObserver(observer4);
    XmlElement xmlElement6 = new XmlElement();
    java.lang.String str9 = xmlElement6.getAttribute("hi!", "");
    java.util.Enumeration enumeration10 = xmlElement6.getAttributeNames();
    XmlElement xmlElement11 = new XmlElement();
    xmlElement11.notifyObservers();
    boolean b13 = xmlElement6.addElement(xmlElement11);
    java.lang.String str15 = xmlElement6.getAttribute("hi!");
    XmlElement xmlElement16 = xmlElement0.addSubElement(xmlElement6);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement18 = xmlElement6.getElement("hi!");
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement16);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    java.util.Enumeration enumeration4 = xmlElement0.getAttributeNames();
    int i5 = xmlElement0.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    java.util.Enumeration enumeration4 = xmlElement0.getAttributeNames();
    int i5 = xmlElement0.count();
    java.lang.Object obj6 = xmlElement0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    java.util.Enumeration enumeration4 = xmlElement0.getAttributeNames();
    XmlElement xmlElement5 = new XmlElement();
    xmlElement5.notifyObservers();
    boolean b7 = xmlElement0.addElement(xmlElement5);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = xmlElement5.getAttributes();
    boolean b9 = xmlElement5.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    java.util.Enumeration enumeration3 = xmlElement2.getAttributeNames();
    XmlElement xmlElement6 = xmlElement2.addSubElement("", "");
    XmlElement xmlElement7 = new XmlElement();
    java.lang.String str10 = xmlElement7.getAttribute("hi!", "");
    XmlElement xmlElement11 = xmlElement2.addSubElement(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    java.util.Enumeration enumeration4 = xmlElement0.getAttributeNames();
    int i5 = xmlElement0.count();
    XmlElement xmlElement7 = xmlElement0.addSubElement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = new XmlElement("hi!", "hi!");
    java.util.Enumeration enumeration6 = xmlElement5.getAttributeNames();
    XmlElement xmlElement7 = xmlElement2.addSubElement(xmlElement5);
    java.lang.String str8 = xmlElement5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    XmlElement xmlElement1 = new XmlElement();
    java.lang.String str4 = xmlElement1.getAttribute("hi!", "");
    java.util.Enumeration enumeration5 = xmlElement1.getAttributeNames();
    xmlElement1.removeAllElements();
    XmlElement xmlElement7 = new XmlElement();
    java.lang.String str10 = xmlElement7.getAttribute("hi!", "");
    java.util.Enumeration enumeration11 = xmlElement7.getAttributeNames();
    XmlElement xmlElement12 = new XmlElement();
    xmlElement12.notifyObservers();
    boolean b14 = xmlElement7.addElement(xmlElement12);
    java.lang.String str16 = xmlElement7.getAttribute("hi!");
    XmlElement xmlElement17 = new XmlElement();
    xmlElement17.setData("");
    xmlElement17.notifyObservers((java.lang.Object)'4');
    XmlElement xmlElement22 = xmlElement7.removeElement(xmlElement17);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str23 = xmlElement7.getAttributes();
    xmlElement1.notifyObservers((java.lang.Object)hashtable_str_str23);
    XmlElement xmlElement25 = new XmlElement("", hashtable_str_str23);
    xmlElement25.notifyObservers((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str23);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    java.util.Observer observer4 = null;
    xmlElement0.deleteObserver(observer4);
    XmlElement xmlElement6 = new XmlElement();
    java.lang.String str9 = xmlElement6.getAttribute("hi!", "");
    java.util.Enumeration enumeration10 = xmlElement6.getAttributeNames();
    XmlElement xmlElement11 = new XmlElement();
    xmlElement11.notifyObservers();
    boolean b13 = xmlElement6.addElement(xmlElement11);
    java.lang.String str15 = xmlElement6.getAttribute("hi!");
    XmlElement xmlElement16 = xmlElement0.addSubElement(xmlElement6);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement18 = xmlElement16.getElement("");
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement16);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    XmlElement xmlElement0 = new XmlElement();
    XmlElement xmlElement3 = new XmlElement("hi!", "hi!");
    java.util.Enumeration enumeration4 = xmlElement3.getAttributeNames();
    XmlElement xmlElement7 = xmlElement3.addSubElement("", "");
    xmlElement3.removeFromParent();
    xmlElement3.removeFromParent();
    XmlElement xmlElement10 = xmlElement0.addSubElement(xmlElement3);
    XmlElement xmlElement11 = new XmlElement();
    java.lang.String str14 = xmlElement11.getAttribute("hi!", "");
    java.util.Enumeration enumeration15 = xmlElement11.getAttributeNames();
    XmlElement xmlElement16 = new XmlElement();
    xmlElement16.notifyObservers();
    boolean b18 = xmlElement11.addElement(xmlElement16);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement16.getAttributes();
    java.lang.Object obj20 = xmlElement16.clone();
    XmlElement xmlElement21 = new XmlElement();
    java.lang.String str24 = xmlElement21.getAttribute("hi!", "");
    java.util.Enumeration enumeration25 = xmlElement21.getAttributeNames();
    XmlElement xmlElement26 = new XmlElement();
    xmlElement26.notifyObservers();
    boolean b28 = xmlElement21.addElement(xmlElement26);
    java.lang.String str30 = xmlElement21.getAttribute("hi!");
    XmlElement xmlElement31 = new XmlElement();
    xmlElement31.setData("");
    xmlElement31.notifyObservers((java.lang.Object)'4');
    XmlElement xmlElement36 = xmlElement21.removeElement(xmlElement31);
    XmlElement xmlElement37 = xmlElement16.removeElement(xmlElement36);
    boolean b38 = xmlElement0.equals((java.lang.Object)xmlElement37);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str40 = xmlElement37.getAttribute("");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    java.util.Enumeration enumeration4 = xmlElement0.getAttributeNames();
    XmlElement xmlElement5 = new XmlElement();
    xmlElement5.notifyObservers();
    boolean b7 = xmlElement0.addElement(xmlElement5);
    java.lang.String str9 = xmlElement0.getAttribute("hi!");
    XmlElement xmlElement10 = new XmlElement();
    xmlElement10.setData("");
    xmlElement10.notifyObservers((java.lang.Object)'4');
    XmlElement xmlElement15 = xmlElement0.removeElement(xmlElement10);
    XmlElement xmlElement18 = new XmlElement("hi!", "hi!");
    java.util.Enumeration enumeration19 = xmlElement18.getAttributeNames();
    XmlElement xmlElement22 = xmlElement18.addSubElement("", "");
    xmlElement18.removeFromParent();
    xmlElement10.setParent(xmlElement18);
    XmlElement xmlElement26 = xmlElement10.getElement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement26);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    XmlElement xmlElement0 = new XmlElement();
    XmlElement xmlElement3 = new XmlElement("hi!", "hi!");
    java.util.Enumeration enumeration4 = xmlElement3.getAttributeNames();
    XmlElement xmlElement7 = xmlElement3.addSubElement("", "");
    xmlElement3.removeFromParent();
    xmlElement3.removeFromParent();
    XmlElement xmlElement10 = xmlElement0.addSubElement(xmlElement3);
    java.util.Observer observer11 = null;
    xmlElement0.deleteObserver(observer11);
    xmlElement0.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    java.util.Enumeration enumeration3 = xmlElement2.getAttributeNames();
    int i4 = xmlElement2.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    XmlElement xmlElement1 = new XmlElement();
    java.lang.String str4 = xmlElement1.getAttribute("hi!", "");
    java.util.Enumeration enumeration5 = xmlElement1.getAttributeNames();
    XmlElement xmlElement6 = new XmlElement();
    xmlElement6.notifyObservers();
    boolean b8 = xmlElement1.addElement(xmlElement6);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str9 = xmlElement6.getAttributes();
    XmlElement xmlElement10 = new XmlElement("hi!", hashtable_str_str9);
    XmlElement xmlElement11 = new XmlElement();
    java.lang.String str14 = xmlElement11.getAttribute("hi!", "");
    java.util.Enumeration enumeration15 = xmlElement11.getAttributeNames();
    XmlElement xmlElement16 = new XmlElement();
    xmlElement16.notifyObservers();
    boolean b18 = xmlElement11.addElement(xmlElement16);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement16.getAttributes();
    XmlElement xmlElement20 = xmlElement10.addSubElement(xmlElement16);
    XmlElement xmlElement21 = new XmlElement();
    java.lang.String str24 = xmlElement21.getAttribute("hi!", "");
    java.util.Enumeration enumeration25 = xmlElement21.getAttributeNames();
    XmlElement xmlElement26 = new XmlElement();
    xmlElement26.notifyObservers();
    boolean b28 = xmlElement21.addElement(xmlElement26);
    java.lang.String str30 = xmlElement21.getAttribute("hi!");
    XmlElement xmlElement33 = xmlElement21.addSubElement("hi!", "");
    XmlElement xmlElement36 = new XmlElement("hi!", "hi!");
    java.util.Enumeration enumeration37 = xmlElement36.getAttributeNames();
    XmlElement xmlElement39 = xmlElement36.addSubElement("");
    java.lang.String str42 = xmlElement36.getAttribute("", "");
    xmlElement21.append(xmlElement36);
    xmlElement10.append(xmlElement21);
    java.lang.String str45 = xmlElement21.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + ""+ "'", str42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str45);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    java.util.Enumeration enumeration4 = xmlElement0.getAttributeNames();
    XmlElement xmlElement5 = new XmlElement();
    xmlElement5.notifyObservers();
    boolean b7 = xmlElement0.addElement(xmlElement5);
    java.lang.String str9 = xmlElement0.getAttribute("hi!");
    XmlElement xmlElement10 = new XmlElement();
    xmlElement10.setData("");
    xmlElement10.notifyObservers((java.lang.Object)'4');
    XmlElement xmlElement15 = xmlElement0.removeElement(xmlElement10);
    XmlElement xmlElement18 = new XmlElement("hi!", "hi!");
    java.util.Enumeration enumeration19 = xmlElement18.getAttributeNames();
    XmlElement xmlElement22 = xmlElement18.addSubElement("", "");
    xmlElement18.removeFromParent();
    xmlElement10.setParent(xmlElement18);
    java.util.Observer observer25 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement18.addObserver(observer25);
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
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    XmlElement xmlElement1 = new XmlElement();
    java.lang.String str4 = xmlElement1.getAttribute("hi!", "");
    java.util.Enumeration enumeration5 = xmlElement1.getAttributeNames();
    xmlElement1.removeAllElements();
    XmlElement xmlElement7 = new XmlElement();
    java.lang.String str10 = xmlElement7.getAttribute("hi!", "");
    java.util.Enumeration enumeration11 = xmlElement7.getAttributeNames();
    XmlElement xmlElement12 = new XmlElement();
    xmlElement12.notifyObservers();
    boolean b14 = xmlElement7.addElement(xmlElement12);
    java.lang.String str16 = xmlElement7.getAttribute("hi!");
    XmlElement xmlElement17 = new XmlElement();
    xmlElement17.setData("");
    xmlElement17.notifyObservers((java.lang.Object)'4');
    XmlElement xmlElement22 = xmlElement7.removeElement(xmlElement17);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str23 = xmlElement7.getAttributes();
    xmlElement1.notifyObservers((java.lang.Object)hashtable_str_str23);
    XmlElement xmlElement25 = new XmlElement("", hashtable_str_str23);
    xmlElement25.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str23);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    java.util.Enumeration enumeration4 = xmlElement0.getAttributeNames();
    XmlElement xmlElement5 = new XmlElement();
    xmlElement5.notifyObservers();
    boolean b7 = xmlElement0.addElement(xmlElement5);
    xmlElement0.setName("");
    XmlElement xmlElement10 = new XmlElement();
    java.lang.String str13 = xmlElement10.getAttribute("hi!", "");
    java.util.Enumeration enumeration14 = xmlElement10.getAttributeNames();
    XmlElement xmlElement15 = new XmlElement();
    xmlElement15.notifyObservers();
    boolean b17 = xmlElement10.addElement(xmlElement15);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str18 = xmlElement15.getAttributes();
    java.lang.Object obj19 = xmlElement15.clone();
    XmlElement xmlElement21 = new XmlElement();
    java.lang.String str24 = xmlElement21.getAttribute("hi!", "");
    java.util.Enumeration enumeration25 = xmlElement21.getAttributeNames();
    XmlElement xmlElement26 = new XmlElement();
    xmlElement26.notifyObservers();
    boolean b28 = xmlElement21.addElement(xmlElement26);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str29 = xmlElement26.getAttributes();
    XmlElement xmlElement30 = new XmlElement("hi!", hashtable_str_str29);
    xmlElement15.setAttributes(hashtable_str_str29);
    xmlElement0.setAttributes(hashtable_str_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str29);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    XmlElement xmlElement0 = new XmlElement();
    xmlElement0.setData("");
    xmlElement0.notifyObservers((java.lang.Object)'4');
    int i5 = xmlElement0.count();
    XmlElement xmlElement6 = new XmlElement();
    java.lang.String str9 = xmlElement6.getAttribute("hi!", "");
    java.util.Enumeration enumeration10 = xmlElement6.getAttributeNames();
    XmlElement xmlElement11 = new XmlElement();
    xmlElement11.notifyObservers();
    boolean b13 = xmlElement6.addElement(xmlElement11);
    XmlElement xmlElement14 = xmlElement0.removeElement(xmlElement11);
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = xmlElement14.hasChanged();
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement14);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    java.util.Enumeration enumeration4 = xmlElement0.getAttributeNames();
    java.util.Observer observer5 = null;
    xmlElement0.deleteObserver(observer5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str3 = xmlElement0.getAttribute("hi!", "");
    java.util.Enumeration enumeration4 = xmlElement0.getAttributeNames();
    XmlElement xmlElement5 = new XmlElement();
    xmlElement5.notifyObservers();
    boolean b7 = xmlElement0.addElement(xmlElement5);
    java.lang.String str9 = xmlElement0.getAttribute("hi!");
    XmlElement xmlElement10 = new XmlElement();
    xmlElement10.setData("");
    xmlElement10.notifyObservers((java.lang.Object)'4');
    XmlElement xmlElement15 = xmlElement0.removeElement(xmlElement10);
    XmlElement xmlElement18 = new XmlElement("hi!", "hi!");
    java.util.Enumeration enumeration19 = xmlElement18.getAttributeNames();
    XmlElement xmlElement22 = xmlElement18.addSubElement("", "");
    xmlElement18.removeFromParent();
    xmlElement10.setParent(xmlElement18);
    XmlElement xmlElement25 = new XmlElement();
    java.lang.String str28 = xmlElement25.getAttribute("hi!", "");
    java.util.Enumeration enumeration29 = xmlElement25.getAttributeNames();
    XmlElement xmlElement30 = new XmlElement();
    xmlElement30.notifyObservers();
    boolean b32 = xmlElement25.addElement(xmlElement30);
    java.lang.String str34 = xmlElement25.getAttribute("hi!");
    XmlElement xmlElement37 = xmlElement25.addSubElement("hi!", "");
    XmlElement xmlElement40 = new XmlElement("hi!", "hi!");
    java.util.Enumeration enumeration41 = xmlElement40.getAttributeNames();
    xmlElement37.append(xmlElement40);
    XmlElement xmlElement43 = new XmlElement();
    java.lang.String str46 = xmlElement43.getAttribute("hi!", "");
    java.util.Observer observer47 = null;
    xmlElement43.deleteObserver(observer47);
    XmlElement xmlElement49 = new XmlElement();
    java.lang.String str52 = xmlElement49.getAttribute("hi!", "");
    java.util.Enumeration enumeration53 = xmlElement49.getAttributeNames();
    XmlElement xmlElement54 = new XmlElement();
    xmlElement54.notifyObservers();
    boolean b56 = xmlElement49.addElement(xmlElement54);
    java.lang.String str58 = xmlElement49.getAttribute("hi!");
    XmlElement xmlElement59 = xmlElement43.addSubElement(xmlElement49);
    xmlElement59.removeFromParent();
    xmlElement40.setParent(xmlElement59);
    XmlElement xmlElement62 = xmlElement18.removeElement(xmlElement59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + ""+ "'", str46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + ""+ "'", str52.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + ""+ "'", str58.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement62);

  }

}
