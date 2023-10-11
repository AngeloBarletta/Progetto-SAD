
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


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
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement5.notifyObservers((java.lang.Object)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement4 = xmlElement2.getElement("");
    XmlElement xmlElement7 = new XmlElement("", "");
    XmlElement xmlElement10 = new XmlElement("", "");
    java.lang.String str13 = xmlElement10.getAttribute("", "hi!");
    xmlElement7.setParent(xmlElement10);
    xmlElement7.notifyObservers((java.lang.Object)false);
    xmlElement7.setName("");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement19 = xmlElement4.removeElement(xmlElement7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    xmlElement2.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    int i12 = xmlElement2.countObservers();
    XmlElement xmlElement13 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = xmlElement2.addElement(xmlElement13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = xmlElement2.getAttributes();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement18 = xmlElement15.addSubElement("", "hi!");
    XmlElement xmlElement19 = xmlElement2.removeElement(xmlElement18);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = xmlElement19.getAttribute("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement19);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("hi!");
    xmlElement4.notifyObservers();
    java.lang.Object obj6 = xmlElement4.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = xmlElement2.addSubElement("", "hi!");
    xmlElement5.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    java.util.List list12 = xmlElement2.getElements();
    XmlElement.printNode(xmlElement2, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    java.util.List list12 = xmlElement2.getElements();
    java.util.Observer observer13 = null;
    xmlElement2.deleteObserver(observer13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    java.util.List list10 = xmlElement2.getElements();
    xmlElement2.notifyObservers();
    XmlElement xmlElement14 = new XmlElement("", "");
    XmlElement xmlElement17 = new XmlElement("", "");
    java.lang.String str20 = xmlElement17.getAttribute("", "hi!");
    xmlElement14.setParent(xmlElement17);
    xmlElement14.notifyObservers((java.lang.Object)false);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str24 = xmlElement14.getAttributes();
    xmlElement2.setParent(xmlElement14);
    XmlElement xmlElement28 = new XmlElement("", "");
    XmlElement xmlElement31 = new XmlElement("", "");
    java.lang.String str34 = xmlElement31.getAttribute("", "hi!");
    xmlElement28.setParent(xmlElement31);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str36 = xmlElement31.getAttributes();
    java.util.Observer observer37 = null;
    xmlElement31.deleteObserver(observer37);
    java.util.Enumeration enumeration39 = xmlElement31.getAttributeNames();
    boolean b40 = xmlElement14.equals((java.lang.Object)xmlElement31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = xmlElement2.getAttributes();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement18 = xmlElement15.addSubElement("", "hi!");
    XmlElement xmlElement19 = xmlElement2.removeElement(xmlElement18);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement21 = xmlElement19.getElement("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement19);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    int i12 = xmlElement2.countObservers();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement15.addSubElement("hi!");
    boolean b18 = xmlElement2.addElement(xmlElement17);
    XmlElement xmlElement21 = xmlElement17.addSubElement("", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement23 = xmlElement21.getElement((int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("hi!");
    XmlElement.printNode(xmlElement2, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("hi!");
    XmlElement xmlElement7 = new XmlElement("", "");
    XmlElement xmlElement10 = new XmlElement("", "");
    java.lang.String str13 = xmlElement10.getAttribute("", "hi!");
    xmlElement7.setParent(xmlElement10);
    xmlElement7.notifyObservers((java.lang.Object)false);
    int i17 = xmlElement7.countObservers();
    XmlElement xmlElement20 = new XmlElement("", "");
    XmlElement xmlElement22 = xmlElement20.addSubElement("hi!");
    boolean b23 = xmlElement7.addElement(xmlElement22);
    XmlElement xmlElement26 = xmlElement22.addSubElement("", "hi!");
    boolean b27 = xmlElement22.hasChanged();
    xmlElement2.notifyObservers((java.lang.Object)b27);
    XmlElement xmlElement31 = new XmlElement("", "");
    XmlElement xmlElement34 = new XmlElement("", "");
    java.lang.String str37 = xmlElement34.getAttribute("", "hi!");
    xmlElement31.setParent(xmlElement34);
    xmlElement31.notifyObservers((java.lang.Object)false);
    java.util.List list41 = xmlElement31.getElements();
    XmlElement xmlElement44 = new XmlElement("", "");
    XmlElement xmlElement47 = new XmlElement("", "");
    java.lang.String str50 = xmlElement47.getAttribute("", "hi!");
    xmlElement44.setParent(xmlElement47);
    xmlElement31.setParent(xmlElement47);
    XmlElement.printNode(xmlElement31, "hi!");
    boolean b55 = xmlElement31.hasChanged();
    xmlElement2.setParent(xmlElement31);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement58 = xmlElement31.removeElement(100);
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!"+ "'", str50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    int i12 = xmlElement2.countObservers();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement15.addSubElement("hi!");
    boolean b18 = xmlElement2.addElement(xmlElement17);
    xmlElement17.setName("hi!");
    java.lang.Object obj23 = xmlElement17.addAttribute("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    int i12 = xmlElement2.countObservers();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement15.addSubElement("hi!");
    boolean b18 = xmlElement2.addElement(xmlElement17);
    XmlElement xmlElement21 = xmlElement17.addSubElement("", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement23 = xmlElement17.getElement((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = xmlElement2.getAttribute("");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    xmlElement2.notifyObservers((java.lang.Object)1.0f);
    xmlElement2.deleteObservers();

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    java.util.List list10 = xmlElement2.getElements();
    xmlElement2.notifyObservers();
    java.util.Observer observer12 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement2.addObserver(observer12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("hi!");
    XmlElement xmlElement7 = new XmlElement("", "");
    XmlElement xmlElement10 = new XmlElement("", "");
    java.lang.String str13 = xmlElement10.getAttribute("", "hi!");
    xmlElement7.setParent(xmlElement10);
    xmlElement7.notifyObservers((java.lang.Object)false);
    int i17 = xmlElement7.countObservers();
    XmlElement xmlElement20 = new XmlElement("", "");
    XmlElement xmlElement22 = xmlElement20.addSubElement("hi!");
    boolean b23 = xmlElement7.addElement(xmlElement22);
    XmlElement xmlElement26 = xmlElement22.addSubElement("", "hi!");
    boolean b27 = xmlElement22.hasChanged();
    xmlElement2.notifyObservers((java.lang.Object)b27);
    XmlElement xmlElement31 = new XmlElement("", "");
    XmlElement xmlElement34 = new XmlElement("", "");
    java.lang.String str37 = xmlElement34.getAttribute("", "hi!");
    xmlElement31.setParent(xmlElement34);
    xmlElement31.notifyObservers((java.lang.Object)false);
    java.util.List list41 = xmlElement31.getElements();
    XmlElement xmlElement44 = new XmlElement("", "");
    XmlElement xmlElement47 = new XmlElement("", "");
    java.lang.String str50 = xmlElement47.getAttribute("", "hi!");
    xmlElement44.setParent(xmlElement47);
    xmlElement31.setParent(xmlElement47);
    XmlElement.printNode(xmlElement31, "hi!");
    boolean b55 = xmlElement31.hasChanged();
    xmlElement2.setParent(xmlElement31);
    XmlElement xmlElement57 = xmlElement31.getParent();
    XmlElement xmlElement60 = new XmlElement("", "");
    XmlElement xmlElement63 = new XmlElement("", "");
    java.lang.String str66 = xmlElement63.getAttribute("", "hi!");
    xmlElement60.setParent(xmlElement63);
    xmlElement60.notifyObservers((java.lang.Object)false);
    java.lang.String str72 = xmlElement60.getAttribute("hi!", "hi!");
    XmlElement xmlElement73 = xmlElement31.addSubElement(xmlElement60);
    xmlElement60.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!"+ "'", str50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!"+ "'", str66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!"+ "'", str72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement73);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    XmlElement xmlElement1 = new XmlElement("");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement3 = xmlElement1.removeElement((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    xmlElement2.setName("");
    XmlElement xmlElement16 = xmlElement2.addSubElement("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement16);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    java.util.List list12 = xmlElement2.getElements();
    xmlElement2.notifyObservers();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement15 = xmlElement2.getElement((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    java.lang.String str5 = xmlElement2.getAttribute("", "hi!");
    xmlElement2.removeAllElements();
    xmlElement2.setData("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    XmlElement xmlElement2 = new XmlElement("", "hi!");
    XmlElement xmlElement4 = xmlElement2.getElement("");
    // The following exception was thrown during execution in test generation
    try {
    xmlElement4.removeFromParent();
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
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    java.lang.String str4 = xmlElement2.getAttribute("");
    int i5 = xmlElement2.count();
    XmlElement xmlElement8 = new XmlElement("", "");
    XmlElement xmlElement11 = new XmlElement("", "");
    java.lang.String str14 = xmlElement11.getAttribute("", "hi!");
    xmlElement8.setParent(xmlElement11);
    xmlElement8.deleteObservers();
    xmlElement2.append(xmlElement8);
    java.lang.String str18 = xmlElement8.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    int i12 = xmlElement2.countObservers();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement15.addSubElement("hi!");
    boolean b18 = xmlElement2.addElement(xmlElement17);
    java.lang.String str21 = xmlElement2.getAttribute("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement5.getAttributes();
    java.util.Observer observer11 = null;
    xmlElement5.deleteObserver(observer11);
    java.util.Enumeration enumeration13 = xmlElement5.getAttributeNames();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement15 = xmlElement5.getElement((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration13);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    java.lang.String str4 = xmlElement2.getAttribute("");
    int i5 = xmlElement2.count();
    XmlElement.printNode(xmlElement2, "");
    boolean b9 = xmlElement2.equals((java.lang.Object)100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("hi!");
    xmlElement4.notifyObservers();
    int i6 = xmlElement4.countObservers();
    XmlElement xmlElement9 = new XmlElement("", "");
    XmlElement xmlElement12 = new XmlElement("", "");
    java.lang.String str15 = xmlElement12.getAttribute("", "hi!");
    xmlElement9.setParent(xmlElement12);
    xmlElement9.notifyObservers((java.lang.Object)false);
    xmlElement9.setName("");
    java.lang.String str21 = xmlElement9.getData();
    xmlElement4.append(xmlElement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement2 = xmlElement1.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement2);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    int i12 = xmlElement2.countObservers();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement15.addSubElement("hi!");
    boolean b18 = xmlElement2.addElement(xmlElement17);
    XmlElement xmlElement21 = xmlElement17.addSubElement("", "hi!");
    boolean b22 = xmlElement17.hasChanged();
    XmlElement xmlElement25 = new XmlElement("", "");
    java.lang.String str27 = xmlElement25.getAttribute("");
    XmlElement xmlElement30 = new XmlElement("", "");
    XmlElement xmlElement33 = new XmlElement("", "");
    java.lang.String str36 = xmlElement33.getAttribute("", "hi!");
    xmlElement30.setParent(xmlElement33);
    xmlElement30.notifyObservers((java.lang.Object)false);
    xmlElement25.setParent(xmlElement30);
    xmlElement17.notifyObservers((java.lang.Object)xmlElement25);
    XmlElement xmlElement44 = new XmlElement("", "");
    XmlElement xmlElement46 = xmlElement44.addSubElement("hi!");
    boolean b47 = xmlElement25.addElement(xmlElement44);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement49 = xmlElement44.removeElement((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers();
    XmlElement xmlElement13 = new XmlElement("", "");
    XmlElement xmlElement16 = new XmlElement("", "");
    java.lang.String str19 = xmlElement16.getAttribute("", "hi!");
    xmlElement13.setParent(xmlElement16);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = xmlElement16.getAttributes();
    java.util.Observer observer22 = null;
    xmlElement16.deleteObserver(observer22);
    java.util.Enumeration enumeration24 = xmlElement16.getAttributeNames();
    xmlElement2.setParent(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration24);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.removeFromParent();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement12 = xmlElement2.removeElement((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("hi!");
    XmlElement xmlElement7 = new XmlElement("", "");
    XmlElement xmlElement10 = new XmlElement("", "");
    java.lang.String str13 = xmlElement10.getAttribute("", "hi!");
    xmlElement7.setParent(xmlElement10);
    xmlElement7.notifyObservers((java.lang.Object)false);
    int i17 = xmlElement7.countObservers();
    XmlElement xmlElement20 = new XmlElement("", "");
    XmlElement xmlElement22 = xmlElement20.addSubElement("hi!");
    boolean b23 = xmlElement7.addElement(xmlElement22);
    XmlElement xmlElement26 = xmlElement22.addSubElement("", "hi!");
    boolean b27 = xmlElement22.hasChanged();
    xmlElement2.notifyObservers((java.lang.Object)b27);
    XmlElement xmlElement31 = new XmlElement("", "");
    XmlElement xmlElement34 = new XmlElement("", "");
    java.lang.String str37 = xmlElement34.getAttribute("", "hi!");
    xmlElement31.setParent(xmlElement34);
    xmlElement31.notifyObservers((java.lang.Object)false);
    java.util.List list41 = xmlElement31.getElements();
    XmlElement xmlElement44 = new XmlElement("", "");
    XmlElement xmlElement47 = new XmlElement("", "");
    java.lang.String str50 = xmlElement47.getAttribute("", "hi!");
    xmlElement44.setParent(xmlElement47);
    xmlElement31.setParent(xmlElement47);
    XmlElement.printNode(xmlElement31, "hi!");
    boolean b55 = xmlElement31.hasChanged();
    xmlElement2.setParent(xmlElement31);
    XmlElement xmlElement57 = xmlElement31.getParent();
    XmlElement xmlElement60 = new XmlElement("", "");
    XmlElement xmlElement63 = new XmlElement("", "");
    java.lang.String str66 = xmlElement63.getAttribute("", "hi!");
    xmlElement60.setParent(xmlElement63);
    xmlElement60.notifyObservers((java.lang.Object)false);
    java.lang.String str72 = xmlElement60.getAttribute("hi!", "hi!");
    XmlElement xmlElement73 = xmlElement31.addSubElement(xmlElement60);
    XmlElement xmlElement76 = new XmlElement("", "");
    XmlElement xmlElement79 = xmlElement76.addSubElement("", "hi!");
    XmlElement xmlElement80 = xmlElement73.addSubElement(xmlElement79);
    XmlElement xmlElement83 = new XmlElement("", "");
    XmlElement xmlElement86 = new XmlElement("", "");
    java.lang.String str89 = xmlElement86.getAttribute("", "hi!");
    xmlElement83.setParent(xmlElement86);
    java.util.List list91 = xmlElement83.getElements();
    xmlElement83.notifyObservers();
    xmlElement79.setParent(xmlElement83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!"+ "'", str50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!"+ "'", str66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!"+ "'", str72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str89 + "' != '" + "hi!"+ "'", str89.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list91);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    java.util.List list10 = xmlElement2.getElements();
    xmlElement2.notifyObservers();
    XmlElement xmlElement14 = new XmlElement("", "");
    XmlElement xmlElement17 = new XmlElement("", "");
    java.lang.String str20 = xmlElement17.getAttribute("", "hi!");
    xmlElement14.setParent(xmlElement17);
    xmlElement14.notifyObservers((java.lang.Object)false);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str24 = xmlElement14.getAttributes();
    xmlElement2.setParent(xmlElement14);
    java.lang.String str28 = xmlElement2.getAttribute("", "hi!");
    xmlElement2.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("hi!");
    XmlElement xmlElement7 = new XmlElement("", "");
    XmlElement xmlElement10 = new XmlElement("", "");
    java.lang.String str13 = xmlElement10.getAttribute("", "hi!");
    xmlElement7.setParent(xmlElement10);
    xmlElement7.notifyObservers((java.lang.Object)false);
    int i17 = xmlElement7.countObservers();
    XmlElement xmlElement20 = new XmlElement("", "");
    XmlElement xmlElement22 = xmlElement20.addSubElement("hi!");
    boolean b23 = xmlElement7.addElement(xmlElement22);
    XmlElement xmlElement26 = xmlElement22.addSubElement("", "hi!");
    boolean b27 = xmlElement22.hasChanged();
    xmlElement2.notifyObservers((java.lang.Object)b27);
    XmlElement xmlElement31 = new XmlElement("", "");
    XmlElement xmlElement34 = new XmlElement("", "");
    java.lang.String str37 = xmlElement34.getAttribute("", "hi!");
    xmlElement31.setParent(xmlElement34);
    xmlElement31.notifyObservers((java.lang.Object)false);
    java.util.List list41 = xmlElement31.getElements();
    XmlElement xmlElement44 = new XmlElement("", "");
    XmlElement xmlElement47 = new XmlElement("", "");
    java.lang.String str50 = xmlElement47.getAttribute("", "hi!");
    xmlElement44.setParent(xmlElement47);
    xmlElement31.setParent(xmlElement47);
    XmlElement.printNode(xmlElement31, "hi!");
    boolean b55 = xmlElement31.hasChanged();
    xmlElement2.setParent(xmlElement31);
    XmlElement xmlElement57 = xmlElement31.getParent();
    XmlElement xmlElement60 = new XmlElement("", "");
    XmlElement xmlElement63 = new XmlElement("", "");
    java.lang.String str66 = xmlElement63.getAttribute("", "hi!");
    xmlElement60.setParent(xmlElement63);
    xmlElement60.notifyObservers((java.lang.Object)false);
    java.lang.String str72 = xmlElement60.getAttribute("hi!", "hi!");
    XmlElement xmlElement73 = xmlElement31.addSubElement(xmlElement60);
    XmlElement xmlElement75 = xmlElement73.getElement("");
    XmlElement xmlElement78 = new XmlElement("", "");
    XmlElement xmlElement81 = new XmlElement("", "");
    java.lang.String str84 = xmlElement81.getAttribute("", "hi!");
    xmlElement78.setParent(xmlElement81);
    xmlElement78.notifyObservers((java.lang.Object)false);
    int i88 = xmlElement78.countObservers();
    XmlElement xmlElement91 = new XmlElement("", "");
    XmlElement xmlElement93 = xmlElement91.addSubElement("hi!");
    boolean b94 = xmlElement78.addElement(xmlElement93);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement95 = xmlElement75.addSubElement(xmlElement78);
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!"+ "'", str50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!"+ "'", str66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!"+ "'", str72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str84 + "' != '" + "hi!"+ "'", str84.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    XmlElement xmlElement3 = new XmlElement("", "");
    XmlElement xmlElement6 = new XmlElement("", "");
    java.lang.String str9 = xmlElement6.getAttribute("", "hi!");
    xmlElement3.setParent(xmlElement6);
    xmlElement3.notifyObservers((java.lang.Object)false);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str13 = xmlElement3.getAttributes();
    XmlElement xmlElement14 = new XmlElement("hi!", hashtable_str_str13);
    java.lang.String str17 = xmlElement14.getAttribute("hi!", "hi!");
    int i18 = xmlElement14.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = xmlElement2.getAttributes();
    XmlElement xmlElement15 = new XmlElement("", "");
    java.lang.String str17 = xmlElement15.getAttribute("");
    boolean b18 = xmlElement2.equals((java.lang.Object)str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = xmlElement2.getAttributes();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement18 = xmlElement15.addSubElement("", "hi!");
    XmlElement xmlElement19 = xmlElement2.removeElement(xmlElement18);
    java.lang.String str20 = xmlElement18.getData();
    XmlElement xmlElement23 = new XmlElement("", "");
    XmlElement xmlElement26 = new XmlElement("", "");
    java.lang.String str29 = xmlElement26.getAttribute("", "hi!");
    xmlElement23.setParent(xmlElement26);
    xmlElement23.notifyObservers((java.lang.Object)false);
    int i33 = xmlElement23.countObservers();
    XmlElement xmlElement36 = new XmlElement("", "");
    XmlElement xmlElement38 = xmlElement36.addSubElement("hi!");
    boolean b39 = xmlElement23.addElement(xmlElement38);
    XmlElement xmlElement42 = new XmlElement("", "");
    XmlElement xmlElement45 = new XmlElement("", "");
    java.lang.String str48 = xmlElement45.getAttribute("", "hi!");
    xmlElement42.setParent(xmlElement45);
    xmlElement42.notifyObservers((java.lang.Object)false);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str52 = xmlElement42.getAttributes();
    xmlElement38.setAttributes(hashtable_str_str52);
    xmlElement18.setAttributes(hashtable_str_str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!"+ "'", str48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str52);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    XmlElement xmlElement2 = new XmlElement("", "hi!");
    XmlElement xmlElement4 = xmlElement2.getElement("");
    xmlElement2.notifyObservers((java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement4);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    int i12 = xmlElement2.countObservers();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement15.addSubElement("hi!");
    boolean b18 = xmlElement2.addElement(xmlElement17);
    XmlElement xmlElement21 = xmlElement17.addSubElement("", "hi!");
    boolean b22 = xmlElement17.hasChanged();
    XmlElement xmlElement25 = new XmlElement("", "");
    java.lang.String str27 = xmlElement25.getAttribute("");
    XmlElement xmlElement30 = new XmlElement("", "");
    XmlElement xmlElement33 = new XmlElement("", "");
    java.lang.String str36 = xmlElement33.getAttribute("", "hi!");
    xmlElement30.setParent(xmlElement33);
    xmlElement30.notifyObservers((java.lang.Object)false);
    xmlElement25.setParent(xmlElement30);
    xmlElement17.notifyObservers((java.lang.Object)xmlElement25);
    XmlElement xmlElement44 = new XmlElement("", "");
    XmlElement xmlElement47 = new XmlElement("", "");
    java.lang.String str50 = xmlElement47.getAttribute("", "hi!");
    xmlElement44.setParent(xmlElement47);
    XmlElement xmlElement54 = new XmlElement("", "");
    XmlElement xmlElement57 = new XmlElement("", "");
    java.lang.String str60 = xmlElement57.getAttribute("", "hi!");
    xmlElement54.setParent(xmlElement57);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str62 = xmlElement57.getAttributes();
    xmlElement47.setAttributes(hashtable_str_str62);
    xmlElement25.setAttributes(hashtable_str_str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!"+ "'", str50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!"+ "'", str60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str62);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("hi!");
    XmlElement xmlElement7 = new XmlElement("", "");
    XmlElement xmlElement10 = new XmlElement("", "");
    java.lang.String str13 = xmlElement10.getAttribute("", "hi!");
    xmlElement7.setParent(xmlElement10);
    xmlElement7.notifyObservers((java.lang.Object)false);
    int i17 = xmlElement7.countObservers();
    XmlElement xmlElement20 = new XmlElement("", "");
    XmlElement xmlElement22 = xmlElement20.addSubElement("hi!");
    boolean b23 = xmlElement7.addElement(xmlElement22);
    XmlElement xmlElement26 = xmlElement22.addSubElement("", "hi!");
    boolean b27 = xmlElement22.hasChanged();
    xmlElement2.notifyObservers((java.lang.Object)b27);
    XmlElement xmlElement31 = new XmlElement("", "");
    XmlElement xmlElement34 = new XmlElement("", "");
    java.lang.String str37 = xmlElement34.getAttribute("", "hi!");
    xmlElement31.setParent(xmlElement34);
    xmlElement31.notifyObservers((java.lang.Object)false);
    java.util.List list41 = xmlElement31.getElements();
    XmlElement xmlElement44 = new XmlElement("", "");
    XmlElement xmlElement47 = new XmlElement("", "");
    java.lang.String str50 = xmlElement47.getAttribute("", "hi!");
    xmlElement44.setParent(xmlElement47);
    xmlElement31.setParent(xmlElement47);
    XmlElement.printNode(xmlElement31, "hi!");
    boolean b55 = xmlElement31.hasChanged();
    xmlElement2.setParent(xmlElement31);
    XmlElement xmlElement57 = xmlElement31.getParent();
    xmlElement57.setData("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!"+ "'", str50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement57);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    XmlElement xmlElement3 = new XmlElement("", "");
    XmlElement xmlElement6 = new XmlElement("", "");
    java.lang.String str9 = xmlElement6.getAttribute("", "hi!");
    xmlElement3.setParent(xmlElement6);
    java.lang.String str12 = xmlElement3.getAttribute("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str13 = xmlElement3.getAttributes();
    XmlElement xmlElement14 = new XmlElement("hi!", hashtable_str_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str13);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    java.lang.String str5 = xmlElement2.getAttribute("", "hi!");
    xmlElement2.removeAllElements();
    java.lang.String str7 = xmlElement2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    int i3 = xmlElement2.countObservers();
    boolean b4 = xmlElement2.hasChanged();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = xmlElement2.getAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashtable_str_str5);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    java.util.List list12 = xmlElement2.getElements();
    int i13 = xmlElement2.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    java.lang.String str4 = xmlElement2.getAttribute("");
    int i5 = xmlElement2.count();
    XmlElement xmlElement6 = xmlElement2.getParent();
    int i7 = xmlElement2.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    java.lang.Object obj10 = xmlElement2.clone();
    xmlElement2.setData("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    java.lang.String str10 = xmlElement2.getData();
    boolean b11 = xmlElement2.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    XmlElement xmlElement4 = new XmlElement("", "");
    XmlElement xmlElement7 = xmlElement4.addSubElement("", "hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = xmlElement4.getAttributes();
    XmlElement xmlElement9 = new XmlElement("", hashtable_str_str8);
    XmlElement xmlElement10 = new XmlElement("hi!", hashtable_str_str8);
    XmlElement.printNode(xmlElement10, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str8);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("hi!");
    XmlElement xmlElement7 = new XmlElement("", "");
    XmlElement xmlElement10 = new XmlElement("", "");
    java.lang.String str13 = xmlElement10.getAttribute("", "hi!");
    xmlElement7.setParent(xmlElement10);
    xmlElement7.notifyObservers((java.lang.Object)false);
    int i17 = xmlElement7.countObservers();
    XmlElement xmlElement20 = new XmlElement("", "");
    XmlElement xmlElement22 = xmlElement20.addSubElement("hi!");
    boolean b23 = xmlElement7.addElement(xmlElement22);
    XmlElement xmlElement26 = xmlElement22.addSubElement("", "hi!");
    boolean b27 = xmlElement22.hasChanged();
    xmlElement2.notifyObservers((java.lang.Object)b27);
    XmlElement xmlElement31 = new XmlElement("", "");
    XmlElement xmlElement34 = new XmlElement("", "");
    java.lang.String str37 = xmlElement34.getAttribute("", "hi!");
    xmlElement31.setParent(xmlElement34);
    xmlElement31.notifyObservers((java.lang.Object)false);
    java.util.List list41 = xmlElement31.getElements();
    XmlElement xmlElement44 = new XmlElement("", "");
    XmlElement xmlElement47 = new XmlElement("", "");
    java.lang.String str50 = xmlElement47.getAttribute("", "hi!");
    xmlElement44.setParent(xmlElement47);
    xmlElement31.setParent(xmlElement47);
    XmlElement.printNode(xmlElement31, "hi!");
    boolean b55 = xmlElement31.hasChanged();
    xmlElement2.setParent(xmlElement31);
    XmlElement xmlElement57 = xmlElement31.getParent();
    XmlElement xmlElement60 = new XmlElement("", "");
    XmlElement xmlElement63 = new XmlElement("", "");
    java.lang.String str66 = xmlElement63.getAttribute("", "hi!");
    xmlElement60.setParent(xmlElement63);
    xmlElement60.notifyObservers((java.lang.Object)false);
    java.lang.String str72 = xmlElement60.getAttribute("hi!", "hi!");
    XmlElement xmlElement73 = xmlElement31.addSubElement(xmlElement60);
    xmlElement60.removeFromParent();
    XmlElement xmlElement77 = new XmlElement("", "");
    XmlElement xmlElement80 = xmlElement77.addSubElement("", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    xmlElement60.insertElement(xmlElement80, (int)'#');
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!"+ "'", str50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!"+ "'", str66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!"+ "'", str72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement80);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    XmlElement xmlElement12 = new XmlElement("", "");
    XmlElement xmlElement15 = new XmlElement("", "");
    java.lang.String str18 = xmlElement15.getAttribute("", "hi!");
    xmlElement12.setParent(xmlElement15);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str20 = xmlElement15.getAttributes();
    xmlElement5.setAttributes(hashtable_str_str20);
    java.lang.String str24 = xmlElement5.getAttribute("hi!", "hi!");
    java.lang.String str26 = xmlElement5.getAttribute("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    java.lang.String str4 = xmlElement2.getAttribute("");
    int i5 = xmlElement2.count();
    xmlElement2.deleteObservers();
    java.util.List list7 = xmlElement2.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list7);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("hi!");
    XmlElement xmlElement7 = new XmlElement("", "");
    XmlElement xmlElement10 = new XmlElement("", "");
    java.lang.String str13 = xmlElement10.getAttribute("", "hi!");
    xmlElement7.setParent(xmlElement10);
    xmlElement7.notifyObservers((java.lang.Object)false);
    int i17 = xmlElement7.countObservers();
    XmlElement xmlElement20 = new XmlElement("", "");
    XmlElement xmlElement22 = xmlElement20.addSubElement("hi!");
    boolean b23 = xmlElement7.addElement(xmlElement22);
    XmlElement xmlElement26 = xmlElement22.addSubElement("", "hi!");
    boolean b27 = xmlElement22.hasChanged();
    xmlElement2.notifyObservers((java.lang.Object)b27);
    XmlElement xmlElement31 = new XmlElement("", "");
    XmlElement xmlElement34 = new XmlElement("", "");
    java.lang.String str37 = xmlElement34.getAttribute("", "hi!");
    xmlElement31.setParent(xmlElement34);
    xmlElement31.notifyObservers((java.lang.Object)false);
    java.util.List list41 = xmlElement31.getElements();
    XmlElement xmlElement44 = new XmlElement("", "");
    XmlElement xmlElement47 = new XmlElement("", "");
    java.lang.String str50 = xmlElement47.getAttribute("", "hi!");
    xmlElement44.setParent(xmlElement47);
    xmlElement31.setParent(xmlElement47);
    XmlElement.printNode(xmlElement31, "hi!");
    boolean b55 = xmlElement31.hasChanged();
    xmlElement2.setParent(xmlElement31);
    XmlElement xmlElement57 = xmlElement31.getParent();
    XmlElement xmlElement60 = new XmlElement("", "");
    XmlElement xmlElement63 = new XmlElement("", "");
    java.lang.String str66 = xmlElement63.getAttribute("", "hi!");
    xmlElement60.setParent(xmlElement63);
    xmlElement60.notifyObservers((java.lang.Object)false);
    java.lang.String str72 = xmlElement60.getAttribute("hi!", "hi!");
    XmlElement xmlElement73 = xmlElement31.addSubElement(xmlElement60);
    java.lang.Object obj76 = xmlElement60.addAttribute("", "");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement78 = xmlElement60.removeElement((int)(short)100);
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!"+ "'", str50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!"+ "'", str66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!"+ "'", str72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj76);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    java.util.List list12 = xmlElement2.getElements();
    xmlElement2.notifyObservers();
    int i14 = xmlElement2.count();
    XmlElement xmlElement15 = xmlElement2.getParent();
    int i16 = xmlElement15.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    int i12 = xmlElement2.countObservers();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement15.addSubElement("hi!");
    boolean b18 = xmlElement2.addElement(xmlElement17);
    XmlElement xmlElement21 = xmlElement17.addSubElement("", "hi!");
    boolean b22 = xmlElement17.hasChanged();
    XmlElement xmlElement25 = new XmlElement("", "");
    java.lang.String str27 = xmlElement25.getAttribute("");
    XmlElement xmlElement30 = new XmlElement("", "");
    XmlElement xmlElement33 = new XmlElement("", "");
    java.lang.String str36 = xmlElement33.getAttribute("", "hi!");
    xmlElement30.setParent(xmlElement33);
    xmlElement30.notifyObservers((java.lang.Object)false);
    xmlElement25.setParent(xmlElement30);
    xmlElement17.notifyObservers((java.lang.Object)xmlElement25);
    XmlElement xmlElement44 = new XmlElement("", "");
    XmlElement xmlElement47 = new XmlElement("", "");
    java.lang.String str50 = xmlElement47.getAttribute("", "hi!");
    xmlElement44.setParent(xmlElement47);
    xmlElement44.notifyObservers();
    XmlElement xmlElement53 = xmlElement17.removeElement(xmlElement44);
    boolean b55 = xmlElement44.equals((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!"+ "'", str50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    XmlElement xmlElement3 = new XmlElement("", "");
    XmlElement xmlElement6 = new XmlElement("", "");
    java.lang.String str9 = xmlElement6.getAttribute("", "hi!");
    xmlElement3.setParent(xmlElement6);
    xmlElement3.notifyObservers((java.lang.Object)false);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str13 = xmlElement3.getAttributes();
    XmlElement xmlElement16 = new XmlElement("", "");
    XmlElement xmlElement18 = xmlElement16.addSubElement("hi!");
    XmlElement xmlElement21 = new XmlElement("", "");
    XmlElement xmlElement24 = new XmlElement("", "");
    java.lang.String str27 = xmlElement24.getAttribute("", "hi!");
    xmlElement21.setParent(xmlElement24);
    xmlElement21.notifyObservers((java.lang.Object)false);
    int i31 = xmlElement21.countObservers();
    XmlElement xmlElement34 = new XmlElement("", "");
    XmlElement xmlElement36 = xmlElement34.addSubElement("hi!");
    boolean b37 = xmlElement21.addElement(xmlElement36);
    XmlElement xmlElement40 = xmlElement36.addSubElement("", "hi!");
    boolean b41 = xmlElement36.hasChanged();
    xmlElement16.notifyObservers((java.lang.Object)b41);
    XmlElement xmlElement45 = new XmlElement("", "");
    XmlElement xmlElement48 = new XmlElement("", "");
    java.lang.String str51 = xmlElement48.getAttribute("", "hi!");
    xmlElement45.setParent(xmlElement48);
    xmlElement45.notifyObservers((java.lang.Object)false);
    java.util.List list55 = xmlElement45.getElements();
    XmlElement xmlElement58 = new XmlElement("", "");
    XmlElement xmlElement61 = new XmlElement("", "");
    java.lang.String str64 = xmlElement61.getAttribute("", "hi!");
    xmlElement58.setParent(xmlElement61);
    xmlElement45.setParent(xmlElement61);
    XmlElement.printNode(xmlElement45, "hi!");
    boolean b69 = xmlElement45.hasChanged();
    xmlElement16.setParent(xmlElement45);
    XmlElement xmlElement71 = xmlElement3.removeElement(xmlElement16);
    XmlElement xmlElement74 = new XmlElement("", "");
    XmlElement xmlElement77 = new XmlElement("", "");
    java.lang.String str80 = xmlElement77.getAttribute("", "hi!");
    xmlElement74.setParent(xmlElement77);
    java.util.List list82 = xmlElement74.getElements();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str83 = xmlElement74.getAttributes();
    xmlElement3.setAttributes(hashtable_str_str83);
    XmlElement xmlElement85 = new XmlElement("", hashtable_str_str83);
    java.lang.String str87 = xmlElement85.getAttribute("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!"+ "'", str51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!"+ "'", str64.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "hi!"+ "'", str80.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str87);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = xmlElement2.addSubElement("", "hi!");
    XmlElement xmlElement8 = new XmlElement("", "");
    XmlElement xmlElement11 = new XmlElement("", "");
    java.lang.String str14 = xmlElement11.getAttribute("", "hi!");
    xmlElement8.setParent(xmlElement11);
    xmlElement8.notifyObservers((java.lang.Object)false);
    java.lang.String str20 = xmlElement8.getAttribute("hi!", "hi!");
    xmlElement2.notifyObservers((java.lang.Object)"hi!");
    java.util.Observer observer22 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement2.addObserver(observer22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    java.util.List list10 = xmlElement2.getElements();
    xmlElement2.notifyObservers();
    XmlElement xmlElement14 = new XmlElement("", "");
    XmlElement xmlElement17 = new XmlElement("", "");
    java.lang.String str20 = xmlElement17.getAttribute("", "hi!");
    xmlElement14.setParent(xmlElement17);
    xmlElement14.notifyObservers((java.lang.Object)false);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str24 = xmlElement14.getAttributes();
    xmlElement2.setParent(xmlElement14);
    java.util.Observer observer26 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement14.addObserver(observer26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str24);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    XmlElement xmlElement12 = new XmlElement("", "");
    XmlElement xmlElement15 = new XmlElement("", "");
    java.lang.String str18 = xmlElement15.getAttribute("", "hi!");
    xmlElement12.setParent(xmlElement15);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str20 = xmlElement15.getAttributes();
    xmlElement5.setAttributes(hashtable_str_str20);
    java.lang.String str24 = xmlElement5.getAttribute("hi!", "hi!");
    int i25 = xmlElement5.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = xmlElement2.addSubElement("", "hi!");
    boolean b6 = xmlElement5.hasChanged();
    java.lang.String str7 = xmlElement5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    java.util.List list10 = xmlElement2.getElements();
    java.lang.String str13 = xmlElement2.getAttribute("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = new XmlElement("", "");
    XmlElement xmlElement7 = new XmlElement("", "");
    java.lang.String str10 = xmlElement7.getAttribute("", "hi!");
    xmlElement4.setParent(xmlElement7);
    xmlElement4.notifyObservers((java.lang.Object)false);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str14 = xmlElement4.getAttributes();
    xmlElement1.setAttributes(hashtable_str_str14);
    XmlElement xmlElement17 = xmlElement1.getElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement17);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    XmlElement xmlElement0 = new XmlElement();
    XmlElement xmlElement3 = new XmlElement("", "");
    XmlElement xmlElement6 = new XmlElement("", "");
    java.lang.String str9 = xmlElement6.getAttribute("", "hi!");
    xmlElement3.setParent(xmlElement6);
    xmlElement3.notifyObservers((java.lang.Object)false);
    boolean b13 = xmlElement0.addElement(xmlElement3);
    java.lang.String str14 = xmlElement0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.deleteObservers();
    java.lang.String str12 = xmlElement2.getAttribute("hi!");
    boolean b13 = xmlElement2.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    XmlElement xmlElement12 = new XmlElement("", "");
    XmlElement xmlElement15 = new XmlElement("", "");
    java.lang.String str18 = xmlElement15.getAttribute("", "hi!");
    xmlElement12.setParent(xmlElement15);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str20 = xmlElement15.getAttributes();
    xmlElement5.setAttributes(hashtable_str_str20);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement23 = xmlElement5.getElement((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str20);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.removeFromParent();
    XmlElement xmlElement12 = xmlElement2.getElement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement12);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    int i12 = xmlElement2.countObservers();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement15.addSubElement("hi!");
    boolean b18 = xmlElement2.addElement(xmlElement17);
    XmlElement xmlElement21 = xmlElement17.addSubElement("", "hi!");
    boolean b22 = xmlElement17.hasChanged();
    xmlElement17.removeAllElements();
    xmlElement17.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = xmlElement2.getAttributes();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement18 = xmlElement15.addSubElement("", "hi!");
    XmlElement xmlElement19 = xmlElement2.removeElement(xmlElement18);
    java.util.Enumeration enumeration20 = xmlElement2.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration20);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    int i12 = xmlElement2.countObservers();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement15.addSubElement("hi!");
    boolean b18 = xmlElement2.addElement(xmlElement17);
    XmlElement xmlElement21 = xmlElement17.addSubElement("", "hi!");
    boolean b22 = xmlElement17.hasChanged();
    xmlElement17.removeAllElements();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement25 = xmlElement17.getElement(1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    java.lang.String str11 = xmlElement2.getAttribute("");
    java.util.Observer observer12 = null;
    xmlElement2.deleteObserver(observer12);
    java.lang.String str14 = xmlElement2.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    java.util.List list10 = xmlElement2.getElements();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = xmlElement2.getAttributes();
    XmlElement xmlElement14 = xmlElement2.addSubElement("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement14);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("hi!");
    XmlElement xmlElement7 = new XmlElement("", "");
    XmlElement xmlElement10 = new XmlElement("", "");
    java.lang.String str13 = xmlElement10.getAttribute("", "hi!");
    xmlElement7.setParent(xmlElement10);
    xmlElement7.notifyObservers((java.lang.Object)false);
    int i17 = xmlElement7.countObservers();
    XmlElement xmlElement20 = new XmlElement("", "");
    XmlElement xmlElement22 = xmlElement20.addSubElement("hi!");
    boolean b23 = xmlElement7.addElement(xmlElement22);
    XmlElement xmlElement26 = xmlElement22.addSubElement("", "hi!");
    boolean b27 = xmlElement22.hasChanged();
    xmlElement2.notifyObservers((java.lang.Object)b27);
    xmlElement2.deleteObservers();
    XmlElement xmlElement32 = new XmlElement("", "");
    XmlElement xmlElement35 = xmlElement32.addSubElement("", "hi!");
    xmlElement35.setName("hi!");
    XmlElement xmlElement38 = xmlElement2.addSubElement(xmlElement35);
    xmlElement38.setData("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement38);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    int i12 = xmlElement2.countObservers();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement15.addSubElement("hi!");
    boolean b18 = xmlElement2.addElement(xmlElement17);
    XmlElement xmlElement21 = xmlElement17.addSubElement("", "hi!");
    boolean b22 = xmlElement17.hasChanged();
    XmlElement xmlElement25 = new XmlElement("", "");
    java.lang.String str27 = xmlElement25.getAttribute("");
    XmlElement xmlElement30 = new XmlElement("", "");
    XmlElement xmlElement33 = new XmlElement("", "");
    java.lang.String str36 = xmlElement33.getAttribute("", "hi!");
    xmlElement30.setParent(xmlElement33);
    xmlElement30.notifyObservers((java.lang.Object)false);
    xmlElement25.setParent(xmlElement30);
    xmlElement17.notifyObservers((java.lang.Object)xmlElement25);
    XmlElement xmlElement44 = new XmlElement("", "");
    XmlElement xmlElement47 = new XmlElement("", "");
    java.lang.String str50 = xmlElement47.getAttribute("", "hi!");
    xmlElement44.setParent(xmlElement47);
    xmlElement44.notifyObservers();
    XmlElement xmlElement53 = xmlElement17.removeElement(xmlElement44);
    int i54 = xmlElement44.count();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement56 = xmlElement44.removeElement(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!"+ "'", str50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    xmlElement2.setName("");
    java.lang.String str14 = xmlElement2.getData();
    XmlElement xmlElement16 = xmlElement2.getElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    XmlElement xmlElement1 = new XmlElement("hi!");

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement13 = xmlElement2.getElement(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    java.lang.String str4 = xmlElement2.getAttribute("");
    XmlElement xmlElement7 = xmlElement2.addSubElement("hi!", "hi!");
    java.util.List list8 = xmlElement2.getElements();
    xmlElement2.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    int i12 = xmlElement2.countObservers();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement15.addSubElement("hi!");
    boolean b18 = xmlElement2.addElement(xmlElement17);
    XmlElement xmlElement21 = xmlElement17.addSubElement("", "hi!");
    boolean b22 = xmlElement21.hasChanged();
    XmlElement xmlElement25 = new XmlElement("", "");
    XmlElement xmlElement28 = new XmlElement("", "");
    java.lang.String str31 = xmlElement28.getAttribute("", "hi!");
    xmlElement25.setParent(xmlElement28);
    xmlElement25.notifyObservers((java.lang.Object)false);
    int i35 = xmlElement25.countObservers();
    XmlElement xmlElement38 = new XmlElement("", "");
    XmlElement xmlElement40 = xmlElement38.addSubElement("hi!");
    boolean b41 = xmlElement25.addElement(xmlElement40);
    XmlElement xmlElement44 = xmlElement40.addSubElement("", "hi!");
    boolean b45 = xmlElement40.hasChanged();
    XmlElement xmlElement48 = new XmlElement("", "");
    java.lang.String str50 = xmlElement48.getAttribute("");
    XmlElement xmlElement53 = new XmlElement("", "");
    XmlElement xmlElement56 = new XmlElement("", "");
    java.lang.String str59 = xmlElement56.getAttribute("", "hi!");
    xmlElement53.setParent(xmlElement56);
    xmlElement53.notifyObservers((java.lang.Object)false);
    xmlElement48.setParent(xmlElement53);
    xmlElement40.notifyObservers((java.lang.Object)xmlElement48);
    XmlElement xmlElement67 = new XmlElement("", "");
    XmlElement xmlElement70 = new XmlElement("", "");
    java.lang.String str73 = xmlElement70.getAttribute("", "hi!");
    xmlElement67.setParent(xmlElement70);
    xmlElement67.notifyObservers();
    XmlElement xmlElement76 = xmlElement40.removeElement(xmlElement67);
    XmlElement xmlElement78 = xmlElement40.getElement((int)(byte)0);
    XmlElement xmlElement80 = xmlElement40.addSubElement("");
    xmlElement21.notifyObservers((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!"+ "'", str59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + "hi!"+ "'", str73.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement80);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    XmlElement xmlElement3 = new XmlElement("", "");
    XmlElement xmlElement6 = new XmlElement("", "");
    java.lang.String str9 = xmlElement6.getAttribute("", "hi!");
    xmlElement3.setParent(xmlElement6);
    java.util.List list11 = xmlElement3.getElements();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = xmlElement3.getAttributes();
    XmlElement xmlElement13 = new XmlElement("", hashtable_str_str12);
    java.lang.String str14 = xmlElement13.getData();
    XmlElement xmlElement16 = xmlElement13.getElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    int i12 = xmlElement2.countObservers();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement15.addSubElement("hi!");
    boolean b18 = xmlElement2.addElement(xmlElement17);
    XmlElement xmlElement21 = xmlElement17.addSubElement("", "hi!");
    boolean b22 = xmlElement17.hasChanged();
    xmlElement17.removeAllElements();
    XmlElement xmlElement26 = new XmlElement("", "");
    XmlElement xmlElement29 = xmlElement26.addSubElement("", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    xmlElement17.insertElement(xmlElement26, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement29);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    java.util.List list12 = xmlElement2.getElements();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement18 = new XmlElement("", "");
    java.lang.String str21 = xmlElement18.getAttribute("", "hi!");
    xmlElement15.setParent(xmlElement18);
    xmlElement2.setParent(xmlElement18);
    XmlElement xmlElement25 = xmlElement2.getElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement25);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    int i12 = xmlElement2.countObservers();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement15.addSubElement("hi!");
    boolean b18 = xmlElement2.addElement(xmlElement17);
    xmlElement2.deleteObservers();
    int i20 = xmlElement2.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    int i12 = xmlElement2.countObservers();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement15.addSubElement("hi!");
    boolean b18 = xmlElement2.addElement(xmlElement17);
    XmlElement xmlElement21 = xmlElement17.addSubElement("", "hi!");
    boolean b22 = xmlElement17.hasChanged();
    XmlElement xmlElement25 = new XmlElement("", "");
    java.lang.String str27 = xmlElement25.getAttribute("");
    XmlElement xmlElement30 = new XmlElement("", "");
    XmlElement xmlElement33 = new XmlElement("", "");
    java.lang.String str36 = xmlElement33.getAttribute("", "hi!");
    xmlElement30.setParent(xmlElement33);
    xmlElement30.notifyObservers((java.lang.Object)false);
    xmlElement25.setParent(xmlElement30);
    xmlElement17.notifyObservers((java.lang.Object)xmlElement25);
    XmlElement xmlElement44 = new XmlElement("", "");
    XmlElement xmlElement46 = xmlElement44.addSubElement("hi!");
    boolean b47 = xmlElement25.addElement(xmlElement44);
    xmlElement44.setName("hi!");
    java.lang.Object obj52 = xmlElement44.addAttribute("", "hi!");
    java.util.Observer observer53 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement44.addObserver(observer53);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj52);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("hi!");
    XmlElement xmlElement7 = new XmlElement("", "");
    XmlElement xmlElement10 = new XmlElement("", "");
    java.lang.String str13 = xmlElement10.getAttribute("", "hi!");
    xmlElement7.setParent(xmlElement10);
    xmlElement7.notifyObservers((java.lang.Object)false);
    int i17 = xmlElement7.countObservers();
    XmlElement xmlElement20 = new XmlElement("", "");
    XmlElement xmlElement22 = xmlElement20.addSubElement("hi!");
    boolean b23 = xmlElement7.addElement(xmlElement22);
    XmlElement xmlElement26 = xmlElement22.addSubElement("", "hi!");
    boolean b27 = xmlElement22.hasChanged();
    xmlElement2.notifyObservers((java.lang.Object)b27);
    XmlElement xmlElement31 = new XmlElement("", "");
    XmlElement xmlElement34 = new XmlElement("", "");
    java.lang.String str37 = xmlElement34.getAttribute("", "hi!");
    xmlElement31.setParent(xmlElement34);
    xmlElement31.notifyObservers((java.lang.Object)false);
    java.util.List list41 = xmlElement31.getElements();
    XmlElement xmlElement44 = new XmlElement("", "");
    XmlElement xmlElement47 = new XmlElement("", "");
    java.lang.String str50 = xmlElement47.getAttribute("", "hi!");
    xmlElement44.setParent(xmlElement47);
    xmlElement31.setParent(xmlElement47);
    XmlElement.printNode(xmlElement31, "hi!");
    boolean b55 = xmlElement31.hasChanged();
    xmlElement2.setParent(xmlElement31);
    XmlElement xmlElement57 = xmlElement31.getParent();
    XmlElement xmlElement60 = new XmlElement("", "");
    XmlElement xmlElement63 = new XmlElement("", "");
    java.lang.String str66 = xmlElement63.getAttribute("", "hi!");
    xmlElement60.setParent(xmlElement63);
    xmlElement60.notifyObservers((java.lang.Object)false);
    java.lang.String str72 = xmlElement60.getAttribute("hi!", "hi!");
    XmlElement xmlElement73 = xmlElement31.addSubElement(xmlElement60);
    XmlElement xmlElement76 = new XmlElement("", "");
    XmlElement xmlElement79 = xmlElement76.addSubElement("", "hi!");
    XmlElement xmlElement80 = xmlElement73.addSubElement(xmlElement79);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str82 = null;
    XmlElement xmlElement83 = new XmlElement("hi!", hashtable_str_str82);
    xmlElement79.append(xmlElement83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!"+ "'", str50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!"+ "'", str66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!"+ "'", str72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement80);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("hi!");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement6 = xmlElement4.getElement((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = xmlElement2.getAttributes();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement15.addSubElement("hi!");
    XmlElement xmlElement20 = new XmlElement("", "");
    XmlElement xmlElement23 = new XmlElement("", "");
    java.lang.String str26 = xmlElement23.getAttribute("", "hi!");
    xmlElement20.setParent(xmlElement23);
    xmlElement20.notifyObservers((java.lang.Object)false);
    int i30 = xmlElement20.countObservers();
    XmlElement xmlElement33 = new XmlElement("", "");
    XmlElement xmlElement35 = xmlElement33.addSubElement("hi!");
    boolean b36 = xmlElement20.addElement(xmlElement35);
    XmlElement xmlElement39 = xmlElement35.addSubElement("", "hi!");
    boolean b40 = xmlElement35.hasChanged();
    xmlElement15.notifyObservers((java.lang.Object)b40);
    XmlElement xmlElement44 = new XmlElement("", "");
    XmlElement xmlElement47 = new XmlElement("", "");
    java.lang.String str50 = xmlElement47.getAttribute("", "hi!");
    xmlElement44.setParent(xmlElement47);
    xmlElement44.notifyObservers((java.lang.Object)false);
    java.util.List list54 = xmlElement44.getElements();
    XmlElement xmlElement57 = new XmlElement("", "");
    XmlElement xmlElement60 = new XmlElement("", "");
    java.lang.String str63 = xmlElement60.getAttribute("", "hi!");
    xmlElement57.setParent(xmlElement60);
    xmlElement44.setParent(xmlElement60);
    XmlElement.printNode(xmlElement44, "hi!");
    boolean b68 = xmlElement44.hasChanged();
    xmlElement15.setParent(xmlElement44);
    XmlElement xmlElement70 = xmlElement2.removeElement(xmlElement15);
    XmlElement.printNode(xmlElement2, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!"+ "'", str50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "hi!"+ "'", str63.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement70);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("hi!");
    XmlElement xmlElement7 = new XmlElement("", "");
    XmlElement xmlElement10 = new XmlElement("", "");
    java.lang.String str13 = xmlElement10.getAttribute("", "hi!");
    xmlElement7.setParent(xmlElement10);
    xmlElement7.notifyObservers((java.lang.Object)false);
    int i17 = xmlElement7.countObservers();
    XmlElement xmlElement20 = new XmlElement("", "");
    XmlElement xmlElement22 = xmlElement20.addSubElement("hi!");
    boolean b23 = xmlElement7.addElement(xmlElement22);
    XmlElement xmlElement26 = xmlElement22.addSubElement("", "hi!");
    boolean b27 = xmlElement22.hasChanged();
    xmlElement2.notifyObservers((java.lang.Object)b27);
    XmlElement xmlElement31 = new XmlElement("", "");
    XmlElement xmlElement34 = new XmlElement("", "");
    java.lang.String str37 = xmlElement34.getAttribute("", "hi!");
    xmlElement31.setParent(xmlElement34);
    xmlElement31.notifyObservers((java.lang.Object)false);
    java.util.List list41 = xmlElement31.getElements();
    XmlElement xmlElement44 = new XmlElement("", "");
    XmlElement xmlElement47 = new XmlElement("", "");
    java.lang.String str50 = xmlElement47.getAttribute("", "hi!");
    xmlElement44.setParent(xmlElement47);
    xmlElement31.setParent(xmlElement47);
    XmlElement.printNode(xmlElement31, "hi!");
    boolean b55 = xmlElement31.hasChanged();
    xmlElement2.setParent(xmlElement31);
    XmlElement xmlElement57 = xmlElement31.getParent();
    XmlElement xmlElement60 = new XmlElement("", "");
    XmlElement xmlElement63 = new XmlElement("", "");
    java.lang.String str66 = xmlElement63.getAttribute("", "hi!");
    xmlElement60.setParent(xmlElement63);
    xmlElement60.notifyObservers((java.lang.Object)false);
    java.lang.String str72 = xmlElement60.getAttribute("hi!", "hi!");
    XmlElement xmlElement73 = xmlElement31.addSubElement(xmlElement60);
    XmlElement xmlElement76 = new XmlElement("", "");
    XmlElement xmlElement79 = xmlElement76.addSubElement("", "hi!");
    XmlElement xmlElement80 = xmlElement73.addSubElement(xmlElement79);
    xmlElement73.removeAllElements();
    XmlElement xmlElement84 = new XmlElement("", "");
    XmlElement xmlElement87 = new XmlElement("", "");
    java.lang.String str90 = xmlElement87.getAttribute("", "hi!");
    xmlElement84.setParent(xmlElement87);
    xmlElement84.notifyObservers((java.lang.Object)false);
    xmlElement84.setName("");
    java.lang.String str96 = xmlElement84.getData();
    xmlElement73.notifyObservers((java.lang.Object)str96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!"+ "'", str50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!"+ "'", str66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!"+ "'", str72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str90 + "' != '" + "hi!"+ "'", str90.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str96 + "' != '" + ""+ "'", str96.equals(""));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement4 = xmlElement2.addSubElement("hi!");
    XmlElement xmlElement7 = new XmlElement("", "");
    XmlElement xmlElement10 = new XmlElement("", "");
    java.lang.String str13 = xmlElement10.getAttribute("", "hi!");
    xmlElement7.setParent(xmlElement10);
    xmlElement7.notifyObservers((java.lang.Object)false);
    int i17 = xmlElement7.countObservers();
    XmlElement xmlElement20 = new XmlElement("", "");
    XmlElement xmlElement22 = xmlElement20.addSubElement("hi!");
    boolean b23 = xmlElement7.addElement(xmlElement22);
    XmlElement xmlElement26 = xmlElement22.addSubElement("", "hi!");
    boolean b27 = xmlElement22.hasChanged();
    xmlElement2.notifyObservers((java.lang.Object)b27);
    XmlElement xmlElement31 = new XmlElement("", "");
    XmlElement xmlElement34 = new XmlElement("", "");
    java.lang.String str37 = xmlElement34.getAttribute("", "hi!");
    xmlElement31.setParent(xmlElement34);
    xmlElement31.notifyObservers((java.lang.Object)false);
    java.util.List list41 = xmlElement31.getElements();
    XmlElement xmlElement44 = new XmlElement("", "");
    XmlElement xmlElement47 = new XmlElement("", "");
    java.lang.String str50 = xmlElement47.getAttribute("", "hi!");
    xmlElement44.setParent(xmlElement47);
    xmlElement31.setParent(xmlElement47);
    XmlElement.printNode(xmlElement31, "hi!");
    boolean b55 = xmlElement31.hasChanged();
    xmlElement2.setParent(xmlElement31);
    XmlElement xmlElement57 = xmlElement31.getParent();
    XmlElement xmlElement60 = new XmlElement("", "");
    XmlElement xmlElement63 = new XmlElement("", "");
    java.lang.String str66 = xmlElement63.getAttribute("", "hi!");
    xmlElement60.setParent(xmlElement63);
    xmlElement60.notifyObservers((java.lang.Object)false);
    java.lang.String str72 = xmlElement60.getAttribute("hi!", "hi!");
    XmlElement xmlElement73 = xmlElement31.addSubElement(xmlElement60);
    XmlElement xmlElement76 = new XmlElement("", "");
    XmlElement xmlElement79 = new XmlElement("", "");
    java.lang.String str82 = xmlElement79.getAttribute("", "hi!");
    xmlElement76.setParent(xmlElement79);
    xmlElement76.notifyObservers((java.lang.Object)false);
    int i86 = xmlElement76.countObservers();
    XmlElement xmlElement89 = new XmlElement("", "");
    XmlElement xmlElement91 = xmlElement89.addSubElement("hi!");
    boolean b92 = xmlElement76.addElement(xmlElement91);
    XmlElement xmlElement95 = xmlElement91.addSubElement("", "hi!");
    boolean b96 = xmlElement31.addElement(xmlElement95);
    int i97 = xmlElement95.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!"+ "'", str50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!"+ "'", str66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!"+ "'", str72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str82 + "' != '" + "hi!"+ "'", str82.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i97 == 0);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = xmlElement2.getAttributes();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement18 = xmlElement15.addSubElement("", "hi!");
    XmlElement xmlElement19 = xmlElement2.removeElement(xmlElement18);
    java.lang.Object obj20 = xmlElement18.clone();
    XmlElement xmlElement22 = xmlElement18.addSubElement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    XmlElement xmlElement0 = new XmlElement();
    XmlElement xmlElement3 = new XmlElement("", "");
    XmlElement xmlElement6 = new XmlElement("", "");
    java.lang.String str9 = xmlElement6.getAttribute("", "hi!");
    xmlElement3.setParent(xmlElement6);
    xmlElement3.notifyObservers((java.lang.Object)false);
    boolean b13 = xmlElement0.addElement(xmlElement3);
    xmlElement0.deleteObservers();
    XmlElement xmlElement15 = xmlElement0.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement15);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    java.lang.String str4 = xmlElement2.getAttribute("");
    int i5 = xmlElement2.count();
    java.util.Enumeration enumeration6 = xmlElement2.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    XmlElement xmlElement12 = new XmlElement("", "");
    XmlElement xmlElement15 = new XmlElement("", "");
    java.lang.String str18 = xmlElement15.getAttribute("", "hi!");
    xmlElement12.setParent(xmlElement15);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str20 = xmlElement15.getAttributes();
    xmlElement5.setAttributes(hashtable_str_str20);
    XmlElement xmlElement23 = xmlElement5.addSubElement("");
    java.util.List list24 = xmlElement23.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list24);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    int i12 = xmlElement2.countObservers();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement15.addSubElement("hi!");
    boolean b18 = xmlElement2.addElement(xmlElement17);
    XmlElement xmlElement21 = xmlElement17.addSubElement("", "hi!");
    boolean b22 = xmlElement17.hasChanged();
    xmlElement17.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = xmlElement2.addSubElement("", "hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement2.getAttributes();
    java.lang.String str7 = xmlElement2.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    int i10 = xmlElement2.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);
    XmlElement xmlElement4 = xmlElement2.addSubElement("hi!");
    XmlElement xmlElement7 = new XmlElement("", "");
    XmlElement xmlElement10 = new XmlElement("", "");
    java.lang.String str13 = xmlElement10.getAttribute("", "hi!");
    xmlElement7.setParent(xmlElement10);
    xmlElement7.notifyObservers((java.lang.Object)false);
    int i17 = xmlElement7.countObservers();
    XmlElement xmlElement20 = new XmlElement("", "");
    XmlElement xmlElement22 = xmlElement20.addSubElement("hi!");
    boolean b23 = xmlElement7.addElement(xmlElement22);
    XmlElement xmlElement26 = xmlElement22.addSubElement("", "hi!");
    boolean b27 = xmlElement22.hasChanged();
    XmlElement xmlElement30 = new XmlElement("", "");
    java.lang.String str32 = xmlElement30.getAttribute("");
    XmlElement xmlElement35 = new XmlElement("", "");
    XmlElement xmlElement38 = new XmlElement("", "");
    java.lang.String str41 = xmlElement38.getAttribute("", "hi!");
    xmlElement35.setParent(xmlElement38);
    xmlElement35.notifyObservers((java.lang.Object)false);
    xmlElement30.setParent(xmlElement35);
    xmlElement22.notifyObservers((java.lang.Object)xmlElement30);
    XmlElement xmlElement49 = new XmlElement("", "");
    XmlElement xmlElement51 = xmlElement49.addSubElement("hi!");
    boolean b52 = xmlElement30.addElement(xmlElement49);
    // The following exception was thrown during execution in test generation
    try {
    xmlElement4.insertElement(xmlElement30, (-1));
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    int i12 = xmlElement2.countObservers();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement15.addSubElement("hi!");
    boolean b18 = xmlElement2.addElement(xmlElement17);
    XmlElement xmlElement19 = xmlElement2.getParent();
    XmlElement xmlElement21 = new XmlElement("");
    XmlElement xmlElement24 = new XmlElement("", "");
    XmlElement xmlElement27 = new XmlElement("", "");
    java.lang.String str30 = xmlElement27.getAttribute("", "hi!");
    xmlElement24.setParent(xmlElement27);
    xmlElement24.notifyObservers((java.lang.Object)false);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str34 = xmlElement24.getAttributes();
    xmlElement21.setAttributes(hashtable_str_str34);
    XmlElement xmlElement38 = new XmlElement("", "");
    XmlElement xmlElement41 = new XmlElement("", "");
    java.lang.String str44 = xmlElement41.getAttribute("", "hi!");
    xmlElement38.setParent(xmlElement41);
    xmlElement38.notifyObservers((java.lang.Object)false);
    int i48 = xmlElement38.countObservers();
    XmlElement xmlElement51 = new XmlElement("", "");
    XmlElement xmlElement53 = xmlElement51.addSubElement("hi!");
    boolean b54 = xmlElement38.addElement(xmlElement53);
    XmlElement xmlElement57 = xmlElement53.addSubElement("", "hi!");
    boolean b58 = xmlElement57.hasChanged();
    xmlElement21.insertElement(xmlElement57, 0);
    XmlElement xmlElement64 = new XmlElement("", "");
    XmlElement xmlElement67 = new XmlElement("", "");
    java.lang.String str70 = xmlElement67.getAttribute("", "hi!");
    xmlElement64.setParent(xmlElement67);
    xmlElement64.notifyObservers((java.lang.Object)false);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str74 = xmlElement64.getAttributes();
    XmlElement xmlElement75 = new XmlElement("hi!", hashtable_str_str74);
    xmlElement21.setAttributes(hashtable_str_str74);
    XmlElement xmlElement77 = xmlElement19.addSubElement(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!"+ "'", str44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "hi!"+ "'", str70.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement77);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = xmlElement2.getAttributes();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement18 = xmlElement15.addSubElement("", "hi!");
    XmlElement xmlElement19 = xmlElement2.removeElement(xmlElement18);
    xmlElement2.setData("");
    xmlElement2.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement19);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    xmlElement2.setName("hi!");

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers();
    int i11 = xmlElement2.count();
    XmlElement xmlElement14 = new XmlElement("", "");
    XmlElement xmlElement17 = new XmlElement("", "");
    java.lang.String str20 = xmlElement17.getAttribute("", "hi!");
    xmlElement14.setParent(xmlElement17);
    java.util.List list22 = xmlElement14.getElements();
    xmlElement14.notifyObservers();
    xmlElement2.append(xmlElement14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    int i12 = xmlElement2.countObservers();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement15.addSubElement("hi!");
    boolean b18 = xmlElement2.addElement(xmlElement17);
    XmlElement xmlElement21 = xmlElement17.addSubElement("", "hi!");
    XmlElement.printNode(xmlElement21, "hi!");
    XmlElement xmlElement27 = new XmlElement("", "");
    XmlElement xmlElement30 = xmlElement27.addSubElement("", "hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str31 = xmlElement27.getAttributes();
    XmlElement xmlElement32 = new XmlElement("", hashtable_str_str31);
    XmlElement xmlElement33 = xmlElement21.removeElement(xmlElement32);
    XmlElement xmlElement36 = new XmlElement("", "");
    XmlElement xmlElement39 = new XmlElement("", "");
    java.lang.String str42 = xmlElement39.getAttribute("", "hi!");
    xmlElement36.setParent(xmlElement39);
    xmlElement36.notifyObservers((java.lang.Object)false);
    int i46 = xmlElement36.countObservers();
    XmlElement xmlElement49 = new XmlElement("", "");
    XmlElement xmlElement51 = xmlElement49.addSubElement("hi!");
    boolean b52 = xmlElement36.addElement(xmlElement51);
    xmlElement51.setName("hi!");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement55 = xmlElement33.removeElement(xmlElement51);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!"+ "'", str42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    xmlElement2.notifyObservers((java.lang.Object)false);
    int i12 = xmlElement2.countObservers();
    XmlElement xmlElement15 = new XmlElement("", "");
    XmlElement xmlElement17 = xmlElement15.addSubElement("hi!");
    boolean b18 = xmlElement2.addElement(xmlElement17);
    XmlElement xmlElement21 = xmlElement17.addSubElement("", "hi!");
    boolean b22 = xmlElement17.hasChanged();
    XmlElement xmlElement25 = new XmlElement("", "");
    java.lang.String str27 = xmlElement25.getAttribute("");
    XmlElement xmlElement30 = new XmlElement("", "");
    XmlElement xmlElement33 = new XmlElement("", "");
    java.lang.String str36 = xmlElement33.getAttribute("", "hi!");
    xmlElement30.setParent(xmlElement33);
    xmlElement30.notifyObservers((java.lang.Object)false);
    xmlElement25.setParent(xmlElement30);
    xmlElement17.notifyObservers((java.lang.Object)xmlElement25);
    XmlElement xmlElement44 = new XmlElement("", "");
    XmlElement xmlElement46 = xmlElement44.addSubElement("hi!");
    boolean b47 = xmlElement25.addElement(xmlElement44);
    XmlElement xmlElement48 = xmlElement44.getParent();
    XmlElement xmlElement51 = new XmlElement("", "");
    XmlElement xmlElement54 = new XmlElement("", "");
    java.lang.String str57 = xmlElement54.getAttribute("", "hi!");
    xmlElement51.setParent(xmlElement54);
    java.util.List list59 = xmlElement51.getElements();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str60 = xmlElement51.getAttributes();
    xmlElement48.setAttributes(hashtable_str_str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!"+ "'", str57.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str60);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    java.lang.String str11 = xmlElement2.getAttribute("");
    xmlElement2.setData("hi!");
    XmlElement.printNode(xmlElement2, "hi!");
    java.lang.String str18 = xmlElement2.getAttribute("", "");
    XmlElement xmlElement21 = new XmlElement("", "");
    java.lang.String str23 = xmlElement21.getAttribute("");
    int i24 = xmlElement21.count();
    XmlElement xmlElement27 = new XmlElement("", "");
    XmlElement xmlElement30 = new XmlElement("", "");
    java.lang.String str33 = xmlElement30.getAttribute("", "hi!");
    xmlElement27.setParent(xmlElement30);
    xmlElement27.deleteObservers();
    xmlElement21.append(xmlElement27);
    java.lang.String str38 = xmlElement21.getAttribute("hi!");
    java.util.List list39 = xmlElement21.getElements();
    xmlElement2.notifyObservers((java.lang.Object)list39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list39);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    java.lang.String str5 = xmlElement2.getAttribute("", "hi!");
    java.lang.String str6 = xmlElement2.getName();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str7 = xmlElement2.getAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str7);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    XmlElement xmlElement5 = new XmlElement("", "");
    java.lang.String str8 = xmlElement5.getAttribute("", "hi!");
    xmlElement2.setParent(xmlElement5);
    java.lang.String str11 = xmlElement2.getAttribute("");
    xmlElement2.setData("hi!");
    java.lang.Object obj16 = xmlElement2.addAttribute("hi!", "hi!");
    xmlElement2.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    XmlElement xmlElement3 = new XmlElement("", "");
    XmlElement xmlElement6 = new XmlElement("", "");
    java.lang.String str9 = xmlElement6.getAttribute("", "hi!");
    xmlElement3.setParent(xmlElement6);
    java.util.List list11 = xmlElement3.getElements();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = xmlElement3.getAttributes();
    XmlElement xmlElement13 = new XmlElement("", hashtable_str_str12);
    java.lang.String str14 = xmlElement13.getData();
    java.lang.String str15 = xmlElement13.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

}
